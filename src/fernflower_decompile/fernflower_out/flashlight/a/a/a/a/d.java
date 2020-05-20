package a.a.a.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import java.io.File;

class d extends ContextWrapper {
   private final String a;
   private final String b;

   public d(Context param1, String param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   public File getCacheDir() {
      // $FF: Couldn't be decompiled
   }

   public File getDatabasePath(String param1) {
      // $FF: Couldn't be decompiled
   }

   @TargetApi(8)
   public File getExternalCacheDir() {
      // $FF: Couldn't be decompiled
   }

   @TargetApi(8)
   public File getExternalFilesDir(String param1) {
      // $FF: Couldn't be decompiled
   }

   public File getFilesDir() {
      // $FF: Couldn't be decompiled
   }

   public SharedPreferences getSharedPreferences(String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public SQLiteDatabase openOrCreateDatabase(String param1, int param2, CursorFactory param3) {
      // $FF: Couldn't be decompiled
   }

   @TargetApi(11)
   public SQLiteDatabase openOrCreateDatabase(String param1, int param2, CursorFactory param3, DatabaseErrorHandler param4) {
      // $FF: Couldn't be decompiled
   }
}
