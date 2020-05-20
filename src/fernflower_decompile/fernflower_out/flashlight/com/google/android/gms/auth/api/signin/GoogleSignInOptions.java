package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

@SafeParcelable.Class(
   creator = "GoogleSignInOptionsCreator"
)
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {
   public static final Creator CREATOR;
   public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
   public static final GoogleSignInOptions DEFAULT_SIGN_IN;
   private static Comparator zaaf;
   @VisibleForTesting
   public static final Scope zar;
   @VisibleForTesting
   public static final Scope zas;
   @VisibleForTesting
   public static final Scope zat;
   @VisibleForTesting
   public static final Scope zau;
   @VisibleForTesting
   public static final Scope zav;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int versionCode;
   @SafeParcelable.Field(
      getter = "isForceCodeForRefreshToken",
      id = 6
   )
   private final boolean zaaa;
   @SafeParcelable.Field(
      getter = "getServerClientId",
      id = 7
   )
   private String zaab;
   @SafeParcelable.Field(
      getter = "getHostedDomain",
      id = 8
   )
   private String zaac;
   @SafeParcelable.Field(
      getter = "getExtensions",
      id = 9
   )
   private ArrayList zaad;
   private Map zaae;
   @SafeParcelable.Field(
      getter = "getScopes",
      id = 2
   )
   private final ArrayList zaw;
   @SafeParcelable.Field(
      getter = "getAccount",
      id = 3
   )
   private Account zax;
   @SafeParcelable.Field(
      getter = "isIdTokenRequested",
      id = 4
   )
   private boolean zay;
   @SafeParcelable.Field(
      getter = "isServerAuthCodeRequested",
      id = 5
   )
   private final boolean zaz;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   GoogleSignInOptions(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) ArrayList param2, @SafeParcelable.Param(id = 3) Account param3, @SafeParcelable.Param(id = 4) boolean param4, @SafeParcelable.Param(id = 5) boolean param5, @SafeParcelable.Param(id = 6) boolean param6, @SafeParcelable.Param(id = 7) String param7, @SafeParcelable.Param(id = 8) String param8, @SafeParcelable.Param(id = 9) ArrayList param9) {
      // $FF: Couldn't be decompiled
   }

   private GoogleSignInOptions(int param1, ArrayList param2, Account param3, boolean param4, boolean param5, boolean param6, String param7, String param8, Map param9) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   GoogleSignInOptions(int param1, ArrayList param2, Account param3, boolean param4, boolean param5, boolean param6, String param7, String param8, Map param9, zac param10) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ArrayList zaa(GoogleSignInOptions param0) {
      // $FF: Couldn't be decompiled
   }

   private static Map zaa(List param0) {
      // $FF: Couldn't be decompiled
   }

   public static GoogleSignInOptions zab(String param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Map zab(List param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zab(GoogleSignInOptions param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zac(GoogleSignInOptions param0) {
      // $FF: Couldn't be decompiled
   }

   private final JSONObject zad() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zad(GoogleSignInOptions param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static String zae(GoogleSignInOptions param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Account zaf(GoogleSignInOptions param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static String zag(GoogleSignInOptions param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ArrayList zah(GoogleSignInOptions param0) {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Account getAccount() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public ArrayList getExtensions() {
      // $FF: Couldn't be decompiled
   }

   public Scope[] getScopeArray() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public ArrayList getScopes() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public String getServerClientId() {
      // $FF: Couldn't be decompiled
   }

   public int hashCode() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public boolean isForceCodeForRefreshToken() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public boolean isIdTokenRequested() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public boolean isServerAuthCodeRequested() {
      // $FF: Couldn't be decompiled
   }

   public void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final String zae() {
      // $FF: Couldn't be decompiled
   }

   public static final class Builder {
      private Set mScopes;
      private boolean zaaa;
      private String zaab;
      private String zaac;
      private Map zaag;
      private Account zax;
      private boolean zay;
      private boolean zaz;

      public Builder() {
         // $FF: Couldn't be decompiled
      }

      public Builder(GoogleSignInOptions param1) {
         // $FF: Couldn't be decompiled
      }

      private final String zac(String param1) {
         // $FF: Couldn't be decompiled
      }

      public final GoogleSignInOptions.Builder addExtension(GoogleSignInOptionsExtension param1) {
         // $FF: Couldn't be decompiled
      }

      public final GoogleSignInOptions build() {
         // $FF: Couldn't be decompiled
      }

      public final GoogleSignInOptions.Builder requestEmail() {
         // $FF: Couldn't be decompiled
      }

      public final GoogleSignInOptions.Builder requestId() {
         // $FF: Couldn't be decompiled
      }

      public final GoogleSignInOptions.Builder requestIdToken(String param1) {
         // $FF: Couldn't be decompiled
      }

      public final GoogleSignInOptions.Builder requestProfile() {
         // $FF: Couldn't be decompiled
      }

      public final GoogleSignInOptions.Builder requestScopes(Scope param1, Scope... param2) {
         // $FF: Couldn't be decompiled
      }

      public final GoogleSignInOptions.Builder requestServerAuthCode(String param1) {
         // $FF: Couldn't be decompiled
      }

      public final GoogleSignInOptions.Builder requestServerAuthCode(String param1, boolean param2) {
         // $FF: Couldn't be decompiled
      }

      public final GoogleSignInOptions.Builder setAccountName(String param1) {
         // $FF: Couldn't be decompiled
      }

      public final GoogleSignInOptions.Builder setHostedDomain(String param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
