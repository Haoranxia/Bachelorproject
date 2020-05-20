package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "CacheOfferingCreator"
)
@SafeParcelable.Reserved({1})
public final class zzry extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 2
   )
   public final String url;
   @SafeParcelable.Field(
      id = 3
   )
   private final long zzbrj;
   @SafeParcelable.Field(
      id = 4
   )
   private final String zzbrk;
   @SafeParcelable.Field(
      id = 5
   )
   private final String zzbrl;
   @SafeParcelable.Field(
      id = 6
   )
   private final String zzbrm;
   @SafeParcelable.Field(
      id = 7
   )
   private final Bundle zzbrn;
   @SafeParcelable.Field(
      id = 8
   )
   public final boolean zzbro;
   @SafeParcelable.Field(
      id = 9
   )
   public long zzbrp;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zzry(@SafeParcelable.Param(id = 2) String param1, @SafeParcelable.Param(id = 3) long param2, @SafeParcelable.Param(id = 4) String param4, @SafeParcelable.Param(id = 5) String param5, @SafeParcelable.Param(id = 6) String param6, @SafeParcelable.Param(id = 7) Bundle param7, @SafeParcelable.Param(id = 8) boolean param8, @SafeParcelable.Param(id = 9) long param9) {
      // $FF: Couldn't be decompiled
   }

   public static zzry zzby(String param0) {
      // $FF: Couldn't be decompiled
   }

   public static zzry zzd(Uri param0) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
