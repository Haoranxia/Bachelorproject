package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@VisibleForTesting
final class zzbdz extends WebView implements OnGlobalLayoutListener, DownloadListener, zzbdi {
   private int maxHeight;
   private int maxWidth;
   @GuardedBy("this")
   private String zzabg;
   private final zzazb zzbll;
   private final WindowManager zzbnl;
   private int zzdgf;
   private int zzdgg;
   @GuardedBy("this")
   private boolean zzdhs;
   @GuardedBy("this")
   private String zzdiy;
   @GuardedBy("this")
   private Boolean zzdqk;
   private zzaac zzeao;
   private final zzsm zzeeg;
   private final zzbez zzefu;
   private final zzdq zzefv;
   private final com.google.android.gms.ads.internal.zzi zzefw;
   private final com.google.android.gms.ads.internal.zza zzefx;
   private final float zzefy;
   private final zzro zzefz;
   private final boolean zzega;
   private boolean zzegb;
   private boolean zzegc;
   private zzbdl zzegd;
   @GuardedBy("this")
   private com.google.android.gms.ads.internal.overlay.zzc zzege;
   @GuardedBy("this")
   private IObjectWrapper zzegf;
   @GuardedBy("this")
   private zzbey zzegg;
   @GuardedBy("this")
   private boolean zzegh;
   @GuardedBy("this")
   private boolean zzegi;
   @GuardedBy("this")
   private boolean zzegj;
   @GuardedBy("this")
   private int zzegk;
   @GuardedBy("this")
   private boolean zzegl;
   @GuardedBy("this")
   private boolean zzegm;
   @GuardedBy("this")
   private zzbed zzegn;
   @GuardedBy("this")
   private boolean zzego;
   @GuardedBy("this")
   private boolean zzegp;
   @GuardedBy("this")
   private zzabw zzegq;
   @GuardedBy("this")
   private zzabr zzegr;
   @GuardedBy("this")
   private zzra zzegs;
   @GuardedBy("this")
   private int zzegt;
   @GuardedBy("this")
   private int zzegu;
   private zzaac zzegv;
   private zzaac zzegw;
   private zzaab zzegx;
   private WeakReference zzegy;
   @GuardedBy("this")
   private com.google.android.gms.ads.internal.overlay.zzc zzegz;
   @GuardedBy("this")
   private boolean zzeha;
   private zzayl zzehb;
   private Map zzehc;
   private final DisplayMetrics zzwe;

   @VisibleForTesting
   private zzbdz(zzbez param1, zzbey param2, String param3, boolean param4, boolean param5, zzdq param6, zzazb param7, zzaae param8, com.google.android.gms.ads.internal.zzi param9, com.google.android.gms.ads.internal.zza param10, zzsm param11, zzro param12, boolean param13) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static int zza(zzbdz param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static int zza(zzbdz param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   private final void zza(Boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @TargetApi(19)
   private final void zza(String param1, ValueCallback param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static final void zza(boolean param0, int param1, zztu param2) {
      // $FF: Couldn't be decompiled
   }

   private final boolean zzabg() {
      // $FF: Couldn't be decompiled
   }

   private final void zzabh() {
      // $FF: Couldn't be decompiled
   }

   private final void zzabi() {
      // $FF: Couldn't be decompiled
   }

   private final void zzabj() {
      // $FF: Couldn't be decompiled
   }

   private final void zzabk() {
      // $FF: Couldn't be decompiled
   }

   private final void zzabl() {
      // $FF: Couldn't be decompiled
   }

   private final void zzabm() {
      // $FF: Couldn't be decompiled
   }

   private final void zzabn() {
      // $FF: Couldn't be decompiled
   }

   static zzbdz zzb(Context param0, zzbey param1, String param2, boolean param3, boolean param4, zzdq param5, zzazb param6, zzaae param7, com.google.android.gms.ads.internal.zzi param8, com.google.android.gms.ads.internal.zza param9, zzsm param10, zzro param11, boolean param12) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zzb(zzbdz param0) {
      // $FF: Couldn't be decompiled
   }

   private final void zzbd(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private final void zzfm(String param1) {
      // $FF: Couldn't be decompiled
   }

   private final void zzfn(String param1) {
      // $FF: Couldn't be decompiled
   }

   private final void zzfo(String param1) {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   private final Boolean zzva() {
      // $FF: Couldn't be decompiled
   }

   private final void zzvd() {
      // $FF: Couldn't be decompiled
   }

   public final void destroy() {
      // $FF: Couldn't be decompiled
   }

   @TargetApi(19)
   public final void evaluateJavascript(String param1, ValueCallback param2) {
      // $FF: Couldn't be decompiled
   }

   protected final void finalize() {
      // $FF: Couldn't be decompiled
   }

   public final View getView() {
      // $FF: Couldn't be decompiled
   }

   public final WebView getWebView() {
      // $FF: Couldn't be decompiled
   }

   public final boolean isDestroyed() {
      // $FF: Couldn't be decompiled
   }

   public final void loadData(String param1, String param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   public final void loadDataWithBaseURL(String param1, String param2, String param3, String param4, String param5) {
      // $FF: Couldn't be decompiled
   }

   public final void loadUrl(String param1) {
      // $FF: Couldn't be decompiled
   }

   protected final void onAttachedToWindow() {
      // $FF: Couldn't be decompiled
   }

   protected final void onDetachedFromWindow() {
      // $FF: Couldn't be decompiled
   }

   public final void onDownloadStart(String param1, String param2, String param3, String param4, long param5) {
      // $FF: Couldn't be decompiled
   }

   @TargetApi(21)
   protected final void onDraw(Canvas param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean onGenericMotionEvent(MotionEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public final void onGlobalLayout() {
      // $FF: Couldn't be decompiled
   }

   @SuppressLint({"DrawAllocation"})
   protected final void onMeasure(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void onPause() {
      // $FF: Couldn't be decompiled
   }

   public final void onResume() {
      // $FF: Couldn't be decompiled
   }

   public final boolean onTouchEvent(MotionEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public final void setOnClickListener(OnClickListener param1) {
      // $FF: Couldn't be decompiled
   }

   public final void setRequestedOrientation(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void setWebViewClient(WebViewClient param1) {
      // $FF: Couldn't be decompiled
   }

   public final void stopLoading() {
      // $FF: Couldn't be decompiled
   }

   public final void zza(ViewGroup param1, Activity param2, String param3, String param4) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(com.google.android.gms.ads.internal.overlay.zzc param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(com.google.android.gms.ads.internal.overlay.zzd param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(zzabr param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(zzabw param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(zzbed param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(zzbey param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(zzpt param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(zzra param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(String param1, Predicate param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(String param1, zzafn param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(String param1, zzbcn param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(String param1, Map param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(String param1, JSONObject param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(boolean param1, int param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(boolean param1, int param2, String param3, String param4) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(boolean param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public final zzbev zzaaa() {
      // $FF: Couldn't be decompiled
   }

   public final WebViewClient zzaab() {
      // $FF: Couldn't be decompiled
   }

   public final boolean zzaac() {
      // $FF: Couldn't be decompiled
   }

   public final zzdq zzaad() {
      // $FF: Couldn't be decompiled
   }

   public final IObjectWrapper zzaae() {
      // $FF: Couldn't be decompiled
   }

   public final boolean zzaaf() {
      // $FF: Couldn't be decompiled
   }

   public final void zzaag() {
      // $FF: Couldn't be decompiled
   }

   public final boolean zzaah() {
      // $FF: Couldn't be decompiled
   }

   public final boolean zzaai() {
      // $FF: Couldn't be decompiled
   }

   public final void zzaaj() {
      // $FF: Couldn't be decompiled
   }

   public final void zzaak() {
      // $FF: Couldn't be decompiled
   }

   public final zzabw zzaal() {
      // $FF: Couldn't be decompiled
   }

   public final void zzaam() {
      // $FF: Couldn't be decompiled
   }

   public final void zzaan() {
      // $FF: Couldn't be decompiled
   }

   public final zzra zzaao() {
      // $FF: Couldn't be decompiled
   }

   public final boolean zzaap() {
      // $FF: Couldn't be decompiled
   }

   public final zzro zzaaq() {
      // $FF: Couldn't be decompiled
   }

   public final boolean zzaar() {
      // $FF: Couldn't be decompiled
   }

   public final void zzal(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzan(IObjectWrapper param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzav(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzax(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzay(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzaz(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzb(com.google.android.gms.ads.internal.overlay.zzc param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzb(String param1, zzafn param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zzb(String param1, String param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   public final void zzb(String param1, JSONObject param2) {
      // $FF: Couldn't be decompiled
   }

   public final boolean zzb(boolean param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zzba(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzbr(Context param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzc(boolean param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zzcy(String param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzde(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final zzbcn zzfe(String param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzjv() {
      // $FF: Couldn't be decompiled
   }

   public final void zzjw() {
      // $FF: Couldn't be decompiled
   }

   public final void zztr() {
      // $FF: Couldn't be decompiled
   }

   public final void zzts() {
      // $FF: Couldn't be decompiled
   }

   public final zzbao zzyk() {
      // $FF: Couldn't be decompiled
   }

   public final zzbed zzyl() {
      // $FF: Couldn't be decompiled
   }

   public final zzaac zzym() {
      // $FF: Couldn't be decompiled
   }

   public final Activity zzyn() {
      // $FF: Couldn't be decompiled
   }

   public final com.google.android.gms.ads.internal.zza zzyo() {
      // $FF: Couldn't be decompiled
   }

   public final String zzyp() {
      // $FF: Couldn't be decompiled
   }

   public final zzaab zzyq() {
      // $FF: Couldn't be decompiled
   }

   public final zzazb zzyr() {
      // $FF: Couldn't be decompiled
   }

   public final int zzys() {
      // $FF: Couldn't be decompiled
   }

   public final int zzyt() {
      // $FF: Couldn't be decompiled
   }

   public final void zzyu() {
      // $FF: Couldn't be decompiled
   }

   public final void zzzt() {
      // $FF: Couldn't be decompiled
   }

   public final void zzzu() {
      // $FF: Couldn't be decompiled
   }

   public final Context zzzv() {
      // $FF: Couldn't be decompiled
   }

   public final com.google.android.gms.ads.internal.overlay.zzc zzzw() {
      // $FF: Couldn't be decompiled
   }

   public final com.google.android.gms.ads.internal.overlay.zzc zzzx() {
      // $FF: Couldn't be decompiled
   }

   public final zzbey zzzy() {
      // $FF: Couldn't be decompiled
   }

   public final String zzzz() {
      // $FF: Couldn't be decompiled
   }
}
