package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;

public interface ICancelToken extends IInterface {
   void cancel();

   public abstract static class Stub extends com.google.android.gms.internal.common.zzb implements ICancelToken {
      public Stub() {
         // $FF: Couldn't be decompiled
      }

      public static ICancelToken asInterface(IBinder param0) {
         // $FF: Couldn't be decompiled
      }

      public static final class zza extends com.google.android.gms.internal.common.zza implements ICancelToken {
         zza(IBinder param1) {
            // $FF: Couldn't be decompiled
         }

         public final void cancel() {
            // $FF: Couldn't be decompiled
         }
      }
   }
}
