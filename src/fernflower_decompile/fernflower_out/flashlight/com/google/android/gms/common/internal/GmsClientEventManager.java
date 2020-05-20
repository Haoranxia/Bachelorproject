package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Handler.Callback;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class GmsClientEventManager implements Callback {
   private final Handler mHandler;
   private final Object mLock;
   private final GmsClientEventManager.GmsClientEventState zaol;
   private final ArrayList zaom;
   @VisibleForTesting
   private final ArrayList zaon;
   private final ArrayList zaoo;
   private volatile boolean zaop;
   private final AtomicInteger zaoq;
   private boolean zaor;

   public GmsClientEventManager(Looper param1, GmsClientEventManager.GmsClientEventState param2) {
      // $FF: Couldn't be decompiled
   }

   public final boolean areCallbacksEnabled() {
      // $FF: Couldn't be decompiled
   }

   public final void disableCallbacks() {
      // $FF: Couldn't be decompiled
   }

   public final void enableCallbacks() {
      // $FF: Couldn't be decompiled
   }

   public final boolean handleMessage(Message param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener param1) {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   public final void onConnectionFailure(ConnectionResult param1) {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   protected final void onConnectionSuccess() {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   public final void onConnectionSuccess(Bundle param1) {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   public final void onUnintentionalDisconnection(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks param1) {
      // $FF: Couldn't be decompiled
   }

   public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener param1) {
      // $FF: Couldn't be decompiled
   }

   public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks param1) {
      // $FF: Couldn't be decompiled
   }

   public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener param1) {
      // $FF: Couldn't be decompiled
   }

   @VisibleForTesting
   public interface GmsClientEventState {
      Bundle getConnectionHint();

      boolean isConnected();
   }
}
