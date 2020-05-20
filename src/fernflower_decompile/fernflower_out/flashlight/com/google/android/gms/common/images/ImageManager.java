package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import androidx.b.e;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.base.zak;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

public final class ImageManager {
   private static final Object zamh;
   private static HashSet zami;
   private static ImageManager zamj;
   private final Context mContext;
   private final Handler mHandler;
   private final ExecutorService zamk;
   private final ImageManager.zaa zaml;
   private final zak zamm;
   private final Map zamn;
   private final Map zamo;
   private final Map zamp;

   static {
      // $FF: Couldn't be decompiled
   }

   private ImageManager(Context param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public static ImageManager create(Context param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Bitmap zaa(ImageManager param0, com.google.android.gms.common.images.zab param1) {
      // $FF: Couldn't be decompiled
   }

   private final Bitmap zaa(com.google.android.gms.common.images.zab param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Map zaa(ImageManager param0) {
      // $FF: Couldn't be decompiled
   }

   private final void zaa(com.google.android.gms.common.images.zaa param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Context zab(ImageManager param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static zak zac(ImageManager param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Object zacc() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static HashSet zacd() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Map zad(ImageManager param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Map zae(ImageManager param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ExecutorService zaf(ImageManager param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Handler zag(ImageManager param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ImageManager.zaa zah(ImageManager param0) {
      // $FF: Couldn't be decompiled
   }

   public final void loadImage(ImageView param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void loadImage(ImageView param1, Uri param2) {
      // $FF: Couldn't be decompiled
   }

   public final void loadImage(ImageView param1, Uri param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public final void loadImage(ImageManager.OnImageLoadedListener param1, Uri param2) {
      // $FF: Couldn't be decompiled
   }

   public final void loadImage(ImageManager.OnImageLoadedListener param1, Uri param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepName
   private final class ImageReceiver extends ResultReceiver {
      private final Uri mUri;
      private final ArrayList zamq;
      // $FF: synthetic field
      private final ImageManager zamr;

      ImageReceiver(ImageManager param1, Uri param2) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static ArrayList zaa(ImageManager.ImageReceiver param0) {
         // $FF: Couldn't be decompiled
      }

      public final void onReceiveResult(int param1, Bundle param2) {
         // $FF: Couldn't be decompiled
      }

      public final void zab(com.google.android.gms.common.images.zaa param1) {
         // $FF: Couldn't be decompiled
      }

      public final void zac(com.google.android.gms.common.images.zaa param1) {
         // $FF: Couldn't be decompiled
      }

      public final void zace() {
         // $FF: Couldn't be decompiled
      }
   }

   public interface OnImageLoadedListener {
      void onImageLoaded(Uri var1, Drawable var2, boolean var3);
   }

   private static final class zaa extends e {
      // $FF: synthetic method
      protected final void entryRemoved(boolean param1, Object param2, Object param3, Object param4) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      protected final int sizeOf(Object param1, Object param2) {
         // $FF: Couldn't be decompiled
      }
   }

   private final class zab implements Runnable {
      private final Uri mUri;
      // $FF: synthetic field
      private final ImageManager zamr;
      private final ParcelFileDescriptor zams;

      public zab(ImageManager param1, Uri param2, ParcelFileDescriptor param3) {
         // $FF: Couldn't be decompiled
      }

      public final void run() {
         // $FF: Couldn't be decompiled
      }
   }

   private final class zac implements Runnable {
      // $FF: synthetic field
      private final ImageManager zamr;
      private final com.google.android.gms.common.images.zaa zamt;

      public zac(ImageManager param1, com.google.android.gms.common.images.zaa param2) {
         // $FF: Couldn't be decompiled
      }

      public final void run() {
         // $FF: Couldn't be decompiled
      }
   }

   private final class zad implements Runnable {
      private final Bitmap mBitmap;
      private final Uri mUri;
      private final CountDownLatch zadr;
      // $FF: synthetic field
      private final ImageManager zamr;
      private boolean zamu;

      public zad(ImageManager param1, Uri param2, Bitmap param3, boolean param4, CountDownLatch param5) {
         // $FF: Couldn't be decompiled
      }

      public final void run() {
         // $FF: Couldn't be decompiled
      }
   }
}
