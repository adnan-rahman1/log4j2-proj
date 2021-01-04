package com.log4j2.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class BaseTest {

    public static final Logger logger = LogManager.getLogger("myLogger");

    @Test
    public void testOne() throws Exception {
        logger.trace("This is trace log");
        logger.debug("This is debug log");
        logger.info("This is info log");
        logger.warn("This is warn log");
        // Below log will be show if we did not configure anything
        logger.error("This is error log");
        logger.fatal("This is fatal log");
    }
}
