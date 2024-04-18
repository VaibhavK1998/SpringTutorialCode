package beanAwarnes.beans;

import org.springframework.beans.factory.BeanNameAware;

public class BeanAwareEx1 implements BeanNameAware{
	private String name;
	private int id;
	private String beanName;
	
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
	public void display() {
		System.out.println("name: "+name);
		System.out.println("id: "+id);
		System.out.println("Beanname: "+beanName);
	}
	
	
	@Override
	public void setBeanName(String beanName) {
		this.beanName=beanName;
		
	}
	

}
