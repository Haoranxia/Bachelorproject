package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public class RegistrationMethods {
   public final RegisterListenerMethod zajz;
   public final UnregisterListenerMethod zaka;

   private RegistrationMethods(RegisterListenerMethod param1, UnregisterListenerMethod param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   RegistrationMethods(RegisterListenerMethod param1, UnregisterListenerMethod param2, zabx param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static RegistrationMethods.Builder builder() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static class Builder {
      private boolean zajw;
      private RemoteCall zakb;
      private RemoteCall zakc;
      private ListenerHolder zakd;
      private Feature[] zake;

      private Builder() {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      Builder(zabx param1) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static RemoteCall zaa(RegistrationMethods.Builder param0) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static RemoteCall zab(RegistrationMethods.Builder param0) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public RegistrationMethods build() {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public RegistrationMethods.Builder register(RemoteCall param1) {
         // $FF: Couldn't be decompiled
      }

      @Deprecated
      @KeepForSdk
      public RegistrationMethods.Builder register(BiConsumer param1) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public RegistrationMethods.Builder setAutoResolveMissingFeatures(boolean param1) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public RegistrationMethods.Builder setFeatures(Feature[] param1) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public RegistrationMethods.Builder unregister(RemoteCall param1) {
         // $FF: Couldn't be decompiled
      }

      @Deprecated
      @KeepForSdk
      public RegistrationMethods.Builder unregister(BiConsumer param1) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public RegistrationMethods.Builder withHolder(ListenerHolder param1) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      final void zaa(Api.AnyClient param1, TaskCompletionSource param2) {
         // $FF: Couldn't be decompiled
      }
   }
}
