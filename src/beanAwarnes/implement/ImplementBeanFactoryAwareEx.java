package beanAwarnes.implement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beanAwarnes.beans.BeanFactoryEx1;

public class ImplementBeanFactoryAwareEx {
public static void main(String[] args) {
	ApplicationContext ct=new ClassPathXmlApplicationContext("./beanAwarnes/resource3/BeanFactoryAwareEx1.xml");
	BeanFactoryEx1 a1=(BeanFactoryEx1)ct.getBean("obj1");
	a1.display();
}
}
