package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class UnregisterListenerMethod {
   private final ListenerHolder.ListenerKey zajl;

   @KeepForSdk
   protected UnregisterListenerMethod(ListenerHolder.ListenerKey param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public ListenerHolder.ListenerKey getListenerKey() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected abstract void unregisterListener(Api.AnyClient var1, TaskCompletionSource var2);
}
