package com.google.android.gms.ads.mediation;

public interface MediationNativeAdCallback extends MediationAdCallback {
   void onAdLeftApplication();

   void onVideoComplete();

   void onVideoMute();

   void onVideoPause();

   void onVideoPlay();

   void onVideoUnmute();
}
