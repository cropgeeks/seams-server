package jhi.seams.server.util.perdix;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class PerdixAssetRequest
{
	private Boolean fetchMeasures  = true;
	private Boolean fetchDevices = true;
	private Boolean fetchNotificationSuppression = false;
	private Boolean fetchRules = false;
}
