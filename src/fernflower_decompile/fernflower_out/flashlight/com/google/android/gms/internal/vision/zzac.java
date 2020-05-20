package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "LineBoxParcelCreator"
)
@SafeParcelable.Reserved({1})
public final class zzac extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 7
   )
   private final float zzdo;
   @SafeParcelable.Field(
      id = 8
   )
   public final String zzec;
   @SafeParcelable.Field(
      id = 2
   )
   public final zzaj[] zzeh;
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
   private final zzw zzek;
   @SafeParcelable.Field(
      id = 6
   )
   public final String zzel;
   @SafeParcelable.Field(
      id = 9
   )
   private final int zzem;
   @SafeParcelable.Field(
      id = 10
   )
   public final boolean zzen;
   @SafeParcelable.Field(
      id = 11
   )
   public final int zzeo;
   @SafeParcelable.Field(
      id = 12
   )
   public final int zzep;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzac(@SafeParcelable.Param(id = 2) zzaj[] param1, @SafeParcelable.Param(id = 3) zzw param2, @SafeParcelable.Param(id = 4) zzw param3, @SafeParcelable.Param(id = 5) zzw param4, @SafeParcelable.Param(id = 6) String param5, @SafeParcelable.Param(id = 7) float param6, @SafeParcelable.Param(id = 8) String param7, @SafeParcelable.Param(id = 9) int param8, @SafeParcelable.Param(id = 10) boolean param9, @SafeParcelable.Param(id = 11) int param10, @SafeParcelable.Param(id = 12) int param11) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
