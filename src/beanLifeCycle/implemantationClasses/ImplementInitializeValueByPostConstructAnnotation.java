package beanLifeCycle.implemantationClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beanLifeCycle.beanClasses.InitializeValueByPostConstructAnnotation;



public class ImplementInitializeValueByPostConstructAnnotation {
	public static void main(String[] args) {
		ApplicationContext ct =new ClassPathXmlApplicationContext("./beanLifeCycle/resources1/initializeValueByPostConstructAnnotationMethod.xml");
		InitializeValueByPostConstructAnnotation ip=ct.getBean("postConstruct",InitializeValueByPostConstructAnnotation.class);
	ip.display();
	}
	
}
