package beanLifeCycle.beanClasses;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DestroyObjectWay2UsingDisposalBeanInterface implements InitializingBean,DisposableBean {
	private String nameOfProduct;
	private int id;
	

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method");
		nameOfProduct="mahesh";
		id=101;
	}
	public void display() {
		System.out.println("Name: "+nameOfProduct);
		System.out.println("id: "+id);
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method call");
		
	}
}
