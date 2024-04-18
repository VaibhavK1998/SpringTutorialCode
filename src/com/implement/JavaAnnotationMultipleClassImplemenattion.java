package com.implement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean2.Manager;
import com.resources1.JavaConfigFileForMultipleClassesAnnotationBased;
public class JavaAnnotationMultipleClassImplemenattion {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfigFileForMultipleClassesAnnotationBased.class);
Manager mnManager=(Manager)context.getBean("ManagerObject");
System.out.println("Manager name:"+mnManager.getName());

		

	}

}
