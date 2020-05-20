package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@VisibleForTesting
public interface zzbdi extends com.google.android.gms.ads.internal.zzi, zzahs, zzaip, zzbaz, zzbei, zzbel, zzbep, zzbeq, zzbes, zzbet, zzps {
   void destroy();

   Context getContext();

   int getHeight();

   LayoutParams getLayoutParams();

   void getLocationOnScreen(int[] var1);

   ViewParent getParent();

   View getView();

   WebView getWebView();

   int getWidth();

   boolean isDestroyed();

   void loadData(String var1, String var2, String var3);

   void loadDataWithBaseURL(String var1, String var2, String var3, String var4, String var5);

   void loadUrl(String var1);

   void measure(int var1, int var2);

   void onPause();

   void onResume();

   void setBackgroundColor(int var1);

   void setOnClickListener(OnClickListener var1);

   void setOnTouchListener(OnTouchListener var1);

   void setRequestedOrientation(int var1);

   void setWebChromeClient(WebChromeClient var1);

   void setWebViewClient(WebViewClient var1);

   void zza(ViewGroup var1, Activity var2, String var3, String var4);

   void zza(com.google.android.gms.ads.internal.overlay.zzc var1);

   void zza(zzabr var1);

   void zza(zzabw var1);

   void zza(zzbed var1);

   void zza(zzbey var1);

   void zza(zzra var1);

   void zza(String var1, Predicate var2);

   void zza(String var1, zzafn var2);

   void zza(String var1, zzbcn var2);

   zzbev zzaaa();

   WebViewClient zzaab();

   boolean zzaac();

   zzdq zzaad();

   IObjectWrapper zzaae();

   boolean zzaaf();

   void zzaag();

   boolean zzaah();

   boolean zzaai();

   void zzaaj();

   void zzaak();

   zzabw zzaal();

   void zzaam();

   void zzaan();

   zzra zzaao();

   boolean zzaap();

   zzro zzaaq();

   boolean zzaar();

   void zzal(boolean var1);

   void zzan(IObjectWrapper var1);

   void zzax(boolean var1);

   void zzay(boolean var1);

   void zzaz(boolean var1);

   void zzb(com.google.android.gms.ads.internal.overlay.zzc var1);

   void zzb(String var1, zzafn var2);

   void zzb(String var1, String var2, String var3);

   boolean zzb(boolean var1, int var2);

   void zzba(boolean var1);

   void zzbr(Context var1);

   void zzde(int var1);

   void zztr();

   zzbed zzyl();

   Activity zzyn();

   com.google.android.gms.ads.internal.zza zzyo();

   zzaab zzyq();

   zzazb zzyr();

   void zzzt();

   void zzzu();

   Context zzzv();

   com.google.android.gms.ads.internal.overlay.zzc zzzw();

   com.google.android.gms.ads.internal.overlay.zzc zzzx();

   zzbey zzzy();

   String zzzz();
}
