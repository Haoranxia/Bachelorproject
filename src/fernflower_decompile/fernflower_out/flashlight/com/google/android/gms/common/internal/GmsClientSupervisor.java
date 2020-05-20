package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract class GmsClientSupervisor {
   private static final Object zzdp;
   private static GmsClientSupervisor zzdq;

   static {
      // $FF: Couldn't be decompiled
   }

   public GmsClientSupervisor() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static GmsClientSupervisor getInstance(Context param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public boolean bindService(ComponentName param1, ServiceConnection param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public boolean bindService(String param1, ServiceConnection param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void unbindService(ComponentName param1, ServiceConnection param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void unbindService(String param1, ServiceConnection param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   public final void zza(String param1, String param2, int param3, ServiceConnection param4, String param5) {
      // $FF: Couldn't be decompiled
   }

   protected abstract boolean zza(GmsClientSupervisor.zza var1, ServiceConnection var2, String var3);

   protected abstract void zzb(GmsClientSupervisor.zza var1, ServiceConnection var2, String var3);

   protected static final class zza {
      private final ComponentName mComponentName;
      private final String zzdr;
      private final String zzds;
      private final int zzdt;

      public zza(ComponentName param1, int param2) {
         // $FF: Couldn't be decompiled
      }

      public zza(String param1, int param2) {
         // $FF: Couldn't be decompiled
      }

      public zza(String param1, String param2, int param3) {
         // $FF: Couldn't be decompiled
      }

      public final boolean equals(Object param1) {
         // $FF: Couldn't be decompiled
      }

      public final ComponentName getComponentName() {
         // $FF: Couldn't be decompiled
      }

      public final String getPackage() {
         // $FF: Couldn't be decompiled
      }

      public final int hashCode() {
         // $FF: Couldn't be decompiled
      }

      public final String toString() {
         // $FF: Couldn't be decompiled
      }

      public final Intent zzb(Context param1) {
         // $FF: Couldn't be decompiled
      }

      public final int zzq() {
         // $FF: Couldn't be decompiled
      }
   }
}
