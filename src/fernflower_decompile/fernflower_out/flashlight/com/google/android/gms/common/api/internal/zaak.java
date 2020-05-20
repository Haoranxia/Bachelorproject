package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zaak implements zabd {
   private final Context mContext;
   private final Api.AbstractClientBuilder zace;
   private final Lock zaeo;
   private final ClientSettings zaet;
   private final Map zaew;
   private final GoogleApiAvailabilityLight zaey;
   private ConnectionResult zafh;
   private final zabe zaft;
   private int zafw;
   private int zafx;
   private int zafy;
   private final Bundle zafz;
   private final Set zaga;
   private com.google.android.gms.signin.zad zagb;
   private boolean zagc;
   private boolean zagd;
   private boolean zage;
   private IAccountAccessor zagf;
   private boolean zagg;
   private boolean zagh;
   private ArrayList zagi;

   public zaak(zabe param1, ClientSettings param2, Map param3, GoogleApiAvailabilityLight param4, Api.AbstractClientBuilder param5, Lock param6, Context param7) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Context zaa(zaak param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zaa(zaak param0, ConnectionResult param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zaa(zaak param0, ConnectionResult param1, Api param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zaa(zaak param0, com.google.android.gms.signin.internal.zaj param1) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final void zaa(com.google.android.gms.signin.internal.zaj param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zaa(zaak param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final boolean zaao() {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final void zaap() {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final void zaaq() {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final void zaar() {
      // $FF: Couldn't be decompiled
   }

   private final void zaas() {
      // $FF: Couldn't be decompiled
   }

   private final Set zaat() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static GoogleApiAvailabilityLight zab(zaak param0) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final void zab(ConnectionResult param1, Api param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final void zab(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zab(zaak param0, ConnectionResult param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Lock zac(zaak param0) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final boolean zac(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static zabe zad(zaak param0) {
      // $FF: Couldn't be decompiled
   }

   private static String zad(int param0) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final boolean zad(ConnectionResult param1) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final void zae(ConnectionResult param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zae(zaak param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static com.google.android.gms.signin.zad zaf(zaak param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Set zag(zaak param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static IAccountAccessor zah(zaak param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ClientSettings zai(zaak param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zaj(zaak param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zak(zaak param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zal(zaak param0) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   public final void begin() {
      // $FF: Couldn't be decompiled
   }

   public final void connect() {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   public final boolean disconnect() {
      // $FF: Couldn't be decompiled
   }

   public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl param1) {
      // $FF: Couldn't be decompiled
   }

   public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl param1) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   public final void onConnected(Bundle param1) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   public final void onConnectionSuspended(int param1) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   public final void zaa(ConnectionResult param1, Api param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }
}
