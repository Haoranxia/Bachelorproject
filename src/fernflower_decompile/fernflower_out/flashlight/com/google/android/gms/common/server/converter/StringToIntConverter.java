package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

@KeepForSdk
@SafeParcelable.Class(
   creator = "StringToIntConverterCreator"
)
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter {
   public static final Creator CREATOR;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int zalf;
   private final HashMap zapm;
   private final SparseArray zapn;
   @SafeParcelable.Field(
      getter = "getSerializedMap",
      id = 2
   )
   private final ArrayList zapo;

   static {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public StringToIntConverter() {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   StringToIntConverter(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) ArrayList param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final StringToIntConverter add(String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public final Object convert(Object param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public final Object convertBack(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final int zacj() {
      // $FF: Couldn't be decompiled
   }

   public final int zack() {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Class(
      creator = "StringToIntConverterEntryCreator"
   )
   public static final class zaa extends AbstractSafeParcelable {
      public static final Creator CREATOR;
      @SafeParcelable.VersionField(
         id = 1
      )
      private final int versionCode;
      @SafeParcelable.Field(
         id = 2
      )
      final String zapp;
      @SafeParcelable.Field(
         id = 3
      )
      final int zapq;

      static {
         // $FF: Couldn't be decompiled
      }

      @SafeParcelable.Constructor
      zaa(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) String param2, @SafeParcelable.Param(id = 3) int param3) {
         // $FF: Couldn't be decompiled
      }

      zaa(String param1, int param2) {
         // $FF: Couldn't be decompiled
      }

      public final void writeToParcel(Parcel param1, int param2) {
         // $FF: Couldn't be decompiled
      }
   }
}
