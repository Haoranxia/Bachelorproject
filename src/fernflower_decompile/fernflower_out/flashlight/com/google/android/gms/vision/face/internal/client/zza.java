package com.google.android.gms.vision.face.internal.client;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "ContourParcelCreator"
)
@SafeParcelable.Reserved({1})
public final class zza extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 3
   )
   public final int type;
   @SafeParcelable.Field(
      id = 2
   )
   public final PointF[] zzcx;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zza(@SafeParcelable.Param(id = 2) PointF[] param1, @SafeParcelable.Param(id = 3) int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
