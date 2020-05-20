package com.google.android.gms.ads.instream;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MediaAspectRatio;
import com.google.android.gms.ads.VideoController;

public abstract class InstreamAd {
   public InstreamAd() {
      // $FF: Couldn't be decompiled
   }

   public static void load(Context param0, String param1, AdRequest param2, @MediaAspectRatio int param3, InstreamAd.InstreamAdLoadCallback param4) {
      // $FF: Couldn't be decompiled
   }

   public static void load(Context param0, String param1, InstreamAd.InstreamAdLoadCallback param2) {
      // $FF: Couldn't be decompiled
   }

   public abstract void destroy();

   public abstract float getAspectRatio();

   public abstract VideoController getVideoController();

   public abstract float getVideoCurrentTime();

   public abstract float getVideoDuration();

   protected abstract void zza(InstreamAdView var1);

   public static class InstreamAdLoadCallback {
      public InstreamAdLoadCallback() {
         // $FF: Couldn't be decompiled
      }

      public void onInstreamAdFailedToLoad(int param1) {
         // $FF: Couldn't be decompiled
      }

      public void onInstreamAdLoaded(InstreamAd param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
