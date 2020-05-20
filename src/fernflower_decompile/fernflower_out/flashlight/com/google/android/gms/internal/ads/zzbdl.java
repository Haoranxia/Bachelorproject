package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@VisibleForTesting
public class zzbdl extends WebViewClient implements zzbev {
   private final Object lock;
   @GuardedBy("lock")
   private boolean zzbmb;
   private zzty zzcbt;
   private zzaew zzcwq;
   private zzaey zzcws;
   private com.google.android.gms.ads.internal.zzc zzcxo;
   private zzaoe zzcxp;
   private com.google.android.gms.ads.internal.overlay.zzo zzdhq;
   private com.google.android.gms.ads.internal.overlay.zzt zzdhu;
   private boolean zzdll;
   protected zzbdi zzeef;
   private final zzsm zzeeg;
   private final HashMap zzeeh;
   private zzbeu zzeei;
   private zzbex zzeej;
   private zzbew zzeek;
   private boolean zzeel;
   @GuardedBy("lock")
   private boolean zzeem;
   @GuardedBy("lock")
   private boolean zzeen;
   @GuardedBy("lock")
   private boolean zzeeo;
   private final zzaol zzeep;
   protected zzato zzeeq;
   private boolean zzeer;
   private boolean zzees;
   private int zzeet;
   private OnAttachStateChangeListener zzeeu;

   public zzbdl(zzbdi param1, zzsm param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   private zzbdl(zzbdi param1, zzsm param2, boolean param3, zzaol param4, zzaoe param5) {
      // $FF: Couldn't be decompiled
   }

   private final void zza(View param1, zzato param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private final void zza(AdOverlayInfoParcel param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zza(zzbdl param0, View param1, zzato param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private final void zzaay() {
      // $FF: Couldn't be decompiled
   }

   private final void zzabd() {
      // $FF: Couldn't be decompiled
   }

   private static WebResourceResponse zzabe() {
      // $FF: Couldn't be decompiled
   }

   private final WebResourceResponse zze(String param1, Map param2) {
      // $FF: Couldn't be decompiled
   }

   public final void onLoadResource(WebView param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public final void onPageFinished(WebView param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public void onPageStarted(WebView param1, String param2, Bitmap param3) {
      // $FF: Couldn't be decompiled
   }

   @TargetApi(26)
   public boolean onRenderProcessGone(WebView param1, RenderProcessGoneDetail param2) {
      // $FF: Couldn't be decompiled
   }

   public final void reset() {
      // $FF: Couldn't be decompiled
   }

   @TargetApi(11)
   public WebResourceResponse shouldInterceptRequest(WebView param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean shouldOverrideKeyEvent(WebView param1, KeyEvent param2) {
      // $FF: Couldn't be decompiled
   }

   public final boolean shouldOverrideUrlLoading(WebView param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(int param1, int param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(com.google.android.gms.ads.internal.overlay.zzd param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(zzbeu param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(zzbex param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(zzty param1, zzaew param2, com.google.android.gms.ads.internal.overlay.zzo param3, zzaey param4, com.google.android.gms.ads.internal.overlay.zzt param5, boolean param6, zzafq param7, com.google.android.gms.ads.internal.zzc param8, zzaon param9, zzato param10) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(String param1, Predicate param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(String param1, zzafn param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(boolean param1, int param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(boolean param1, int param2, String param3, String param4) {
      // $FF: Couldn't be decompiled
   }

   public final com.google.android.gms.ads.internal.zzc zzaas() {
      // $FF: Couldn't be decompiled
   }

   public final boolean zzaat() {
      // $FF: Couldn't be decompiled
   }

   public final boolean zzaau() {
      // $FF: Couldn't be decompiled
   }

   public final boolean zzaav() {
      // $FF: Couldn't be decompiled
   }

   public final OnGlobalLayoutListener zzaaw() {
      // $FF: Couldn't be decompiled
   }

   public final OnScrollChangedListener zzaax() {
      // $FF: Couldn't be decompiled
   }

   public final void zzaaz() {
      // $FF: Couldn't be decompiled
   }

   public final void zzaba() {
      // $FF: Couldn't be decompiled
   }

   public final void zzabb() {
      // $FF: Couldn't be decompiled
   }

   public final void zzabc() {
      // $FF: Couldn't be decompiled
   }

   public final zzato zzabf() {
      // $FF: Couldn't be decompiled
   }

   public final void zzav(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzb(String param1, zzafn param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zzba(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzbb(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzbc(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzc(boolean param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   protected final WebResourceResponse zzd(String param1, Map param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zzh(Uri param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzi(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zztn() {
      // $FF: Couldn't be decompiled
   }
}
