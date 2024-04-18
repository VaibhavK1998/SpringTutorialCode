package beanLifeCycle.implemantationClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beanLifeCycle.beanClasses.InitializeObjectValueByafterPropetieSetMethod;
//lecture number 6
public class ImplementInitializeValueByafterPropertySetMethod {

	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("./beanLifeCycle/resources1/initializeValueByIafterPropertySetMethod.xml");
		InitializeObjectValueByafterPropetieSetMethod ap=ct.getBean("afterPropertySetValue",InitializeObjectValueByafterPropetieSetMethod.class);
	ap.display();
	}

}
