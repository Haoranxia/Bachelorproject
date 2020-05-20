package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
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
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

final class zas implements zabs {
   private final Context mContext;
   private final Looper zabj;
   private final zaaw zaee;
   private final zabe zaef;
   private final zabe zaeg;
   private final Map zaeh;
   private final Set zaei;
   private final Api.Client zaej;
   private Bundle zaek;
   private ConnectionResult zael;
   private ConnectionResult zaem;
   private boolean zaen;
   private final Lock zaeo;
   @GuardedBy("mLock")
   private int zaep;

   private zas(Context param1, zaaw param2, Lock param3, Looper param4, GoogleApiAvailabilityLight param5, Map param6, Map param7, ClientSettings param8, Api.AbstractClientBuilder param9, Api.Client param10, ArrayList param11, ArrayList param12, Map param13, Map param14) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ConnectionResult zaa(zas param0, ConnectionResult param1) {
      // $FF: Couldn't be decompiled
   }

   public static zas zaa(Context param0, zaaw param1, Lock param2, Looper param3, GoogleApiAvailabilityLight param4, Map param5, ClientSettings param6, Map param7, Api.AbstractClientBuilder param8, ArrayList param9) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Lock zaa(zas param0) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final void zaa(int param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   private final void zaa(Bundle param1) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final void zaa(ConnectionResult param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zaa(zas param0, int param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zaa(zas param0, Bundle param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean zaa(BaseImplementation.ApiMethodImpl param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zaa(zas param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private final PendingIntent zaaa() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ConnectionResult zab(zas param0, ConnectionResult param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zab(zas param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean zab(ConnectionResult param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zac(zas param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ConnectionResult zad(zas param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static zabe zae(zas param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static zabe zaf(zas param0) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final void zax() {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final void zay() {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final boolean zaz() {
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

   @GuardedBy("mLock")
   public final void zaw() {
      // $FF: Couldn't be decompiled
   }
}
