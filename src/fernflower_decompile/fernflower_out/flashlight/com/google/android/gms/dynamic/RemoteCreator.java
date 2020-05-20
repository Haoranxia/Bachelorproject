package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract class RemoteCreator {
   private final String zzic;
   private Object zzid;

   @KeepForSdk
   protected RemoteCreator(String param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   protected abstract Object getRemoteCreator(IBinder var1);

   @KeepForSdk
   protected final Object getRemoteCreatorInstance(Context param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static class RemoteCreatorException extends Exception {
      public RemoteCreatorException(String param1) {
         // $FF: Couldn't be decompiled
      }

      public RemoteCreatorException(String param1, Throwable param2) {
         // $FF: Couldn't be decompiled
      }
   }
}
