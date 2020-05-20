package com.google.android.gms.ads.mediation.rtb;

import com.google.android.gms.ads.mediation.Adapter;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public abstract class RtbAdapter extends Adapter {
   public RtbAdapter() {
      // $FF: Couldn't be decompiled
   }

   public abstract void collectSignals(RtbSignalData var1, SignalCallbacks var2);
}
