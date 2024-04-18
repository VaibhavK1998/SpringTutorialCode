package dependencyInjection.ImplementClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import dependencyInjection.deepBeans.Book_DInByJavaConfig;
import dependencyInjection.resource4.BookJavaConfig;

public class ImplementBookDIByJavaConfig {

	public static void main(String[] args) {
		ApplicationContext at=new AnnotationConfigApplicationContext(BookJavaConfig.class);
		Book_DInByJavaConfig ct=at.getBean("bookData", Book_DInByJavaConfig.class);
	ct.display();

	}

}
