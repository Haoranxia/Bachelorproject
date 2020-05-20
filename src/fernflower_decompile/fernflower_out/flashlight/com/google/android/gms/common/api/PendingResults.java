package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BasePendingResult;

@KeepForSdk
public final class PendingResults {
   @KeepForSdk
   private PendingResults() {
      // $FF: Couldn't be decompiled
   }

   public static PendingResult canceledPendingResult() {
      // $FF: Couldn't be decompiled
   }

   public static PendingResult canceledPendingResult(Result param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static PendingResult immediateFailedResult(Result param0, GoogleApiClient param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static OptionalPendingResult immediatePendingResult(Result param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static OptionalPendingResult immediatePendingResult(Result param0, GoogleApiClient param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static PendingResult immediatePendingResult(Status param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static PendingResult immediatePendingResult(Status param0, GoogleApiClient param1) {
      // $FF: Couldn't be decompiled
   }

   private static final class zaa extends BasePendingResult {
      private final Result zaci;

      public zaa(Result param1) {
         // $FF: Couldn't be decompiled
      }

      protected final Result createFailedResult(Status param1) {
         // $FF: Couldn't be decompiled
      }
   }

   private static final class zab extends BasePendingResult {
      private final Result zacj;

      public zab(GoogleApiClient param1, Result param2) {
         // $FF: Couldn't be decompiled
      }

      protected final Result createFailedResult(Status param1) {
         // $FF: Couldn't be decompiled
      }
   }

   private static final class zac extends BasePendingResult {
      public zac(GoogleApiClient param1) {
         // $FF: Couldn't be decompiled
      }

      protected final Result createFailedResult(Status param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
