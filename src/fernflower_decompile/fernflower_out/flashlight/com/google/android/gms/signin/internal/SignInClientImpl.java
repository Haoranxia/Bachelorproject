package com.google.android.gms.signin.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.signin.SignInOptions;

@KeepForSdk
public class SignInClientImpl extends GmsClient implements com.google.android.gms.signin.zad {
   private final ClientSettings zaet;
   private Integer zaoe;
   private final boolean zasb;
   private final Bundle zasc;

   private SignInClientImpl(Context param1, Looper param2, boolean param3, ClientSettings param4, Bundle param5, GoogleApiClient.ConnectionCallbacks param6, GoogleApiClient.OnConnectionFailedListener param7) {
      // $FF: Couldn't be decompiled
   }

   public SignInClientImpl(Context param1, Looper param2, boolean param3, ClientSettings param4, SignInOptions param5, GoogleApiClient.ConnectionCallbacks param6, GoogleApiClient.OnConnectionFailedListener param7) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static Bundle createBundleFromClientSettings(ClientSettings param0) {
      // $FF: Couldn't be decompiled
   }

   public final void connect() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   protected IInterface createServiceInterface(IBinder param1) {
      // $FF: Couldn't be decompiled
   }

   protected Bundle getGetServiceRequestExtraArgs() {
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

   public boolean requiresSignIn() {
      // $FF: Couldn't be decompiled
   }

   public final void zaa(IAccountAccessor param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zaa(zad param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zacw() {
      // $FF: Couldn't be decompiled
   }
}
