package com.adjust.sdk;

import org.json.JSONObject;

public class ResponseData {
   public ActivityKind activityKind;
   public String adid;
   public AdjustAttribution attribution;
   public JSONObject jsonResponse;
   public String message;
   public boolean success;
   public String timestamp;
   public TrackingState trackingState;
   public boolean willRetry;

   protected ResponseData() {
      // $FF: Couldn't be decompiled
   }

   public static ResponseData buildResponseData(ActivityPackage param0) {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      // $FF: Couldn't be decompiled
   }
}
