package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class TaskApiCall {
   private final Feature[] zake;
   private final boolean zakl;

   @Deprecated
   @KeepForSdk
   public TaskApiCall() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   private TaskApiCall(Feature[] param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   TaskApiCall(Feature[] param1, boolean param2, zaci param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static TaskApiCall.Builder builder() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected abstract void doExecute(Api.AnyClient var1, TaskCompletionSource var2);

   @KeepForSdk
   public boolean shouldAutoResolveMissingFeatures() {
      // $FF: Couldn't be decompiled
   }

   public final Feature[] zabt() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static class Builder {
      private Feature[] zake;
      private boolean zakl;
      private RemoteCall zakm;

      private Builder() {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      Builder(zaci param1) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static RemoteCall zaa(TaskApiCall.Builder param0) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public TaskApiCall build() {
         // $FF: Couldn't be decompiled
      }

      @Deprecated
      @KeepForSdk
      public TaskApiCall.Builder execute(BiConsumer param1) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public TaskApiCall.Builder run(RemoteCall param1) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public TaskApiCall.Builder setAutoResolveMissingFeatures(boolean param1) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public TaskApiCall.Builder setFeatures(Feature... param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
