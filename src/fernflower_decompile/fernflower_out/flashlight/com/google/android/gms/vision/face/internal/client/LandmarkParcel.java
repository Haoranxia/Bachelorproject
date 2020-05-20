package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@UsedByNative("wrapper.cc")
@SafeParcelable.Class(
   creator = "LandmarkParcelCreator"
)
public final class LandmarkParcel extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 4
   )
   public final int type;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int versionCode;
   @SafeParcelable.Field(
      id = 2
   )
   public final float x;
   @SafeParcelable.Field(
      id = 3
   )
   public final float y;

   static {
      // $FF: Couldn't be decompiled
   }

   @UsedByNative("wrapper.cc")
   @SafeParcelable.Constructor
   public LandmarkParcel(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) float param2, @SafeParcelable.Param(id = 3) float param3, @SafeParcelable.Param(id = 4) int param4) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
