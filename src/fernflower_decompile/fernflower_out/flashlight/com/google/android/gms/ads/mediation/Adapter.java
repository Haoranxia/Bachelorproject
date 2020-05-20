package com.google.android.gms.ads.mediation;

import android.content.Context;
import java.util.List;

public abstract class Adapter implements MediationExtrasReceiver {
   public Adapter() {
      // $FF: Couldn't be decompiled
   }

   public abstract VersionInfo getSDKVersionInfo();

   public abstract VersionInfo getVersionInfo();

   public abstract void initialize(Context var1, InitializationCompleteCallback var2, List var3);

   public void loadBannerAd(MediationBannerAdConfiguration param1, MediationAdLoadCallback param2) {
      // $FF: Couldn't be decompiled
   }

   public void loadInterstitialAd(MediationInterstitialAdConfiguration param1, MediationAdLoadCallback param2) {
      // $FF: Couldn't be decompiled
   }

   public void loadNativeAd(MediationNativeAdConfiguration param1, MediationAdLoadCallback param2) {
      // $FF: Couldn't be decompiled
   }

   public void loadRewardedAd(MediationRewardedAdConfiguration param1, MediationAdLoadCallback param2) {
      // $FF: Couldn't be decompiled
   }
}
