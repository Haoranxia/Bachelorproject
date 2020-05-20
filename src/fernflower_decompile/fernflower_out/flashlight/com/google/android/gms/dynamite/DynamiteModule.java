package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.DynamiteApi;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public final class DynamiteModule {
   @KeepForSdk
   public static final DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION;
   @KeepForSdk
   public static final DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING;
   @KeepForSdk
   public static final DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION;
   @KeepForSdk
   public static final DynamiteModule.VersionPolicy PREFER_LOCAL;
   @KeepForSdk
   public static final DynamiteModule.VersionPolicy PREFER_REMOTE;
   @GuardedBy("DynamiteModule.class")
   private static Boolean zzif;
   @GuardedBy("DynamiteModule.class")
   private static zzi zzig;
   @GuardedBy("DynamiteModule.class")
   private static zzk zzih;
   @GuardedBy("DynamiteModule.class")
   private static String zzii;
   @GuardedBy("DynamiteModule.class")
   private static int zzij;
   private static final ThreadLocal zzik;
   private static final DynamiteModule.VersionPolicy.zza zzil;
   private static final DynamiteModule.VersionPolicy zzim;
   private final Context zzin;

   static {
      // $FF: Couldn't be decompiled
   }

   private DynamiteModule(Context param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static int getLocalVersion(Context param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static int getRemoteVersion(Context param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static DynamiteModule load(Context param0, DynamiteModule.VersionPolicy param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public static int zza(Context param0, String param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   private static DynamiteModule zza(Context param0, String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("DynamiteModule.class")
   private static void zza(ClassLoader param0) {
      // $FF: Couldn't be decompiled
   }

   private static Boolean zzaj() {
      // $FF: Couldn't be decompiled
   }

   private static int zzb(Context param0, String param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   private static DynamiteModule zzb(Context param0, String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private static int zzc(Context param0, String param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   private static DynamiteModule zze(Context param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   private static zzi zzj(Context param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final Context getModuleContext() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final IBinder instantiate(String param1) {
      // $FF: Couldn't be decompiled
   }

   @DynamiteApi
   public static class DynamiteLoaderClassLoader {
      @GuardedBy("DynamiteLoaderClassLoader.class")
      public static ClassLoader sClassLoader;

      public DynamiteLoaderClassLoader() {
         // $FF: Couldn't be decompiled
      }
   }

   @KeepForSdk
   public static class LoadingException extends Exception {
      private LoadingException(String param1) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      LoadingException(String param1, com.google.android.gms.dynamite.zza param2) {
         // $FF: Couldn't be decompiled
      }

      private LoadingException(String param1, Throwable param2) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      LoadingException(String param1, Throwable param2, com.google.android.gms.dynamite.zza param3) {
         // $FF: Couldn't be decompiled
      }
   }

   public interface VersionPolicy {
      DynamiteModule.VersionPolicy.zzb zza(Context var1, String var2, DynamiteModule.VersionPolicy.zza var3);

      public interface zza {
         int getLocalVersion(Context var1, String var2);

         int zza(Context var1, String var2, boolean var3);
      }

      public static final class zzb {
         public int zzir;
         public int zzis;
         public int zzit;

         public zzb() {
            // $FF: Couldn't be decompiled
         }
      }
   }

   private static final class zza {
      public Cursor zzio;

      private zza() {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      zza(com.google.android.gms.dynamite.zza param1) {
         // $FF: Couldn't be decompiled
      }
   }

   private static final class zzb implements DynamiteModule.VersionPolicy.zza {
      private final int zzip;
      private final int zziq;

      public zzb(int param1, int param2) {
         // $FF: Couldn't be decompiled
      }

      public final int getLocalVersion(Context param1, String param2) {
         // $FF: Couldn't be decompiled
      }

      public final int zza(Context param1, String param2, boolean param3) {
         // $FF: Couldn't be decompiled
      }
   }
}
