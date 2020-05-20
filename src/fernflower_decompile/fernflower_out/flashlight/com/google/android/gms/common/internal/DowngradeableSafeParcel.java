package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
   private static final Object zzdc;
   private static ClassLoader zzdd;
   private static Integer zzde;
   private boolean zzdf;

   static {
      // $FF: Couldn't be decompiled
   }

   public DowngradeableSafeParcel() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected static boolean canUnparcelSafely(String param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected static Integer getUnparcelClientVersion() {
      // $FF: Couldn't be decompiled
   }

   private static ClassLoader zzp() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected abstract boolean prepareForClientVersion(int var1);

   @KeepForSdk
   public void setShouldDowngrade(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected boolean shouldDowngrade() {
      // $FF: Couldn't be decompiled
   }
}
