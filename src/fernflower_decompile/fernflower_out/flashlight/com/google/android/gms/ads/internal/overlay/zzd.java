package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "AdLauncherIntentInfoCreator"
)
@SafeParcelable.Reserved({1})
public final class zzd extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 9
   )
   public final Intent intent;
   @SafeParcelable.Field(
      id = 4
   )
   public final String mimeType;
   @SafeParcelable.Field(
      id = 5
   )
   public final String packageName;
   @SafeParcelable.Field(
      id = 3
   )
   public final String url;
   @SafeParcelable.Field(
      id = 2
   )
   private final String zzdhe;
   @SafeParcelable.Field(
      id = 6
   )
   public final String zzdhf;
   @SafeParcelable.Field(
      id = 7
   )
   public final String zzdhg;
   @SafeParcelable.Field(
      id = 8
   )
   private final String zzdhh;

   static {
      // $FF: Couldn't be decompiled
   }

   public zzd(Intent param1) {
      // $FF: Couldn't be decompiled
   }

   public zzd(String param1, String param2, String param3, String param4, String param5, String param6, String param7) {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzd(@SafeParcelable.Param(id = 2) String param1, @SafeParcelable.Param(id = 3) String param2, @SafeParcelable.Param(id = 4) String param3, @SafeParcelable.Param(id = 5) String param4, @SafeParcelable.Param(id = 6) String param5, @SafeParcelable.Param(id = 7) String param6, @SafeParcelable.Param(id = 8) String param7, @SafeParcelable.Param(id = 9) Intent param8) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
