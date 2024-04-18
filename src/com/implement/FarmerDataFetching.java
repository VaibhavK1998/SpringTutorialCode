package com.implement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.FarmerData;
import com.resources1.FarmerInfoUsingJavaConfiguration;
public class FarmerDataFetching {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(FarmerInfoUsingJavaConfiguration.class);
		FarmerData infoData=(FarmerData)context.getBean("farmObject");
		infoData.setId(10);
		infoData.setName("Rakesh");
		System.out.println("name of farmer:"+infoData.getName());
		System.out.println("id of farmer:"+infoData.getId());

	}

}
