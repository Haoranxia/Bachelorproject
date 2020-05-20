package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;

@SafeParcelable.Class(
   creator = "GoogleCertificatesQueryCreator"
)
public final class zzk extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      getter = "getAllowTestKeys",
      id = 3
   )
   private final boolean zzaa;
   @SafeParcelable.Field(
      defaultValue = "false",
      getter = "getForbidTestKeys",
      id = 4
   )
   private final boolean zzab;
   @SafeParcelable.Field(
      getter = "getCallingPackage",
      id = 1
   )
   private final String zzy;
   @Nullable
   @SafeParcelable.Field(
      getter = "getCallingCertificateBinder",
      id = 2,
      type = "android.os.IBinder"
   )
   private final zze zzz;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zzk(@SafeParcelable.Param(id = 1) String param1, @Nullable @SafeParcelable.Param(id = 2) IBinder param2, @SafeParcelable.Param(id = 3) boolean param3, @SafeParcelable.Param(id = 4) boolean param4) {
      // $FF: Couldn't be decompiled
   }

   zzk(String param1, @Nullable zze param2, boolean param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   private static zze zza(@Nullable IBinder param0) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
