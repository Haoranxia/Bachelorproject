package com.google.android.gms.common.api;

import android.app.Activity;
import com.google.android.gms.common.annotation.KeepForSdk;

public abstract class ResolvingResultCallbacks extends ResultCallbacks {
   private final Activity mActivity;
   private final int zzao;

   protected ResolvingResultCallbacks(Activity param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final void onFailure(Status param1) {
      // $FF: Couldn't be decompiled
   }

   public abstract void onSuccess(Result var1);

   public abstract void onUnresolvableFailure(Status var1);
}
