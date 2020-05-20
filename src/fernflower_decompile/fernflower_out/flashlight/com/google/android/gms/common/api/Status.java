package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
@SafeParcelable.Class(
   creator = "StatusCreator"
)
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
   public static final Creator CREATOR;
   @KeepForSdk
   public static final Status RESULT_CANCELED;
   @KeepForSdk
   public static final Status RESULT_DEAD_CLIENT;
   @KeepForSdk
   public static final Status RESULT_INTERNAL_ERROR;
   @KeepForSdk
   public static final Status RESULT_INTERRUPTED;
   @KeepForSdk
   @VisibleForTesting
   public static final Status RESULT_SUCCESS;
   @KeepForSdk
   public static final Status RESULT_TIMEOUT;
   private static final Status zzar;
   @SafeParcelable.VersionField(
      id = 1000
   )
   private final int zzg;
   @SafeParcelable.Field(
      getter = "getStatusCode",
      id = 1
   )
   private final int zzh;
   @SafeParcelable.Field(
      getter = "getPendingIntent",
      id = 3
   )
   private final PendingIntent zzi;
   @SafeParcelable.Field(
      getter = "getStatusMessage",
      id = 2
   )
   private final String zzj;

   static {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Status(int param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   @SafeParcelable.Constructor
   Status(@SafeParcelable.Param(id = 1000) int param1, @SafeParcelable.Param(id = 1) int param2, @SafeParcelable.Param(id = 2) String param3, @SafeParcelable.Param(id = 3) PendingIntent param4) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Status(int param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Status(int param1, String param2, PendingIntent param3) {
      // $FF: Couldn't be decompiled
   }

   public final boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public final PendingIntent getResolution() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final Status getStatus() {
      // $FF: Couldn't be decompiled
   }

   public final int getStatusCode() {
      // $FF: Couldn't be decompiled
   }

   public final String getStatusMessage() {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   public final boolean hasResolution() {
      // $FF: Couldn't be decompiled
   }

   public final int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public final boolean isCanceled() {
      // $FF: Couldn't be decompiled
   }

   public final boolean isInterrupted() {
      // $FF: Couldn't be decompiled
   }

   public final boolean isSuccess() {
      // $FF: Couldn't be decompiled
   }

   public final void startResolutionForResult(Activity param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final String toString() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final String zzg() {
      // $FF: Couldn't be decompiled
   }
}
