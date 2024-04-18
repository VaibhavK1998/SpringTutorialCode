package beanLifeCycle.implemantationClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beanLifeCycle.beanClasses.InitializevalueByInitMethod;


//lecture number 6
public class ImplementInitializeValueByInitMethod {

	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("./beanLifeCycle/resources1/initializeValueByInitMethod.xml");
		InitializevalueByInitMethod it=ct.getBean("init",InitializevalueByInitMethod.class);
		it.display();
	}

}
