package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;

@KeepForSdk
@ShowFirstParty
@SafeParcelable.Class(
   creator = "BitmapTeleporterCreator"
)
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
   @KeepForSdk
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 3
   )
   private final int mType;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int zalf;
   @SafeParcelable.Field(
      id = 2
   )
   private ParcelFileDescriptor zalg;
   private Bitmap zalh;
   private boolean zali;
   private File zalj;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   BitmapTeleporter(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) ParcelFileDescriptor param2, @SafeParcelable.Param(id = 3) int param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public BitmapTeleporter(Bitmap param1) {
      // $FF: Couldn't be decompiled
   }

   private static void zaa(Closeable param0) {
      // $FF: Couldn't be decompiled
   }

   private final FileOutputStream zabz() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public Bitmap get() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void release() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void setTempDir(File param1) {
      // $FF: Couldn't be decompiled
   }

   public void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
