package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "GassEventParcelCreator"
)
public final class zzb extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int versionCode;
   @SafeParcelable.Field(
      id = 2
   )
   private final byte[] zzgta;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zzb(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) byte[] param2) {
      // $FF: Couldn't be decompiled
   }

   public zzb(byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
