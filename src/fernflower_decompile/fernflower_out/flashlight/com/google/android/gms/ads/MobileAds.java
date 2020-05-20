package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzxv;

public class MobileAds {
   private MobileAds() {
      // $FF: Couldn't be decompiled
   }

   public static InitializationStatus getInitializationStatus() {
      // $FF: Couldn't be decompiled
   }

   public static RequestConfiguration getRequestConfiguration() {
      // $FF: Couldn't be decompiled
   }

   public static RewardedVideoAd getRewardedVideoAdInstance(Context param0) {
      // $FF: Couldn't be decompiled
   }

   public static String getVersionString() {
      // $FF: Couldn't be decompiled
   }

   public static void initialize(Context param0) {
      // $FF: Couldn't be decompiled
   }

   public static void initialize(Context param0, OnInitializationCompleteListener param1) {
      // $FF: Couldn't be decompiled
   }

   public static void initialize(Context param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public static void initialize(Context param0, String param1, MobileAds.Settings param2) {
      // $FF: Couldn't be decompiled
   }

   public static void openDebugMenu(Context param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static void registerRtbAdapter(Class param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setAppMuted(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setAppVolume(float param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setRequestConfiguration(RequestConfiguration param0) {
      // $FF: Couldn't be decompiled
   }

   public static final class Settings {
      private final zzxv zzabn;

      public Settings() {
         // $FF: Couldn't be decompiled
      }

      @Deprecated
      public final String getTrackingId() {
         // $FF: Couldn't be decompiled
      }

      @Deprecated
      public final boolean isGoogleAnalyticsEnabled() {
         // $FF: Couldn't be decompiled
      }

      @Deprecated
      public final MobileAds.Settings setGoogleAnalyticsEnabled(boolean param1) {
         // $FF: Couldn't be decompiled
      }

      @Deprecated
      public final MobileAds.Settings setTrackingId(String param1) {
         // $FF: Couldn't be decompiled
      }

      final zzxv zzdk() {
         // $FF: Couldn't be decompiled
      }
   }
}
