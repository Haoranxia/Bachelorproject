package com.adjust.sdk;

import android.content.Context;
import android.net.Uri;
import org.json.JSONObject;

public interface IActivityHandler {
   void addSessionCallbackParameter(String var1, String var2);

   void addSessionPartnerParameter(String var1, String var2);

   void disableThirdPartySharing();

   void finishedTrackingActivity(ResponseData var1);

   void gdprForgetMe();

   ActivityState getActivityState();

   String getAdid();

   AdjustConfig getAdjustConfig();

   AdjustAttribution getAttribution();

   String getBasePath();

   Context getContext();

   DeviceInfo getDeviceInfo();

   String getGdprPath();

   SessionParameters getSessionParameters();

   void gotOptOutResponse();

   void init(AdjustConfig var1);

   boolean isEnabled();

   void launchAttributionResponseTasks(AttributionResponseData var1);

   void launchEventResponseTasks(EventResponseData var1);

   void launchSdkClickResponseTasks(SdkClickResponseData var1);

   void launchSessionResponseTasks(SessionResponseData var1);

   void onPause();

   void onResume();

   void readOpenUrl(Uri var1, long var2);

   void removeSessionCallbackParameter(String var1);

   void removeSessionPartnerParameter(String var1);

   void resetSessionCallbackParameters();

   void resetSessionPartnerParameters();

   void sendFirstPackages();

   void sendInstallReferrer(String var1, long var2, long var4);

   void sendReftagReferrer();

   void setAskingAttribution(boolean var1);

   void setEnabled(boolean var1);

   void setOfflineMode(boolean var1);

   void setPushToken(String var1, boolean var2);

   void teardown();

   void trackAdRevenue(String var1, JSONObject var2);

   void trackEvent(AdjustEvent var1);

   boolean updateAttributionI(AdjustAttribution var1);
}
