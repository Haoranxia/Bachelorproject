package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@SafeParcelable.Class(
   creator = "RtbVersionInfoParcelCreator"
)
public final class zzanw extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 1
   )
   private final int major;
   @SafeParcelable.Field(
      id = 2
   )
   private final int minor;
   @SafeParcelable.Field(
      id = 3
   )
   private final int zzdev;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zzanw(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) int param2, @SafeParcelable.Param(id = 3) int param3) {
      // $FF: Couldn't be decompiled
   }

   public static zzanw zza(VersionInfo param0) {
      // $FF: Couldn't be decompiled
   }

   public final String toString() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
