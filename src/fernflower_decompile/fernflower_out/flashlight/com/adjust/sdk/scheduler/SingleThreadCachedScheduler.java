package com.adjust.sdk.scheduler;

import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class SingleThreadCachedScheduler implements ThreadScheduler {
   private boolean isTeardown;
   private boolean isThreadProcessing;
   private final List queue;
   private ThreadPoolExecutor threadPoolExecutor;

   public SingleThreadCachedScheduler(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void access$000(SingleThreadCachedScheduler param0, Runnable param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static List access$100(SingleThreadCachedScheduler param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean access$200(SingleThreadCachedScheduler param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean access$302(SingleThreadCachedScheduler param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private void processQueue(Runnable param1) {
      // $FF: Couldn't be decompiled
   }

   private void tryExecuteRunnable(Runnable param1) {
      // $FF: Couldn't be decompiled
   }

   public void schedule(Runnable param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   public void submit(Runnable param1) {
      // $FF: Couldn't be decompiled
   }

   public void teardown() {
      // $FF: Couldn't be decompiled
   }
}
