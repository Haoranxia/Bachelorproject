package com.google.android.gms.ads.reward.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.reward.RewardItem;

public interface MediationRewardedVideoAdListener {
   void onAdClicked(MediationRewardedVideoAdAdapter var1);

   void onAdClosed(MediationRewardedVideoAdAdapter var1);

   void onAdFailedToLoad(MediationRewardedVideoAdAdapter var1, int var2);

   void onAdLeftApplication(MediationRewardedVideoAdAdapter var1);

   void onAdLoaded(MediationRewardedVideoAdAdapter var1);

   void onAdOpened(MediationRewardedVideoAdAdapter var1);

   void onInitializationFailed(MediationRewardedVideoAdAdapter var1, int var2);

   void onInitializationSucceeded(MediationRewardedVideoAdAdapter var1);

   void onRewarded(MediationRewardedVideoAdAdapter var1, RewardItem var2);

   void onVideoCompleted(MediationRewardedVideoAdAdapter var1);

   void onVideoStarted(MediationRewardedVideoAdAdapter var1);

   void zzb(Bundle var1);
}
