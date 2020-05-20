package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "FaceSettingsParcelCreator"
)
@SafeParcelable.Reserved({1})
public final class zzf extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 3
   )
   public int landmarkType;
   @SafeParcelable.Field(
      id = 2
   )
   public int mode;
   @SafeParcelable.Field(
      defaultValue = "-1",
      id = 7
   )
   public float proportionalMinFaceSize;
   @SafeParcelable.Field(
      id = 6
   )
   public boolean trackingEnabled;
   @SafeParcelable.Field(
      id = 5
   )
   public boolean zzcn;
   @SafeParcelable.Field(
      id = 4
   )
   public int zzco;

   static {
      // $FF: Couldn't be decompiled
   }

   public zzf() {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzf(@SafeParcelable.Param(id = 2) int param1, @SafeParcelable.Param(id = 3) int param2, @SafeParcelable.Param(id = 4) int param3, @SafeParcelable.Param(id = 5) boolean param4, @SafeParcelable.Param(id = 6) boolean param5, @SafeParcelable.Param(id = 7) float param6) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
