package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepForSdk
@KeepName
public abstract class BasePendingResult extends PendingResult {
   static final ThreadLocal zadn;
   @KeepName
   private BasePendingResult.zaa mResultGuardian;
   private Status mStatus;
   private Result zacj;
   private final Object zado;
   private final BasePendingResult.CallbackHandler zadp;
   private final WeakReference zadq;
   private final CountDownLatch zadr;
   private final ArrayList zads;
   private ResultCallback zadt;
   private final AtomicReference zadu;
   private volatile boolean zadv;
   private boolean zadw;
   private boolean zadx;
   private ICancelToken zady;
   private volatile zacm zadz;
   private boolean zaea;

   static {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   BasePendingResult() {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   @KeepForSdk
   protected BasePendingResult(Looper param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected BasePendingResult(GoogleApiClient param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   @VisibleForTesting
   protected BasePendingResult(BasePendingResult.CallbackHandler param1) {
      // $FF: Couldn't be decompiled
   }

   private final Result get() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Result zaa(BasePendingResult param0) {
      // $FF: Couldn't be decompiled
   }

   private final void zaa(Result param1) {
      // $FF: Couldn't be decompiled
   }

   public static void zab(Result param0) {
      // $FF: Couldn't be decompiled
   }

   public final void addStatusListener(PendingResult.StatusListener param1) {
      // $FF: Couldn't be decompiled
   }

   public final Result await() {
      // $FF: Couldn't be decompiled
   }

   public final Result await(long param1, TimeUnit param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void cancel() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected abstract Result createFailedResult(Status var1);

   public boolean isCanceled() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final boolean isReady() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected final void setCancelToken(ICancelToken param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final void setResult(Result param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final void setResultCallback(ResultCallback param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final void setResultCallback(ResultCallback param1, long param2, TimeUnit param4) {
      // $FF: Couldn't be decompiled
   }

   public TransformedResult then(ResultTransform param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zaa(zacs param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zab(Status param1) {
      // $FF: Couldn't be decompiled
   }

   public final Integer zam() {
      // $FF: Couldn't be decompiled
   }

   public final boolean zat() {
      // $FF: Couldn't be decompiled
   }

   public final void zau() {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   public static class CallbackHandler extends com.google.android.gms.internal.base.zap {
      public CallbackHandler() {
         // $FF: Couldn't be decompiled
      }

      public CallbackHandler(Looper param1) {
         // $FF: Couldn't be decompiled
      }

      public void handleMessage(Message param1) {
         // $FF: Couldn't be decompiled
      }

      public final void zaa(ResultCallback param1, Result param2) {
         // $FF: Couldn't be decompiled
      }
   }

   private final class zaa {
      // $FF: synthetic field
      private final BasePendingResult zaeb;

      private zaa(BasePendingResult param1) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      zaa(BasePendingResult param1, zap param2) {
         // $FF: Couldn't be decompiled
      }

      protected final void finalize() {
         // $FF: Couldn't be decompiled
      }
   }
}
