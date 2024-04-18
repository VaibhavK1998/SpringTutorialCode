package beanLifeCycle.implemantationClasses;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import beanLifeCycle.beanClasses.DestroyBeanObjectByDestroyMethod;


public class ImplementDestroyBeanObjectByDestroyMethod {

	public static void main(String[] args) {
		AbstractApplicationContext ct=new ClassPathXmlApplicationContext("./beanLifeCycle/resources1/DestroyObjectBy_destroyMethod.xml");
		DestroyBeanObjectByDestroyMethod db=ct.getBean("desObject",DestroyBeanObjectByDestroyMethod.class);
		db.display();
		ct.registerShutdownHook();
	}

}
