package autowiring.beans5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VehicleAutowiringByComponentScan {
	@Value("Tata")
private String VechicleName;
	@Value("101")
private int VehicleId;
	
	@Autowired
private VehicleSupportPartsAutowiringByComponent vtAutowiringByComponent;

public String getVechicleName() {
	return VechicleName;
}
public void setVechicleName(String vechicleName) {
	VechicleName = vechicleName;
}
public int getVehicleId() {
	return VehicleId;
}
public void setVehicleId(int vehicleId) {
	VehicleId = vehicleId;
}
public VehicleSupportPartsAutowiringByComponent getVtAutowiringByComponent() {
	return vtAutowiringByComponent;
}
public void setVtAutowiringByComponent(VehicleSupportPartsAutowiringByComponent vtAutowiringByComponent) {
	this.vtAutowiringByComponent = vtAutowiringByComponent;
}
public void display() {
	System.out.println("VechicleName: "+VechicleName);
	System.out.println("VehicleId: "+VehicleId);
	System.out.println("vtAutowiringByComponent: "+vtAutowiringByComponent);
	
}
}
