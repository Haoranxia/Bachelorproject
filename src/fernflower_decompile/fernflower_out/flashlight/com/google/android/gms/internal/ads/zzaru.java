package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "RewardedVideoAdRequestParcelCreator"
)
@SafeParcelable.Reserved({1})
public final class zzaru extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 3
   )
   public final String zzbqz;
   @SafeParcelable.Field(
      id = 2
   )
   public final zzug zzdio;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzaru(@SafeParcelable.Param(id = 2) zzug param1, @SafeParcelable.Param(id = 3) String param2) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
