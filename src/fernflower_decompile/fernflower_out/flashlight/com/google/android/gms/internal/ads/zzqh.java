package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

@TargetApi(14)
final class zzqh implements ActivityLifecycleCallbacks {
   private boolean foreground;
   private final Object lock;
   private boolean zzbpe;
   @GuardedBy("lock")
   private final List zzbpf;
   @GuardedBy("lock")
   private final List zzbpg;
   private Runnable zzbph;
   private long zzbpi;
   private Context zzup;
   private boolean zzxx;
   private Activity zzzk;

   zzqh() {
      // $FF: Couldn't be decompiled
   }

   private final void setActivity(Activity param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Object zza(zzqh param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zza(zzqh param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zzb(zzqh param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zzc(zzqh param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static List zzd(zzqh param0) {
      // $FF: Couldn't be decompiled
   }

   public final Activity getActivity() {
      // $FF: Couldn't be decompiled
   }

   public final Context getContext() {
      // $FF: Couldn't be decompiled
   }

   public final void onActivityCreated(Activity param1, Bundle param2) {
      // $FF: Couldn't be decompiled
   }

   public final void onActivityDestroyed(Activity param1) {
      // $FF: Couldn't be decompiled
   }

   public final void onActivityPaused(Activity param1) {
      // $FF: Couldn't be decompiled
   }

   public final void onActivityResumed(Activity param1) {
      // $FF: Couldn't be decompiled
   }

   public final void onActivitySaveInstanceState(Activity param1, Bundle param2) {
      // $FF: Couldn't be decompiled
   }

   public final void onActivityStarted(Activity param1) {
      // $FF: Couldn't be decompiled
   }

   public final void onActivityStopped(Activity param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(Application param1, Context param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(zzqj param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zzb(zzqj param1) {
      // $FF: Couldn't be decompiled
   }
}
