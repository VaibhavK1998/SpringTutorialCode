package autowiring.beans5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VehicleSupportPartsAutowiringByComponent {
@Value("sidecover")
	private String dashboardPart;
@Value("key")
	private String acPart;
	public String getDashboardPart() {
		return dashboardPart;
	}
	
	public void setDashboardPart(String dashboardPart) {
		this.dashboardPart = dashboardPart;
	}
	public String getAcPart() {
		return acPart;
	}
	public void setAcPart(String acPart) {
		this.acPart = acPart;
	}
	
	@Override
	public String toString() {
		return "VehicleSupportPartsAutowiringByComponent [dashboardPart=" + dashboardPart + ", acPart=" + acPart + "]";
	}
}
