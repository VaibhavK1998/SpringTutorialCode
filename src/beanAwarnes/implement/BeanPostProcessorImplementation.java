package beanAwarnes.implement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beanAwarnes.beans.Student;

public class BeanPostProcessorImplementation {

	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("./beanAwarnes/resource3/postProcessorImple.xml");
		Student a1=(Student)ct.getBean("obj1");
		a1.display();

	}

}
