package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

public class zzdfs extends zzdhv implements zzdhe {
   private static final boolean GENERATE_CANCELLATION_CAUSES;
   private static final Object NULL;
   private static final Logger zzgvj;
   private static final zzdfs.zza zzgvk;
   @NullableDecl
   private volatile zzdfs.zzd listeners;
   @NullableDecl
   private volatile Object value;
   @NullableDecl
   private volatile zzdfs.zzk waiters;

   static {
      // $FF: Couldn't be decompiled
   }

   protected zzdfs() {
      // $FF: Couldn't be decompiled
   }

   private static Object getFutureValue(zzdhe param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static zzdfs.zzd zza(zzdfs param0, zzdfs.zzd param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static zzdfs.zzk zza(zzdfs param0, zzdfs.zzk param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Object zza(zzdfs param0, Object param1) {
      // $FF: Couldn't be decompiled
   }

   private static Object zza(Future param0) {
      // $FF: Couldn't be decompiled
   }

   private final void zza(zzdfs.zzk param1) {
      // $FF: Couldn't be decompiled
   }

   private static void zza(zzdfs param0) {
      // $FF: Couldn't be decompiled
   }

   private static void zza(Runnable param0, Executor param1) {
      // $FF: Couldn't be decompiled
   }

   private final void zza(StringBuilder param1) {
      // $FF: Couldn't be decompiled
   }

   private static Object zzah(Object param0) {
      // $FF: Couldn't be decompiled
   }

   private final String zzai(Object param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static zzdfs.zza zzarl() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zzarm() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Object zzb(zzdfs param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zzc(zzdfs param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static zzdfs.zzk zzd(zzdfs param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Object zzd(zzdhe param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static zzdfs.zzd zze(zzdfs param0) {
      // $FF: Couldn't be decompiled
   }

   public void addListener(Runnable param1, Executor param2) {
      // $FF: Couldn't be decompiled
   }

   protected void afterDone() {
      // $FF: Couldn't be decompiled
   }

   public boolean cancel(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public Object get() {
      // $FF: Couldn't be decompiled
   }

   public Object get(long param1, TimeUnit param3) {
      // $FF: Couldn't be decompiled
   }

   protected void interruptTask() {
      // $FF: Couldn't be decompiled
   }

   public boolean isCancelled() {
      // $FF: Couldn't be decompiled
   }

   public boolean isDone() {
      // $FF: Couldn't be decompiled
   }

   final void maybePropagateCancellationTo(@NullableDecl Future param1) {
      // $FF: Couldn't be decompiled
   }

   @NullableDecl
   protected String pendingToString() {
      // $FF: Couldn't be decompiled
   }

   protected boolean set(@NullableDecl Object param1) {
      // $FF: Couldn't be decompiled
   }

   protected boolean setException(Throwable param1) {
      // $FF: Couldn't be decompiled
   }

   protected final boolean setFuture(zzdhe param1) {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      // $FF: Couldn't be decompiled
   }

   protected final boolean wasInterrupted() {
      // $FF: Couldn't be decompiled
   }

   @NullableDecl
   protected final Throwable zzark() {
      // $FF: Couldn't be decompiled
   }

   abstract static class zza {
      private zza() {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      zza(Object param1) {
         // $FF: Couldn't be decompiled
      }

      abstract void zza(zzdfs.zzk var1, zzdfs.zzk var2);

      abstract void zza(zzdfs.zzk var1, Thread var2);

      abstract boolean zza(zzdfs var1, zzdfs.zzd var2, zzdfs.zzd var3);

      abstract boolean zza(zzdfs var1, zzdfs.zzk var2, zzdfs.zzk var3);

      abstract boolean zza(zzdfs var1, Object var2, Object var3);
   }

   static final class zzb {
      static final zzdfs.zzb zzgvl;
      final Throwable exception;

      static {
         // $FF: Couldn't be decompiled
      }

      zzb(Throwable param1) {
         // $FF: Couldn't be decompiled
      }
   }

   static final class zzc {
      static final zzdfs.zzc zzgvm;
      static final zzdfs.zzc zzgvn;
      @NullableDecl
      final Throwable cause;
      final boolean wasInterrupted;

      static {
         // $FF: Couldn't be decompiled
      }

      zzc(boolean param1, @NullableDecl Throwable param2) {
         // $FF: Couldn't be decompiled
      }
   }

   static final class zzd {
      static final zzdfs.zzd zzgvo;
      final Executor executor;
      @NullableDecl
      zzdfs.zzd next;
      final Runnable task;

      static {
         // $FF: Couldn't be decompiled
      }

      zzd(Runnable param1, Executor param2) {
         // $FF: Couldn't be decompiled
      }
   }

   static final class zze implements Runnable {
      final zzdhe future;
      final zzdfs zzgvp;

      zze(zzdfs param1, zzdhe param2) {
         // $FF: Couldn't be decompiled
      }

      public final void run() {
         // $FF: Couldn't be decompiled
      }
   }

   static final class zzf extends zzdfs.zza {
      final AtomicReferenceFieldUpdater listenersUpdater;
      final AtomicReferenceFieldUpdater valueUpdater;
      final AtomicReferenceFieldUpdater waiterNextUpdater;
      final AtomicReferenceFieldUpdater waiterThreadUpdater;
      final AtomicReferenceFieldUpdater waitersUpdater;

      zzf(AtomicReferenceFieldUpdater param1, AtomicReferenceFieldUpdater param2, AtomicReferenceFieldUpdater param3, AtomicReferenceFieldUpdater param4, AtomicReferenceFieldUpdater param5) {
         // $FF: Couldn't be decompiled
      }

      final void zza(zzdfs.zzk param1, zzdfs.zzk param2) {
         // $FF: Couldn't be decompiled
      }

      final void zza(zzdfs.zzk param1, Thread param2) {
         // $FF: Couldn't be decompiled
      }

      final boolean zza(zzdfs param1, zzdfs.zzd param2, zzdfs.zzd param3) {
         // $FF: Couldn't be decompiled
      }

      final boolean zza(zzdfs param1, zzdfs.zzk param2, zzdfs.zzk param3) {
         // $FF: Couldn't be decompiled
      }

      final boolean zza(zzdfs param1, Object param2, Object param3) {
         // $FF: Couldn't be decompiled
      }
   }

   interface zzg extends zzdhe {
   }

   static final class zzh extends zzdfs.zza {
      private zzh() {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      zzh(Object param1) {
         // $FF: Couldn't be decompiled
      }

      final void zza(zzdfs.zzk param1, zzdfs.zzk param2) {
         // $FF: Couldn't be decompiled
      }

      final void zza(zzdfs.zzk param1, Thread param2) {
         // $FF: Couldn't be decompiled
      }

      final boolean zza(zzdfs param1, zzdfs.zzd param2, zzdfs.zzd param3) {
         // $FF: Couldn't be decompiled
      }

      final boolean zza(zzdfs param1, zzdfs.zzk param2, zzdfs.zzk param3) {
         // $FF: Couldn't be decompiled
      }

      final boolean zza(zzdfs param1, Object param2, Object param3) {
         // $FF: Couldn't be decompiled
      }
   }

   static final class zzi extends zzdfs.zza {
      static final Unsafe zzgvq;
      static final long zzgvr;
      static final long zzgvs;
      static final long zzgvt;
      static final long zzgvu;
      static final long zzgvv;

      static {
         // $FF: Couldn't be decompiled
      }

      private zzi() {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      zzi(Object param1) {
         // $FF: Couldn't be decompiled
      }

      final void zza(zzdfs.zzk param1, zzdfs.zzk param2) {
         // $FF: Couldn't be decompiled
      }

      final void zza(zzdfs.zzk param1, Thread param2) {
         // $FF: Couldn't be decompiled
      }

      final boolean zza(zzdfs param1, zzdfs.zzd param2, zzdfs.zzd param3) {
         // $FF: Couldn't be decompiled
      }

      final boolean zza(zzdfs param1, zzdfs.zzk param2, zzdfs.zzk param3) {
         // $FF: Couldn't be decompiled
      }

      final boolean zza(zzdfs param1, Object param2, Object param3) {
         // $FF: Couldn't be decompiled
      }
   }

   static class zzj extends zzdfs implements zzdfs.zzg {
      zzj() {
         // $FF: Couldn't be decompiled
      }

      public final Object get(long param1, TimeUnit param3) {
         // $FF: Couldn't be decompiled
      }
   }

   static final class zzk {
      static final zzdfs.zzk zzgvw;
      @NullableDecl
      volatile zzdfs.zzk next;
      @NullableDecl
      volatile Thread thread;

      static {
         // $FF: Couldn't be decompiled
      }

      zzk() {
         // $FF: Couldn't be decompiled
      }

      private zzk(boolean param1) {
         // $FF: Couldn't be decompiled
      }

      final void zzb(zzdfs.zzk param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
