package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;

@KeepForSdk
@SafeParcelable.Class(
   creator = "ConfigurationCreator"
)
@SafeParcelable.Reserved({1})
public class Configuration extends AbstractSafeParcelable implements Comparable {
   @KeepForSdk
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 2
   )
   private final int zzc;
   @SafeParcelable.Field(
      id = 3
   )
   private final zzi[] zzd;
   @SafeParcelable.Field(
      id = 4
   )
   private final String[] zze;
   private final Map zzf;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public Configuration(@SafeParcelable.Param(id = 2) int param1, @SafeParcelable.Param(id = 3) zzi[] param2, @SafeParcelable.Param(id = 4) String[] param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public int compareTo(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      // $FF: Couldn't be decompiled
   }

   public void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
