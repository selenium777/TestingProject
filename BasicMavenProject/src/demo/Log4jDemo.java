package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {

		logger.debug("3 This is debug message...");
		logger.error("2 error message...");
		logger.info("1 info message....");
		logger.warn("1 warn message...");
		logger.traceEntry("1 trace message...");
	}

}
