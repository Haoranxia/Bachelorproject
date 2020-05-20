package com.google.android.gms.internal.ads;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzade extends IInterface {
   void destroy();

   List getAvailableAssetNames();

   String getCustomTemplateId();

   zzxb getVideoController();

   void performClick(String var1);

   void recordImpression();

   String zzct(String var1);

   zzaci zzcu(String var1);

   boolean zzp(IObjectWrapper var1);

   void zzq(IObjectWrapper var1);

   IObjectWrapper zzrf();

   IObjectWrapper zzrk();

   boolean zzrl();

   boolean zzrm();

   void zzrn();
}
