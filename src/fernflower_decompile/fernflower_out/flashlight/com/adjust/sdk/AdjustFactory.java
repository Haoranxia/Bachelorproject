package com.adjust.sdk;

import android.content.Context;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class AdjustFactory {
   private static IActivityHandler activityHandler;
   private static IAttributionHandler attributionHandler;
   private static String baseUrl;
   private static UtilNetworking.IConnectionOptions connectionOptions;
   private static String gdprUrl;
   private static HttpsURLConnection httpsURLConnection;
   private static ILogger logger;
   private static long maxDelayStart;
   private static IPackageHandler packageHandler;
   private static BackoffStrategy packageHandlerBackoffStrategy;
   private static IRequestHandler requestHandler;
   private static BackoffStrategy sdkClickBackoffStrategy;
   private static ISdkClickHandler sdkClickHandler;
   private static long sessionInterval;
   private static long subsessionInterval;
   private static long timerInterval;
   private static long timerStart;
   private static boolean tryInstallReferrer;

   static {
      // $FF: Couldn't be decompiled
   }

   public AdjustFactory() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static String access$000(byte[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static String byte2HexFormatted(byte[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static IActivityHandler getActivityHandler(AdjustConfig param0) {
      // $FF: Couldn't be decompiled
   }

   public static IAttributionHandler getAttributionHandler(IActivityHandler param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public static String getBaseUrl() {
      // $FF: Couldn't be decompiled
   }

   public static UtilNetworking.IConnectionOptions getConnectionOptions() {
      // $FF: Couldn't be decompiled
   }

   public static String getGdprUrl() {
      // $FF: Couldn't be decompiled
   }

   public static HttpsURLConnection getHttpsURLConnection(URL param0) {
      // $FF: Couldn't be decompiled
   }

   public static ILogger getLogger() {
      // $FF: Couldn't be decompiled
   }

   public static long getMaxDelayStart() {
      // $FF: Couldn't be decompiled
   }

   public static IPackageHandler getPackageHandler(IActivityHandler param0, Context param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public static BackoffStrategy getPackageHandlerBackoffStrategy() {
      // $FF: Couldn't be decompiled
   }

   public static IRequestHandler getRequestHandler(IActivityHandler param0, IPackageHandler param1) {
      // $FF: Couldn't be decompiled
   }

   public static BackoffStrategy getSdkClickBackoffStrategy() {
      // $FF: Couldn't be decompiled
   }

   public static ISdkClickHandler getSdkClickHandler(IActivityHandler param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public static long getSessionInterval() {
      // $FF: Couldn't be decompiled
   }

   public static long getSubsessionInterval() {
      // $FF: Couldn't be decompiled
   }

   public static long getTimerInterval() {
      // $FF: Couldn't be decompiled
   }

   public static long getTimerStart() {
      // $FF: Couldn't be decompiled
   }

   public static boolean getTryInstallReferrer() {
      // $FF: Couldn't be decompiled
   }

   public static void setActivityHandler(IActivityHandler param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setAttributionHandler(IAttributionHandler param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setBaseUrl(String param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setGdprUrl(String param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setHttpsURLConnection(HttpsURLConnection param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setLogger(ILogger param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setPackageHandler(IPackageHandler param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setPackageHandlerBackoffStrategy(BackoffStrategy param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setRequestHandler(IRequestHandler param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setSdkClickBackoffStrategy(BackoffStrategy param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setSdkClickHandler(ISdkClickHandler param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setSessionInterval(long param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setSubsessionInterval(long param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setTimerInterval(long param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setTimerStart(long param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setTryInstallReferrer(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   public static void teardown(Context param0) {
      // $FF: Couldn't be decompiled
   }

   public static void useTestConnectionOptions() {
      // $FF: Couldn't be decompiled
   }

   public static class URLGetConnection {
      HttpsURLConnection httpsURLConnection;
      URL url;

      URLGetConnection(HttpsURLConnection param1, URL param2) {
         // $FF: Couldn't be decompiled
      }
   }
}
