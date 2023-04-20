package jhi.seams.server.util.perdix;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Accessors(fluent = true)
public class PerdixAssetRequest
{
	private Boolean fetchMeasures  = true;
	private Boolean fetchDevices = true;
	private Boolean fetchNotificationSuppression = false;
	private Boolean fetchRules = false;
}
