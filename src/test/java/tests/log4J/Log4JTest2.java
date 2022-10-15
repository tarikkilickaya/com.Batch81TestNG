package tests.log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4JTest2 {
    private static Logger logger = LogManager.getLogger(Log4JTest2.class.getName());

    @Test
    public void log4jTest1() {
        System.out.println("LOG INFO");
        logger.info("LOG INFO");
        System.out.println("LOG DEBUG HATA");
        logger.debug("LOG DEBUG");
        System.out.println("LOG DEBUG HATA");
        logger.error("LOG ERROR");
        System.out.println("LOG DEBUG HATA");
        logger.fatal("LOG FATAL");
        System.out.println("LOG DEBUG HATA");
        logger.warn("LOG WARN");
    }
}