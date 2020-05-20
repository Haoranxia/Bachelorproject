package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import com.google.android.gms.common.annotation.KeepForSdk;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public final class CrashUtils {
   private static final String[] zzgg;
   private static DropBoxManager zzgh;
   private static boolean zzgi;
   private static int zzgj;
   @GuardedBy("CrashUtils.class")
   private static int zzgk;
   @GuardedBy("CrashUtils.class")
   private static int zzgl;

   static {
      // $FF: Couldn't be decompiled
   }

   public CrashUtils() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static boolean addDynamiteErrorToDropBox(Context param0, Throwable param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean zza(Context param0, Throwable param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
