package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@SafeParcelable.Class(
   creator = "PoolConfigurationCreator"
)
public final class zzdbe extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   private final zzdbh[] zzgod;
   private final int[] zzgoe;
   private final int[] zzgof;
   @SafeParcelable.Field(
      getter = "getFormatInt",
      id = 1
   )
   private final int zzgog;
   public final zzdbh zzgoh;
   @SafeParcelable.Field(
      id = 2
   )
   public final int zzgoi;
   @SafeParcelable.Field(
      id = 3
   )
   public final int zzgoj;
   @SafeParcelable.Field(
      id = 4
   )
   public final int zzgok;
   @SafeParcelable.Field(
      id = 5
   )
   public final String zzgol;
   @SafeParcelable.Field(
      getter = "getPoolDiscardStrategyInt",
      id = 6
   )
   private final int zzgom;
   public final int zzgon;
   @SafeParcelable.Field(
      getter = "getPrecacheStartTriggerInt",
      id = 7
   )
   private final int zzgoo;
   private final int zzgop;
   @Nullable
   public final Context zzup;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzdbe(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) int param2, @SafeParcelable.Param(id = 3) int param3, @SafeParcelable.Param(id = 4) int param4, @SafeParcelable.Param(id = 5) String param5, @SafeParcelable.Param(id = 6) int param6, @SafeParcelable.Param(id = 7) int param7) {
      // $FF: Couldn't be decompiled
   }

   private zzdbe(@Nullable Context param1, zzdbh param2, int param3, int param4, int param5, String param6, String param7, String param8) {
      // $FF: Couldn't be decompiled
   }

   public static zzdbe zza(zzdbh param0, Context param1) {
      // $FF: Couldn't be decompiled
   }

   public static boolean zzapl() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
