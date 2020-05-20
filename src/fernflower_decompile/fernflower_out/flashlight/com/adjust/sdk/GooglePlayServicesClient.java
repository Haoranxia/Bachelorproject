package com.adjust.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.LinkedBlockingQueue;

public class GooglePlayServicesClient {
   public GooglePlayServicesClient() {
      // $FF: Couldn't be decompiled
   }

   public static GooglePlayServicesClient.GooglePlayServicesInfo getGooglePlayServicesInfo(Context param0) {
      // $FF: Couldn't be decompiled
   }

   private static final class GooglePlayServicesConnection implements ServiceConnection {
      private final LinkedBlockingQueue queue;
      boolean retrieved;

      private GooglePlayServicesConnection() {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      GooglePlayServicesConnection(Object param1) {
         // $FF: Couldn't be decompiled
      }

      public IBinder getBinder() {
         // $FF: Couldn't be decompiled
      }

      public void onServiceConnected(ComponentName param1, IBinder param2) {
         // $FF: Couldn't be decompiled
      }

      public void onServiceDisconnected(ComponentName param1) {
         // $FF: Couldn't be decompiled
      }
   }

   public static final class GooglePlayServicesInfo {
      private final String gpsAdid;
      private final Boolean trackingEnabled;

      GooglePlayServicesInfo(String param1, Boolean param2) {
         // $FF: Couldn't be decompiled
      }

      public String getGpsAdid() {
         // $FF: Couldn't be decompiled
      }

      public Boolean isTrackingEnabled() {
         // $FF: Couldn't be decompiled
      }
   }

   private static final class GooglePlayServicesInterface implements IInterface {
      private IBinder binder;

      public GooglePlayServicesInterface(IBinder param1) {
         // $FF: Couldn't be decompiled
      }

      public IBinder asBinder() {
         // $FF: Couldn't be decompiled
      }

      public String getGpsAdid() {
         // $FF: Couldn't be decompiled
      }

      public Boolean getTrackingEnabled(boolean param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
