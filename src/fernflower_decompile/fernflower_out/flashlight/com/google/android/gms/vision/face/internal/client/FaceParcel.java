package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@UsedByNative("wrapper.cc")
@SafeParcelable.Class(
   creator = "FaceParcelCreator"
)
public class FaceParcel extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 3
   )
   public final float centerX;
   @SafeParcelable.Field(
      id = 4
   )
   public final float centerY;
   @SafeParcelable.Field(
      id = 6
   )
   public final float height;
   @SafeParcelable.Field(
      id = 2
   )
   public final int id;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int versionCode;
   @SafeParcelable.Field(
      id = 5
   )
   public final float width;
   @SafeParcelable.Field(
      id = 10
   )
   public final float zzce;
   @SafeParcelable.Field(
      id = 11
   )
   public final float zzcf;
   @SafeParcelable.Field(
      id = 12
   )
   public final float zzcg;
   @SafeParcelable.Field(
      defaultValue = "-1.0f",
      id = 15
   )
   public final float zzch;
   @SafeParcelable.Field(
      defaultValue = "3.4028235E38f",
      id = 7
   )
   public final float zzcz;
   @SafeParcelable.Field(
      defaultValue = "3.4028235E38f",
      id = 8
   )
   public final float zzda;
   @SafeParcelable.Field(
      defaultValue = "3.4028235E38f",
      id = 14
   )
   public final float zzdb;
   @SafeParcelable.Field(
      id = 9
   )
   public final LandmarkParcel[] zzdc;
   @SafeParcelable.Field(
      id = 13
   )
   public final zza[] zzdd;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public FaceParcel(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) int param2, @SafeParcelable.Param(id = 3) float param3, @SafeParcelable.Param(id = 4) float param4, @SafeParcelable.Param(id = 5) float param5, @SafeParcelable.Param(id = 6) float param6, @SafeParcelable.Param(id = 7) float param7, @SafeParcelable.Param(id = 8) float param8, @SafeParcelable.Param(id = 14) float param9, @SafeParcelable.Param(id = 9) LandmarkParcel[] param10, @SafeParcelable.Param(id = 10) float param11, @SafeParcelable.Param(id = 11) float param12, @SafeParcelable.Param(id = 12) float param13, @SafeParcelable.Param(id = 13) zza[] param14, @SafeParcelable.Param(id = 15) float param15) {
      // $FF: Couldn't be decompiled
   }

   @UsedByNative("wrapper.cc")
   public FaceParcel(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) int param2, @SafeParcelable.Param(id = 3) float param3, @SafeParcelable.Param(id = 4) float param4, @SafeParcelable.Param(id = 5) float param5, @SafeParcelable.Param(id = 6) float param6, @SafeParcelable.Param(id = 7) float param7, @SafeParcelable.Param(id = 8) float param8, @SafeParcelable.Param(id = 9) LandmarkParcel[] param9, @SafeParcelable.Param(id = 10) float param10, @SafeParcelable.Param(id = 11) float param11, @SafeParcelable.Param(id = 12) float param12) {
      // $FF: Couldn't be decompiled
   }

   public void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
