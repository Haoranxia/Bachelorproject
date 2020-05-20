package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;

public abstract class ResultCallbacks implements ResultCallback {
   public ResultCallbacks() {
      // $FF: Couldn't be decompiled
   }

   public abstract void onFailure(Status var1);

   @KeepForSdk
   public final void onResult(Result param1) {
      // $FF: Couldn't be decompiled
   }

   public abstract void onSuccess(Result var1);
}
