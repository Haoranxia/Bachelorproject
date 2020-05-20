package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "BoundingBoxParcelCreator"
)
@SafeParcelable.Reserved({1})
public final class zzw extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 5
   )
   public final int height;
   @SafeParcelable.Field(
      id = 2
   )
   public final int left;
   @SafeParcelable.Field(
      id = 3
   )
   public final int top;
   @SafeParcelable.Field(
      id = 4
   )
   public final int width;
   @SafeParcelable.Field(
      id = 6
   )
   public final float zzeg;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzw(@SafeParcelable.Param(id = 2) int param1, @SafeParcelable.Param(id = 3) int param2, @SafeParcelable.Param(id = 4) int param3, @SafeParcelable.Param(id = 5) int param4, @SafeParcelable.Param(id = 6) float param5) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
