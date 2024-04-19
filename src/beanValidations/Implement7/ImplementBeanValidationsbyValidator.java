package beanValidations.Implement7;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;

import beanValidations.bean7.StudenValidator;
import beanValidations.bean7.StudentBeanValidationByValidatorInterface;

public class ImplementBeanValidationsbyValidator {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("./beanValidations/resource7/beanValidationByValidator.xml");
		StudentBeanValidationByValidatorInterface bt=applicationContext.getBean("std1",StudentBeanValidationByValidatorInterface.class);
		bt.display();
		DataBinder dBinder=new DataBinder(bt);// DataBinder class is use to bind the data/ configure the validators.
		dBinder.addValidators(new StudenValidator());// addValidators method use to add our validator class where we write our validation code of bean in validate method
		dBinder.validate();
	List<ObjectError> errorList=dBinder.getBindingResult().getAllErrors();
	for(ObjectError e1:errorList) {
		System.err.println(e1.getDefaultMessage());
	}

	}

}
