package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.DataHolder;

@KeepForSdk
public abstract class DataHolderNotifier implements ListenerHolder.Notifier {
   private final DataHolder mDataHolder;

   @KeepForSdk
   protected DataHolderNotifier(DataHolder param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final void notifyListener(Object param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected abstract void notifyListener(Object var1, DataHolder var2);

   @KeepForSdk
   public void onNotifyListenerFailed() {
      // $FF: Couldn't be decompiled
   }
}
