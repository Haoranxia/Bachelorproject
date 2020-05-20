package com.adjust.sdk.scheduler;

import com.adjust.sdk.ILogger;
import java.util.concurrent.ScheduledFuture;

public class TimerOnce {
   private Runnable command;
   private ILogger logger;
   private String name;
   private FutureScheduler scheduler;
   private ScheduledFuture waitingTask;

   public TimerOnce(Runnable param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static String access$000(TimerOnce param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ILogger access$100(TimerOnce param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Runnable access$200(TimerOnce param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ScheduledFuture access$302(TimerOnce param0, ScheduledFuture param1) {
      // $FF: Couldn't be decompiled
   }

   private void cancel(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void cancel() {
      // $FF: Couldn't be decompiled
   }

   public long getFireIn() {
      // $FF: Couldn't be decompiled
   }

   public void startIn(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void teardown() {
      // $FF: Couldn't be decompiled
   }
}
