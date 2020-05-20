package com.google.android.gms.ads.identifier;

import android.content.Context;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads_identifier.zze;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@KeepForSdk
public class AdvertisingIdClient {
   @GuardedBy("this")
   private final Context mContext;
   @GuardedBy("this")
   private BlockingServiceConnection zze;
   @GuardedBy("this")
   private zze zzf;
   @GuardedBy("this")
   private boolean zzg;
   private final Object zzh;
   @GuardedBy("mAutoDisconnectTaskLock")
   private AdvertisingIdClient.zza zzi;
   private final boolean zzj;
   private final long zzk;

   @KeepForSdk
   public AdvertisingIdClient(Context param1) {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   private AdvertisingIdClient(Context param1, long param2, boolean param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static AdvertisingIdClient.Info getAdvertisingIdInfo(Context param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static boolean getIsAdIdFakeForDebugLogging(Context param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static void setShouldSkipGmsCoreVersionCheck(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   private static BlockingServiceConnection zza(Context param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   private static zze zza(Context param0, BlockingServiceConnection param1) {
      // $FF: Couldn't be decompiled
   }

   private final void zza() {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   private final void zza(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   private final boolean zza(AdvertisingIdClient.Info param1, boolean param2, float param3, long param4, String param6, Throwable param7) {
      // $FF: Couldn't be decompiled
   }

   private final boolean zzb() {
      // $FF: Couldn't be decompiled
   }

   protected void finalize() {
      // $FF: Couldn't be decompiled
   }

   public final void finish() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public AdvertisingIdClient.Info getInfo() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void start() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdkWithMembers
   public static final class Info {
      private final String zzq;
      private final boolean zzr;

      public Info(String param1, boolean param2) {
         // $FF: Couldn't be decompiled
      }

      public final String getId() {
         // $FF: Couldn't be decompiled
      }

      public final boolean isLimitAdTrackingEnabled() {
         // $FF: Couldn't be decompiled
      }

      public final String toString() {
         // $FF: Couldn't be decompiled
      }
   }

   @VisibleForTesting
   static final class zza extends Thread {
      private WeakReference zzm;
      private long zzn;
      CountDownLatch zzo;
      boolean zzp;

      public zza(AdvertisingIdClient param1, long param2) {
         // $FF: Couldn't be decompiled
      }

      private final void disconnect() {
         // $FF: Couldn't be decompiled
      }

      public final void run() {
         // $FF: Couldn't be decompiled
      }
   }
}
