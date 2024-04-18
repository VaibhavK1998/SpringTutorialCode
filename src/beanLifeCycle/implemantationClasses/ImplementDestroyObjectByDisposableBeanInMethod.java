package beanLifeCycle.implemantationClasses;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beanLifeCycle.beanClasses.DestroyObjectWay2UsingDisposalBeanInterface;

//lecture number 6
public class ImplementDestroyObjectByDisposableBeanInMethod {

	public static void main(String[] args) {
		AbstractApplicationContext ct=new ClassPathXmlApplicationContext("./beanLifeCycle/resources1/DestroyObjectByDisposableBeanInterfaceMethod.xml");
		DestroyObjectWay2UsingDisposalBeanInterface mt=ct.getBean("desObject",DestroyObjectWay2UsingDisposalBeanInterface.class);
		mt.display();
		ct.registerShutdownHook();
		
	}

}
