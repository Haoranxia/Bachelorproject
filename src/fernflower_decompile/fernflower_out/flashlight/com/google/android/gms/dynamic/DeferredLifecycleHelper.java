package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.LinkedList;

@KeepForSdk
public abstract class DeferredLifecycleHelper {
   private LifecycleDelegate zarf;
   private Bundle zarg;
   private LinkedList zarh;
   private final OnDelegateCreatedListener zari;

   @KeepForSdk
   public DeferredLifecycleHelper() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static void showGooglePlayUnavailableMessage(FrameLayout param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Bundle zaa(DeferredLifecycleHelper param0, Bundle param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static LifecycleDelegate zaa(DeferredLifecycleHelper param0, LifecycleDelegate param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static LinkedList zaa(DeferredLifecycleHelper param0) {
      // $FF: Couldn't be decompiled
   }

   private final void zaa(Bundle param1, DeferredLifecycleHelper.zaa param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static LifecycleDelegate zab(DeferredLifecycleHelper param0) {
      // $FF: Couldn't be decompiled
   }

   private final void zal(int param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected abstract void createDelegate(OnDelegateCreatedListener var1);

   @KeepForSdk
   public LifecycleDelegate getDelegate() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected void handleGooglePlayUnavailable(FrameLayout param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void onCreate(Bundle param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public View onCreateView(LayoutInflater param1, ViewGroup param2, Bundle param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void onDestroy() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void onDestroyView() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void onInflate(Activity param1, Bundle param2, Bundle param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void onLowMemory() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void onPause() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void onResume() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void onSaveInstanceState(Bundle param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void onStart() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void onStop() {
      // $FF: Couldn't be decompiled
   }

   private interface zaa {
      int getState();

      void zaa(LifecycleDelegate var1);
   }
}
