package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzada extends IInterface {
   void destroy();

   String getAdvertiser();

   String getBody();

   String getCallToAction();

   Bundle getExtras();

   String getHeadline();

   List getImages();

   String getMediationAdapterClassName();

   zzxb getVideoController();

   void performClick(Bundle var1);

   boolean recordImpression(Bundle var1);

   void reportTouchEvent(Bundle var1);

   IObjectWrapper zzrf();

   zzaca zzrh();

   IObjectWrapper zzri();

   zzaci zzrj();
}
