package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

@SafeParcelable.Class(
   creator = "GoogleSignInAccountCreator"
)
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
   public static final Creator CREATOR;
   @VisibleForTesting
   private static Clock zae;
   @SafeParcelable.Field(
      getter = "getId",
      id = 2
   )
   private String mId;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int versionCode;
   @SafeParcelable.Field(
      getter = "getIdToken",
      id = 3
   )
   private String zaf;
   @SafeParcelable.Field(
      getter = "getEmail",
      id = 4
   )
   private String zag;
   @SafeParcelable.Field(
      getter = "getDisplayName",
      id = 5
   )
   private String zah;
   @SafeParcelable.Field(
      getter = "getPhotoUrl",
      id = 6
   )
   private Uri zai;
   @SafeParcelable.Field(
      getter = "getServerAuthCode",
      id = 7
   )
   private String zaj;
   @SafeParcelable.Field(
      getter = "getExpirationTimeSecs",
      id = 8
   )
   private long zak;
   @SafeParcelable.Field(
      getter = "getObfuscatedIdentifier",
      id = 9
   )
   private String zal;
   @SafeParcelable.Field(
      id = 10
   )
   private List zam;
   @SafeParcelable.Field(
      getter = "getGivenName",
      id = 11
   )
   private String zan;
   @SafeParcelable.Field(
      getter = "getFamilyName",
      id = 12
   )
   private String zao;
   private Set zap;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   GoogleSignInAccount(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) String param2, @SafeParcelable.Param(id = 3) String param3, @SafeParcelable.Param(id = 4) String param4, @SafeParcelable.Param(id = 5) String param5, @SafeParcelable.Param(id = 6) Uri param6, @SafeParcelable.Param(id = 7) String param7, @SafeParcelable.Param(id = 8) long param8, @SafeParcelable.Param(id = 9) String param10, @SafeParcelable.Param(id = 10) List param11, @SafeParcelable.Param(id = 11) String param12, @SafeParcelable.Param(id = 12) String param13) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static GoogleSignInAccount createDefault() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static final int zaa(Scope param0, Scope param1) {
      // $FF: Couldn't be decompiled
   }

   public static GoogleSignInAccount zaa(String param0) {
      // $FF: Couldn't be decompiled
   }

   private static GoogleSignInAccount zaa(String param0, String param1, String param2, String param3, String param4, String param5, Uri param6, Long param7, String param8, Set param9) {
      // $FF: Couldn't be decompiled
   }

   private final JSONObject zad() {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public Account getAccount() {
      // $FF: Couldn't be decompiled
   }

   public String getDisplayName() {
      // $FF: Couldn't be decompiled
   }

   public String getEmail() {
      // $FF: Couldn't be decompiled
   }

   public String getFamilyName() {
      // $FF: Couldn't be decompiled
   }

   public String getGivenName() {
      // $FF: Couldn't be decompiled
   }

   public Set getGrantedScopes() {
      // $FF: Couldn't be decompiled
   }

   public String getId() {
      // $FF: Couldn't be decompiled
   }

   public String getIdToken() {
      // $FF: Couldn't be decompiled
   }

   public Uri getPhotoUrl() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Set getRequestedScopes() {
      // $FF: Couldn't be decompiled
   }

   public String getServerAuthCode() {
      // $FF: Couldn't be decompiled
   }

   public int hashCode() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public boolean isExpired() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public GoogleSignInAccount requestExtraScopes(Scope... param1) {
      // $FF: Couldn't be decompiled
   }

   public void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final String zab() {
      // $FF: Couldn't be decompiled
   }

   public final String zac() {
      // $FF: Couldn't be decompiled
   }
}
