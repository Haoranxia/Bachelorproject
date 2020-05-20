package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "PlayLoggerContextCreator"
)
@SafeParcelable.Reserved({1})
public final class zzr extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 2
   )
   private final String packageName;
   @SafeParcelable.Field(
      defaultValue = "true",
      id = 7
   )
   private final boolean zzay;
   @SafeParcelable.Field(
      id = 10
   )
   private final int zzaz;
   @SafeParcelable.Field(
      id = 3
   )
   private final int zzi;
   @SafeParcelable.Field(
      id = 8
   )
   public final String zzj;
   @SafeParcelable.Field(
      id = 4
   )
   public final int zzk;
   @SafeParcelable.Field(
      id = 5
   )
   private final String zzl;
   @SafeParcelable.Field(
      id = 6
   )
   private final String zzm;
   @SafeParcelable.Field(
      id = 9
   )
   private final boolean zzn;

   static {
      // $FF: Couldn't be decompiled
   }

   public zzr(String param1, int param2, int param3, String param4, String param5, String param6, boolean param7, zzge.zzv.zzb param8) {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzr(@SafeParcelable.Param(id = 2) String param1, @SafeParcelable.Param(id = 3) int param2, @SafeParcelable.Param(id = 4) int param3, @SafeParcelable.Param(id = 5) String param4, @SafeParcelable.Param(id = 6) String param5, @SafeParcelable.Param(id = 7) boolean param6, @SafeParcelable.Param(id = 8) String param7, @SafeParcelable.Param(id = 9) boolean param8, @SafeParcelable.Param(id = 10) int param9) {
      // $FF: Couldn't be decompiled
   }

   public final boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public final int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public final String toString() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
