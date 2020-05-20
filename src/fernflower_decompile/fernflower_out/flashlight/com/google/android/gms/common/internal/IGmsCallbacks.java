package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IGmsCallbacks extends IInterface {
   void onPostInitComplete(int var1, IBinder var2, Bundle var3);

   void zza(int var1, Bundle var2);

   void zza(int var1, IBinder var2, zzb var3);

   public abstract static class zza extends com.google.android.gms.internal.common.zzb implements IGmsCallbacks {
      public zza() {
         // $FF: Couldn't be decompiled
      }

      protected final boolean zza(int param1, Parcel param2, Parcel param3, int param4) {
         // $FF: Couldn't be decompiled
      }
   }
}
