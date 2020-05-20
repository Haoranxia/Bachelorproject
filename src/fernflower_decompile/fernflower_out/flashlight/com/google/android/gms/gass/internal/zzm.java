package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "ProgramRequestCreator"
)
public final class zzm extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int versionCode;
   @SafeParcelable.Field(
      id = 3
   )
   private final String zzgsf;
   @SafeParcelable.Field(
      id = 4
   )
   private final String zzgsg;
   @SafeParcelable.Field(
      id = 2
   )
   private final int zzgsh;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zzm(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) int param2, @SafeParcelable.Param(id = 3) String param3, @SafeParcelable.Param(id = 4) String param4) {
      // $FF: Couldn't be decompiled
   }

   public zzm(int param1, String param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
