package jhi.seams.server.util.perdix;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PerdixApi
{
	@POST("api/login/signin")
	Call<PerdixLoginResponse> signIn(@Body PerdixLoginRequest credentials);

	@POST("api/asset/listAllAssets")
	Call<PerdixAssetResponse> getAssets(@Body PerdixAssetRequest query,
										@Header("token") String token,
										@Header("account") String account,
										@Header("user") String user);

	@GET("media/?w=1920")
	@Streaming
	Call<ResponseBody> getImage(@Query("m") String imageSrc, @Query("t") String token, @Query("a") String accountId, @Query("u") String user);
}
