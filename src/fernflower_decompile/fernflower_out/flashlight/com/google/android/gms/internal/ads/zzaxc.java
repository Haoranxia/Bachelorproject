package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "ExceptionParcelCreator"
)
public final class zzaxc extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 2
   )
   public final int errorCode;
   @SafeParcelable.Field(
      id = 1
   )
   public final String zzdtr;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zzaxc(@SafeParcelable.Param(id = 1) String param1, @SafeParcelable.Param(id = 2) int param2) {
      // $FF: Couldn't be decompiled
   }

   public static zzaxc zza(Throwable param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
