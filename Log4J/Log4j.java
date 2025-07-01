package Log4J;

import java.util.logging.Logger;

public class Log4j {
	
	public static void main(String[] args) {
	
	Logger log = Logger.getLogger("TestLog4j");
	
	logzx .debug("this is debug----");
	log.info("this is info----");
	log.warm("this warm-----");
	log.error("this error---- ");
	log.fatal("this fatal--");
	
      try {
	
	   int i = 0;
	   int c = 5/i;
  System.out.println("devision=" + c);
         
      }catch (RuntimeException e) {
	      log.error("Arthmatic error e");
  }
   
	}
}
