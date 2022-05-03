package jhi.seams.server.util.perdix;

import jhi.seams.server.util.*;
import okhttp3.ResponseBody;
import retrofit2.*;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class PerdixClient implements Runnable
{
	private static PerdixClientResponse cameras;

	public static synchronized List<PerdixClientResponse.Camera> getCameras()
	{
		if (cameras != null)
		{
			return cameras.cameras();
		}
		else
		{
			return new ArrayList<>();
		}
	}

	@Override
	public void run()
	{
		try
		{
			String email = PropertyWatcher.get("perdix.username");
			String password = PropertyWatcher.get("perdix.password");

			if (StringUtils.isEmpty(email) || StringUtils.isEmpty(password)) {
				return;
			}

			Retrofit retrofit = new Retrofit.Builder()
				.addConverterFactory(GsonConverterFactory.create())
				.baseUrl("https://portal.perdixpro.com/")
				.build();

			PerdixApi service = retrofit.create(PerdixApi.class);

			Response<PerdixLoginResponse> resp = service.signIn(new PerdixLoginRequest()
															.email(email)
															.password(password))
														.execute();

			if (resp.isSuccessful())
			{
				Logger.getLogger("").info("PERDIX: Login successful");

				PerdixLoginResponse loginResponse = resp.body();
				PerdixLoginResponse.MemberRecord memberRecord = loginResponse.getMemberRecords().get(0);
				String token = memberRecord.getUser().getAuthentication().getToken();
				String user = memberRecord.getUser().getRid();
				String accountId = memberRecord.getAccount().getAccountId();

				Response<PerdixAssetResponse> assets = service.getAssets(new PerdixAssetRequest(), token, accountId, user)
															  .execute();

				if (assets.isSuccessful())
				{
					List<PerdixAssetResponse.Asset> assetsFiltered = assets.body().getAssets()
																		   .stream()
																		   .filter(a -> a.getPrimaryLocation() != null && !CollectionUtils.isEmptyOrNull(a.getMeasurements()) && a.getMeasurements()
																																												  .stream()
																																												  .anyMatch(m -> Objects.equals(m.getTypeName(), "Media") && m.getSample() != null && m.getSample().getData() != null && m.getSample().getData().getSrc() != null))
																		   .collect(Collectors.toList());

					Logger.getLogger("").info("PERDIX: " + assetsFiltered.size() + " assets found.");

					PerdixClientResponse result = new PerdixClientResponse()
						.cameras(assetsFiltered.stream().map(a -> {
							return new PerdixClientResponse.Camera()
								.rid(a.getRid())
								.name(a.getName())
								.at(a.getMeasurements().get(0).getSample().getAt())
								.lat(a.getPrimaryLocation().getCoordinates().getLat())
								.lng(a.getPrimaryLocation().getCoordinates().getLng())
								.imgSrc(a.getMeasurements().get(0).getSample().getData().getSrc());
						}).collect(Collectors.toList()));

					File perdixFolder = new File(new File(PropertyWatcher.get(PropertyWatcher.PROP_EXT_DATA)), "perdix");
					perdixFolder.mkdirs();

					result.cameras().forEach(c -> {
						try
						{
							Response<ResponseBody> img = service.getImage(c.imgSrc(), token, accountId, user)
																.execute();

							try (InputStream is = img.body().byteStream())
							{
								Path target = new File(perdixFolder, "camera" + c.rid().replaceAll("[^A-Za-z0-9]", "-") + ".jpg").toPath();
								Files.copy(is, target, StandardCopyOption.REPLACE_EXISTING);

								c.imgSrc(target.toFile().getName());
							}
						}
						catch (IOException e)
						{
							e.printStackTrace();
						}
					});

					cameras = result;
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
			Logger.getLogger("").severe(e.getMessage());
		}
	}
}
