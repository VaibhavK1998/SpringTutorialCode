package propertiesConfigurationDiffDataType.Implement2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import propertiesConfigurationDiffDataType.beanT.PropertieFileExaBean;
//lecture 8
public class ConfigureValueByProepertiesFile {

	public static void main(String[] args) {
		ApplicationContext apt=new ClassPathXmlApplicationContext("./propertiesConfigurationDiffDataType/resource2/propertiesFileDataConfig.xml");
              PropertieFileExaBean val=apt.getBean("prop",PropertieFileExaBean.class);
             val.display();
	}

}