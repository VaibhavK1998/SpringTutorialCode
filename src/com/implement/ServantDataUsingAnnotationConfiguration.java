package com.implement;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.Servant;

public class ServantDataUsingAnnotationConfiguration {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.refresh();// it is mandatory to refresh.
		context.register(Servant.class);// need to register object
		Servant servantInfo=(Servant)context.getBean("servantObject");
System.out.println("id of the servant:"+servantInfo.getId());
	}

}
