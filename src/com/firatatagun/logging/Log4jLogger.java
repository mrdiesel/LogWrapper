package com.firatatagun.logging;

import java.io.IOException;

import org.apache.log4j.*;
import org.apache.log4j.spi.LoggerRepository;

import com.google.inject.Inject;

public final class Log4jLogger implements ILogger {
	
	private Logger logger;
	
	private LoggerLevel loggerLevel;
	
	private Level _level;
	
	public Log4jLogger()
	{
		Layout layout = new PatternLayout("%r [%t] %-5p %c %x - %m%n");

		try {
			RollingFileAppender appender = new RollingFileAppender(layout, "C:\\log\\app.log");
			appender.setImmediateFlush(true);
			appender.setAppend(true);
			appender.setMaxBackupIndex(5);
			appender.setMaxBackupIndex(10);
			
			appender.activateOptions();
			
			LoggerRepository repository = LogManager.getLoggerRepository();
			
			Logger root = repository.getRootLogger();
			root.setLevel(Level.INFO);
			root.addAppender(appender);
			
			logger = LogManager.getLogger(Log4jLogger.class);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("deprecation")
	private void doLog(Level level, String format, Object... params)
	{
		logger.log(Priority.INFO, "test");
	}

	@Override
	public boolean isVerboseEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDebugEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInfoEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWarnEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isErrorEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFatalEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean LogDuplicateExceptions() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void verbose(String format, Object... params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debug(String format, Object... params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info(String format, Object... params) {
		doLog(Level.INFO, "", null);
	}

	@Override
	public void warn(String format, Object... params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(String format, Object... params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fatal(String format, Object... params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(Exception exception) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fatal(Exception exception) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(Exception exception, String format, Object... params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fatal(Exception exception, String format, Object params) {
		// TODO Auto-generated method stub
		
	}
	
}
