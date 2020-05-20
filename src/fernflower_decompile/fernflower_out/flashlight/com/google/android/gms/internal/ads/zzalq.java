package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzalq extends IInterface {
   String getAdvertiser();

   String getBody();

   String getCallToAction();

   Bundle getExtras();

   String getHeadline();

   List getImages();

   boolean getOverrideClickHandling();

   boolean getOverrideImpressionRecording();

   zzxb getVideoController();

   void recordImpression();

   void zzc(IObjectWrapper var1, IObjectWrapper var2, IObjectWrapper var3);

   zzaca zzrh();

   IObjectWrapper zzri();

   zzaci zzrj();

   IObjectWrapper zzsu();

   IObjectWrapper zzsv();

   void zzu(IObjectWrapper var1);

   void zzv(IObjectWrapper var1);

   void zzw(IObjectWrapper var1);
}
