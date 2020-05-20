package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

public interface zzm extends IInterface {
   void beginAdUnitExposure(String var1, long var2);

   void clearConditionalUserProperty(String var1, String var2, Bundle var3);

   void endAdUnitExposure(String var1, long var2);

   void generateEventId(zzn var1);

   void getAppInstanceId(zzn var1);

   void getCachedAppInstanceId(zzn var1);

   void getConditionalUserProperties(String var1, String var2, zzn var3);

   void getCurrentScreenClass(zzn var1);

   void getCurrentScreenName(zzn var1);

   void getGmpAppId(zzn var1);

   void getMaxUserProperties(String var1, zzn var2);

   void getTestFlag(zzn var1, int var2);

   void getUserProperties(String var1, String var2, boolean var3, zzn var4);

   void initForTests(Map var1);

   void initialize(IObjectWrapper var1, zzv var2, long var3);

   void isDataCollectionEnabled(zzn var1);

   void logEvent(String var1, String var2, Bundle var3, boolean var4, boolean var5, long var6);

   void logEventAndBundle(String var1, String var2, Bundle var3, zzn var4, long var5);

   void logHealthData(int var1, String var2, IObjectWrapper var3, IObjectWrapper var4, IObjectWrapper var5);

   void onActivityCreated(IObjectWrapper var1, Bundle var2, long var3);

   void onActivityDestroyed(IObjectWrapper var1, long var2);

   void onActivityPaused(IObjectWrapper var1, long var2);

   void onActivityResumed(IObjectWrapper var1, long var2);

   void onActivitySaveInstanceState(IObjectWrapper var1, zzn var2, long var3);

   void onActivityStarted(IObjectWrapper var1, long var2);

   void onActivityStopped(IObjectWrapper var1, long var2);

   void performAction(Bundle var1, zzn var2, long var3);

   void registerOnMeasurementEventListener(zzs var1);

   void resetAnalyticsData(long var1);

   void setConditionalUserProperty(Bundle var1, long var2);

   void setCurrentScreen(IObjectWrapper var1, String var2, String var3, long var4);

   void setDataCollectionEnabled(boolean var1);

   void setEventInterceptor(zzs var1);

   void setInstanceIdProvider(zzt var1);

   void setMeasurementEnabled(boolean var1, long var2);

   void setMinimumSessionDuration(long var1);

   void setSessionTimeoutDuration(long var1);

   void setUserId(String var1, long var2);

   void setUserProperty(String var1, String var2, IObjectWrapper var3, boolean var4, long var5);

   void unregisterOnMeasurementEventListener(zzs var1);
}
