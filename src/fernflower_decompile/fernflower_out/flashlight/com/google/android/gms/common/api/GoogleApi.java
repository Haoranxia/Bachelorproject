package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zace;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.tasks.Task;

@KeepForSdk
public class GoogleApi {
   private final Api mApi;
   private final Context mContext;
   private final int mId;
   private final Api.ApiOptions zabh;
   private final zai zabi;
   private final Looper zabj;
   private final GoogleApiClient zabk;
   private final StatusExceptionMapper zabl;
   protected final GoogleApiManager zabm;

   @KeepForSdk
   public GoogleApi(Activity param1, Api param2, Api.ApiOptions param3, GoogleApi.Settings param4) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   @KeepForSdk
   public GoogleApi(Activity param1, Api param2, Api.ApiOptions param3, StatusExceptionMapper param4) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected GoogleApi(Context param1, Api param2, Looper param3) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   @KeepForSdk
   public GoogleApi(Context param1, Api param2, Api.ApiOptions param3, Looper param4, StatusExceptionMapper param5) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public GoogleApi(Context param1, Api param2, Api.ApiOptions param3, GoogleApi.Settings param4) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   @KeepForSdk
   public GoogleApi(Context param1, Api param2, Api.ApiOptions param3, StatusExceptionMapper param4) {
      // $FF: Couldn't be decompiled
   }

   private final BaseImplementation.ApiMethodImpl zaa(int param1, BaseImplementation.ApiMethodImpl param2) {
      // $FF: Couldn't be decompiled
   }

   private final Task zaa(int param1, TaskApiCall param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public GoogleApiClient asGoogleApiClient() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected ClientSettings.Builder createClientSettingsBuilder() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected Task disconnectService() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public BaseImplementation.ApiMethodImpl doBestEffortWrite(BaseImplementation.ApiMethodImpl param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Task doBestEffortWrite(TaskApiCall param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public BaseImplementation.ApiMethodImpl doRead(BaseImplementation.ApiMethodImpl param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Task doRead(TaskApiCall param1) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   @KeepForSdk
   public Task doRegisterEventListener(RegisterListenerMethod param1, UnregisterListenerMethod param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Task doRegisterEventListener(RegistrationMethods param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Task doUnregisterEventListener(ListenerHolder.ListenerKey param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public BaseImplementation.ApiMethodImpl doWrite(BaseImplementation.ApiMethodImpl param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Task doWrite(TaskApiCall param1) {
      // $FF: Couldn't be decompiled
   }

   public final Api getApi() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Api.ApiOptions getApiOptions() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Context getApplicationContext() {
      // $FF: Couldn't be decompiled
   }

   public final int getInstanceId() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Looper getLooper() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public ListenerHolder registerListener(Object param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public Api.Client zaa(Looper param1, GoogleApiManager.zaa param2) {
      // $FF: Couldn't be decompiled
   }

   public zace zaa(Context param1, Handler param2) {
      // $FF: Couldn't be decompiled
   }

   public final zai zak() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static class Settings {
      @KeepForSdk
      public static final GoogleApi.Settings DEFAULT_SETTINGS;
      public final StatusExceptionMapper zabn;
      public final Looper zabo;

      static {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      private Settings(StatusExceptionMapper param1, Account param2, Looper param3) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      Settings(StatusExceptionMapper param1, Account param2, Looper param3, zab param4) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public static class Builder {
         private Looper zabj;
         private StatusExceptionMapper zabl;

         @KeepForSdk
         public Builder() {
            // $FF: Couldn't be decompiled
         }

         @KeepForSdk
         public GoogleApi.Settings build() {
            // $FF: Couldn't be decompiled
         }

         @KeepForSdk
         public GoogleApi.Settings.Builder setLooper(Looper param1) {
            // $FF: Couldn't be decompiled
         }

         @KeepForSdk
         public GoogleApi.Settings.Builder setMapper(StatusExceptionMapper param1) {
            // $FF: Couldn't be decompiled
         }
      }
   }
}
