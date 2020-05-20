package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;

@TargetApi(14)
public final class zzpo implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {
   private static final long zzbnk;
   private final WindowManager zzbnl;
   @VisibleForTesting
   private BroadcastReceiver zzbnm;
   private WeakReference zzbnn;
   private zzpv zzbno;
   private zzaya zzbnp;
   private boolean zzbnq;
   private final HashSet zzbnr;
   private final Rect zzbns;
   private final DisplayMetrics zzwe;
   private Application zzxa;
   private final Context zzyv;
   private final PowerManager zzyw;
   private final KeyguardManager zzyx;
   private WeakReference zzyz;
   private int zzzd;

   static {
      // $FF: Couldn't be decompiled
   }

   public zzpo(Context param1, View param2) {
      // $FF: Couldn't be decompiled
   }

   private final Rect zza(Rect param1) {
      // $FF: Couldn't be decompiled
   }

   private final void zza(Activity param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zza(zzpo param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private final void zzbn(int param1) {
      // $FF: Couldn't be decompiled
   }

   private final int zzbo(int param1) {
      // $FF: Couldn't be decompiled
   }

   private final void zzck() {
      // $FF: Couldn't be decompiled
   }

   private final void zze(View param1) {
      // $FF: Couldn't be decompiled
   }

   private final void zzf(View param1) {
      // $FF: Couldn't be decompiled
   }

   private final List zzh(View param1) {
      // $FF: Couldn't be decompiled
   }

   public final void onActivityCreated(Activity param1, Bundle param2) {
      // $FF: Couldn't be decompiled
   }

   public final void onActivityDestroyed(Activity param1) {
      // $FF: Couldn't be decompiled
   }

   public final void onActivityPaused(Activity param1) {
      // $FF: Couldn't be decompiled
   }

   public final void onActivityResumed(Activity param1) {
      // $FF: Couldn't be decompiled
   }

   public final void onActivitySaveInstanceState(Activity param1, Bundle param2) {
      // $FF: Couldn't be decompiled
   }

   public final void onActivityStarted(Activity param1) {
      // $FF: Couldn't be decompiled
   }

   public final void onActivityStopped(Activity param1) {
      // $FF: Couldn't be decompiled
   }

   public final void onGlobalLayout() {
      // $FF: Couldn't be decompiled
   }

   public final void onScrollChanged() {
      // $FF: Couldn't be decompiled
   }

   public final void onViewAttachedToWindow(View param1) {
      // $FF: Couldn't be decompiled
   }

   public final void onViewDetachedFromWindow(View param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(zzps param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzb(zzps param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzen(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzlp() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   final void zzlq() {
      // $FF: Couldn't be decompiled
   }
}
