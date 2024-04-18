package beanAwarnes.implement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beanAwarnes.beans.BeanAwareEx1;

public class ImplementBeanAware1 {

	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("./beanAwarnes/resource3/beanAware.xml");
		BeanAwareEx1  a1=(BeanAwareEx1)ct.getBean("EmployeeObject");
		a1.display();
	}

}
