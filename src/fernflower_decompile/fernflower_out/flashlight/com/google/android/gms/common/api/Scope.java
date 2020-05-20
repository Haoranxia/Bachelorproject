package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(
   creator = "ScopeCreator"
)
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      getter = "getScopeUri",
      id = 2
   )
   private final String zzaq;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int zzg;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   Scope(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) String param2) {
      // $FF: Couldn't be decompiled
   }

   public Scope(String param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final String getScopeUri() {
      // $FF: Couldn't be decompiled
   }

   public final int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public final String toString() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
