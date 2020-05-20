package com.google.android.gms.ads.query;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public interface QueryDataGenerationCallback {
   @KeepForSdk
   void onFailure(String var1);

   @KeepForSdk
   void onSuccess(QueryData var1);
}
