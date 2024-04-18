package beanLifeCycle.beanClasses;

import javax.annotation.PostConstruct;

public class InitializeValueByPostConstructAnnotation {

	private String name;

	private int id;

@PostConstruct
public void initializeValue() {
	name="mukesh";
	id=109;
}
public void display() {
	System.out.println("Name:"+name);
	System.out.println("id:"+id);
}


}
