package com.implement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
public class EmplyeeData {

	public static void main(String[] args) {
		ApplicationContext container1= new ClassPathXmlApplicationContext("./resources/applicationContext.xml");
		Employee employee=(Employee)container1.getBean("EmployeeObject");
        System.out.println("employeeName: "+employee.getEmployeeName());
        System.out.println("employee id: "+employee.getEmployeeId());

	}

}
