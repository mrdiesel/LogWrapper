package com.firatatagun.logging;

import com.google.inject.Guice;
import com.google.inject.Injector;

public final class Application {
	
	private static ILogger logger;
	
	public static ILogger getLogger(String clazz)
	{
		Injector injector = Guice.createInjector();
		logger = injector.getInstance(Log4jLogger.class);
		return logger;				
	}

}
