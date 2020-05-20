package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "HttpResponseParcelCreator"
)
public final class zzagb extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 4
   )
   public final byte[] data;
   @SafeParcelable.Field(
      id = 3
   )
   public final int statusCode;
   @SafeParcelable.Field(
      id = 7
   )
   public final boolean zzac;
   @SafeParcelable.Field(
      id = 8
   )
   public final long zzad;
   @SafeParcelable.Field(
      id = 5
   )
   public final String[] zzcxv;
   @SafeParcelable.Field(
      id = 6
   )
   public final String[] zzcxw;
   @SafeParcelable.Field(
      id = 1
   )
   public final boolean zzcxx;
   @SafeParcelable.Field(
      id = 2
   )
   public final String zzcxy;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zzagb(@SafeParcelable.Param(id = 1) boolean param1, @SafeParcelable.Param(id = 2) String param2, @SafeParcelable.Param(id = 3) int param3, @SafeParcelable.Param(id = 4) byte[] param4, @SafeParcelable.Param(id = 5) String[] param5, @SafeParcelable.Param(id = 6) String[] param6, @SafeParcelable.Param(id = 7) boolean param7, @SafeParcelable.Param(id = 8) long param8) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
