package autowiring.Implementation5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowiring.beans5.Market_AutowiringByXml;
//lecture 11
public class MarketAutowiringImplementationXml {

	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("./autowiring/resources4/MarketAutowiring.xml");
		Market_AutowiringByXml mt=ct.getBean("market",Market_AutowiringByXml.class);
		mt.display();
		
		
	}

}
