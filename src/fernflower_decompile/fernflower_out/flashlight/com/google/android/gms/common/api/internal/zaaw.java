package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClientEventManager;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zaaw extends GoogleApiClient implements zabt {
   private final Context mContext;
   private final Looper zabj;
   private final int zacb;
   private final GoogleApiAvailability zacd;
   private final Api.AbstractClientBuilder zace;
   private boolean zach;
   private final Lock zaeo;
   private final ClientSettings zaet;
   private final Map zaew;
   @VisibleForTesting
   final Queue zafc;
   private final GmsClientEventManager zags;
   private zabs zagt;
   private volatile boolean zagu;
   private long zagv;
   private long zagw;
   private final zabb zagx;
   @VisibleForTesting
   private zabq zagy;
   final Map zagz;
   Set zaha;
   private final ListenerHolders zahb;
   private final ArrayList zahc;
   private Integer zahd;
   Set zahe;
   final zacp zahf;
   private final GmsClientEventManager.GmsClientEventState zahg;

   public zaaw(Context param1, Lock param2, Looper param3, ClientSettings param4, GoogleApiAvailability param5, Api.AbstractClientBuilder param6, Map param7, List param8, List param9, Map param10, int param11, int param12, ArrayList param13, boolean param14) {
      // $FF: Couldn't be decompiled
   }

   private final void resume() {
      // $FF: Couldn't be decompiled
   }

   public static int zaa(Iterable param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private final void zaa(GoogleApiClient param1, StatusPendingResult param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zaa(zaaw param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zaa(zaaw param0, GoogleApiClient param1, StatusPendingResult param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final void zaau() {
      // $FF: Couldn't be decompiled
   }

   private final void zaav() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zab(zaaw param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Context zac(zaaw param0) {
      // $FF: Couldn't be decompiled
   }

   private final void zae(int param1) {
      // $FF: Couldn't be decompiled
   }

   private static String zaf(int param0) {
      // $FF: Couldn't be decompiled
   }

   public final ConnectionResult blockingConnect() {
      // $FF: Couldn't be decompiled
   }

   public final ConnectionResult blockingConnect(long param1, TimeUnit param3) {
      // $FF: Couldn't be decompiled
   }

   public final PendingResult clearDefaultAccountAndReconnect() {
      // $FF: Couldn't be decompiled
   }

   public final void connect() {
      // $FF: Couldn't be decompiled
   }

   public final void connect(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void disconnect() {
      // $FF: Couldn't be decompiled
   }

   public final void dump(String param1, FileDescriptor param2, PrintWriter param3, String[] param4) {
      // $FF: Couldn't be decompiled
   }

   public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl param1) {
      // $FF: Couldn't be decompiled
   }

   public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl param1) {
      // $FF: Couldn't be decompiled
   }

   public final Api.Client getClient(Api.AnyClientKey param1) {
      // $FF: Couldn't be decompiled
   }

   public final ConnectionResult getConnectionResult(Api param1) {
      // $FF: Couldn't be decompiled
   }

   public final Context getContext() {
      // $FF: Couldn't be decompiled
   }

   public final Looper getLooper() {
      // $FF: Couldn't be decompiled
   }

   public final boolean hasApi(Api param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean hasConnectedApi(Api param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean isConnected() {
      // $FF: Couldn't be decompiled
   }

   public final boolean isConnecting() {
      // $FF: Couldn't be decompiled
   }

   public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean maybeSignIn(SignInConnectionListener param1) {
      // $FF: Couldn't be decompiled
   }

   public final void maybeSignOut() {
      // $FF: Couldn't be decompiled
   }

   public final void reconnect() {
      // $FF: Couldn't be decompiled
   }

   public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks param1) {
      // $FF: Couldn't be decompiled
   }

   public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener param1) {
      // $FF: Couldn't be decompiled
   }

   public final ListenerHolder registerListener(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public final void stopAutoManage(c param1) {
      // $FF: Couldn't be decompiled
   }

   public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks param1) {
      // $FF: Couldn't be decompiled
   }

   public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zaa(zacm param1) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   final boolean zaaw() {
      // $FF: Couldn't be decompiled
   }

   final boolean zaax() {
      // $FF: Couldn't be decompiled
   }

   final String zaay() {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   public final void zab(int param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   public final void zab(Bundle param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zab(zacm param1) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   public final void zac(ConnectionResult param1) {
      // $FF: Couldn't be decompiled
   }
}
