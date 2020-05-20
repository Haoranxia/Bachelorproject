package com.google.android.gms.ads.reward;

public interface RewardedVideoAdListener {
   void onRewarded(RewardItem var1);

   void onRewardedVideoAdClosed();

   void onRewardedVideoAdFailedToLoad(int var1);

   void onRewardedVideoAdLeftApplication();

   void onRewardedVideoAdLoaded();

   void onRewardedVideoAdOpened();

   void onRewardedVideoCompleted();

   void onRewardedVideoStarted();
}
