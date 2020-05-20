package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Comparator;
import java.util.UUID;

public final class zziv implements Parcelable, Comparator {
   public static final Creator CREATOR;
   private int zzafx;
   private final zziv.zza[] zzamm;
   public final int zzamn;

   static {
      // $FF: Couldn't be decompiled
   }

   zziv(Parcel param1) {
      // $FF: Couldn't be decompiled
   }

   private zziv(boolean param1, zziv.zza... param2) {
      // $FF: Couldn't be decompiled
   }

   public zziv(zziv.zza... param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public final int compare(Object param1, Object param2) {
      // $FF: Couldn't be decompiled
   }

   public final int describeContents() {
      // $FF: Couldn't be decompiled
   }

   public final boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public final int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final zziv.zza zzaa(int param1) {
      // $FF: Couldn't be decompiled
   }

   public static final class zza implements Parcelable {
      public static final Creator CREATOR;
      private final byte[] data;
      private final String mimeType;
      private final UUID uuid;
      private int zzafx;
      public final boolean zzamo;

      static {
         // $FF: Couldn't be decompiled
      }

      zza(Parcel param1) {
         // $FF: Couldn't be decompiled
      }

      public zza(UUID param1, String param2, byte[] param3) {
         // $FF: Couldn't be decompiled
      }

      private zza(UUID param1, String param2, byte[] param3, boolean param4) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static UUID zza(zziv.zza param0) {
         // $FF: Couldn't be decompiled
      }

      public final int describeContents() {
         // $FF: Couldn't be decompiled
      }

      public final boolean equals(Object param1) {
         // $FF: Couldn't be decompiled
      }

      public final int hashCode() {
         // $FF: Couldn't be decompiled
      }

      public final void writeToParcel(Parcel param1, int param2) {
         // $FF: Couldn't be decompiled
      }
   }
}
