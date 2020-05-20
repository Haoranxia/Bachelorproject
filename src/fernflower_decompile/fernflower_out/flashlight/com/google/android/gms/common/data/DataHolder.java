package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepForSdk
@KeepName
@SafeParcelable.Class(
   creator = "DataHolderCreator",
   validate = true
)
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
   @KeepForSdk
   public static final Creator CREATOR;
   private static final DataHolder.Builder zaly;
   private boolean mClosed;
   @SafeParcelable.VersionField(
      id = 1000
   )
   private final int zalf;
   @SafeParcelable.Field(
      getter = "getColumns",
      id = 1
   )
   private final String[] zalq;
   private Bundle zalr;
   @SafeParcelable.Field(
      getter = "getWindows",
      id = 2
   )
   private final CursorWindow[] zals;
   @SafeParcelable.Field(
      getter = "getStatusCode",
      id = 3
   )
   private final int zalt;
   @SafeParcelable.Field(
      getter = "getMetadata",
      id = 4
   )
   private final Bundle zalu;
   private int[] zalv;
   private int zalw;
   private boolean zalx;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   DataHolder(@SafeParcelable.Param(id = 1000) int param1, @SafeParcelable.Param(id = 1) String[] param2, @SafeParcelable.Param(id = 2) CursorWindow[] param3, @SafeParcelable.Param(id = 3) int param4, @SafeParcelable.Param(id = 4) Bundle param5) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public DataHolder(Cursor param1, int param2, Bundle param3) {
      // $FF: Couldn't be decompiled
   }

   private DataHolder(DataHolder.Builder param1, int param2, Bundle param3) {
      // $FF: Couldn't be decompiled
   }

   private DataHolder(DataHolder.Builder param1, int param2, Bundle param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   DataHolder(DataHolder.Builder param1, int param2, Bundle param3, int param4, zab param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   DataHolder(DataHolder.Builder param1, int param2, Bundle param3, zab param4) {
      // $FF: Couldn't be decompiled
   }

   private DataHolder(CursorWrapper param1, int param2, Bundle param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public DataHolder(String[] param1, CursorWindow[] param2, int param3, Bundle param4) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static DataHolder.Builder builder(String[] param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static DataHolder empty(int param0) {
      // $FF: Couldn't be decompiled
   }

   private final void zaa(String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private static CursorWindow[] zaa(DataHolder.Builder param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static CursorWindow[] zaa(CursorWrapper param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final void close() {
      // $FF: Couldn't be decompiled
   }

   protected final void finalize() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final boolean getBoolean(String param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final byte[] getByteArray(String param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final int getCount() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final int getInteger(String param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final long getLong(String param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final Bundle getMetadata() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final int getStatusCode() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final String getString(String param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final int getWindowIndex(int param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final boolean hasColumn(String param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final boolean hasNull(String param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final boolean isClosed() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final float zaa(String param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public final void zaa(String param1, int param2, int param3, CharArrayBuffer param4) {
      // $FF: Couldn't be decompiled
   }

   public final double zab(String param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public final void zaca() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static class Builder {
      private final String[] zalq;
      private final ArrayList zalz;
      private final String zama;
      private final HashMap zamb;
      private boolean zamc;
      private String zamd;

      private Builder(String[] param1, String param2) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      Builder(String[] param1, String param2, zab param3) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static String[] zaa(DataHolder.Builder param0) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static ArrayList zab(DataHolder.Builder param0) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public DataHolder build(int param1) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public DataHolder build(int param1, Bundle param2) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public DataHolder.Builder withRow(ContentValues param1) {
         // $FF: Couldn't be decompiled
      }

      public DataHolder.Builder zaa(HashMap param1) {
         // $FF: Couldn't be decompiled
      }
   }

   public static final class zaa extends RuntimeException {
      public zaa(String param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
