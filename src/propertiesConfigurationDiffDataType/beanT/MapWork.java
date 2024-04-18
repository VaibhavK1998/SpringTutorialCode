package propertiesConfigurationDiffDataType.beanT;

import java.util.Map;
//lecture 8
public class MapWork {
	private String name;
	private int id;
	private Map<Integer, String> marks;
	
	public Map<Integer, String> getMarks() {
		return marks;
	}
	public void setMarks(Map<Integer, String> marks) {
		this.marks = marks;
	}
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
	System.out.println(marks);
}
}
