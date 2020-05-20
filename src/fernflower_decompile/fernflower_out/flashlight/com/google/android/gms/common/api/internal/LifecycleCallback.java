package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@KeepForSdk
public class LifecycleCallback {
   @KeepForSdk
   protected final LifecycleFragment mLifecycleFragment;

   @KeepForSdk
   protected LifecycleCallback(LifecycleFragment param1) {
      // $FF: Couldn't be decompiled
   }

   @Keep
   private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static LifecycleFragment getFragment(Activity param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static LifecycleFragment getFragment(ContextWrapper param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected static LifecycleFragment getFragment(LifecycleActivity param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void dump(String param1, FileDescriptor param2, PrintWriter param3, String[] param4) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Activity getActivity() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void onActivityResult(int param1, int param2, Intent param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void onCreate(Bundle param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void onDestroy() {
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
}
