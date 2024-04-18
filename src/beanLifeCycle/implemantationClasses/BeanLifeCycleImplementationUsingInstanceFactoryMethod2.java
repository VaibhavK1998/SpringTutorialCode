package beanLifeCycle.implemantationClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import beanLifeCycle.beanClasses.WorkerInstanceFactory;
import beanLifeCycle.beanClasses.WorkerBean;

public class BeanLifeCycleImplementationUsingInstanceFactoryMethod2 {

	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("beanLifeCycle\\resources1\\lifecycleUsingInstanceFactoryMethod.xml");
		WorkerBean wk=(WorkerBean)ct.getBean("instanceFactory");
	System.out.println(wk);
		

	}

}
