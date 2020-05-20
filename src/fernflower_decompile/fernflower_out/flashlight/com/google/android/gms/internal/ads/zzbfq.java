package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

public interface zzbfq extends IInterface {
   void beginAdUnitExposure(String var1);

   void clearConditionalUserProperty(String var1, String var2, Bundle var3);

   void endAdUnitExposure(String var1);

   long generateEventId();

   String getAppIdOrigin();

   String getAppInstanceId();

   List getConditionalUserProperties(String var1, String var2);

   String getCurrentScreenClass();

   String getCurrentScreenName();

   String getGmpAppId();

   int getMaxUserProperties(String var1);

   Map getUserProperties(String var1, String var2, boolean var3);

   void logEvent(String var1, String var2, Bundle var3);

   void performAction(Bundle var1);

   Bundle performActionWithResponse(Bundle var1);

   void setConditionalUserProperty(Bundle var1);

   void zza(String var1, String var2, IObjectWrapper var3);

   void zzb(IObjectWrapper var1, String var2, String var3);
}
