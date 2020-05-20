package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.clearcut.zzha;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;

@SafeParcelable.Class(
   creator = "LogEventParcelableCreator"
)
@SafeParcelable.Reserved({1})
public final class zze extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   public final zzha zzaa;
   @SafeParcelable.Field(
      id = 2
   )
   public zzr zzag;
   @SafeParcelable.Field(
      id = 3
   )
   public byte[] zzah;
   @SafeParcelable.Field(
      id = 4
   )
   private int[] zzai;
   @SafeParcelable.Field(
      id = 5
   )
   private String[] zzaj;
   @SafeParcelable.Field(
      id = 6
   )
   private int[] zzak;
   @SafeParcelable.Field(
      id = 7
   )
   private byte[][] zzal;
   @SafeParcelable.Field(
      id = 9
   )
   private ExperimentTokens[] zzam;
   public final ClearcutLogger.zzb zzan;
   public final ClearcutLogger.zzb zzt;
   @SafeParcelable.Field(
      defaultValue = "true",
      id = 8
   )
   private boolean zzz;

   static {
      // $FF: Couldn't be decompiled
   }

   public zze(zzr param1, zzha param2, ClearcutLogger.zzb param3, ClearcutLogger.zzb param4, int[] param5, String[] param6, int[] param7, byte[][] param8, ExperimentTokens[] param9, boolean param10) {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zze(@SafeParcelable.Param(id = 2) zzr param1, @SafeParcelable.Param(id = 3) byte[] param2, @SafeParcelable.Param(id = 4) int[] param3, @SafeParcelable.Param(id = 5) String[] param4, @SafeParcelable.Param(id = 6) int[] param5, @SafeParcelable.Param(id = 7) byte[][] param6, @SafeParcelable.Param(id = 8) boolean param7, @SafeParcelable.Param(id = 9) ExperimentTokens[] param8) {
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
