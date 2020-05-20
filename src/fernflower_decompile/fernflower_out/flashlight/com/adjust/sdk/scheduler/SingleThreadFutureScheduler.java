package com.adjust.sdk.scheduler;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class SingleThreadFutureScheduler implements FutureScheduler {
   private ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;

   public SingleThreadFutureScheduler(String param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public ScheduledFuture scheduleFuture(Runnable param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   public ScheduledFuture scheduleFutureWithFixedDelay(Runnable param1, long param2, long param4) {
      // $FF: Couldn't be decompiled
   }

   public void teardown() {
      // $FF: Couldn't be decompiled
   }
}
