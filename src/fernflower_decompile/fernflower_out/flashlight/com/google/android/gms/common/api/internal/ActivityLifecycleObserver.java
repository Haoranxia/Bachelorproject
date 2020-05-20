package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract class ActivityLifecycleObserver {
   public ActivityLifecycleObserver() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static final ActivityLifecycleObserver of(Activity param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public abstract ActivityLifecycleObserver onStopCallOnce(Runnable var1);
}
