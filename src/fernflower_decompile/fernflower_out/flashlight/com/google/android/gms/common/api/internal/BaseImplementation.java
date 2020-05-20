package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

@KeepForSdk
public class BaseImplementation {
   public BaseImplementation() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public abstract static class ApiMethodImpl extends BasePendingResult implements BaseImplementation.ResultHolder {
      @KeepForSdk
      private final Api mApi;
      @KeepForSdk
      private final Api.AnyClientKey mClientKey;

      @Deprecated
      @KeepForSdk
      protected ApiMethodImpl(Api.AnyClientKey param1, GoogleApiClient param2) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      protected ApiMethodImpl(Api param1, GoogleApiClient param2) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      protected ApiMethodImpl(BasePendingResult.CallbackHandler param1) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      private void setFailedResult(RemoteException param1) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      protected abstract void doExecute(Api.AnyClient var1);

      @KeepForSdk
      public final Api getApi() {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public final Api.AnyClientKey getClientKey() {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      protected void onSetFailedResult(Result param1) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public final void run(Api.AnyClient param1) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public final void setFailedResult(Status param1) {
         // $FF: Couldn't be decompiled
      }
   }

   @KeepForSdk
   public interface ResultHolder {
      @KeepForSdk
      void setFailedResult(Status var1);

      @KeepForSdk
      void setResult(Object var1);
   }
}
