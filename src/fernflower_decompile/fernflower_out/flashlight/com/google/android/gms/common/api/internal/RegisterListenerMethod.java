package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class RegisterListenerMethod {
   private final ListenerHolder zaju;
   private final Feature[] zajv;
   private final boolean zajw;

   @KeepForSdk
   protected RegisterListenerMethod(ListenerHolder param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected RegisterListenerMethod(ListenerHolder param1, Feature[] param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void clearListener() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public ListenerHolder.ListenerKey getListenerKey() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Feature[] getRequiredFeatures() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected abstract void registerListener(Api.AnyClient var1, TaskCompletionSource var2);

   public final boolean shouldAutoResolveMissingFeatures() {
      // $FF: Couldn't be decompiled
   }
}
