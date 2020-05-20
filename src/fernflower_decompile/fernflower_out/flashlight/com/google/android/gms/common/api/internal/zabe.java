package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ClientSettings;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zabe implements zabs, zar {
   private final Context mContext;
   private final Api.AbstractClientBuilder zace;
   final zaaw zaee;
   private final Lock zaeo;
   private final ClientSettings zaet;
   private final Map zaew;
   private final GoogleApiAvailabilityLight zaey;
   final Map zagz;
   private final Condition zahn;
   private final zabg zaho;
   final Map zahp;
   private volatile zabd zahq;
   private ConnectionResult zahr;
   int zahs;
   final zabt zaht;

   public zabe(Context param1, zaaw param2, Lock param3, Looper param4, GoogleApiAvailabilityLight param5, Map param6, ClientSettings param7, Map param8, Api.AbstractClientBuilder param9, ArrayList param10, zabt param11) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Lock zaa(zabe param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static zabd zab(zabe param0) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   public final ConnectionResult blockingConnect() {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   public final ConnectionResult blockingConnect(long param1, TimeUnit param3) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   public final void connect() {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   public final void disconnect() {
      // $FF: Couldn't be decompiled
   }

   public final void dump(String param1, FileDescriptor param2, PrintWriter param3, String[] param4) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl param1) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl param1) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   public final ConnectionResult getConnectionResult(Api param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean isConnected() {
      // $FF: Couldn't be decompiled
   }

   public final boolean isConnecting() {
      // $FF: Couldn't be decompiled
   }

   public final boolean maybeSignIn(SignInConnectionListener param1) {
      // $FF: Couldn't be decompiled
   }

   public final void maybeSignOut() {
      // $FF: Couldn't be decompiled
   }

   public final void onConnected(Bundle param1) {
      // $FF: Couldn't be decompiled
   }

   public final void onConnectionSuspended(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zaa(ConnectionResult param1, Api param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   final void zaa(zabf param1) {
      // $FF: Couldn't be decompiled
   }

   final void zaaz() {
      // $FF: Couldn't be decompiled
   }

   final void zab(RuntimeException param1) {
      // $FF: Couldn't be decompiled
   }

   final void zaba() {
      // $FF: Couldn't be decompiled
   }

   final void zaf(ConnectionResult param1) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   public final void zaw() {
      // $FF: Couldn't be decompiled
   }
}
