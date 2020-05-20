package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
@KeepForSdk
public final class GoogleServices {
   private static final Object sLock;
   @GuardedBy("sLock")
   private static GoogleServices zzay;
   private final String zzaz;
   private final Status zzba;
   private final boolean zzbb;
   private final boolean zzbc;

   static {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   @VisibleForTesting
   GoogleServices(Context param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   @VisibleForTesting
   GoogleServices(String param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   private static GoogleServices checkInitialized(String param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   @VisibleForTesting
   static void clearInstanceForTest() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static String getGoogleAppId() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static Status initialize(Context param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static Status initialize(Context param0, String param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static boolean isMeasurementEnabled() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static boolean isMeasurementExplicitlyDisabled() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   @VisibleForTesting
   final Status checkGoogleAppId(String param1) {
      // $FF: Couldn't be decompiled
   }
}
