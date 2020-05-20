package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {
   private AbstractWindowedCursor zzez;

   @KeepForSdk
   public CursorWrapper(Cursor param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void fillWindow(int param1, CursorWindow param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public CursorWindow getWindow() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public Cursor getWrappedCursor() {
      // $FF: Couldn't be decompiled
   }

   public boolean onMove(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void setWindow(CursorWindow param1) {
      // $FF: Couldn't be decompiled
   }
}
