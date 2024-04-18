package beanLifeCycle.implemantationClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beanLifeCycle.beanClasses.TrialInitilizeValueAnnotation;

public class AnnotValueImplementTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext at=new AnnotationConfigApplicationContext();
		at.refresh();
		at.register(TrialInitilizeValueAnnotation.class);
		TrialInitilizeValueAnnotation value=(TrialInitilizeValueAnnotation)at.getBean("annotTest");
		value.display();
		
	}

}
