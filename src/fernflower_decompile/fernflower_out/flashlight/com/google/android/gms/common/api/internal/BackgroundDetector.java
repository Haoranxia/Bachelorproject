package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public final class BackgroundDetector implements ActivityLifecycleCallbacks, ComponentCallbacks2 {
   private static final BackgroundDetector zzat;
   private final AtomicBoolean zzau;
   private final AtomicBoolean zzav;
   @GuardedBy("sInstance")
   private final ArrayList zzaw;
   @GuardedBy("sInstance")
   private boolean zzax;

   static {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   private BackgroundDetector() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static BackgroundDetector getInstance() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static void initialize(Application param0) {
      // $FF: Couldn't be decompiled
   }

   private final void onBackgroundStateChanged(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final void addListener(BackgroundDetector.BackgroundStateChangeListener param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final boolean isInBackground() {
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

   public final void onConfigurationChanged(Configuration param1) {
      // $FF: Couldn't be decompiled
   }

   public final void onLowMemory() {
      // $FF: Couldn't be decompiled
   }

   public final void onTrimMemory(int param1) {
      // $FF: Couldn't be decompiled
   }

   @TargetApi(16)
   @KeepForSdk
   public final boolean readCurrentStateIfPossible(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public interface BackgroundStateChangeListener {
      @KeepForSdk
      void onBackgroundStateChanged(boolean var1);
   }
}
