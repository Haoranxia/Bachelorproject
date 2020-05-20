package com.adjust.sdk.scheduler;

public interface ThreadScheduler extends ThreadExecutor {
   void schedule(Runnable var1, long var2);
}
