package com.google.android.gms.ads.doubleclick;

import android.view.View;

public interface CustomRenderedAd {
   String getBaseUrl();

   String getContent();

   void onAdRendered(View var1);

   void recordClick();

   void recordImpression();
}
