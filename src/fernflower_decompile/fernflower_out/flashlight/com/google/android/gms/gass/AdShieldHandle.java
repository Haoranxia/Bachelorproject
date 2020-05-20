package com.google.android.gms.gass;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

public interface AdShieldHandle {
   void close();

   String getClickSignals(Context var1, String var2, String var3, View var4, Activity var5);

   String getImpressionSignals(Context var1, String var2, View var3, Activity var4);

   int getLastCrashInformation();

   String getQuerySignals(Context var1, String var2);

   void reportTouchEvent(String var1, MotionEvent var2);
}
