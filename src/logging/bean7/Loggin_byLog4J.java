package logging.bean7;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.PropertyConfigurator;
//lecture 16
public class Loggin_byLog4J {

	public static void main(String[] args) {
		//BasicConfigurator.configure();// if we not write this then our logger will not work because this class set the basic configuration we need for logging.
	PropertyConfigurator.configure("C:\\Users\\HP\\Desktop\\NewEclipseWorkspace\\SpringProject2\\src\\logging\\resourses7\\log4j.properties");
	// the property file we configuring and giving configuration where we write in what manner our logs should be store/display
	Logger logger=	Logger.getLogger("Loggin_byLog4J");
	logger.fatal("this is fatal");
	logger.error("this is the error");
	logger.warn("this is warn message");
	logger.info("this is info");
	System.out.println("hello");
	}

}
