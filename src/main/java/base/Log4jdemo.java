package base;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jdemo {

	public static Logger log=Logger.getLogger(Log4jdemo.class.getName());



//	public static void startTestCase(Method md) {
//		log.info("=============  "+md.getName().toString()+"  test started ============");
//
//	}
//
//	public static void endTestCase(Method md) {
//		log.info("=============  "+md.getName().toString()+"  test ended ============");
//
//	}

	public static void info(String message) {

		log.info(message);
	}

}
