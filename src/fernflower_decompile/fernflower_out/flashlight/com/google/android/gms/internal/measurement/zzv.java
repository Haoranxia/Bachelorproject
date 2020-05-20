package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "InitializationParamsCreator"
)
public final class zzv extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 1
   )
   public final long zza;
   @SafeParcelable.Field(
      id = 2
   )
   public final long zzb;
   @SafeParcelable.Field(
      id = 3
   )
   public final boolean zzc;
   @SafeParcelable.Field(
      id = 4
   )
   public final String zzd;
   @SafeParcelable.Field(
      id = 5
   )
   public final String zze;
   @SafeParcelable.Field(
      id = 6
   )
   public final String zzf;
   @SafeParcelable.Field(
      id = 7
   )
   public final Bundle zzg;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzv(@SafeParcelable.Param(id = 1) long param1, @SafeParcelable.Param(id = 2) long param3, @SafeParcelable.Param(id = 3) boolean param5, @SafeParcelable.Param(id = 4) String param6, @SafeParcelable.Param(id = 5) String param7, @SafeParcelable.Param(id = 6) String param8, @SafeParcelable.Param(id = 7) Bundle param9) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
