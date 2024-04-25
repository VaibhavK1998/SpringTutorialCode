package i18NandL10N.implement7;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import i18NandL10N.bean7.Student;

public class StudentMessge {
	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("./i18NandL10N/resource7/applicationContext.xml");
	Student std= context.getBean("student",Student.class);
	std.display();
	
	int a=10;
	int b=19;
	}
}
