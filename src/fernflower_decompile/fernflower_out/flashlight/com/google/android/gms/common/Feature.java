package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(
   creator = "FeatureCreator"
)
public class Feature extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      getter = "getName",
      id = 1
   )
   private final String name;
   @Deprecated
   @SafeParcelable.Field(
      getter = "getOldVersion",
      id = 2
   )
   private final int zzk;
   @SafeParcelable.Field(
      defaultValue = "-1",
      getter = "getVersion",
      id = 3
   )
   private final long zzl;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public Feature(@SafeParcelable.Param(id = 1) String param1, @SafeParcelable.Param(id = 2) int param2, @SafeParcelable.Param(id = 3) long param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Feature(String param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public String getName() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public long getVersion() {
      // $FF: Couldn't be decompiled
   }

   public int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      // $FF: Couldn't be decompiled
   }

   public void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
