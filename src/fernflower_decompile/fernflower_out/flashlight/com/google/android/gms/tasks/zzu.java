package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

final class zzu extends Task {
   private final Object mLock;
   @GuardedBy("mLock")
   private Object zzaa;
   @GuardedBy("mLock")
   private Exception zzab;
   private final zzr zzx;
   @GuardedBy("mLock")
   private boolean zzy;
   private volatile boolean zzz;

   zzu() {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final void zzb() {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final void zzc() {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mLock")
   private final void zzd() {
      // $FF: Couldn't be decompiled
   }

   private final void zze() {
      // $FF: Couldn't be decompiled
   }

   public final Task addOnCanceledListener(Activity param1, OnCanceledListener param2) {
      // $FF: Couldn't be decompiled
   }

   public final Task addOnCanceledListener(OnCanceledListener param1) {
      // $FF: Couldn't be decompiled
   }

   public final Task addOnCanceledListener(Executor param1, OnCanceledListener param2) {
      // $FF: Couldn't be decompiled
   }

   public final Task addOnCompleteListener(Activity param1, OnCompleteListener param2) {
      // $FF: Couldn't be decompiled
   }

   public final Task addOnCompleteListener(OnCompleteListener param1) {
      // $FF: Couldn't be decompiled
   }

   public final Task addOnCompleteListener(Executor param1, OnCompleteListener param2) {
      // $FF: Couldn't be decompiled
   }

   public final Task addOnFailureListener(Activity param1, OnFailureListener param2) {
      // $FF: Couldn't be decompiled
   }

   public final Task addOnFailureListener(OnFailureListener param1) {
      // $FF: Couldn't be decompiled
   }

   public final Task addOnFailureListener(Executor param1, OnFailureListener param2) {
      // $FF: Couldn't be decompiled
   }

   public final Task addOnSuccessListener(Activity param1, OnSuccessListener param2) {
      // $FF: Couldn't be decompiled
   }

   public final Task addOnSuccessListener(OnSuccessListener param1) {
      // $FF: Couldn't be decompiled
   }

   public final Task addOnSuccessListener(Executor param1, OnSuccessListener param2) {
      // $FF: Couldn't be decompiled
   }

   public final Task continueWith(Continuation param1) {
      // $FF: Couldn't be decompiled
   }

   public final Task continueWith(Executor param1, Continuation param2) {
      // $FF: Couldn't be decompiled
   }

   public final Task continueWithTask(Continuation param1) {
      // $FF: Couldn't be decompiled
   }

   public final Task continueWithTask(Executor param1, Continuation param2) {
      // $FF: Couldn't be decompiled
   }

   public final Exception getException() {
      // $FF: Couldn't be decompiled
   }

   public final Object getResult() {
      // $FF: Couldn't be decompiled
   }

   public final Object getResult(Class param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean isCanceled() {
      // $FF: Couldn't be decompiled
   }

   public final boolean isComplete() {
      // $FF: Couldn't be decompiled
   }

   public final boolean isSuccessful() {
      // $FF: Couldn't be decompiled
   }

   public final Task onSuccessTask(SuccessContinuation param1) {
      // $FF: Couldn't be decompiled
   }

   public final Task onSuccessTask(Executor param1, SuccessContinuation param2) {
      // $FF: Couldn't be decompiled
   }

   public final void setException(Exception param1) {
      // $FF: Couldn't be decompiled
   }

   public final void setResult(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean trySetException(Exception param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean trySetResult(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean zza() {
      // $FF: Couldn't be decompiled
   }

   private static class zza extends LifecycleCallback {
      private final List zzac;

      private zza(LifecycleFragment param1) {
         // $FF: Couldn't be decompiled
      }

      public static zzu.zza zza(Activity param0) {
         // $FF: Couldn't be decompiled
      }

      public void onStop() {
         // $FF: Couldn't be decompiled
      }

      public final void zzb(zzq param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
