package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.os.Handler.Callback;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

final class zze extends GmsClientSupervisor implements Callback {
   private final Handler mHandler;
   @GuardedBy("mConnectionStatus")
   private final HashMap zzdu;
   private final Context zzdv;
   private final ConnectionTracker zzdw;
   private final long zzdx;
   private final long zzdy;

   zze(Context param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static HashMap zza(zze param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Handler zzb(zze param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Context zzc(zze param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ConnectionTracker zzd(zze param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static long zze(zze param0) {
      // $FF: Couldn't be decompiled
   }

   public final boolean handleMessage(Message param1) {
      // $FF: Couldn't be decompiled
   }

   protected final boolean zza(GmsClientSupervisor.zza param1, ServiceConnection param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   protected final void zzb(GmsClientSupervisor.zza param1, ServiceConnection param2, String param3) {
      // $FF: Couldn't be decompiled
   }
}
