package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Set;

@KeepForSdk
public abstract class GmsClient extends BaseGmsClient implements Api.Client, GmsClientEventManager.GmsClientEventState {
   private final Set mScopes;
   private final ClientSettings zaet;
   private final Account zax;

   @KeepForSdk
   @VisibleForTesting
   protected GmsClient(Context param1, Handler param2, int param3, ClientSettings param4) {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   protected GmsClient(Context param1, Handler param2, GmsClientSupervisor param3, GoogleApiAvailability param4, int param5, ClientSettings param6, GoogleApiClient.ConnectionCallbacks param7, GoogleApiClient.OnConnectionFailedListener param8) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected GmsClient(Context param1, Looper param2, int param3, ClientSettings param4) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected GmsClient(Context param1, Looper param2, int param3, ClientSettings param4, GoogleApiClient.ConnectionCallbacks param5, GoogleApiClient.OnConnectionFailedListener param6) {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   protected GmsClient(Context param1, Looper param2, GmsClientSupervisor param3, GoogleApiAvailability param4, int param5, ClientSettings param6, GoogleApiClient.ConnectionCallbacks param7, GoogleApiClient.OnConnectionFailedListener param8) {
      // $FF: Couldn't be decompiled
   }

   private static BaseGmsClient.BaseConnectionCallbacks zaa(GoogleApiClient.ConnectionCallbacks param0) {
      // $FF: Couldn't be decompiled
   }

   private static BaseGmsClient.BaseOnConnectionFailedListener zaa(GoogleApiClient.OnConnectionFailedListener param0) {
      // $FF: Couldn't be decompiled
   }

   private final Set zaa(Set param1) {
      // $FF: Couldn't be decompiled
   }

   public final Account getAccount() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected final ClientSettings getClientSettings() {
      // $FF: Couldn't be decompiled
   }

   public int getMinApkVersion() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Feature[] getRequiredFeatures() {
      // $FF: Couldn't be decompiled
   }

   protected final Set getScopes() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected Set validateScopes(Set param1) {
      // $FF: Couldn't be decompiled
   }
}
