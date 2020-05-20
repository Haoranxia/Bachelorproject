package com.adjust.sdk;

public interface IAttributionHandler {
   void checkSdkClickResponse(SdkClickResponseData var1);

   void checkSessionResponse(SessionResponseData var1);

   void getAttribution();

   void init(IActivityHandler var1, boolean var2);

   void pauseSending();

   void resumeSending();

   void teardown();
}
