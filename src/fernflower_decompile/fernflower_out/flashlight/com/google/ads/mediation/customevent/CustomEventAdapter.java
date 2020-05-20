package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter {
   private View zzmj;
   @VisibleForTesting
   private CustomEventBanner zzmk;
   @VisibleForTesting
   private CustomEventInterstitial zzml;

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

   public final void destroy() {
      // $FF: Couldn't be decompiled
   }

   public final Class getAdditionalParametersType() {
      // $FF: Couldn't be decompiled
   }

   public final View getBannerView() {
      // $FF: Couldn't be decompiled
   }

   public final Class getServerParametersType() {
      // $FF: Couldn't be decompiled
   }

   public final void requestBannerAd(MediationBannerListener param1, Activity param2, CustomEventServerParameters param3, AdSize param4, MediationAdRequest param5, CustomEventExtras param6) {
      // $FF: Couldn't be decompiled
   }

   public final void requestInterstitialAd(MediationInterstitialListener param1, Activity param2, CustomEventServerParameters param3, MediationAdRequest param4, CustomEventExtras param5) {
      // $FF: Couldn't be decompiled
   }

   public final void showInterstitial() {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   final class zza implements CustomEventInterstitialListener {
      private final CustomEventAdapter zzmm;
      private final MediationInterstitialListener zzmn;
      // $FF: synthetic field
      private final CustomEventAdapter zzmo;

      public zza(CustomEventAdapter param1, CustomEventAdapter param2, MediationInterstitialListener param3) {
         // $FF: Couldn't be decompiled
      }

      public final void onDismissScreen() {
         // $FF: Couldn't be decompiled
      }

      public final void onFailedToReceiveAd() {
         // $FF: Couldn't be decompiled
      }

      public final void onLeaveApplication() {
         // $FF: Couldn't be decompiled
      }

      public final void onPresentScreen() {
         // $FF: Couldn't be decompiled
      }

      public final void onReceivedAd() {
         // $FF: Couldn't be decompiled
      }
   }

   @VisibleForTesting
   static final class zzb implements CustomEventBannerListener {
      private final CustomEventAdapter zzmm;
      private final MediationBannerListener zzmp;

      public zzb(CustomEventAdapter param1, MediationBannerListener param2) {
         // $FF: Couldn't be decompiled
      }

      public final void onClick() {
         // $FF: Couldn't be decompiled
      }

      public final void onDismissScreen() {
         // $FF: Couldn't be decompiled
      }

      public final void onFailedToReceiveAd() {
         // $FF: Couldn't be decompiled
      }

      public final void onLeaveApplication() {
         // $FF: Couldn't be decompiled
      }

      public final void onPresentScreen() {
         // $FF: Couldn't be decompiled
      }

      public final void onReceivedAd(View param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
