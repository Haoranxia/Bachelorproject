package com.google.android.gms.flags;

import com.google.android.gms.common.annotation.KeepForSdk;

@Deprecated
@KeepForSdk
public abstract class Flag {
   private final String mKey;
   private final int zze;
   private final Object zzf;

   private Flag(int param1, String param2, Object param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Flag(int param1, String param2, Object param3, zza param4) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   @KeepForSdk
   public static Flag.BooleanFlag define(int param0, String param1, Boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   @KeepForSdk
   public static Flag.IntegerFlag define(int param0, String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   @KeepForSdk
   public static Flag.LongFlag define(int param0, String param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   @KeepForSdk
   public static Flag.StringFlag define(int param0, String param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Object get() {
      // $FF: Couldn't be decompiled
   }

   public final String getKey() {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public final int getSource() {
      // $FF: Couldn't be decompiled
   }

   protected abstract Object zza(zzc var1);

   public final Object zzb() {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public static class BooleanFlag extends Flag {
      public BooleanFlag(int param1, String param2, Boolean param3) {
         // $FF: Couldn't be decompiled
      }

      private final Boolean zzb(zzc param1) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      public final Object zza(zzc param1) {
         // $FF: Couldn't be decompiled
      }
   }

   @Deprecated
   @KeepForSdk
   public static class IntegerFlag extends Flag {
      public IntegerFlag(int param1, String param2, Integer param3) {
         // $FF: Couldn't be decompiled
      }

      private final Integer zzc(zzc param1) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      public final Object zza(zzc param1) {
         // $FF: Couldn't be decompiled
      }
   }

   @Deprecated
   @KeepForSdk
   public static class LongFlag extends Flag {
      public LongFlag(int param1, String param2, Long param3) {
         // $FF: Couldn't be decompiled
      }

      private final Long zzd(zzc param1) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      public final Object zza(zzc param1) {
         // $FF: Couldn't be decompiled
      }
   }

   @Deprecated
   @KeepForSdk
   public static class StringFlag extends Flag {
      public StringFlag(int param1, String param2, String param3) {
         // $FF: Couldn't be decompiled
      }

      private final String zze(zzc param1) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      public final Object zza(zzc param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
