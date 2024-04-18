package propertiesConfigurationDiffDataType.Implement2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;

import propertiesConfigurationDiffDataType.beanT.Actor;

public class ActorImplement {

	public static void main(String[] args) {
		ApplicationContext aT=new ClassPathXmlApplicationContext("./propertiesConfigurationDiffDataType/resource2/ActorProWithList.xml");
		Actor awardModel=aT.getBean("Actor",Actor.class);
	List<String> awards=awardModel.getAwardsList();
	for(String award:awards) {
		System.out.println("award wins:"+award);
	}

	}

}
