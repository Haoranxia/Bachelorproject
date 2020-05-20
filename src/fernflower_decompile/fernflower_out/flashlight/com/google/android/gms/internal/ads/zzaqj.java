package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.OutputStream;

@SafeParcelable.Class(
   creator = "LargeParcelTeleporterCreator"
)
@SafeParcelable.Reserved({1})
public final class zzaqj extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 2
   )
   private ParcelFileDescriptor zzdlr;
   private Parcelable zzdls;
   private boolean zzdlt;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzaqj(@SafeParcelable.Param(id = 2) ParcelFileDescriptor param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static final void zza(OutputStream param0, byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static ParcelFileDescriptor zzh(byte[] param0) {
      // $FF: Couldn't be decompiled
   }

   private final ParcelFileDescriptor zzty() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final SafeParcelable zza(Creator param1) {
      // $FF: Couldn't be decompiled
   }
}
