package com.google.android.gms.clearcut;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.clearcut.zzge;
import com.google.android.gms.internal.clearcut.zzha;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;
import javax.annotation.Nullable;

@KeepForSdk
public final class ClearcutLogger {
   @Deprecated
   public static final Api API;
   private static final Api.AbstractClientBuilder CLIENT_BUILDER;
   private static final Api.ClientKey CLIENT_KEY;
   private static final ExperimentTokens[] zze;
   private static final String[] zzf;
   private static final byte[][] zzg;
   private final String packageName;
   private final Context zzh;
   private final int zzi;
   private String zzj;
   private int zzk;
   private String zzl;
   private String zzm;
   private final boolean zzn;
   private zzge.zzv.zzb zzo;
   private final com.google.android.gms.clearcut.zzb zzp;
   private final Clock zzq;
   private ClearcutLogger.zzc zzr;
   private final ClearcutLogger.zza zzs;

   static {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   private ClearcutLogger(Context param1, int param2, String param3, String param4, String param5, boolean param6, com.google.android.gms.clearcut.zzb param7, Clock param8, ClearcutLogger.zzc param9, ClearcutLogger.zza param10) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public ClearcutLogger(Context param1, String param2, @Nullable String param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static ClearcutLogger anonymousLogger(Context param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   private static int zza(Context param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static int zza(ClearcutLogger param0) {
      // $FF: Couldn't be decompiled
   }

   private static int[] zza(ArrayList param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static String zzb(ClearcutLogger param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static int[] zzb(ArrayList param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static String zzc(ClearcutLogger param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static zzge.zzv.zzb zzd(ClearcutLogger param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Context zze(ClearcutLogger param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Clock zzf(ClearcutLogger param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ClearcutLogger.zzc zzg(ClearcutLogger param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zzh(ClearcutLogger param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static String zzi(ClearcutLogger param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static int zzj(ClearcutLogger param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ClearcutLogger.zza zzk(ClearcutLogger param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static com.google.android.gms.clearcut.zzb zzl(ClearcutLogger param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final ClearcutLogger.LogEventBuilder newEvent(@Nullable byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   public class LogEventBuilder {
      private final zzha zzaa;
      private boolean zzab;
      // $FF: synthetic field
      private final ClearcutLogger zzac;
      private String zzj;
      private int zzk;
      private String zzl;
      private String zzm;
      private zzge.zzv.zzb zzo;
      private final ClearcutLogger.zzb zzt;
      private ArrayList zzu;
      private ArrayList zzv;
      private ArrayList zzw;
      private ArrayList zzx;
      private ArrayList zzy;
      private boolean zzz;

      private LogEventBuilder(ClearcutLogger param1, byte[] param2) {
         // $FF: Couldn't be decompiled
      }

      private LogEventBuilder(ClearcutLogger param1, byte[] param2, ClearcutLogger.zzb param3) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      LogEventBuilder(ClearcutLogger param1, byte[] param2, com.google.android.gms.clearcut.zza param3) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public void log() {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public ClearcutLogger.LogEventBuilder setEventCode(int param1) {
         // $FF: Couldn't be decompiled
      }
   }

   public interface zza {
      boolean zza(zze var1);
   }

   public interface zzb {
      byte[] zza();
   }

   public static final class zzc {
      public zzc() {
         // $FF: Couldn't be decompiled
      }
   }
}
