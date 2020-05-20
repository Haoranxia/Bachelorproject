package com.google.android.gms.phenotype;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;
import javax.annotation.Nullable;

@Deprecated
@KeepForSdk
public abstract class PhenotypeFlag {
   private static final Object zzak;
   @SuppressLint({"StaticFieldLeak"})
   private static Context zzal;
   private static boolean zzam;
   private static Boolean zzan;
   private final PhenotypeFlag.Factory zzao;
   final String zzap;
   private final String zzaq;
   private final Object zzar;
   private Object zzas;

   static {
      // $FF: Couldn't be decompiled
   }

   private PhenotypeFlag(PhenotypeFlag.Factory param1, String param2, Object param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PhenotypeFlag(PhenotypeFlag.Factory param1, String param2, Object param3, zzr param4) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static void maybeInit(Context param0) {
      // $FF: Couldn't be decompiled
   }

   private static PhenotypeFlag zza(PhenotypeFlag.Factory param0, String param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   private static Object zza(PhenotypeFlag.zza param0) {
      // $FF: Couldn't be decompiled
   }

   static boolean zza(String param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static PhenotypeFlag zzb(PhenotypeFlag.Factory param0, String param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static final Boolean zzb(String param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   @TargetApi(24)
   private final Object zzd() {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   private final Object zze() {
      // $FF: Couldn't be decompiled
   }

   private static boolean zzf() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Object get() {
      // $FF: Couldn't be decompiled
   }

   public abstract Object zza(SharedPreferences var1);

   public abstract Object zza(String var1);

   // $FF: synthetic method
   final String zzg() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static class Factory {
      private final String zzax;
      private final Uri zzay;
      private final String zzaz;
      private final String zzba;
      private final boolean zzbb;
      private final boolean zzbc;

      @KeepForSdk
      public Factory(Uri param1) {
         // $FF: Couldn't be decompiled
      }

      private Factory(String param1, Uri param2, String param3, String param4, boolean param5, boolean param6) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static String zza(PhenotypeFlag.Factory param0) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static Uri zzb(PhenotypeFlag.Factory param0) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static String zzc(PhenotypeFlag.Factory param0) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static String zzd(PhenotypeFlag.Factory param0) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static boolean zze(PhenotypeFlag.Factory param0) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static boolean zzf(PhenotypeFlag.Factory param0) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public PhenotypeFlag createFlag(String param1, String param2) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public PhenotypeFlag.Factory withGservicePrefix(String param1) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public PhenotypeFlag.Factory withPhenotypePrefix(String param1) {
         // $FF: Couldn't be decompiled
      }
   }

   interface zza {
      Object zzh();
   }
}
