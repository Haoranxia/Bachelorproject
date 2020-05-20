package com.adjust.sdk;

import java.util.Date;
import java.util.Map;
import org.json.JSONObject;

public class PackageBuilder {
   private static ILogger logger;
   private PackageBuilder.ActivityStateCopy activityStateCopy;
   private AdjustConfig adjustConfig;
   AdjustAttribution attribution;
   long clickTimeInMilliseconds;
   long clickTimeInSeconds;
   private long createdAt;
   String deeplink;
   private DeviceInfo deviceInfo;
   Map extraParameters;
   long installBeginTimeInSeconds;
   String rawReferrer;
   String referrer;
   String reftag;
   private SessionParameters sessionParameters;

   static {
      // $FF: Couldn't be decompiled
   }

   PackageBuilder(AdjustConfig param1, DeviceInfo param2, ActivityState param3, SessionParameters param4, long param5) {
      // $FF: Couldn't be decompiled
   }

   public static void addBoolean(Map param0, String param1, Boolean param2) {
      // $FF: Couldn't be decompiled
   }

   private static void addDate(Map param0, String param1, Date param2) {
      // $FF: Couldn't be decompiled
   }

   private static void addDateInMilliseconds(Map param0, String param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private static void addDateInSeconds(Map param0, String param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private static void addDouble(Map param0, String param1, Double param2) {
      // $FF: Couldn't be decompiled
   }

   private static void addDuration(Map param0, String param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   static void addJsonObject(Map param0, String param1, JSONObject param2) {
      // $FF: Couldn't be decompiled
   }

   private static void addLong(Map param0, String param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   static void addMapJson(Map param0, String param1, Map param2) {
      // $FF: Couldn't be decompiled
   }

   public static void addString(Map param0, String param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   private void checkDeviceIds(Map param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean containsPlayIds(Map param1) {
      // $FF: Couldn't be decompiled
   }

   private Map getAdRevenueParameters(String param1, JSONObject param2) {
      // $FF: Couldn't be decompiled
   }

   private Map getAttributionParameters(String param1) {
      // $FF: Couldn't be decompiled
   }

   private Map getClickParameters(String param1) {
      // $FF: Couldn't be decompiled
   }

   private ActivityPackage getDefaultActivityPackage(ActivityKind param1) {
      // $FF: Couldn't be decompiled
   }

   private Map getDisableThirdPartySharingParameters() {
      // $FF: Couldn't be decompiled
   }

   private String getEventSuffix(AdjustEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private Map getGdprParameters() {
      // $FF: Couldn't be decompiled
   }

   private Map getInfoParameters(String param1) {
      // $FF: Couldn't be decompiled
   }

   private Map getSessionParameters(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   ActivityPackage buildAdRevenuePackage(String param1, JSONObject param2) {
      // $FF: Couldn't be decompiled
   }

   ActivityPackage buildAttributionPackage(String param1) {
      // $FF: Couldn't be decompiled
   }

   ActivityPackage buildClickPackage(String param1) {
      // $FF: Couldn't be decompiled
   }

   ActivityPackage buildDisableThirdPartySharingPackage() {
      // $FF: Couldn't be decompiled
   }

   ActivityPackage buildEventPackage(AdjustEvent param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   ActivityPackage buildGdprPackage() {
      // $FF: Couldn't be decompiled
   }

   ActivityPackage buildInfoPackage(String param1) {
      // $FF: Couldn't be decompiled
   }

   ActivityPackage buildSessionPackage(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public Map getEventParameters(AdjustEvent param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   private class ActivityStateCopy {
      int eventCount;
      long lastInterval;
      String pushToken;
      int sessionCount;
      long sessionLength;
      int subsessionCount;
      // $FF: synthetic field
      final PackageBuilder this$0;
      long timeSpent;
      String uuid;

      ActivityStateCopy(PackageBuilder param1, ActivityState param2) {
         // $FF: Couldn't be decompiled
      }
   }
}
