package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IResolveAccountCallbacks extends IInterface {
   void onAccountResolutionComplete(ResolveAccountResponse var1);

   public abstract static class Stub extends com.google.android.gms.internal.base.zab implements IResolveAccountCallbacks {
      public Stub() {
         // $FF: Couldn't be decompiled
      }

      public static IResolveAccountCallbacks asInterface(IBinder param0) {
         // $FF: Couldn't be decompiled
      }

      protected boolean dispatchTransaction(int param1, Parcel param2, Parcel param3, int param4) {
         // $FF: Couldn't be decompiled
      }

      public static class Proxy extends com.google.android.gms.internal.base.zaa implements IResolveAccountCallbacks {
         Proxy(IBinder param1) {
            // $FF: Couldn't be decompiled
         }

         public void onAccountResolutionComplete(ResolveAccountResponse param1) {
            // $FF: Couldn't be decompiled
         }
      }
   }
}
