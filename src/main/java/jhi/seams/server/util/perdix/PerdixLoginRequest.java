package jhi.seams.server.util.perdix;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Accessors(fluent = true)
public class PerdixLoginRequest
{
	private String email;
	private String password;
}
