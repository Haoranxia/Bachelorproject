package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.vision.Frame;

@SafeParcelable.Class(
   creator = "FrameMetadataParcelCreator"
)
@SafeParcelable.Reserved({1})
public final class zzp extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 3
   )
   public int height;
   @SafeParcelable.Field(
      id = 4
   )
   public int id;
   @SafeParcelable.Field(
      id = 6
   )
   public int rotation;
   @SafeParcelable.Field(
      id = 2
   )
   public int width;
   @SafeParcelable.Field(
      id = 5
   )
   public long zzar;

   static {
      // $FF: Couldn't be decompiled
   }

   public zzp() {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzp(@SafeParcelable.Param(id = 2) int param1, @SafeParcelable.Param(id = 3) int param2, @SafeParcelable.Param(id = 4) int param3, @SafeParcelable.Param(id = 5) long param4, @SafeParcelable.Param(id = 6) int param6) {
      // $FF: Couldn't be decompiled
   }

   public static zzp zzc(Frame param0) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
