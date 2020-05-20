package com.adjust.sdk;

import com.adjust.sdk.scheduler.ThreadExecutor;
import java.lang.ref.WeakReference;

public class RequestHandler implements IRequestHandler {
   private WeakReference activityHandlerWeakRef;
   private String basePath;
   private ThreadExecutor executor;
   private String gdprPath;
   private ILogger logger;
   private WeakReference packageHandlerWeakRef;

   public RequestHandler(IActivityHandler param1, IPackageHandler param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void access$000(RequestHandler param0, ActivityPackage param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private void closePackageI(ActivityPackage param1, String param2, Throwable param3) {
      // $FF: Couldn't be decompiled
   }

   private void sendI(ActivityPackage param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private void sendNextPackageI(ActivityPackage param1, String param2, Throwable param3) {
      // $FF: Couldn't be decompiled
   }

   public void init(IActivityHandler param1, IPackageHandler param2) {
      // $FF: Couldn't be decompiled
   }

   public void sendPackage(ActivityPackage param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public void teardown() {
      // $FF: Couldn't be decompiled
   }
}
