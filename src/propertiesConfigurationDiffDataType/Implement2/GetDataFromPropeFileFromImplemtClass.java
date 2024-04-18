package propertiesConfigurationDiffDataType.Implement2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import propertiesConfigurationDiffDataType.beanT.PropWithJavaConf;
import propertiesConfigurationDiffDataType.resource2.PropJavaConfiguration;

public class GetDataFromPropeFileFromImplemtClass {

	public static void main(String[] args) {
		ApplicationContext at=new AnnotationConfigApplicationContext(PropJavaConfiguration.class);
	PropWithJavaConf pfConf=at.getBean("data", PropWithJavaConf.class);
	pfConf.display();

	}

}
