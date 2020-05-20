package com.google.android.gms.common.config;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashSet;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public abstract class GservicesValue {
   private static final Object sLock;
   private static GservicesValue.zza zzbm;
   private static int zzbn;
   private static Context zzbo;
   @GuardedBy("sLock")
   private static HashSet zzbp;
   protected final String mKey;
   protected final Object zzbq;
   private Object zzbr;

   static {
      // $FF: Couldn't be decompiled
   }

   protected GservicesValue(String param1, Object param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static boolean isInitialized() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static GservicesValue value(String param0, Float param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static GservicesValue value(String param0, Integer param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static GservicesValue value(String param0, Long param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static GservicesValue value(String param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static GservicesValue value(String param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean zzi() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public final Object get() {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   @KeepForSdk
   public final Object getBinderSafe() {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   @VisibleForTesting
   public void override(Object param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   @VisibleForTesting
   public void resetOverride() {
      // $FF: Couldn't be decompiled
   }

   protected abstract Object zzd(String var1);

   private interface zza {
      Long getLong(String var1, Long var2);

      String getString(String var1, String var2);

      Boolean zza(String var1, Boolean var2);

      Float zza(String var1, Float var2);

      Integer zza(String var1, Integer var2);
   }
}
