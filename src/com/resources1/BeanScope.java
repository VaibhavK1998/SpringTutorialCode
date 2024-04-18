package com.resources1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.bean.FarmerData;

@Configuration
public class BeanScope {
	
	@Bean(name="BeanScopeObject")
	//@Scope("prototype")
	public FarmerData farmData() {
		FarmerData data=new FarmerData();
		return data;
	}
	
	

}
