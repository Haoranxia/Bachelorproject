package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(
   creator = "GetServiceRequestCreator"
)
@SafeParcelable.Reserved({9})
public class GetServiceRequest extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int version;
   @SafeParcelable.Field(
      id = 2
   )
   private final int zzdg;
   @SafeParcelable.Field(
      id = 3
   )
   private int zzdh;
   @SafeParcelable.Field(
      id = 5
   )
   IBinder zzdi;
   @SafeParcelable.Field(
      id = 6
   )
   Scope[] zzdj;
   @SafeParcelable.Field(
      id = 7
   )
   Bundle zzdk;
   @SafeParcelable.Field(
      id = 8
   )
   Account zzdl;
   @SafeParcelable.Field(
      id = 10
   )
   Feature[] zzdm;
   @SafeParcelable.Field(
      id = 11
   )
   Feature[] zzdn;
   @SafeParcelable.Field(
      id = 12
   )
   private boolean zzdo;
   @SafeParcelable.Field(
      id = 4
   )
   String zzy;

   static {
      // $FF: Couldn't be decompiled
   }

   public GetServiceRequest(int param1) {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   GetServiceRequest(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) int param2, @SafeParcelable.Param(id = 3) int param3, @SafeParcelable.Param(id = 4) String param4, @SafeParcelable.Param(id = 5) IBinder param5, @SafeParcelable.Param(id = 6) Scope[] param6, @SafeParcelable.Param(id = 7) Bundle param7, @SafeParcelable.Param(id = 8) Account param8, @SafeParcelable.Param(id = 10) Feature[] param9, @SafeParcelable.Param(id = 11) Feature[] param10, @SafeParcelable.Param(id = 12) boolean param11) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Bundle getExtraArgs() {
      // $FF: Couldn't be decompiled
   }

   public void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
