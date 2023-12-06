package javaapplication17;

import java.util.logging.Level; 
import java.util.logging.Logger; 
   

public class LoggingTest {
    
       private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
       
       // instance of a log
       public void practiceLog() {
           
           // A log INFO message
           LOGGER.log(Level.INFO, "This a logging test message");
       }
   
       public class DemoLog {
           
           public static void main(String [] args) {
               
               Logger logger = Logger.getLogger(LoggingTest.class.getName());
               
               LoggingTest log1 = new LoggingTest();
               log1.practiceLog();
               
               // Log level message is created
               // Log message has a level of INFO
               logger.log(Level.INFO, "This message shows that logging in Java works!");
                  
           }
        } 
}
