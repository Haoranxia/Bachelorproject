package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;

public interface CustomEventNative extends CustomEvent {
   void requestNativeAd(Context var1, CustomEventNativeListener var2, String var3, NativeMediationAdRequest var4, Bundle var5);
}
