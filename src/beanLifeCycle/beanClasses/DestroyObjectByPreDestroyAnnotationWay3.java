package beanLifeCycle.beanClasses;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DestroyObjectByPreDestroyAnnotationWay3 {

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
@PreDestroy
public void destroy() {
	System.out.println("destory method call");
}

}
