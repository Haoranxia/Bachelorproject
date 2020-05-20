package com.google.ads.mediation;

import android.app.Activity;

@Deprecated
public interface MediationInterstitialAdapter extends MediationAdapter {
   void requestInterstitialAd(MediationInterstitialListener var1, Activity var2, MediationServerParameters var3, MediationAdRequest var4, NetworkExtras var5);

   void showInterstitial();
}
