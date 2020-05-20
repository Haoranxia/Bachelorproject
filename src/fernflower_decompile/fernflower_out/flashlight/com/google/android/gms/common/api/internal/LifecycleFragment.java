package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public interface LifecycleFragment {
   @KeepForSdk
   void addCallback(String var1, LifecycleCallback var2);

   @KeepForSdk
   LifecycleCallback getCallbackOrNull(String var1, Class var2);

   @KeepForSdk
   Activity getLifecycleActivity();

   @KeepForSdk
   boolean isCreated();

   @KeepForSdk
   boolean isStarted();

   @KeepForSdk
   void startActivityForResult(Intent var1, int var2);
}
