package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "VideoOptionsParcelCreator"
)
@SafeParcelable.Reserved({1})
public final class zzyw extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 2
   )
   public final boolean zzabv;
   @SafeParcelable.Field(
      id = 3
   )
   public final boolean zzabw;
   @SafeParcelable.Field(
      id = 4
   )
   public final boolean zzabx;

   static {
      // $FF: Couldn't be decompiled
   }

   public zzyw(VideoOptions param1) {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzyw(@SafeParcelable.Param(id = 2) boolean param1, @SafeParcelable.Param(id = 3) boolean param2, @SafeParcelable.Param(id = 4) boolean param3) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
