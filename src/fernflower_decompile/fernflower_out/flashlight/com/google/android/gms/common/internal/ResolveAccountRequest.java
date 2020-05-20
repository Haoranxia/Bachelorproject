package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(
   creator = "ResolveAccountRequestCreator"
)
public class ResolveAccountRequest extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int zalf;
   @SafeParcelable.Field(
      getter = "getSessionId",
      id = 3
   )
   private final int zapa;
   @SafeParcelable.Field(
      getter = "getSignInAccountHint",
      id = 4
   )
   private final GoogleSignInAccount zapb;
   @SafeParcelable.Field(
      getter = "getAccount",
      id = 2
   )
   private final Account zax;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   ResolveAccountRequest(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) Account param2, @SafeParcelable.Param(id = 3) int param3, @SafeParcelable.Param(id = 4) GoogleSignInAccount param4) {
      // $FF: Couldn't be decompiled
   }

   public ResolveAccountRequest(Account param1, int param2, GoogleSignInAccount param3) {
      // $FF: Couldn't be decompiled
   }

   public Account getAccount() {
      // $FF: Couldn't be decompiled
   }

   public int getSessionId() {
      // $FF: Couldn't be decompiled
   }

   public GoogleSignInAccount getSignInAccountHint() {
      // $FF: Couldn't be decompiled
   }

   public void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
