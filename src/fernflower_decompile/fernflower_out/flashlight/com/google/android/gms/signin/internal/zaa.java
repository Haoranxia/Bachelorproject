package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "AuthAccountResultCreator"
)
public final class zaa extends AbstractSafeParcelable implements Result {
   public static final Creator CREATOR;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int zalf;
   @SafeParcelable.Field(
      getter = "getConnectionResultCode",
      id = 2
   )
   private int zarz;
   @SafeParcelable.Field(
      getter = "getRawAuthResolutionIntent",
      id = 3
   )
   private Intent zasa;

   static {
      // $FF: Couldn't be decompiled
   }

   public zaa() {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zaa(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) int param2, @SafeParcelable.Param(id = 3) Intent param3) {
      // $FF: Couldn't be decompiled
   }

   private zaa(int param1, Intent param2) {
      // $FF: Couldn't be decompiled
   }

   public final Status getStatus() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
