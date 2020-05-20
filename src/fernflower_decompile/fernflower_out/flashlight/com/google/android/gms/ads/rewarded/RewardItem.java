package com.google.android.gms.ads.rewarded;

public interface RewardItem {
   RewardItem DEFAULT_REWARD;

   static {
      // $FF: Couldn't be decompiled
   }

   int getAmount();

   String getType();
}
