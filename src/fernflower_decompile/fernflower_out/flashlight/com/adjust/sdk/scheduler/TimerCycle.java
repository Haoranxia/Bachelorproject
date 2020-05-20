package com.adjust.sdk.scheduler;

import com.adjust.sdk.ILogger;
import java.util.concurrent.ScheduledFuture;

public class TimerCycle {
   private Runnable command;
   private long cycleDelay;
   private long initialDelay;
   private boolean isPaused;
   private ILogger logger;
   private String name;
   private FutureScheduler scheduler;
   private ScheduledFuture waitingTask;

   public TimerCycle(Runnable param1, long param2, long param4, String param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static String access$000(TimerCycle param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ILogger access$100(TimerCycle param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Runnable access$200(TimerCycle param0) {
      // $FF: Couldn't be decompiled
   }

   private void cancel(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void start() {
      // $FF: Couldn't be decompiled
   }

   public void suspend() {
      // $FF: Couldn't be decompiled
   }

   public void teardown() {
      // $FF: Couldn't be decompiled
   }
}
