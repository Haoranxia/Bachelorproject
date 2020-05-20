package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzuh;
import com.google.android.gms.internal.ads.zzvm;
import com.google.android.gms.internal.ads.zzvn;
import com.google.android.gms.internal.ads.zzxj;

public class AdLoader {
   private final zzuh zzaba;
   private final zzvm zzabb;
   private final Context zzup;

   AdLoader(Context param1, zzvm param2) {
      // $FF: Couldn't be decompiled
   }

   private AdLoader(Context param1, zzvm param2, zzuh param3) {
      // $FF: Couldn't be decompiled
   }

   private final void zza(zzxj param1) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public String getMediationAdapterClassName() {
      // $FF: Couldn't be decompiled
   }

   public boolean isLoading() {
      // $FF: Couldn't be decompiled
   }

   public void loadAd(AdRequest param1) {
      // $FF: Couldn't be decompiled
   }

   public void loadAd(PublisherAdRequest param1) {
      // $FF: Couldn't be decompiled
   }

   public void loadAds(AdRequest param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public static class Builder {
      private final zzvn zzabd;
      private final Context zzup;

      private Builder(Context param1, zzvn param2) {
         // $FF: Couldn't be decompiled
      }

      public Builder(Context param1, String param2) {
         // $FF: Couldn't be decompiled
      }

      public AdLoader build() {
         // $FF: Couldn't be decompiled
      }

      @Deprecated
      public AdLoader.Builder forAppInstallAd(NativeAppInstallAd.OnAppInstallAdLoadedListener param1) {
         // $FF: Couldn't be decompiled
      }

      @Deprecated
      public AdLoader.Builder forContentAd(NativeContentAd.OnContentAdLoadedListener param1) {
         // $FF: Couldn't be decompiled
      }

      public AdLoader.Builder forCustomTemplateAd(String param1, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener param2, NativeCustomTemplateAd.OnCustomClickListener param3) {
         // $FF: Couldn't be decompiled
      }

      public AdLoader.Builder forPublisherAdView(OnPublisherAdViewLoadedListener param1, AdSize... param2) {
         // $FF: Couldn't be decompiled
      }

      public AdLoader.Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener param1) {
         // $FF: Couldn't be decompiled
      }

      public AdLoader.Builder withAdListener(AdListener param1) {
         // $FF: Couldn't be decompiled
      }

      @Deprecated
      @KeepForSdk
      public AdLoader.Builder withCorrelator(Correlator param1) {
         // $FF: Couldn't be decompiled
      }

      public AdLoader.Builder withNativeAdOptions(NativeAdOptions param1) {
         // $FF: Couldn't be decompiled
      }

      public AdLoader.Builder withPublisherAdViewOptions(PublisherAdViewOptions param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
