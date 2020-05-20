package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzvu extends IInterface {
   void destroy();

   Bundle getAdMetadata();

   String getAdUnitId();

   String getMediationAdapterClassName();

   zzxb getVideoController();

   boolean isLoading();

   boolean isReady();

   void pause();

   void resume();

   void setImmersiveMode(boolean var1);

   void setManualImpressionsEnabled(boolean var1);

   void setUserId(String var1);

   void showInterstitial();

   void stopLoading();

   void zza(zzaak var1);

   void zza(zzaoy var1);

   void zza(zzape var1, String var2);

   void zza(zzaro var1);

   void zza(zzrg var1);

   void zza(zzuj var1);

   void zza(zzuo var1);

   void zza(zzvg var1);

   void zza(zzvh var1);

   void zza(zzvx var1);

   void zza(zzwc var1);

   void zza(zzwi var1);

   void zza(zzxh var1);

   void zza(zzyw var1);

   boolean zza(zzug var1);

   void zzbr(String var1);

   IObjectWrapper zzjx();

   void zzjy();

   zzuj zzjz();

   String zzka();

   zzxa zzkb();

   zzwc zzkc();

   zzvh zzkd();
}
