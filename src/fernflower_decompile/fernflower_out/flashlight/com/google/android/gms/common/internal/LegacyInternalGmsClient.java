package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

@Deprecated
public abstract class LegacyInternalGmsClient extends GmsClient {
   private final GmsClientEventManager zags;

   public LegacyInternalGmsClient(Context param1, int param2, ClientSettings param3, GoogleApiClient.ConnectionCallbacks param4, GoogleApiClient.OnConnectionFailedListener param5) {
      // $FF: Couldn't be decompiled
   }

   public void checkAvailabilityAndConnect() {
      // $FF: Couldn't be decompiled
   }

   public void disconnect() {
      // $FF: Couldn't be decompiled
   }

   public int getMinApkVersion() {
      // $FF: Couldn't be decompiled
   }

   public boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener param1) {
      // $FF: Couldn't be decompiled
   }

   public void onConnectedLocked(IInterface param1) {
      // $FF: Couldn't be decompiled
   }

   public void onConnectionFailed(ConnectionResult param1) {
      // $FF: Couldn't be decompiled
   }

   public void onConnectionSuspended(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks param1) {
      // $FF: Couldn't be decompiled
   }

   public void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener param1) {
      // $FF: Couldn't be decompiled
   }

   public void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks param1) {
      // $FF: Couldn't be decompiled
   }

   public void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener param1) {
      // $FF: Couldn't be decompiled
   }
}
