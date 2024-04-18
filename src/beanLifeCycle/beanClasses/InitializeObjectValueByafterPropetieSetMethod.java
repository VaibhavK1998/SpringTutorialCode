package beanLifeCycle.beanClasses;

import org.springframework.beans.factory.InitializingBean;

public class InitializeObjectValueByafterPropetieSetMethod implements InitializingBean{
	
	private String nameOfProduct;
	private int id;
	

	@Override
	public void afterPropertiesSet() throws Exception {
		nameOfProduct="mahesh";
		id=101;
	}
	public void display() {
		System.out.println("Name: "+nameOfProduct);
		System.out.println("id: "+id);
	}
	

}
