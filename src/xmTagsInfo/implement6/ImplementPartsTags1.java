package xmTagsInfo.implement6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xmTagsInfo.bean6.OldParts;
import xmTagsInfo.bean6.Parts;

public class ImplementPartsTags1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext at=new ClassPathXmlApplicationContext("./xmTagsInfo/resource6/tags1.xml");
		at.getEnvironment().setActiveProfiles("testing");
		at.refresh();
		Parts t1=at.getBean("newPart",Parts.class);
		t1.display();
		System.out.println("---------------------------------------");
		OldParts ol=at.getBean("oldPart",OldParts.class);
		ol.display();
		
		/*
		ApplicationContext at=new ClassPathXmlApplicationContext("./xmTagsInfo/resource6/tags1.xml");
		Parts t1=at.getBean("newPart",Parts.class);
		t1.display();
		System.out.println("---------------------------------------");
		OldParts ol=at.getBean("oldPart",OldParts.class);
		ol.display();
*/
	}

}
