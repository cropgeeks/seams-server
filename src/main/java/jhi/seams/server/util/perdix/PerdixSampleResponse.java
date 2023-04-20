package jhi.seams.server.util.perdix;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class PerdixSampleResponse
{
	private Integer            resultStatus;
	private List<PerdixSample> samples;
}
