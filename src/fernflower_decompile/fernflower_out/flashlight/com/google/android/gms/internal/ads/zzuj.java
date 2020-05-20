package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "AdSizeParcelCreator"
)
@SafeParcelable.Reserved({1})
public final class zzuj extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 3
   )
   public final int height;
   @SafeParcelable.Field(
      id = 4
   )
   public final int heightPixels;
   @SafeParcelable.Field(
      id = 6
   )
   public final int width;
   @SafeParcelable.Field(
      id = 7
   )
   public final int widthPixels;
   @SafeParcelable.Field(
      id = 2
   )
   public final String zzabg;
   @SafeParcelable.Field(
      id = 9
   )
   public final boolean zzbmc;
   @SafeParcelable.Field(
      id = 5
   )
   public final boolean zzcco;
   @SafeParcelable.Field(
      id = 8
   )
   public final zzuj[] zzccp;
   @SafeParcelable.Field(
      id = 10
   )
   public final boolean zzccq;
   @SafeParcelable.Field(
      id = 11
   )
   public boolean zzccr;
   @SafeParcelable.Field(
      id = 12
   )
   public boolean zzccs;
   @SafeParcelable.Field(
      id = 13
   )
   private boolean zzcct;
   @SafeParcelable.Field(
      id = 14
   )
   public boolean zzccu;
   @SafeParcelable.Field(
      id = 15
   )
   public boolean zzccv;

   static {
      // $FF: Couldn't be decompiled
   }

   public zzuj() {
      // $FF: Couldn't be decompiled
   }

   public zzuj(Context param1, AdSize param2) {
      // $FF: Couldn't be decompiled
   }

   public zzuj(Context param1, AdSize[] param2) {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zzuj(@SafeParcelable.Param(id = 2) String param1, @SafeParcelable.Param(id = 3) int param2, @SafeParcelable.Param(id = 4) int param3, @SafeParcelable.Param(id = 5) boolean param4, @SafeParcelable.Param(id = 6) int param5, @SafeParcelable.Param(id = 7) int param6, @SafeParcelable.Param(id = 8) zzuj[] param7, @SafeParcelable.Param(id = 9) boolean param8, @SafeParcelable.Param(id = 10) boolean param9, @SafeParcelable.Param(id = 11) boolean param10, @SafeParcelable.Param(id = 12) boolean param11, @SafeParcelable.Param(id = 13) boolean param12, @SafeParcelable.Param(id = 14) boolean param13, @SafeParcelable.Param(id = 15) boolean param14) {
      // $FF: Couldn't be decompiled
   }

   public static int zzb(DisplayMetrics param0) {
      // $FF: Couldn't be decompiled
   }

   public static int zzc(DisplayMetrics param0) {
      // $FF: Couldn't be decompiled
   }

   private static int zzd(DisplayMetrics param0) {
      // $FF: Couldn't be decompiled
   }

   public static zzuj zzg(Context param0) {
      // $FF: Couldn't be decompiled
   }

   public static zzuj zzol() {
      // $FF: Couldn't be decompiled
   }

   public static zzuj zzom() {
      // $FF: Couldn't be decompiled
   }

   public static zzuj zzon() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final AdSize zzoo() {
      // $FF: Couldn't be decompiled
   }
}
