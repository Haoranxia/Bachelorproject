package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(
   creator = "FieldMapPairCreator"
)
public final class zam extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int versionCode;
   @SafeParcelable.Field(
      id = 2
   )
   final String zaqz;
   @SafeParcelable.Field(
      id = 3
   )
   final FastJsonResponse.Field zara;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zam(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) String param2, @SafeParcelable.Param(id = 3) FastJsonResponse.Field param3) {
      // $FF: Couldn't be decompiled
   }

   zam(String param1, FastJsonResponse.Field param2) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
