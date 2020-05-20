package com.adjust.sdk;

import android.net.Uri;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

public class UtilNetworking {
   private static String userAgent;

   public UtilNetworking() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static String access$000() {
      // $FF: Couldn't be decompiled
   }

   private static String buildAuthorizationHeader(Map param0, String param1, String param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   private static Uri buildUri(String param0, Map param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public static ResponseData createGETHttpsURLConnection(ActivityPackage param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   public static ResponseData createPOSTHttpsURLConnection(String param0, ActivityPackage param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private static String extractAppSecret(Map param0) {
      // $FF: Couldn't be decompiled
   }

   private static void extractEventCallbackId(Map param0) {
      // $FF: Couldn't be decompiled
   }

   private static String extractSecretId(Map param0) {
      // $FF: Couldn't be decompiled
   }

   private static ILogger getLogger() {
      // $FF: Couldn't be decompiled
   }

   private static String getPostDataString(Map param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static Map getSignature(Map param0, String param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   private static String getValidIdentifier(Map param0) {
      // $FF: Couldn't be decompiled
   }

   private static ResponseData readHttpResponse(HttpsURLConnection param0, ActivityPackage param1) {
      // $FF: Couldn't be decompiled
   }

   public static void setUserAgent(String param0) {
      // $FF: Couldn't be decompiled
   }

   static class ConnectionOptions implements UtilNetworking.IConnectionOptions {
      ConnectionOptions() {
         // $FF: Couldn't be decompiled
      }

      public void applyConnectionOptions(HttpsURLConnection param1, String param2) {
         // $FF: Couldn't be decompiled
      }
   }

   public interface IConnectionOptions {
      void applyConnectionOptions(HttpsURLConnection var1, String var2);
   }
}
