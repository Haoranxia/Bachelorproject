package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

@KeepForSdk
public class DataHolderResult implements Releasable, Result {
   @KeepForSdk
   protected final DataHolder mDataHolder;
   @KeepForSdk
   protected final Status mStatus;

   @KeepForSdk
   protected DataHolderResult(DataHolder param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected DataHolderResult(DataHolder param1, Status param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Status getStatus() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void release() {
      // $FF: Couldn't be decompiled
   }
}
