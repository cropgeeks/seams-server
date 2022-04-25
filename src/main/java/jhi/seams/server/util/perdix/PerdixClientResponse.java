package jhi.seams.server.util.perdix;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Accessors(fluent = true)
public class PerdixClientResponse
{
	private List<Camera> cameras;

	@Getter
	@Setter
	@NoArgsConstructor
	@ToString
	@Accessors(fluent = true)
	public static class Camera
	{
		private String rid;
		private String name;
		private Long   at;
		private Double lat;
		private Double lng;
		private String imgSrc;
	}
}
