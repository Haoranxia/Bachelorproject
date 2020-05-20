package com.google.android.gms.ads.mediation;

public interface MediationAdCallback {
   void onAdClosed();

   void onAdOpened();

   void reportAdClicked();

   void reportAdImpression();
}
