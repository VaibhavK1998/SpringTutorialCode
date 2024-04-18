package com.implement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean2.Manager;
import com.bean2.Owner;

public class MultipleComponentClassimplement {

	public static void main(String[] args) {
		ApplicationContext apt=new ClassPathXmlApplicationContext("./resources/packageLevelConfiguration.xml");
		Owner ownerInfo=(Owner)apt.getBean("ownerObject");
		System.out.println(ownerInfo.getName());
Manager mn=(Manager)apt.getBean("ManagerObject");
System.out.println(mn.getName());


	}

}
