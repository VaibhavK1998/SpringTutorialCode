package com.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("servantObject")// here we can provide name to the object// @Component annotation create the object of java beans
public class Servant {// name of the class will be the object of the class if you not configure name explicityly. 
	//note  here Object name will be servant not be a Servant.
	
	@Value("Vaibhav")
	private String name;
	
	@Value("101")
	private int id;
	

	public String getName() {
		return name;
	}

	

	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

}
