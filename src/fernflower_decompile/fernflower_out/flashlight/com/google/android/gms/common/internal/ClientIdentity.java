package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(
   creator = "ClientIdentityCreator"
)
@SafeParcelable.Reserved({1000})
public class ClientIdentity extends AbstractSafeParcelable {
   @KeepForSdk
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      defaultValueUnchecked = "null",
      id = 2
   )
   private final String packageName;
   @SafeParcelable.Field(
      defaultValueUnchecked = "0",
      id = 1
   )
   private final int uid;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public ClientIdentity(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) String param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      // $FF: Couldn't be decompiled
   }

   public void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
