package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "AppOpenAdOptionsParcelCreator"
)
@SafeParcelable.Reserved({1})
public final class zzuo extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @AppOpenAd.AppOpenAdOrientation
   @SafeParcelable.Field(
      id = 2
   )
   public final int orientation;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzuo(@AppOpenAd.AppOpenAdOrientation @SafeParcelable.Param(id = 2) int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
