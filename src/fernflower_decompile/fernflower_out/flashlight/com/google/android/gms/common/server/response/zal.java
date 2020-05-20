package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class(
   creator = "FieldMappingDictionaryEntryCreator"
)
public final class zal extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 2
   )
   final String className;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int versionCode;
   @SafeParcelable.Field(
      id = 3
   )
   final ArrayList zaqy;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zal(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) String param2, @SafeParcelable.Param(id = 3) ArrayList param3) {
      // $FF: Couldn't be decompiled
   }

   zal(String param1, Map param2) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
