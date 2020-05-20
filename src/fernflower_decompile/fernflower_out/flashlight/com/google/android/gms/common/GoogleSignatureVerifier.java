package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
@KeepForSdk
@ShowFirstParty
public class GoogleSignatureVerifier {
   private static GoogleSignatureVerifier zzam;
   private final Context mContext;
   private volatile String zzan;

   private GoogleSignatureVerifier(Context param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static GoogleSignatureVerifier getInstance(Context param0) {
      // $FF: Couldn't be decompiled
   }

   private static zze zza(PackageInfo param0, zze... param1) {
      // $FF: Couldn't be decompiled
   }

   private final zzm zza(String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public static boolean zza(PackageInfo param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private final zzm zzc(String param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public boolean isGooglePublicSignedPackage(PackageInfo param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   @ShowFirstParty
   public boolean isPackageGoogleSigned(String param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   @ShowFirstParty
   public boolean isUidGoogleSigned(int param1) {
      // $FF: Couldn't be decompiled
   }
}
