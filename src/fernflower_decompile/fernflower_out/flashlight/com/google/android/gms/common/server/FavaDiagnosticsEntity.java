package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(
   creator = "FavaDiagnosticsEntityCreator"
)
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
   @KeepForSdk
   public static final Creator CREATOR;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int zalf;
   @SafeParcelable.Field(
      id = 2
   )
   private final String zapj;
   @SafeParcelable.Field(
      id = 3
   )
   private final int zapk;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public FavaDiagnosticsEntity(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) String param2, @SafeParcelable.Param(id = 3) int param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public FavaDiagnosticsEntity(String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
