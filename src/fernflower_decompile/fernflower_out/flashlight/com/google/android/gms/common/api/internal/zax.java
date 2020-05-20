package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ClientSettings;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zax implements zabs {
   private final Looper zabj;
   private final GoogleApiManager zabm;
   private final Lock zaeo;
   private final ClientSettings zaet;
   private final Map zaeu;
   private final Map zaev;
   private final Map zaew;
   private final zaaw zaex;
   private final GoogleApiAvailabilityLight zaey;
   private final Condition zaez;
   private final boolean zafa;
   private final boolean zafb;
   private final Queue zafc;
   @GuardedBy("mLock")
   private boolean zafd;
   @GuardedBy("mLock")
   private Map zafe;
   @GuardedBy("mLock")
   private Map zaff;
   @GuardedBy("mLock")
   private zaaa zafg;
   @GuardedBy("mLock")
   private ConnectionResult zafh;

   public zax(Context param1, Lock param2, Looper param3, GoogleApiAvailabilityLight param4, Map param5, ClientSettings param6, Map param7, Api.AbstractClientBuilder param8, ArrayList param9, zaaw param10, boolean param11) {
      // $FF: Couldn't be decompiled
   }

   private final ConnectionResult zaa(Api.AnyClientKey param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ConnectionResult zaa(zax param0, ConnectionResult param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Map zaa(zax param0, Map param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Lock zaa(zax param0) {
      // $FF: Couldn't be decompiled
   }

   private final boolean zaa(zaw param1, ConnectionResult param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zaa(zax param0, zaw param1, ConnectionResult param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zaa(zax param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean zaac() {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final void zaad() {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final void zaae() {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final ConnectionResult zaaf() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Map zab(zax param0, Map param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean zab(BaseImplementation.ApiMethodImpl param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zab(zax param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Map zac(zax param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Map zad(zax param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zae(zax param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ConnectionResult zaf(zax param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Map zag(zax param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ConnectionResult zah(zax param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zai(zax param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zaj(zax param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static zaaw zak(zax param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Condition zal(zax param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Map zam(zax param0) {
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

   public final void connect() {
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

   public final void zaw() {
      // $FF: Couldn't be decompiled
   }
}
