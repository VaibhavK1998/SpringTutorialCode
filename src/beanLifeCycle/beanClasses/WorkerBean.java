package beanLifeCycle.beanClasses;

public class WorkerBean {
private String name;
private int id;
public String getName() {
	return name;
}
public WorkerBean(int b) {
	System.out.println("constructor called");
	
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
	System.out.println("display method call student factory");
}
}
