package logging.bean7;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggingByLog4jFileAppender {

	public static void main(String[] args) {
		System.out.println("this is a start of programming");
		PropertyConfigurator.configure("C:\\Users\\HP\\Desktop\\NewEclipseWorkspace\\SpringProject2\\src\\logging\\resourses7\\log4jFileAppender.properties");
		Logger logger=Logger.getLogger("LoggingByLog4jFileAppender");
		logger.fatal("this is fatal");
		logger.error("this is the error");
		logger.warn("this is warn message");
		logger.info("this is info");
		System.out.println("hello");
		
	}

}
