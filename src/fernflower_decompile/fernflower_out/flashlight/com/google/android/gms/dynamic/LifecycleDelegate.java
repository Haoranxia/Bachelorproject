package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public interface LifecycleDelegate {
   @KeepForSdk
   void onCreate(Bundle var1);

   @KeepForSdk
   View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3);

   @KeepForSdk
   void onDestroy();

   @KeepForSdk
   void onDestroyView();

   @KeepForSdk
   void onInflate(Activity var1, Bundle var2, Bundle var3);

   @KeepForSdk
   void onLowMemory();

   @KeepForSdk
   void onPause();

   @KeepForSdk
   void onResume();

   @KeepForSdk
   void onSaveInstanceState(Bundle var1);

   @KeepForSdk
   void onStart();

   @KeepForSdk
   void onStop();
}
