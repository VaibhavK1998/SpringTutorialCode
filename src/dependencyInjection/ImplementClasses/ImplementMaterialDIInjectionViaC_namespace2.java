package dependencyInjection.ImplementClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependencyInjection.deepBeans.Chemicals_DIInjectionViaP_nameSpace;
import dependencyInjection.deepBeans.Material_DIInjectionViaC_nameSpace2;
//lecture 10
public class ImplementMaterialDIInjectionViaC_namespace2 {

	public static void main(String[] args) {
		ApplicationContext at=new ClassPathXmlApplicationContext("./dependencyInjection/resource4/MaterialDiViaCNamespace.xml");
		Material_DIInjectionViaC_nameSpace2 ct=at.getBean("Material", Material_DIInjectionViaC_nameSpace2.class);
	ct.display();
	}

}
