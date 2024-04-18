package propertiesConfigurationDiffDataType.beanT;

import java.util.Map;

public class PropWithJavaConf {
	private String name;
	private int id;
	private Map<String, String> items;
	
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
	public Map<String, String> getItems() {
		return items;
	}
	public void setItems(Map<String, String> items) {
		this.items = items;
	}
	
	public void display() {
		System.out.println("name: "+name);
		System.out.println("id: "+id);
		System.out.println("items: "+items);
	}
	
	}