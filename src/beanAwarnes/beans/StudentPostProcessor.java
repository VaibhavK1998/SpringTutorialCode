package beanAwarnes.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class StudentPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object beanObject, String beanName) throws BeansException {
		Student student=(Student)beanObject;
		student.setName("mr:"+student.getName());
		return student;
	}

	@Override
	public Object postProcessBeforeInitialization(Object beanObject, String beanName) throws BeansException {
		Student student=(Student)beanObject;
		student.setName(student.getName()+".");
		return student;
	}
	

}
