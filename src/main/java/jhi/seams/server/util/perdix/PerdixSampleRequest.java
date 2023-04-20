package jhi.seams.server.util.perdix;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Accessors(fluent = true)
public class PerdixSampleRequest
{
	private Long from;
	private String table;
	private Long to;
}
