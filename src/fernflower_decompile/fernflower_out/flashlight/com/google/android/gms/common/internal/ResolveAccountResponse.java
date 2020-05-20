package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "ResolveAccountResponseCreator"
)
public class ResolveAccountResponse extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      getter = "getConnectionResult",
      id = 3
   )
   private ConnectionResult zadi;
   @SafeParcelable.Field(
      getter = "getSaveDefaultAccount",
      id = 4
   )
   private boolean zagg;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int zalf;
   @SafeParcelable.Field(
      id = 2
   )
   private IBinder zanx;
   @SafeParcelable.Field(
      getter = "isFromCrossClientAuth",
      id = 5
   )
   private boolean zapc;

   static {
      // $FF: Couldn't be decompiled
   }

   public ResolveAccountResponse(int param1) {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   ResolveAccountResponse(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) IBinder param2, @SafeParcelable.Param(id = 3) ConnectionResult param3, @SafeParcelable.Param(id = 4) boolean param4, @SafeParcelable.Param(id = 5) boolean param5) {
      // $FF: Couldn't be decompiled
   }

   public ResolveAccountResponse(ConnectionResult param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public IAccountAccessor getAccountAccessor() {
      // $FF: Couldn't be decompiled
   }

   public ConnectionResult getConnectionResult() {
      // $FF: Couldn't be decompiled
   }

   public boolean getSaveDefaultAccount() {
      // $FF: Couldn't be decompiled
   }

   public boolean isFromCrossClientAuth() {
      // $FF: Couldn't be decompiled
   }

   public ResolveAccountResponse setAccountAccessor(IAccountAccessor param1) {
      // $FF: Couldn't be decompiled
   }

   public ResolveAccountResponse setIsFromCrossClientAuth(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public ResolveAccountResponse setSaveDefaultAccount(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
