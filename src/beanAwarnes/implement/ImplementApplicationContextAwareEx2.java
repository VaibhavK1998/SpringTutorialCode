package beanAwarnes.implement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beanAwarnes.beans.ApplicationContextAwareEx;

public class ImplementApplicationContextAwareEx2 {
public static void main(String[] args) {
	ApplicationContext ct=new ClassPathXmlApplicationContext("./beanAwarnes/resource3/ApplicationContextAwareEx1.xml");
	ApplicationContextAwareEx a1=(ApplicationContextAwareEx)ct.getBean("obj1");
	a1.display();
}
}
