package com.resources1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.FarmerData;

@Configuration
public class FarmerInfoUsingJavaConfiguration {
	
	@Bean(name="farmObject")
	public FarmerData farmData() {
		FarmerData data=new FarmerData();
		return data;
	}
	
	

}
