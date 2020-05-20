package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@KeepForSdk
@SafeParcelable.Class(
   creator = "ExperimentTokensCreator"
)
@SafeParcelable.Reserved({1})
public class ExperimentTokens extends AbstractSafeParcelable {
   @KeepForSdk
   public static final Creator CREATOR;
   private static final ExperimentTokens.zza zzaa;
   private static final byte[][] zzn;
   private static final ExperimentTokens zzo;
   private static final ExperimentTokens.zza zzx;
   private static final ExperimentTokens.zza zzy;
   private static final ExperimentTokens.zza zzz;
   @SafeParcelable.Field(
      id = 2
   )
   private final String zzp;
   @SafeParcelable.Field(
      id = 3
   )
   private final byte[] zzq;
   @SafeParcelable.Field(
      id = 4
   )
   private final byte[][] zzr;
   @SafeParcelable.Field(
      id = 5
   )
   private final byte[][] zzs;
   @SafeParcelable.Field(
      id = 6
   )
   private final byte[][] zzt;
   @SafeParcelable.Field(
      id = 7
   )
   private final byte[][] zzu;
   @SafeParcelable.Field(
      id = 8
   )
   private final int[] zzv;
   @SafeParcelable.Field(
      id = 9
   )
   private final byte[][] zzw;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public ExperimentTokens(@SafeParcelable.Param(id = 2) String param1, @SafeParcelable.Param(id = 3) byte[] param2, @SafeParcelable.Param(id = 4) byte[][] param3, @SafeParcelable.Param(id = 5) byte[][] param4, @SafeParcelable.Param(id = 6) byte[][] param5, @SafeParcelable.Param(id = 7) byte[][] param6, @SafeParcelable.Param(id = 8) int[] param7, @SafeParcelable.Param(id = 9) byte[][] param8) {
      // $FF: Couldn't be decompiled
   }

   private static List zza(int[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static List zza(byte[][] param0) {
      // $FF: Couldn't be decompiled
   }

   private static void zza(StringBuilder param0, String param1, byte[][] param2) {
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

   private interface zza {
   }
}
