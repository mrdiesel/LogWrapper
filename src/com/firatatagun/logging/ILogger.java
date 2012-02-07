package com.firatatagun.logging;

import com.google.inject.ImplementedBy;

@ImplementedBy(Log4jLogger.class)
public interface ILogger {
	
	boolean isVerboseEnabled();
	boolean isDebugEnabled();
	boolean isInfoEnabled();
	boolean isWarnEnabled();
	boolean isErrorEnabled();
	boolean isFatalEnabled();
	boolean LogDuplicateExceptions();
	void verbose(String format, Object... params);
	void debug(String format, Object... params);
	void info(String format, Object... params);
	void warn(String format, Object... params);
	void error(String format, Object... params);
	void fatal(String format, Object... params);
	void error(Exception exception);
	void fatal(Exception exception);
	void error(Exception exception , String format, Object... params);
	void fatal(Exception exception, String format, Object params);
}
