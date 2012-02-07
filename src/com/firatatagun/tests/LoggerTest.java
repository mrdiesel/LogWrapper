package com.firatatagun.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.firatatagun.logging.Application;
import com.firatatagun.logging.ILogger;
import com.firatatagun.logging.Log4jLogger;

public class LoggerTest {

	@Test
	public void GetLogger() {

		ILogger logger = Application.getLogger("LoggerTest");
		
		logger.info("test", null);
		assertNotNull(logger);		
	}

}
