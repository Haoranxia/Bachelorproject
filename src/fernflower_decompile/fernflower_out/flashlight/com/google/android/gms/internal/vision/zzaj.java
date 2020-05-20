package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "WordBoxParcelCreator"
)
@SafeParcelable.Reserved({1})
public final class zzaj extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 6
   )
   private final float zzdo;
   @SafeParcelable.Field(
      id = 7
   )
   public final String zzec;
   @SafeParcelable.Field(
      id = 3
   )
   public final zzw zzei;
   @SafeParcelable.Field(
      id = 4
   )
   private final zzw zzej;
   @SafeParcelable.Field(
      id = 5
   )
   public final String zzel;
   @SafeParcelable.Field(
      id = 2
   )
   private final zzag[] zzer;
   @SafeParcelable.Field(
      id = 8
   )
   private final boolean zzes;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzaj(@SafeParcelable.Param(id = 2) zzag[] param1, @SafeParcelable.Param(id = 3) zzw param2, @SafeParcelable.Param(id = 4) zzw param3, @SafeParcelable.Param(id = 5) String param4, @SafeParcelable.Param(id = 6) float param5, @SafeParcelable.Param(id = 7) String param6, @SafeParcelable.Param(id = 8) boolean param7) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
