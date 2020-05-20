package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "GassRequestParcelCreator"
)
public final class zzc extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 2
   )
   private final String packageName;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int versionCode;
   @SafeParcelable.Field(
      id = 3
   )
   private final String zzgtb;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zzc(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) String param2, @SafeParcelable.Param(id = 3) String param3) {
      // $FF: Couldn't be decompiled
   }

   public zzc(String param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
