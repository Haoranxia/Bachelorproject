package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Logger;

abstract class zzdgc extends zzdfs.zzj {
   private static final Logger zzgvj;
   private static final zzdgc.zzb zzgwi;
   private volatile int remaining;
   private volatile Set seenExceptions;

   static {
      // $FF: Couldn't be decompiled
   }

   zzdgc(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Set zza(zzdgc param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Set zza(zzdgc param0, Set param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static int zzb(zzdgc param0) {
      // $FF: Couldn't be decompiled
   }

   final Set zzarp() {
      // $FF: Couldn't be decompiled
   }

   final int zzarq() {
      // $FF: Couldn't be decompiled
   }

   final void zzarr() {
      // $FF: Couldn't be decompiled
   }

   abstract void zzg(Set var1);

   static final class zza extends zzdgc.zzb {
      private final AtomicReferenceFieldUpdater zzgwj;
      private final AtomicIntegerFieldUpdater zzgwk;

      zza(AtomicReferenceFieldUpdater param1, AtomicIntegerFieldUpdater param2) {
         // $FF: Couldn't be decompiled
      }

      final void zza(zzdgc param1, Set param2, Set param3) {
         // $FF: Couldn't be decompiled
      }

      final int zzc(zzdgc param1) {
         // $FF: Couldn't be decompiled
      }
   }

   abstract static class zzb {
      private zzb() {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      zzb(zzdgb param1) {
         // $FF: Couldn't be decompiled
      }

      abstract void zza(zzdgc var1, Set var2, Set var3);

      abstract int zzc(zzdgc var1);
   }

   static final class zzc extends zzdgc.zzb {
      private zzc() {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      zzc(zzdgb param1) {
         // $FF: Couldn't be decompiled
      }

      final void zza(zzdgc param1, Set param2, Set param3) {
         // $FF: Couldn't be decompiled
      }

      final int zzc(zzdgc param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
