package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdkWithMembers
@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
   @VisibleForTesting
   private CustomEventBanner zzejh;
   @VisibleForTesting
   private CustomEventInterstitial zzeji;
   @VisibleForTesting
   private CustomEventNative zzejj;
   private View zzmj;

   public CustomEventAdapter() {
      // $FF: Couldn't be decompiled
   }

   private final void zza(View param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zza(CustomEventAdapter param0, View param1) {
      // $FF: Couldn't be decompiled
   }

   private static Object zzao(String param0) {
      // $FF: Couldn't be decompiled
   }

   public final View getBannerView() {
      // $FF: Couldn't be decompiled
   }

   public final void onDestroy() {
      // $FF: Couldn't be decompiled
   }

   public final void onPause() {
      // $FF: Couldn't be decompiled
   }

   public final void onResume() {
      // $FF: Couldn't be decompiled
   }

   public final void requestBannerAd(Context param1, MediationBannerListener param2, Bundle param3, AdSize param4, MediationAdRequest param5, Bundle param6) {
      // $FF: Couldn't be decompiled
   }

   public final void requestInterstitialAd(Context param1, MediationInterstitialListener param2, Bundle param3, MediationAdRequest param4, Bundle param5) {
      // $FF: Couldn't be decompiled
   }

   public final void requestNativeAd(Context param1, MediationNativeListener param2, Bundle param3, NativeMediationAdRequest param4, Bundle param5) {
      // $FF: Couldn't be decompiled
   }

   public final void showInterstitial() {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   static final class zza implements CustomEventBannerListener {
      private final CustomEventAdapter zzejf;
      private final MediationBannerListener zzejg;

      public zza(CustomEventAdapter param1, MediationBannerListener param2) {
         // $FF: Couldn't be decompiled
      }

      public final void onAdClicked() {
         // $FF: Couldn't be decompiled
      }

      public final void onAdClosed() {
         // $FF: Couldn't be decompiled
      }

      public final void onAdFailedToLoad(int param1) {
         // $FF: Couldn't be decompiled
      }

      public final void onAdLeftApplication() {
         // $FF: Couldn't be decompiled
      }

      public final void onAdLoaded(View param1) {
         // $FF: Couldn't be decompiled
      }

      public final void onAdOpened() {
         // $FF: Couldn't be decompiled
      }
   }

   @VisibleForTesting
   static final class zzb implements CustomEventNativeListener {
      private final CustomEventAdapter zzejf;
      private final MediationNativeListener zzejk;

      public zzb(CustomEventAdapter param1, MediationNativeListener param2) {
         // $FF: Couldn't be decompiled
      }

      public final void onAdClicked() {
         // $FF: Couldn't be decompiled
      }

      public final void onAdClosed() {
         // $FF: Couldn't be decompiled
      }

      public final void onAdFailedToLoad(int param1) {
         // $FF: Couldn't be decompiled
      }

      public final void onAdImpression() {
         // $FF: Couldn't be decompiled
      }

      public final void onAdLeftApplication() {
         // $FF: Couldn't be decompiled
      }

      public final void onAdLoaded(NativeAdMapper param1) {
         // $FF: Couldn't be decompiled
      }

      public final void onAdLoaded(UnifiedNativeAdMapper param1) {
         // $FF: Couldn't be decompiled
      }

      public final void onAdOpened() {
         // $FF: Couldn't be decompiled
      }
   }

   @VisibleForTesting
   final class zzc implements CustomEventInterstitialListener {
      private final CustomEventAdapter zzejf;
      private final MediationInterstitialListener zzejl;
      // $FF: synthetic field
      private final CustomEventAdapter zzejm;

      public zzc(CustomEventAdapter param1, CustomEventAdapter param2, MediationInterstitialListener param3) {
         // $FF: Couldn't be decompiled
      }

      public final void onAdClicked() {
         // $FF: Couldn't be decompiled
      }

      public final void onAdClosed() {
         // $FF: Couldn't be decompiled
      }

      public final void onAdFailedToLoad(int param1) {
         // $FF: Couldn't be decompiled
      }

      public final void onAdLeftApplication() {
         // $FF: Couldn't be decompiled
      }

      public final void onAdLoaded() {
         // $FF: Couldn't be decompiled
      }

      public final void onAdOpened() {
         // $FF: Couldn't be decompiled
      }
   }
}
