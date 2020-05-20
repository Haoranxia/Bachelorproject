package com.google.android.gms.ads.reward;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;

public interface RewardedVideoAd {
   @Deprecated
   void destroy();

   void destroy(Context var1);

   Bundle getAdMetadata();

   String getCustomData();

   String getMediationAdapterClassName();

   RewardedVideoAdListener getRewardedVideoAdListener();

   String getUserId();

   boolean isLoaded();

   void loadAd(String var1, AdRequest var2);

   void loadAd(String var1, PublisherAdRequest var2);

   @Deprecated
   void pause();

   void pause(Context var1);

   @Deprecated
   void resume();

   void resume(Context var1);

   void setAdMetadataListener(AdMetadataListener var1);

   void setCustomData(String var1);

   void setImmersiveMode(boolean var1);

   void setRewardedVideoAdListener(RewardedVideoAdListener var1);

   void setUserId(String var1);

   void show();
}
