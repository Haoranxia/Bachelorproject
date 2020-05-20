package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;

@TargetApi(11)
public final class zzbda extends WebChromeClient {
   private final zzbdi zzcza;

   public zzbda(zzbdi param1) {
      // $FF: Couldn't be decompiled
   }

   private static Context zza(WebView param0) {
      // $FF: Couldn't be decompiled
   }

   private final boolean zza(Context param1, String param2, String param3, String param4, String param5, JsResult param6, JsPromptResult param7, boolean param8) {
      // $FF: Couldn't be decompiled
   }

   public final void onCloseWindow(WebView param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean onConsoleMessage(ConsoleMessage param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean onCreateWindow(WebView param1, boolean param2, boolean param3, Message param4) {
      // $FF: Couldn't be decompiled
   }

   public final void onExceededDatabaseQuota(String param1, String param2, long param3, long param5, long param7, QuotaUpdater param9) {
      // $FF: Couldn't be decompiled
   }

   public final void onGeolocationPermissionsShowPrompt(String param1, Callback param2) {
      // $FF: Couldn't be decompiled
   }

   public final void onHideCustomView() {
      // $FF: Couldn't be decompiled
   }

   public final boolean onJsAlert(WebView param1, String param2, String param3, JsResult param4) {
      // $FF: Couldn't be decompiled
   }

   public final boolean onJsBeforeUnload(WebView param1, String param2, String param3, JsResult param4) {
      // $FF: Couldn't be decompiled
   }

   public final boolean onJsConfirm(WebView param1, String param2, String param3, JsResult param4) {
      // $FF: Couldn't be decompiled
   }

   public final boolean onJsPrompt(WebView param1, String param2, String param3, String param4, JsPromptResult param5) {
      // $FF: Couldn't be decompiled
   }

   @TargetApi(21)
   public final void onPermissionRequest(PermissionRequest param1) {
      // $FF: Couldn't be decompiled
   }

   public final void onReachedMaxAppCacheSize(long param1, long param3, QuotaUpdater param5) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public final void onShowCustomView(View param1, int param2, CustomViewCallback param3) {
      // $FF: Couldn't be decompiled
   }

   public final void onShowCustomView(View param1, CustomViewCallback param2) {
      // $FF: Couldn't be decompiled
   }
}
