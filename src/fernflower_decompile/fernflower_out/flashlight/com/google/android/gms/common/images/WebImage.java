package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONObject;

@SafeParcelable.Class(
   creator = "WebImageCreator"
)
public final class WebImage extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int zalf;
   @SafeParcelable.Field(
      getter = "getWidth",
      id = 3
   )
   private final int zane;
   @SafeParcelable.Field(
      getter = "getHeight",
      id = 4
   )
   private final int zanf;
   @SafeParcelable.Field(
      getter = "getUrl",
      id = 2
   )
   private final Uri zang;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   WebImage(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) Uri param2, @SafeParcelable.Param(id = 3) int param3, @SafeParcelable.Param(id = 4) int param4) {
      // $FF: Couldn't be decompiled
   }

   public WebImage(Uri param1) {
      // $FF: Couldn't be decompiled
   }

   public WebImage(Uri param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public WebImage(JSONObject param1) {
      // $FF: Couldn't be decompiled
   }

   private static Uri zaa(JSONObject param0) {
      // $FF: Couldn't be decompiled
   }

   public final boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public final int getHeight() {
      // $FF: Couldn't be decompiled
   }

   public final Uri getUrl() {
      // $FF: Couldn't be decompiled
   }

   public final int getWidth() {
      // $FF: Couldn't be decompiled
   }

   public final int hashCode() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final JSONObject toJson() {
      // $FF: Couldn't be decompiled
   }

   public final String toString() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
