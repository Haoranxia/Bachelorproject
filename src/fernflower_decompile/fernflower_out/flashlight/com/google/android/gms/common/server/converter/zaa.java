package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

@SafeParcelable.Class(
   creator = "ConverterWrapperCreator"
)
public final class zaa extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int zalf;
   @SafeParcelable.Field(
      getter = "getStringToIntConverter",
      id = 2
   )
   private final StringToIntConverter zapl;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zaa(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) StringToIntConverter param2) {
      // $FF: Couldn't be decompiled
   }

   private zaa(StringToIntConverter param1) {
      // $FF: Couldn't be decompiled
   }

   public static zaa zaa(FastJsonResponse.FieldConverter param0) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final FastJsonResponse.FieldConverter zaci() {
      // $FF: Couldn't be decompiled
   }
}
