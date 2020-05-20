package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "VersionInfoParcelCreator"
)
@SafeParcelable.Reserved({1})
public final class zzazb extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 2
   )
   public String zzbma;
   @SafeParcelable.Field(
      id = 3
   )
   public int zzdvz;
   @SafeParcelable.Field(
      id = 4
   )
   public int zzdwa;
   @SafeParcelable.Field(
      id = 5
   )
   public boolean zzdwb;
   @SafeParcelable.Field(
      id = 6
   )
   private boolean zzdwc;

   static {
      // $FF: Couldn't be decompiled
   }

   public zzazb(int param1, int param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   public zzazb(int param1, int param2, boolean param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   private zzazb(int param1, int param2, boolean param3, boolean param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zzazb(@SafeParcelable.Param(id = 2) String param1, @SafeParcelable.Param(id = 3) int param2, @SafeParcelable.Param(id = 4) int param3, @SafeParcelable.Param(id = 5) boolean param4, @SafeParcelable.Param(id = 6) boolean param5) {
      // $FF: Couldn't be decompiled
   }

   public static zzazb zzxm() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
