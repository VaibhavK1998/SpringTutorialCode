package com.bean2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ownerObject")
public class Owner {
	
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
