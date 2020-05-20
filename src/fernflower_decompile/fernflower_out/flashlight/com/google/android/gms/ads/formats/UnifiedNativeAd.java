package com.google.android.gms.ads.formats;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;

public abstract class UnifiedNativeAd {
   public UnifiedNativeAd() {
      // $FF: Couldn't be decompiled
   }

   public abstract void cancelUnconfirmedClick();

   public abstract void destroy();

   public abstract void enableCustomClickGesture();

   public abstract NativeAd.AdChoicesInfo getAdChoicesInfo();

   public abstract String getAdvertiser();

   public abstract String getBody();

   public abstract String getCallToAction();

   public abstract Bundle getExtras();

   public abstract String getHeadline();

   public abstract NativeAd.Image getIcon();

   public abstract List getImages();

   public abstract UnifiedNativeAd.MediaContent getMediaContent();

   public abstract String getMediationAdapterClassName();

   public abstract List getMuteThisAdReasons();

   public abstract String getPrice();

   public abstract Double getStarRating();

   public abstract String getStore();

   public abstract VideoController getVideoController();

   public abstract boolean isCustomClickGestureEnabled();

   public abstract boolean isCustomMuteThisAdEnabled();

   public abstract void muteThisAd(MuteThisAdReason var1);

   @KeepForSdk
   public abstract void performClick(Bundle var1);

   public abstract void recordCustomClickGesture();

   @KeepForSdk
   public abstract boolean recordImpression(Bundle var1);

   @KeepForSdk
   public abstract void reportTouchEvent(Bundle var1);

   public abstract void setMuteThisAdListener(MuteThisAdListener var1);

   public abstract void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener var1);

   protected abstract Object zzjj();

   public abstract Object zzjo();

   public interface MediaContent {
      float getAspectRatio();

      Drawable getMainImage();

      void setMainImage(Drawable var1);
   }

   public interface OnUnifiedNativeAdLoadedListener {
      void onUnifiedNativeAdLoaded(UnifiedNativeAd var1);
   }

   public interface UnconfirmedClickListener {
      void onUnconfirmedClickCancelled();

      void onUnconfirmedClickReceived(String var1);
   }
}
