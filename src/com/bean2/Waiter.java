package com.bean2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("waiterObject")
public class Waiter {
	
	@Value("suresh")
	private String name;
	
	@Value("10")
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
