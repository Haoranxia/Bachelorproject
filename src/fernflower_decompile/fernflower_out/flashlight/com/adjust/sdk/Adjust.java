package com.adjust.sdk;

import android.content.Context;
import android.net.Uri;
import org.json.JSONObject;

public class Adjust {
   private static AdjustInstance defaultInstance;

   private Adjust() {
      // $FF: Couldn't be decompiled
   }

   public static void addSessionCallbackParameter(String param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   public static void addSessionPartnerParameter(String param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public static void appWillOpenUrl(Uri param0) {
      // $FF: Couldn't be decompiled
   }

   public static void appWillOpenUrl(Uri param0, Context param1) {
      // $FF: Couldn't be decompiled
   }

   public static void disableThirdPartySharing(Context param0) {
      // $FF: Couldn't be decompiled
   }

   public static void gdprForgetMe(Context param0) {
      // $FF: Couldn't be decompiled
   }

   public static String getAdid() {
      // $FF: Couldn't be decompiled
   }

   public static String getAmazonAdId(Context param0) {
      // $FF: Couldn't be decompiled
   }

   public static AdjustAttribution getAttribution() {
      // $FF: Couldn't be decompiled
   }

   public static AdjustInstance getDefaultInstance() {
      // $FF: Couldn't be decompiled
   }

   public static void getGoogleAdId(Context param0, OnDeviceIdsRead param1) {
      // $FF: Couldn't be decompiled
   }

   public static String getSdkVersion() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isEnabled() {
      // $FF: Couldn't be decompiled
   }

   public static void onCreate(AdjustConfig param0) {
      // $FF: Couldn't be decompiled
   }

   public static void onPause() {
      // $FF: Couldn't be decompiled
   }

   public static void onResume() {
      // $FF: Couldn't be decompiled
   }

   public static void removeSessionCallbackParameter(String param0) {
      // $FF: Couldn't be decompiled
   }

   public static void removeSessionPartnerParameter(String param0) {
      // $FF: Couldn't be decompiled
   }

   public static void resetSessionCallbackParameters() {
      // $FF: Couldn't be decompiled
   }

   public static void resetSessionPartnerParameters() {
      // $FF: Couldn't be decompiled
   }

   public static void sendFirstPackages() {
      // $FF: Couldn't be decompiled
   }

   public static void setEnabled(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setOfflineMode(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setPushToken(String param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setPushToken(String param0, Context param1) {
      // $FF: Couldn't be decompiled
   }

   public static void setReferrer(String param0, Context param1) {
      // $FF: Couldn't be decompiled
   }

   public static void setTestOptions(AdjustTestOptions param0) {
      // $FF: Couldn't be decompiled
   }

   public static void trackAdRevenue(String param0, JSONObject param1) {
      // $FF: Couldn't be decompiled
   }

   public static void trackEvent(AdjustEvent param0) {
      // $FF: Couldn't be decompiled
   }
}
