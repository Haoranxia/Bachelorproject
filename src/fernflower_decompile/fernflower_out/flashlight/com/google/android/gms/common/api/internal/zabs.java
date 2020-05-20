package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public interface zabs {
   ConnectionResult blockingConnect();

   ConnectionResult blockingConnect(long var1, TimeUnit var3);

   void connect();

   void disconnect();

   void dump(String var1, FileDescriptor var2, PrintWriter var3, String[] var4);

   BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl var1);

   BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl var1);

   ConnectionResult getConnectionResult(Api var1);

   boolean isConnected();

   boolean isConnecting();

   boolean maybeSignIn(SignInConnectionListener var1);

   void maybeSignOut();

   void zaw();
}
