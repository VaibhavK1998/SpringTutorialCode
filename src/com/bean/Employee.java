package com.bean;

public class Employee {
	private String employeeName;
	private int employeeId;

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void display() {
		System.out.println("employeeName: "+employeeName);
		System.out.println("employeeId: "+employeeId);
	}
}
