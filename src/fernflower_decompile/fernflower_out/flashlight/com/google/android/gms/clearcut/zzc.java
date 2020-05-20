package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "CollectForDebugParcelableCreator"
)
public final class zzc extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      defaultValue = "false",
      id = 1
   )
   private final boolean zzad;
   @SafeParcelable.Field(
      id = 3
   )
   private final long zzae;
   @SafeParcelable.Field(
      id = 2
   )
   private final long zzaf;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzc(@SafeParcelable.Param(id = 1) boolean param1, @SafeParcelable.Param(id = 3) long param2, @SafeParcelable.Param(id = 2) long param4) {
      // $FF: Couldn't be decompiled
   }

   public final boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public final int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public final String toString() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
