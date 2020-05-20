package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "ConnectionInfoCreator"
)
public final class zzb extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 1
   )
   Bundle zzda;
   @SafeParcelable.Field(
      id = 2
   )
   Feature[] zzdb;

   static {
      // $FF: Couldn't be decompiled
   }

   public zzb() {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zzb(@SafeParcelable.Param(id = 1) Bundle param1, @SafeParcelable.Param(id = 2) Feature[] param2) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
