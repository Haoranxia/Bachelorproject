package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.annotation.KeepForSdk;

public interface IGmsServiceBroker extends IInterface {
   @KeepForSdk
   void getService(IGmsCallbacks var1, GetServiceRequest var2);

   public abstract static class Stub extends Binder implements IGmsServiceBroker {
      public Stub() {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public IBinder asBinder() {
         // $FF: Couldn't be decompiled
      }

      public boolean onTransact(int param1, Parcel param2, Parcel param3, int param4) {
         // $FF: Couldn't be decompiled
      }

      private static final class zza implements IGmsServiceBroker {
         private final IBinder zza;

         zza(IBinder param1) {
            // $FF: Couldn't be decompiled
         }

         public final IBinder asBinder() {
            // $FF: Couldn't be decompiled
         }

         public final void getService(IGmsCallbacks param1, GetServiceRequest param2) {
            // $FF: Couldn't be decompiled
         }
      }
   }
}
