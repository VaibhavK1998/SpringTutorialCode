package dependencyInjection.ImplementClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependencyInjection.deepBeans.DIInjectionViaConstructorArgVegetableMarket;
//lecture 10
public class VegetableDiInjeByConstructorArg {

	public static void main(String[] args) {
		ApplicationContext apt=new ClassPathXmlApplicationContext("./dependencyInjection/resource4/VegetableConf.xml");
		DIInjectionViaConstructorArgVegetableMarket	info=apt.getBean("VegInfo",DIInjectionViaConstructorArgVegetableMarket.class);
	info.display();
	}

}
