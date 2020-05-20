package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(
   creator = "WakeLockEventCreator"
)
public final class WakeLockEvent extends StatsEvent {
   public static final Creator CREATOR;
   private long durationMillis;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int versionCode;
   @SafeParcelable.Field(
      getter = "getTimeMillis",
      id = 2
   )
   private final long zzfo;
   @SafeParcelable.Field(
      getter = "getEventType",
      id = 11
   )
   private int zzfp;
   @SafeParcelable.Field(
      getter = "getWakeLockName",
      id = 4
   )
   private final String zzfq;
   @SafeParcelable.Field(
      getter = "getSecondaryWakeLockName",
      id = 10
   )
   private final String zzfr;
   @SafeParcelable.Field(
      getter = "getCodePackage",
      id = 17
   )
   private final String zzfs;
   @SafeParcelable.Field(
      getter = "getWakeLockType",
      id = 5
   )
   private final int zzft;
   @SafeParcelable.Field(
      getter = "getCallingPackages",
      id = 6
   )
   private final List zzfu;
   @SafeParcelable.Field(
      getter = "getEventKey",
      id = 12
   )
   private final String zzfv;
   @SafeParcelable.Field(
      getter = "getElapsedRealtime",
      id = 8
   )
   private final long zzfw;
   @SafeParcelable.Field(
      getter = "getDeviceState",
      id = 14
   )
   private int zzfx;
   @SafeParcelable.Field(
      getter = "getHostPackage",
      id = 13
   )
   private final String zzfy;
   @SafeParcelable.Field(
      getter = "getBeginPowerPercentage",
      id = 15
   )
   private final float zzfz;
   @SafeParcelable.Field(
      getter = "getTimeout",
      id = 16
   )
   private final long zzga;
   @SafeParcelable.Field(
      getter = "getAcquiredWithTimeout",
      id = 18
   )
   private final boolean zzgb;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   WakeLockEvent(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) long param2, @SafeParcelable.Param(id = 11) int param4, @SafeParcelable.Param(id = 4) String param5, @SafeParcelable.Param(id = 5) int param6, @SafeParcelable.Param(id = 6) List param7, @SafeParcelable.Param(id = 12) String param8, @SafeParcelable.Param(id = 8) long param9, @SafeParcelable.Param(id = 14) int param11, @SafeParcelable.Param(id = 10) String param12, @SafeParcelable.Param(id = 13) String param13, @SafeParcelable.Param(id = 15) float param14, @SafeParcelable.Param(id = 16) long param15, @SafeParcelable.Param(id = 17) String param17, @SafeParcelable.Param(id = 18) boolean param18) {
      // $FF: Couldn't be decompiled
   }

   public WakeLockEvent(long param1, int param3, String param4, int param5, List param6, String param7, long param8, int param10, String param11, String param12, float param13, long param14, String param16, boolean param17) {
      // $FF: Couldn't be decompiled
   }

   public final int getEventType() {
      // $FF: Couldn't be decompiled
   }

   public final long getTimeMillis() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final long zzu() {
      // $FF: Couldn't be decompiled
   }

   public final String zzv() {
      // $FF: Couldn't be decompiled
   }
}
