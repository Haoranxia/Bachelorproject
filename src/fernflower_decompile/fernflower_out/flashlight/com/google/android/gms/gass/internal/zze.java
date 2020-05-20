package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbs;

@SafeParcelable.Class(
   creator = "GassResponseParcelCreator"
)
public final class zze extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int versionCode;
   @SafeParcelable.Field(
      getter = "getAfmaSignalsAsBytes",
      id = 2,
      type = "byte[]"
   )
   private zzbs.zza zzgtc;
   private byte[] zzgtd;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zze(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) byte[] param2) {
      // $FF: Couldn't be decompiled
   }

   private final void zzaqr() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final zzbs.zza zzaqq() {
      // $FF: Couldn't be decompiled
   }
}
