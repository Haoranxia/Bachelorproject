package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Set;
import javax.annotation.Nullable;

@SafeParcelable.Class(
   creator = "AuthAccountRequestCreator"
)
public class AuthAccountRequest extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int zalf;
   @Deprecated
   @SafeParcelable.Field(
      id = 2
   )
   private final IBinder zanx;
   @SafeParcelable.Field(
      id = 3
   )
   private final Scope[] zany;
   @SafeParcelable.Field(
      id = 4
   )
   private Integer zanz;
   @SafeParcelable.Field(
      id = 5
   )
   private Integer zaoa;
   @SafeParcelable.Field(
      id = 6,
      type = "android.accounts.Account"
   )
   private Account zax;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   AuthAccountRequest(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) IBinder param2, @SafeParcelable.Param(id = 3) Scope[] param3, @SafeParcelable.Param(id = 4) Integer param4, @SafeParcelable.Param(id = 5) Integer param5, @SafeParcelable.Param(id = 6) Account param6) {
      // $FF: Couldn't be decompiled
   }

   public AuthAccountRequest(Account param1, Set param2) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public AuthAccountRequest(IAccountAccessor param1, Set param2) {
      // $FF: Couldn't be decompiled
   }

   public Account getAccount() {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public Integer getOauthPolicy() {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public Integer getPolicyAction() {
      // $FF: Couldn't be decompiled
   }

   public Set getScopes() {
      // $FF: Couldn't be decompiled
   }

   public AuthAccountRequest setOauthPolicy(@Nullable Integer param1) {
      // $FF: Couldn't be decompiled
   }

   public AuthAccountRequest setPolicyAction(@Nullable Integer param1) {
      // $FF: Couldn't be decompiled
   }

   public void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
