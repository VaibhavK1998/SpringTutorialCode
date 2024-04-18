package com.bean2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ManagerObject")
public class Manager {
	
	@Value("Rajesh")
	private String name;
	
	@Value("1011")
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
