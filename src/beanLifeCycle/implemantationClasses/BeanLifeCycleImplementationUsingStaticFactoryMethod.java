package beanLifeCycle.implemantationClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beanLifeCycle.beanClasses.BeanWithStaticFactoryMethod;

public class BeanLifeCycleImplementationUsingStaticFactoryMethod {

	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("./beanLifeCycle/resources1/lifecycleUsingStaticFactoryMethod.xml");
		BeanWithStaticFactoryMethod LifeCycle=(BeanWithStaticFactoryMethod)ct.getBean("lifecycle");
		LifeCycle.display();

	}

}
