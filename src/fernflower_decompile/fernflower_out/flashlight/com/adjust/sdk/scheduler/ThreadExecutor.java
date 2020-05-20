package com.adjust.sdk.scheduler;

public interface ThreadExecutor {
   void submit(Runnable var1);

   void teardown();
}
