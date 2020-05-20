package com.google.android.gms.common.api.internal;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zal extends LifecycleCallback implements OnCancelListener {
   protected volatile boolean mStarted;
   protected final GoogleApiAvailability zacd;
   protected final AtomicReference zadf;
   private final Handler zadg;

   protected zal(LifecycleFragment param1) {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   private zal(LifecycleFragment param1, GoogleApiAvailability param2) {
      // $FF: Couldn't be decompiled
   }

   private static int zaa(zam param0) {
      // $FF: Couldn't be decompiled
   }

   public void onActivityResult(int param1, int param2, Intent param3) {
      // $FF: Couldn't be decompiled
   }

   public void onCancel(DialogInterface param1) {
      // $FF: Couldn't be decompiled
   }

   public void onCreate(Bundle param1) {
      // $FF: Couldn't be decompiled
   }

   public void onSaveInstanceState(Bundle param1) {
      // $FF: Couldn't be decompiled
   }

   public void onStart() {
      // $FF: Couldn't be decompiled
   }

   public void onStop() {
      // $FF: Couldn't be decompiled
   }

   protected abstract void zaa(ConnectionResult var1, int var2);

   public final void zab(ConnectionResult param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   protected abstract void zao();

   protected final void zaq() {
      // $FF: Couldn't be decompiled
   }
}
