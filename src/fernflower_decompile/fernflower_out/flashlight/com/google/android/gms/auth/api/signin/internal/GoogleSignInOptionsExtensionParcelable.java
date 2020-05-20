package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "GoogleSignInOptionsExtensionCreator"
)
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      getter = "getBundle",
      id = 3
   )
   private Bundle mBundle;
   @SafeParcelable.Field(
      getter = "getType",
      id = 2
   )
   private int mType;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int versionCode;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   GoogleSignInOptionsExtensionParcelable(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) int param2, @SafeParcelable.Param(id = 3) Bundle param3) {
      // $FF: Couldn't be decompiled
   }

   public GoogleSignInOptionsExtensionParcelable(GoogleSignInOptionsExtension param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public int getType() {
      // $FF: Couldn't be decompiled
   }

   public void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
