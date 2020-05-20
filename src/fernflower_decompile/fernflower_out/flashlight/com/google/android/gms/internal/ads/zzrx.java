package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.InputStream;
import javax.annotation.concurrent.GuardedBy;

@SafeParcelable.Class(
   creator = "CacheEntryParcelCreator"
)
@SafeParcelable.Reserved({1})
public final class zzrx extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      getter = "getContentFileDescriptor",
      id = 2
   )
   @GuardedBy("this")
   private ParcelFileDescriptor zzbri;

   static {
      // $FF: Couldn't be decompiled
   }

   public zzrx() {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzrx(@SafeParcelable.Param(id = 2) ParcelFileDescriptor param1) {
      // $FF: Couldn't be decompiled
   }

   private final ParcelFileDescriptor zzmr() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final boolean zzmp() {
      // $FF: Couldn't be decompiled
   }

   public final InputStream zzmq() {
      // $FF: Couldn't be decompiled
   }
}
