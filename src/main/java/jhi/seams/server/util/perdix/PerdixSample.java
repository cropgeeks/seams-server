package jhi.seams.server.util.perdix;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class PerdixSample
{
	private Date at;
	private PerdixData data;
}
