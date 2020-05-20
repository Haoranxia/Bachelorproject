package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Comparator;

@SafeParcelable.Class(
   creator = "FlagCreator"
)
@SafeParcelable.Reserved({1})
public final class zzi extends AbstractSafeParcelable implements Comparable {
   public static final Creator CREATOR;
   private static final Comparator zzai;
   @SafeParcelable.Field(
      id = 2
   )
   public final String name;
   @SafeParcelable.Field(
      id = 3
   )
   private final long zzab;
   @SafeParcelable.Field(
      id = 4
   )
   private final boolean zzac;
   @SafeParcelable.Field(
      id = 5
   )
   private final double zzad;
   @SafeParcelable.Field(
      id = 6
   )
   private final String zzae;
   @SafeParcelable.Field(
      id = 7
   )
   private final byte[] zzaf;
   @SafeParcelable.Field(
      id = 8
   )
   private final int zzag;
   @SafeParcelable.Field(
      id = 9
   )
   public final int zzah;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzi(@SafeParcelable.Param(id = 2) String param1, @SafeParcelable.Param(id = 3) long param2, @SafeParcelable.Param(id = 4) boolean param4, @SafeParcelable.Param(id = 5) double param5, @SafeParcelable.Param(id = 6) String param7, @SafeParcelable.Param(id = 7) byte[] param8, @SafeParcelable.Param(id = 8) int param9, @SafeParcelable.Param(id = 9) int param10) {
      // $FF: Couldn't be decompiled
   }

   private static int compare(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public final int compareTo(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public final String toString() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
