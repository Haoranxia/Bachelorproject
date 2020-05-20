package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Handler.Callback;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public class GoogleApiManager implements Callback {
   private static final Object lock;
   public static final Status zahx;
   private static final Status zahy;
   @GuardedBy("lock")
   private static GoogleApiManager zaic;
   private final Handler handler;
   private long zahz;
   private long zaia;
   private long zaib;
   private final Context zaid;
   private final GoogleApiAvailability zaie;
   private final GoogleApiAvailabilityCache zaif;
   private final AtomicInteger zaig;
   private final AtomicInteger zaih;
   private final Map zaii;
   @GuardedBy("lock")
   private zaae zaij;
   @GuardedBy("lock")
   private final Set zaik;
   private final Set zail;

   static {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   private GoogleApiManager(Context param1, Looper param2, GoogleApiAvailability param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static void reportSignOut() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Handler zaa(GoogleApiManager param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Context zab(GoogleApiManager param0) {
      // $FF: Couldn't be decompiled
   }

   public static GoogleApiManager zab(Context param0) {
      // $FF: Couldn't be decompiled
   }

   private final void zab(GoogleApi param1) {
      // $FF: Couldn't be decompiled
   }

   public static GoogleApiManager zabc() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Object zabe() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Status zabf() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static long zac(GoogleApiManager param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static long zad(GoogleApiManager param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static GoogleApiAvailabilityCache zae(GoogleApiManager param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static zaae zaf(GoogleApiManager param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Set zag(GoogleApiManager param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static GoogleApiAvailability zah(GoogleApiManager param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static long zai(GoogleApiManager param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Map zaj(GoogleApiManager param0) {
      // $FF: Couldn't be decompiled
   }

   public boolean handleMessage(Message param1) {
      // $FF: Couldn't be decompiled
   }

   final void maybeSignOut() {
      // $FF: Couldn't be decompiled
   }

   final PendingIntent zaa(zai param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final Task zaa(GoogleApi param1, ListenerHolder.ListenerKey param2) {
      // $FF: Couldn't be decompiled
   }

   public final Task zaa(GoogleApi param1, RegisterListenerMethod param2, UnregisterListenerMethod param3) {
      // $FF: Couldn't be decompiled
   }

   public final Task zaa(Iterable param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zaa(ConnectionResult param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zaa(GoogleApi param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zaa(GoogleApi param1, int param2, BaseImplementation.ApiMethodImpl param3) {
      // $FF: Couldn't be decompiled
   }

   public final void zaa(GoogleApi param1, int param2, TaskApiCall param3, TaskCompletionSource param4, StatusExceptionMapper param5) {
      // $FF: Couldn't be decompiled
   }

   public final void zaa(zaae param1) {
      // $FF: Couldn't be decompiled
   }

   final void zab(zaae param1) {
      // $FF: Couldn't be decompiled
   }

   public final int zabd() {
      // $FF: Couldn't be decompiled
   }

   public final Task zac(GoogleApi param1) {
      // $FF: Couldn't be decompiled
   }

   final boolean zac(ConnectionResult param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zao() {
      // $FF: Couldn't be decompiled
   }

   public final class zaa implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zar {
      private final zai zafq;
      // $FF: synthetic field
      final GoogleApiManager zaim;
      private final Queue zain;
      private final Api.Client zaio;
      private final Api.AnyClient zaip;
      private final zaab zaiq;
      private final Set zair;
      private final Map zais;
      private final int zait;
      private final zace zaiu;
      private boolean zaiv;
      private final List zaiw;
      private ConnectionResult zaix;

      public zaa(GoogleApiManager param1, GoogleApi param2) {
         // $FF: Couldn't be decompiled
      }

      private final Feature zaa(Feature[] param1) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static void zaa(GoogleApiManager.zaa param0, GoogleApiManager.zab param1) {
         // $FF: Couldn't be decompiled
      }

      private final void zaa(GoogleApiManager.zab param1) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static boolean zaa(GoogleApiManager.zaa param0, boolean param1) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static void zab(GoogleApiManager.zaa param0, GoogleApiManager.zab param1) {
         // $FF: Couldn't be decompiled
      }

      private final void zab(GoogleApiManager.zab param1) {
         // $FF: Couldn't be decompiled
      }

      private final boolean zab(com.google.android.gms.common.api.internal.zab param1) {
         // $FF: Couldn't be decompiled
      }

      private final void zabg() {
         // $FF: Couldn't be decompiled
      }

      private final void zabh() {
         // $FF: Couldn't be decompiled
      }

      private final void zabi() {
         // $FF: Couldn't be decompiled
      }

      private final void zabn() {
         // $FF: Couldn't be decompiled
      }

      private final void zabo() {
         // $FF: Couldn't be decompiled
      }

      private final void zac(com.google.android.gms.common.api.internal.zab param1) {
         // $FF: Couldn't be decompiled
      }

      private final boolean zac(boolean param1) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static void zae(GoogleApiManager.zaa param0) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static void zaf(GoogleApiManager.zaa param0) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static Api.Client zag(GoogleApiManager.zaa param0) {
         // $FF: Couldn't be decompiled
      }

      private final boolean zah(ConnectionResult param1) {
         // $FF: Couldn't be decompiled
      }

      private final void zai(ConnectionResult param1) {
         // $FF: Couldn't be decompiled
      }

      public final void connect() {
         // $FF: Couldn't be decompiled
      }

      public final int getInstanceId() {
         // $FF: Couldn't be decompiled
      }

      final boolean isConnected() {
         // $FF: Couldn't be decompiled
      }

      public final void onConnected(Bundle param1) {
         // $FF: Couldn't be decompiled
      }

      public final void onConnectionFailed(ConnectionResult param1) {
         // $FF: Couldn't be decompiled
      }

      public final void onConnectionSuspended(int param1) {
         // $FF: Couldn't be decompiled
      }

      public final boolean requiresSignIn() {
         // $FF: Couldn't be decompiled
      }

      public final void resume() {
         // $FF: Couldn't be decompiled
      }

      public final void zaa(ConnectionResult param1, Api param2, boolean param3) {
         // $FF: Couldn't be decompiled
      }

      public final void zaa(com.google.android.gms.common.api.internal.zab param1) {
         // $FF: Couldn't be decompiled
      }

      public final void zaa(zak param1) {
         // $FF: Couldn't be decompiled
      }

      public final Api.Client zaab() {
         // $FF: Couldn't be decompiled
      }

      public final void zaav() {
         // $FF: Couldn't be decompiled
      }

      public final void zabj() {
         // $FF: Couldn't be decompiled
      }

      public final Map zabk() {
         // $FF: Couldn't be decompiled
      }

      public final void zabl() {
         // $FF: Couldn't be decompiled
      }

      public final ConnectionResult zabm() {
         // $FF: Couldn't be decompiled
      }

      public final boolean zabp() {
         // $FF: Couldn't be decompiled
      }

      final com.google.android.gms.signin.zad zabq() {
         // $FF: Couldn't be decompiled
      }

      public final void zac(Status param1) {
         // $FF: Couldn't be decompiled
      }

      public final void zag(ConnectionResult param1) {
         // $FF: Couldn't be decompiled
      }
   }

   private static final class zab {
      private final zai zajb;
      private final Feature zajc;

      private zab(zai param1, Feature param2) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      zab(zai param1, Feature param2, zabi param3) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static zai zac(GoogleApiManager.zab param0) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static Feature zad(GoogleApiManager.zab param0) {
         // $FF: Couldn't be decompiled
      }

      public final boolean equals(Object param1) {
         // $FF: Couldn't be decompiled
      }

      public final int hashCode() {
         // $FF: Couldn't be decompiled
      }

      public final String toString() {
         // $FF: Couldn't be decompiled
      }
   }

   private final class zac implements zach, BaseGmsClient.ConnectionProgressReportCallbacks {
      private final zai zafq;
      // $FF: synthetic field
      final GoogleApiManager zaim;
      private final Api.Client zaio;
      private IAccountAccessor zajd;
      private Set zaje;
      private boolean zajf;

      public zac(GoogleApiManager param1, Api.Client param2, zai param3) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static Api.Client zaa(GoogleApiManager.zac param0) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static boolean zaa(GoogleApiManager.zac param0, boolean param1) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static void zab(GoogleApiManager.zac param0) {
         // $FF: Couldn't be decompiled
      }

      private final void zabr() {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static zai zac(GoogleApiManager.zac param0) {
         // $FF: Couldn't be decompiled
      }

      public final void onReportServiceBinding(ConnectionResult param1) {
         // $FF: Couldn't be decompiled
      }

      public final void zaa(IAccountAccessor param1, Set param2) {
         // $FF: Couldn't be decompiled
      }

      public final void zag(ConnectionResult param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
