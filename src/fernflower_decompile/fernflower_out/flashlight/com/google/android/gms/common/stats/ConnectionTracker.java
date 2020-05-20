package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;

@KeepForSdk
public class ConnectionTracker {
   private static final Object zzdp;
   private static volatile ConnectionTracker zzfa;
   @VisibleForTesting
   private static boolean zzfb;
   private final List zzfc;
   private final List zzfd;
   private final List zzfe;
   private final List zzff;

   static {
      // $FF: Couldn't be decompiled
   }

   private ConnectionTracker() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static ConnectionTracker getInstance() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public boolean bindService(Context param1, Intent param2, ServiceConnection param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @SuppressLint({"UntrackedBindService"})
   @KeepForSdk
   public void unbindService(Context param1, ServiceConnection param2) {
      // $FF: Couldn't be decompiled
   }

   public final boolean zza(Context param1, String param2, Intent param3, ServiceConnection param4, int param5) {
      // $FF: Couldn't be decompiled
   }
}
