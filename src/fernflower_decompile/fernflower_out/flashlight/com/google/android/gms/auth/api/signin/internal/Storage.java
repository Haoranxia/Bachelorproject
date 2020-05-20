package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.locks.Lock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public class Storage {
   private static final Lock zaaj;
   @GuardedBy("sLk")
   private static Storage zaak;
   private final Lock zaal;
   @GuardedBy("mLk")
   private final SharedPreferences zaam;

   static {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   private Storage(Context param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static Storage getInstance(Context param0) {
      // $FF: Couldn't be decompiled
   }

   private final void zaa(String param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   private static String zab(String param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   @VisibleForTesting
   private final GoogleSignInAccount zad(String param1) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   @VisibleForTesting
   private final GoogleSignInOptions zae(String param1) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   private final String zaf(String param1) {
      // $FF: Couldn't be decompiled
   }

   private final void zag(String param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void clear() {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   @KeepForSdk
   public GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   @KeepForSdk
   public GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   @KeepForSdk
   public String getSavedRefreshToken() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void saveDefaultGoogleSignInAccount(GoogleSignInAccount param1, GoogleSignInOptions param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zaf() {
      // $FF: Couldn't be decompiled
   }
}
