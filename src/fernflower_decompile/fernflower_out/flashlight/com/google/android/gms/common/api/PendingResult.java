package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.TimeUnit;

@KeepForSdk
public abstract class PendingResult {
   public PendingResult() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void addStatusListener(PendingResult.StatusListener param1) {
      // $FF: Couldn't be decompiled
   }

   public abstract Result await();

   public abstract Result await(long var1, TimeUnit var3);

   public abstract void cancel();

   public abstract boolean isCanceled();

   public abstract void setResultCallback(ResultCallback var1);

   public abstract void setResultCallback(ResultCallback var1, long var2, TimeUnit var4);

   public TransformedResult then(ResultTransform param1) {
      // $FF: Couldn't be decompiled
   }

   public Integer zam() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public interface StatusListener {
      @KeepForSdk
      void onComplete(Status var1);
   }
}
