package autowiring.Implementation5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import autowiring.beans5.VehicleAutowiringByComponentScan;
import autowiring.resources4.VehicleConfigClass;

public class ImplementVehicleAutowiringComponentScan {

	public static void main(String[] args) {
	
ApplicationContext aptContext=new AnnotationConfigApplicationContext(VehicleConfigClass.class);
VehicleAutowiringByComponentScan vByComponentScan=aptContext.getBean(VehicleAutowiringByComponentScan.class);
vByComponentScan.display();
	}

}
