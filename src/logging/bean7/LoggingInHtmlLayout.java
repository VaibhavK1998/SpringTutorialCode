package logging.bean7;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggingInHtmlLayout {

	public static void main(String[] args) {
		System.out.println("this is a start of programming html");
		PropertyConfigurator.configure("C:\\Users\\HP\\Desktop\\NewEclipseWorkspace\\SpringProject2\\src\\logging\\resourses7\\htmlLayout.properties");
		Logger logger=Logger.getLogger("LoggingInHtmlLayout");
		logger.fatal("this is fatal html");
		logger.error("this is the error html");
		logger.warn("this is warn message html");
		logger.info("this is info html");
		System.out.println("hello html");

	}

}
