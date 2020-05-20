package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "SignInButtonConfigCreator"
)
public class SignInButtonConfig extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int zalf;
   @Deprecated
   @SafeParcelable.Field(
      getter = "getScopes",
      id = 4
   )
   private final Scope[] zany;
   @SafeParcelable.Field(
      getter = "getButtonSize",
      id = 2
   )
   private final int zapd;
   @SafeParcelable.Field(
      getter = "getColorScheme",
      id = 3
   )
   private final int zape;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   SignInButtonConfig(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) int param2, @SafeParcelable.Param(id = 3) int param3, @SafeParcelable.Param(id = 4) Scope[] param4) {
      // $FF: Couldn't be decompiled
   }

   public SignInButtonConfig(int param1, int param2, Scope[] param3) {
      // $FF: Couldn't be decompiled
   }

   public int getButtonSize() {
      // $FF: Couldn't be decompiled
   }

   public int getColorScheme() {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public Scope[] getScopes() {
      // $FF: Couldn't be decompiled
   }

   public void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
