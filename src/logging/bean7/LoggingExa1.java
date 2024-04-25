package logging.bean7;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggingExa1 {
	//lecture 16 
	public static void main(String[] args) {
		try {
			FileHandler fileHandler=new FileHandler("C:\\Users\\HP\\Desktop\\NewEclipseWorkspace\\SpringProject2\\src\\logging\\logFiles\\log1.log",true);// the file where we have to store the log
			SimpleFormatter formatter=new SimpleFormatter();// we used this to format our log file in readable format
			fileHandler.setFormatter(formatter);
			System.out.println("first");
			System.out.println("second");
			System.out.println("third");
			
			Logger logger=Logger.getLogger("LoggingExa1");// we have to get object of logger class
			logger.addHandler(fileHandler);// here we adding our log to this file
			logger.setLevel(Level.SEVERE);// we use this to show which kind of level msg should be add in logger file
			logger.log(Level.SEVERE, "we found technical error");
			logger.log(Level.WARNING, "memory space full");
			logger.log(Level.INFO, "messages working");
			logger.log(Level.WARNING, "memory space full");
			System.out.println("------------------------------------------------------");
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
	}
	/*
	public static void test2() {
		System.out.println("ok");
		System.out.println("all");
		System.out.println("working");
	 logger=Logger.getLogger("LoggingExa1");
	 logger.addHandler(fileHandler);
		logger.log(Level.SEVERE, "we found technical error test2");
		logger.log(Level.WARNING, "memory space full test2");
		logger.log(Level.INFO, "messages working test2");
	}
*/
}
