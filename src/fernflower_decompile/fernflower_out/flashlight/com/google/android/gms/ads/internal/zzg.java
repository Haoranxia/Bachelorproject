package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "InterstitialAdParameterParcelCreator"
)
@SafeParcelable.Reserved({1})
public final class zzg extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 2
   )
   public final boolean zzbkx;
   @SafeParcelable.Field(
      id = 3
   )
   public final boolean zzbky;
   @SafeParcelable.Field(
      id = 4
   )
   private final String zzbkz;
   @SafeParcelable.Field(
      id = 5
   )
   public final boolean zzbla;
   @SafeParcelable.Field(
      id = 6
   )
   public final float zzblb;
   @SafeParcelable.Field(
      id = 7
   )
   public final int zzblc;
   @SafeParcelable.Field(
      id = 8
   )
   public final boolean zzbld;
   @SafeParcelable.Field(
      id = 9
   )
   public final boolean zzble;
   @SafeParcelable.Field(
      id = 10
   )
   public final boolean zzblf;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zzg(@SafeParcelable.Param(id = 2) boolean param1, @SafeParcelable.Param(id = 3) boolean param2, @SafeParcelable.Param(id = 4) String param3, @SafeParcelable.Param(id = 5) boolean param4, @SafeParcelable.Param(id = 6) float param5, @SafeParcelable.Param(id = 7) int param6, @SafeParcelable.Param(id = 8) boolean param7, @SafeParcelable.Param(id = 9) boolean param8, @SafeParcelable.Param(id = 10) boolean param9) {
      // $FF: Couldn't be decompiled
   }

   public zzg(boolean param1, boolean param2, boolean param3, float param4, int param5, boolean param6, boolean param7, boolean param8) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
