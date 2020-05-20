package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzacw extends IInterface {
   void destroy();

   String getBody();

   String getCallToAction();

   Bundle getExtras();

   String getHeadline();

   List getImages();

   String getMediationAdapterClassName();

   String getPrice();

   double getStarRating();

   String getStore();

   zzxb getVideoController();

   void performClick(Bundle var1);

   boolean recordImpression(Bundle var1);

   void reportTouchEvent(Bundle var1);

   IObjectWrapper zzrf();

   zzaci zzrg();

   zzaca zzrh();

   IObjectWrapper zzri();
}
