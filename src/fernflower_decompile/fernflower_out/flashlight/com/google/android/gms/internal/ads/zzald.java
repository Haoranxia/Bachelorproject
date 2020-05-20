package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzald extends IInterface {
   void destroy();

   Bundle getInterstitialAdapterInfo();

   zzxb getVideoController();

   boolean isInitialized();

   void pause();

   void resume();

   void setImmersiveMode(boolean var1);

   void showInterstitial();

   void showVideo();

   void zza(IObjectWrapper var1, zzagp var2, List var3);

   void zza(IObjectWrapper var1, zzarz var2, List var3);

   void zza(IObjectWrapper var1, zzug var2, String var3, zzali var4);

   void zza(IObjectWrapper var1, zzug var2, String var3, zzarz var4, String var5);

   void zza(IObjectWrapper var1, zzug var2, String var3, String var4, zzali var5);

   void zza(IObjectWrapper var1, zzug var2, String var3, String var4, zzali var5, zzaby var6, List var7);

   void zza(IObjectWrapper var1, zzuj var2, zzug var3, String var4, zzali var5);

   void zza(IObjectWrapper var1, zzuj var2, zzug var3, String var4, String var5, zzali var6);

   void zza(zzug var1, String var2);

   void zza(zzug var1, String var2, String var3);

   void zzb(IObjectWrapper var1, zzug var2, String var3, zzali var4);

   void zzs(IObjectWrapper var1);

   IObjectWrapper zzsk();

   zzall zzsl();

   zzalq zzsm();

   Bundle zzsn();

   Bundle zzso();

   boolean zzsp();

   zzade zzsq();

   zzalr zzsr();

   void zzt(IObjectWrapper var1);
}
