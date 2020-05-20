package com.adjust.sdk;

import android.content.Context;
import android.net.Uri;
import java.util.List;
import org.json.JSONObject;

public class AdjustInstance {
   private IActivityHandler activityHandler;
   private String basePath;
   private String gdprPath;
   private List preLaunchActionsArray;
   private String pushToken;
   private Boolean startEnabled;
   private boolean startOffline;

   public AdjustInstance() {
      // $FF: Couldn't be decompiled
   }

   private boolean checkActivityHandler() {
      // $FF: Couldn't be decompiled
   }

   private boolean checkActivityHandler(String param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean checkActivityHandler(boolean param1, String param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   private boolean isInstanceEnabled() {
      // $FF: Couldn't be decompiled
   }

   private void saveDisableThirdPartySharing(Context param1) {
      // $FF: Couldn't be decompiled
   }

   private void saveGdprForgetMe(Context param1) {
      // $FF: Couldn't be decompiled
   }

   private void savePushToken(String param1, Context param2) {
      // $FF: Couldn't be decompiled
   }

   private void saveRawReferrer(String param1, long param2, Context param4) {
      // $FF: Couldn't be decompiled
   }

   private void setSendingReferrersAsNotSent(Context param1) {
      // $FF: Couldn't be decompiled
   }

   public void addSessionCallbackParameter(String param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public void addSessionPartnerParameter(String param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public void appWillOpenUrl(Uri param1) {
      // $FF: Couldn't be decompiled
   }

   public void appWillOpenUrl(Uri param1, Context param2) {
      // $FF: Couldn't be decompiled
   }

   public void disableThirdPartySharing(Context param1) {
      // $FF: Couldn't be decompiled
   }

   public void gdprForgetMe(Context param1) {
      // $FF: Couldn't be decompiled
   }

   public String getAdid() {
      // $FF: Couldn't be decompiled
   }

   public AdjustAttribution getAttribution() {
      // $FF: Couldn't be decompiled
   }

   public String getSdkVersion() {
      // $FF: Couldn't be decompiled
   }

   public boolean isEnabled() {
      // $FF: Couldn't be decompiled
   }

   public void onCreate(AdjustConfig param1) {
      // $FF: Couldn't be decompiled
   }

   public void onPause() {
      // $FF: Couldn't be decompiled
   }

   public void onResume() {
      // $FF: Couldn't be decompiled
   }

   public void removeSessionCallbackParameter(String param1) {
      // $FF: Couldn't be decompiled
   }

   public void removeSessionPartnerParameter(String param1) {
      // $FF: Couldn't be decompiled
   }

   public void resetSessionCallbackParameters() {
      // $FF: Couldn't be decompiled
   }

   public void resetSessionPartnerParameters() {
      // $FF: Couldn't be decompiled
   }

   public void sendFirstPackages() {
      // $FF: Couldn't be decompiled
   }

   public void sendReferrer(String param1, Context param2) {
      // $FF: Couldn't be decompiled
   }

   public void setEnabled(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void setOfflineMode(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void setPushToken(String param1) {
      // $FF: Couldn't be decompiled
   }

   public void setPushToken(String param1, Context param2) {
      // $FF: Couldn't be decompiled
   }

   public void setTestOptions(AdjustTestOptions param1) {
      // $FF: Couldn't be decompiled
   }

   public void teardown() {
      // $FF: Couldn't be decompiled
   }

   public void trackAdRevenue(String param1, JSONObject param2) {
      // $FF: Couldn't be decompiled
   }

   public void trackEvent(AdjustEvent param1) {
      // $FF: Couldn't be decompiled
   }
}
