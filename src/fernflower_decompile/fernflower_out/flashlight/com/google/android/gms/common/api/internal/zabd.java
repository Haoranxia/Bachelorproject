package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;

public interface zabd {
   void begin();

   void connect();

   boolean disconnect();

   BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl var1);

   BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl var1);

   void onConnected(Bundle var1);

   void onConnectionSuspended(int var1);

   void zaa(ConnectionResult var1, Api var2, boolean var3);
}
