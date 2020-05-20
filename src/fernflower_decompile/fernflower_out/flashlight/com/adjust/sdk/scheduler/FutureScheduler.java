package com.adjust.sdk.scheduler;

import java.util.concurrent.ScheduledFuture;

public interface FutureScheduler {
   ScheduledFuture scheduleFuture(Runnable var1, long var2);

   ScheduledFuture scheduleFutureWithFixedDelay(Runnable var1, long var2, long var4);

   void teardown();
}
