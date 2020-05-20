package com.adjust.sdk;

public interface ILogger {
   void Assert(String var1, Object... var2);

   void debug(String var1, Object... var2);

   void error(String var1, Object... var2);

   void info(String var1, Object... var2);

   void lockLogLevel();

   void setLogLevel(LogLevel var1, boolean var2);

   void setLogLevelString(String var1, boolean var2);

   void verbose(String var1, Object... var2);

   void warn(String var1, Object... var2);

   void warnInProduction(String var1, Object... var2);
}
