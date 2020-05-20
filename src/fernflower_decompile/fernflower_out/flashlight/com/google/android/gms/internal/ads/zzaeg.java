package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzaeg extends IInterface {
   void cancelUnconfirmedClick();

   void destroy();

   String getAdvertiser();

   String getBody();

   String getCallToAction();

   Bundle getExtras();

   String getHeadline();

   List getImages();

   String getMediationAdapterClassName();

   List getMuteThisAdReasons();

   String getPrice();

   double getStarRating();

   String getStore();

   zzxb getVideoController();

   boolean isCustomClickGestureEnabled();

   boolean isCustomMuteThisAdEnabled();

   void performClick(Bundle var1);

   void recordCustomClickGesture();

   boolean recordImpression(Bundle var1);

   void reportTouchEvent(Bundle var1);

   void zza(zzaeb var1);

   void zza(zzwn var1);

   void zza(zzwr var1);

   zzxa zzkb();

   IObjectWrapper zzrf();

   zzaci zzrg();

   zzaca zzrh();

   IObjectWrapper zzri();

   void zzrp();

   zzacd zzrq();
}
