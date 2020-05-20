package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public interface IStatusCallback extends IInterface {
   void onResult(Status var1);

   public abstract static class Stub extends com.google.android.gms.internal.base.zab implements IStatusCallback {
      public Stub() {
         // $FF: Couldn't be decompiled
      }

      public static IStatusCallback asInterface(IBinder param0) {
         // $FF: Couldn't be decompiled
      }

      protected boolean dispatchTransaction(int param1, Parcel param2, Parcel param3, int param4) {
         // $FF: Couldn't be decompiled
      }

      public static final class zaa extends com.google.android.gms.internal.base.zaa implements IStatusCallback {
         zaa(IBinder param1) {
            // $FF: Couldn't be decompiled
         }

         public final void onResult(Status param1) {
            // $FF: Couldn't be decompiled
         }
      }
   }
}
