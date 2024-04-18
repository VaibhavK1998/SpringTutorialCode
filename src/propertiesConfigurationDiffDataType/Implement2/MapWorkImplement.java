package propertiesConfigurationDiffDataType.Implement2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import propertiesConfigurationDiffDataType.beanT.MapWork;

public class MapWorkImplement {
	public static void main(String[] args) {
		ApplicationContext aContext=new ClassPathXmlApplicationContext("./propertiesConfigurationDiffDataType/resource2/MapWorkConfiguration.xml");
	MapWork marks1=aContext.getBean("mark",MapWork.class);
	marks1.display();
	Map<Integer, String> a=marks1.getMarks();
for(Entry<Integer, String> b:a.entrySet()) {
 System.out.println("key:"+b.getKey()+" "+"value: "+b.getValue());
	}

}
}
