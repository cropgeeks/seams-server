package jhi.seams.server.util.perdix;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class PerdixAssetResponse
{
	private List<Asset> assets;

	@Getter
	@Setter
	@NoArgsConstructor
	@ToString
	public static class Asset
	{
		@SerializedName("@rid")
		private String        rid;
		private String        name;
		private String        typeName;
		private Location      primaryLocation;
		@SerializedName("out_meas")
		private List<Measure> measurements;
	}

	@Getter
	@Setter
	@NoArgsConstructor
	@ToString
	public static class Location
	{
		private Coordinates coordinates;
	}

	@Getter
	@Setter
	@NoArgsConstructor
	@ToString
	public static class Coordinates
	{
		private Double lat;
		private Double lng;
	}

	@Getter
	@Setter
	@NoArgsConstructor
	@ToString
	public static class Measure
	{
		private String name;
		private String typeName;
		private Sample sample;
	}

	@Getter
	@Setter
	@NoArgsConstructor
	@ToString
	public static class Sample
	{
		private String deviceId;
		private Data   data;
		private Long   at;
	}

	@Getter
	@Setter
	@NoArgsConstructor
	@ToString
	public static class Data
	{
		private String src;
	}
}
