package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

@KeepForSdk
public class PendingResultUtil {
   private static final PendingResultUtil.zaa zaou;

   static {
      // $FF: Couldn't be decompiled
   }

   public PendingResultUtil() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static Task toResponseTask(PendingResult param0, Response param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static Task toTask(PendingResult param0, PendingResultUtil.ResultConverter param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static Task toVoidTask(PendingResult param0) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public interface ResultConverter {
      @KeepForSdk
      Object convert(Result var1);
   }

   public interface zaa {
      ApiException zaf(Status var1);
   }
}
