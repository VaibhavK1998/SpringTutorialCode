package dependencyInjection.ImplementClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependencyInjection.deepBeans.Chemicals_DIInjectionViaP_nameSpace;
//lecture 10
public class ImplementChemicalDIInjectionViaP_namespace {

	public static void main(String[] args) {
		ApplicationContext at=new ClassPathXmlApplicationContext("./dependencyInjection/resource4/chemicalConf.xml");
		Chemicals_DIInjectionViaP_nameSpace ct=at.getBean("chemical", Chemicals_DIInjectionViaP_nameSpace.class);
	ct.display();
	}

}
