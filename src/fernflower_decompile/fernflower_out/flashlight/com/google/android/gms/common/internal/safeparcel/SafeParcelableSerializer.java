package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;

@KeepForSdk
@VisibleForTesting
public final class SafeParcelableSerializer {
   public SafeParcelableSerializer() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static SafeParcelable deserializeFromBytes(byte[] param0, Creator param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static SafeParcelable deserializeFromIntentExtra(Intent param0, String param1, Creator param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static SafeParcelable deserializeFromString(String param0, Creator param1) {
      // $FF: Couldn't be decompiled
   }

   public static ArrayList deserializeIterableFromBundle(Bundle param0, String param1, Creator param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static ArrayList deserializeIterableFromIntentExtra(Intent param0, String param1, Creator param2) {
      // $FF: Couldn't be decompiled
   }

   public static void serializeIterableToBundle(Iterable param0, Bundle param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static void serializeIterableToIntentExtra(Iterable param0, Intent param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static byte[] serializeToBytes(SafeParcelable param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static void serializeToIntentExtra(SafeParcelable param0, Intent param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static String serializeToString(SafeParcelable param0) {
      // $FF: Couldn't be decompiled
   }
}
