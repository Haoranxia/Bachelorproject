package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@SafeParcelable.Class(
   creator = "AutoClickProtectionConfigurationParcelCreator"
)
@SafeParcelable.Reserved({1})
public final class zzapz extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 2
   )
   public final boolean zzdln;
   @SafeParcelable.Field(
      id = 3
   )
   public final List zzdlo;

   static {
      // $FF: Couldn't be decompiled
   }

   public zzapz() {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzapz(@SafeParcelable.Param(id = 2) boolean param1, @SafeParcelable.Param(id = 3) List param2) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
