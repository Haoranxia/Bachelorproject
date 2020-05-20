package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;

@KeepForSdk
public class WakeLockTracker {
   private static WakeLockTracker zzgc;
   private static Boolean zzgd;
   @VisibleForTesting
   private static boolean zzge;

   static {
      // $FF: Couldn't be decompiled
   }

   public WakeLockTracker() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static WakeLockTracker getInstance() {
      // $FF: Couldn't be decompiled
   }

   private static void zza(Context param0, WakeLockEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean zzw() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void registerAcquireEvent(Context param1, Intent param2, String param3, String param4, String param5, int param6, String param7) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void registerDeadlineEvent(Context param1, String param2, String param3, String param4, int param5, List param6, boolean param7, long param8) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void registerEvent(Context param1, String param2, int param3, String param4, String param5, String param6, int param7, List param8) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void registerEvent(Context param1, String param2, int param3, String param4, String param5, String param6, int param7, List param8, long param9) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void registerReleaseEvent(Context param1, Intent param2) {
      // $FF: Couldn't be decompiled
   }
}
