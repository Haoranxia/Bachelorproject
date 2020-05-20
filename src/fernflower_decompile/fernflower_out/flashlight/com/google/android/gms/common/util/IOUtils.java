package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

@Deprecated
@KeepForSdk
@ShowFirstParty
public final class IOUtils {
   private IOUtils() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static void closeQuietly(@Nullable ParcelFileDescriptor param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static void closeQuietly(@Nullable Closeable param0) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   @KeepForSdk
   public static long copyStream(InputStream param0, OutputStream param1) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   @KeepForSdk
   public static long copyStream(InputStream param0, OutputStream param1, boolean param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static boolean isGzipByteBuffer(byte[] param0) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   @KeepForSdk
   public static byte[] readInputStreamFully(InputStream param0) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   @KeepForSdk
   public static byte[] readInputStreamFully(InputStream param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   @KeepForSdk
   public static byte[] toByteArray(InputStream param0) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   private static long zza(InputStream param0, OutputStream param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }
}
