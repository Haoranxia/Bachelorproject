package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

public class SimpleClientAdapter extends GmsClient {
   private final Api.SimpleClient zapg;

   public SimpleClientAdapter(Context param1, Looper param2, int param3, GoogleApiClient.ConnectionCallbacks param4, GoogleApiClient.OnConnectionFailedListener param5, ClientSettings param6, Api.SimpleClient param7) {
      // $FF: Couldn't be decompiled
   }

   protected IInterface createServiceInterface(IBinder param1) {
      // $FF: Couldn't be decompiled
   }

   public Api.SimpleClient getClient() {
      // $FF: Couldn't be decompiled
   }

   public int getMinApkVersion() {
      // $FF: Couldn't be decompiled
   }

   protected String getServiceDescriptor() {
      // $FF: Couldn't be decompiled
   }

   protected String getStartServiceAction() {
      // $FF: Couldn't be decompiled
   }

   protected void onSetConnectState(int param1, IInterface param2) {
      // $FF: Couldn't be decompiled
   }
}
