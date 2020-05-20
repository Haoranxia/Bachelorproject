package com.adjust.sdk;

public interface IRequestHandler {
   void init(IActivityHandler var1, IPackageHandler var2);

   void sendPackage(ActivityPackage var1, int var2);

   void teardown();
}
