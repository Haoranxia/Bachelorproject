package com.google.android.gms.common.providers;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;

@KeepForSdk
public class PooledExecutorsProvider {
   private static PooledExecutorsProvider.PooledExecutorFactory zzey;

   private PooledExecutorsProvider() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static PooledExecutorsProvider.PooledExecutorFactory getInstance() {
      // $FF: Couldn't be decompiled
   }

   public interface PooledExecutorFactory {
      @KeepForSdk
      ScheduledExecutorService newSingleThreadScheduledExecutor();
   }
}
