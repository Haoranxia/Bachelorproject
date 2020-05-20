package com.google.android.gms.ads.mediation.rtb;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public interface SignalCallbacks {
   void onFailure(String var1);

   void onSuccess(String var1);
}
