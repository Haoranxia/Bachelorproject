package com.google.android.gms.tasks;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

public final class Tasks {
   private Tasks() {
      // $FF: Couldn't be decompiled
   }

   public static Object await(Task param0) {
      // $FF: Couldn't be decompiled
   }

   public static Object await(Task param0, long param1, TimeUnit param3) {
      // $FF: Couldn't be decompiled
   }

   public static Task call(Callable param0) {
      // $FF: Couldn't be decompiled
   }

   public static Task call(Executor param0, Callable param1) {
      // $FF: Couldn't be decompiled
   }

   public static Task forCanceled() {
      // $FF: Couldn't be decompiled
   }

   public static Task forException(Exception param0) {
      // $FF: Couldn't be decompiled
   }

   public static Task forResult(Object param0) {
      // $FF: Couldn't be decompiled
   }

   public static Task whenAll(Collection param0) {
      // $FF: Couldn't be decompiled
   }

   public static Task whenAll(Task... param0) {
      // $FF: Couldn't be decompiled
   }

   public static Task whenAllComplete(Collection param0) {
      // $FF: Couldn't be decompiled
   }

   public static Task whenAllComplete(Task... param0) {
      // $FF: Couldn't be decompiled
   }

   public static Task whenAllSuccess(Collection param0) {
      // $FF: Couldn't be decompiled
   }

   public static Task whenAllSuccess(Task... param0) {
      // $FF: Couldn't be decompiled
   }

   private static void zza(Task param0, Tasks.zzb param1) {
      // $FF: Couldn't be decompiled
   }

   private static Object zzb(Task param0) {
      // $FF: Couldn't be decompiled
   }

   private static final class zza implements Tasks.zzb {
      private final CountDownLatch zzaf;

      private zza() {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      zza(zzv param1) {
         // $FF: Couldn't be decompiled
      }

      public final void await() {
         // $FF: Couldn't be decompiled
      }

      public final boolean await(long param1, TimeUnit param3) {
         // $FF: Couldn't be decompiled
      }

      public final void onCanceled() {
         // $FF: Couldn't be decompiled
      }

      public final void onFailure(Exception param1) {
         // $FF: Couldn't be decompiled
      }

      public final void onSuccess(Object param1) {
         // $FF: Couldn't be decompiled
      }
   }

   interface zzb extends OnCanceledListener, OnFailureListener, OnSuccessListener {
   }

   private static final class zzc implements Tasks.zzb {
      private final Object mLock;
      private final zzu zza;
      @GuardedBy("mLock")
      private Exception zzab;
      private final int zzag;
      @GuardedBy("mLock")
      private int zzah;
      @GuardedBy("mLock")
      private int zzai;
      @GuardedBy("mLock")
      private int zzaj;
      @GuardedBy("mLock")
      private boolean zzak;

      public zzc(int param1, zzu param2) {
         // $FF: Couldn't be decompiled
      }

      @GuardedBy("mLock")
      private final void zzf() {
         // $FF: Couldn't be decompiled
      }

      public final void onCanceled() {
         // $FF: Couldn't be decompiled
      }

      public final void onFailure(Exception param1) {
         // $FF: Couldn't be decompiled
      }

      public final void onSuccess(Object param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
