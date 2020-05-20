package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzalr extends IInterface {
   String getAdvertiser();

   String getBody();

   String getCallToAction();

   Bundle getExtras();

   String getHeadline();

   List getImages();

   float getMediaContentAspectRatio();

   boolean getOverrideClickHandling();

   boolean getOverrideImpressionRecording();

   String getPrice();

   double getStarRating();

   String getStore();

   zzxb getVideoController();

   void recordImpression();

   void zzc(IObjectWrapper var1, IObjectWrapper var2, IObjectWrapper var3);

   zzaci zzrg();

   zzaca zzrh();

   IObjectWrapper zzri();

   IObjectWrapper zzsu();

   IObjectWrapper zzsv();

   void zzu(IObjectWrapper var1);

   void zzw(IObjectWrapper var1);
}
