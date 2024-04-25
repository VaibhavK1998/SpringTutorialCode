package springExpressions.implement8;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springExpressions.beans8.ElectronicsItems;
import springExpressions.resource8.ElectronicsConf;
//lecture 22
public class ElectronicsSpelExpression {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(ElectronicsConf.class);
		ElectronicsItems eitem=context.getBean("eitem",ElectronicsItems.class);
		eitem.display();
		/*
		ApplicationContext context=new ClassPathXmlApplicationContext("./springExpressions/resource8/ElectronicsItem.xml");
		ElectronicsItems items=context.getBean("Eitem",ElectronicsItems.class);
		items.display();
		*/
	}

}
