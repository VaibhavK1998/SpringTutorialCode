package beanLifeCycle.implemantationClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beanLifeCycle.beanClasses.DestroyObjectByPreDestroyAnnotationWay3;


public class ImplementDestroyBeanObjectByPreDestroyAnnotation {
	public static void main(String[] args) {
		ApplicationContext ct =new ClassPathXmlApplicationContext("./beanLifeCycle/resources1/DestroyBeanObjectByPredestroyAnnotationWay3.xml");
	DestroyObjectByPreDestroyAnnotationWay3 cd=ct.getBean("postConstruct",DestroyObjectByPreDestroyAnnotationWay3.class);
	cd.display();
	}
	
}
