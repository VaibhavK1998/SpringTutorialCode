package com.implement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.FarmerData;
import com.resources1.BeanScope;



public class BeanScopeTesting {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanScope.class);
		FarmerData infoData=(FarmerData)context.getBean("BeanScopeObject");
		infoData.setId(10);
		infoData.setName("Rakesh");
		System.out.println("name of farmer:"+infoData.getName());
		System.out.println("id of farmer:"+infoData.getId());
		FarmerData infoData1=(FarmerData)context.getBean("BeanScopeObject");
		infoData1.setId(110);
		infoData1.setName("pritesh");
		System.out.println("id of infoData:"+infoData);
		System.out.println("id of infoData1:"+infoData1);
	}

}
