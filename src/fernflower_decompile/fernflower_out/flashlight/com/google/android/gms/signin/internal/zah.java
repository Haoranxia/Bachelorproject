package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "SignInRequestCreator"
)
public final class zah extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int zalf;
   @SafeParcelable.Field(
      getter = "getResolveAccountRequest",
      id = 2
   )
   private final ResolveAccountRequest zasd;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zah(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) ResolveAccountRequest param2) {
      // $FF: Couldn't be decompiled
   }

   public zah(ResolveAccountRequest param1) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
