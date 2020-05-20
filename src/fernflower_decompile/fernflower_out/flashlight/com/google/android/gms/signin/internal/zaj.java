package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "SignInResponseCreator"
)
public final class zaj extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      getter = "getConnectionResult",
      id = 2
   )
   private final ConnectionResult zadi;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int zalf;
   @SafeParcelable.Field(
      getter = "getResolveAccountResponse",
      id = 3
   )
   private final ResolveAccountResponse zase;

   static {
      // $FF: Couldn't be decompiled
   }

   public zaj(int param1) {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zaj(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) ConnectionResult param2, @SafeParcelable.Param(id = 3) ResolveAccountResponse param3) {
      // $FF: Couldn't be decompiled
   }

   private zaj(ConnectionResult param1, ResolveAccountResponse param2) {
      // $FF: Couldn't be decompiled
   }

   public final ConnectionResult getConnectionResult() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final ResolveAccountResponse zacx() {
      // $FF: Couldn't be decompiled
   }
}
