package propertiesConfigurationDiffDataType.Implement2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import propertiesConfigurationDiffDataType.beanT.PropConfViaConsturctor;

public class PropInitializeViaConstructor {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("./propertiesConfigurationDiffDataType/resource2/ProfWithConstuctor.xml");
		PropConfViaConsturctor pfConsturctor=applicationContext.getBean("constCheck",PropConfViaConsturctor.class);
		pfConsturctor.display();
	}

}
