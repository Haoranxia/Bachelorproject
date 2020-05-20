package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

@KeepForSdk
public class BlockingServiceConnection implements ServiceConnection {
   private boolean zze;
   private final BlockingQueue zzf;

   public BlockingServiceConnection() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public IBinder getService() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public IBinder getServiceWithTimeout(long param1, TimeUnit param3) {
      // $FF: Couldn't be decompiled
   }

   public void onServiceConnected(ComponentName param1, IBinder param2) {
      // $FF: Couldn't be decompiled
   }

   public void onServiceDisconnected(ComponentName param1) {
      // $FF: Couldn't be decompiled
   }
}
