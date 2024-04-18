package beanLifeCycle.beanClasses;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("annotTest")
public class TrialInitilizeValueAnnotation{
private String name;
@PostConstruct
public void init() {
	name="rahul";
}
public void display() {
	System.out.println("name: "+name);
}


}
