package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class ListenerHolder {
   private final ListenerHolder.zaa zajj;
   private volatile Object zajk;
   private final ListenerHolder.ListenerKey zajl;

   @KeepForSdk
   ListenerHolder(Looper param1, Object param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final void clear() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final ListenerHolder.ListenerKey getListenerKey() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final boolean hasListener() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final void notifyListener(ListenerHolder.Notifier param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   final void notifyListenerInternal(ListenerHolder.Notifier param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static final class ListenerKey {
      private final Object zajk;
      private final String zajn;

      @KeepForSdk
      ListenerKey(Object param1, String param2) {
         // $FF: Couldn't be decompiled
      }

      public final boolean equals(Object param1) {
         // $FF: Couldn't be decompiled
      }

      public final int hashCode() {
         // $FF: Couldn't be decompiled
      }
   }

   @KeepForSdk
   public interface Notifier {
      @KeepForSdk
      void notifyListener(Object var1);

      @KeepForSdk
      void onNotifyListenerFailed();
   }

   private final class zaa extends com.google.android.gms.internal.base.zap {
      // $FF: synthetic field
      private final ListenerHolder zajm;

      public zaa(ListenerHolder param1, Looper param2) {
         // $FF: Couldn't be decompiled
      }

      public final void handleMessage(Message param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
