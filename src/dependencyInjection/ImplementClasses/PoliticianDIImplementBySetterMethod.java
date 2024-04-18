package dependencyInjection.ImplementClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependencyInjection.deepBeans.Politician_DI_BySetterMethod;
//lecture 10
public class PoliticianDIImplementBySetterMethod {

	public static void main(String[] args) {
	ApplicationContext aContext=new ClassPathXmlApplicationContext("./dependencyInjection/resource4/politicianConf.xml");
	Politician_DI_BySetterMethod pi=aContext.getBean("Politician1", Politician_DI_BySetterMethod.class);
    pi.display();
	}

}
