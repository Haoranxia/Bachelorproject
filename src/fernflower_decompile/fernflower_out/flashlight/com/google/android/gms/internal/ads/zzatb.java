package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@SafeParcelable.Class(
   creator = "ServerSideVerificationOptionsParcelCreator"
)
public final class zzatb extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 1
   )
   public final String zzdnv;
   @SafeParcelable.Field(
      id = 2
   )
   public final String zzdnw;

   static {
      // $FF: Couldn't be decompiled
   }

   public zzatb(ServerSideVerificationOptions param1) {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzatb(@SafeParcelable.Param(id = 1) String param1, @SafeParcelable.Param(id = 2) String param2) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
