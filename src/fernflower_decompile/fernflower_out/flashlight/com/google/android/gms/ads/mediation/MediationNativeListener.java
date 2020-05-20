package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

public interface MediationNativeListener {
   void onAdClicked(MediationNativeAdapter var1);

   void onAdClosed(MediationNativeAdapter var1);

   void onAdFailedToLoad(MediationNativeAdapter var1, int var2);

   void onAdImpression(MediationNativeAdapter var1);

   void onAdLeftApplication(MediationNativeAdapter var1);

   @Deprecated
   void onAdLoaded(MediationNativeAdapter var1, NativeAdMapper var2);

   void onAdLoaded(MediationNativeAdapter var1, UnifiedNativeAdMapper var2);

   void onAdOpened(MediationNativeAdapter var1);

   void onVideoEnd(MediationNativeAdapter var1);

   void zza(MediationNativeAdapter var1, NativeCustomTemplateAd var2);

   void zza(MediationNativeAdapter var1, NativeCustomTemplateAd var2, String var3);
}
