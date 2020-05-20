package com.google.android.gms.common.server.response;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
@ShowFirstParty
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
   @KeepForSdk
   public FastSafeParcelableJsonResponse() {
      // $FF: Couldn't be decompiled
   }

   public final int describeContents() {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   public Object getValueObject(String param1) {
      // $FF: Couldn't be decompiled
   }

   public int hashCode() {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   public boolean isPrimitiveFieldSet(String param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public byte[] toByteArray() {
      // $FF: Couldn't be decompiled
   }
}
