package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

public final class zacm extends TransformedResult implements ResultCallback {
   private final Object zado;
   private final WeakReference zadq;
   private ResultTransform zako;
   private zacm zakp;
   private volatile ResultCallbacks zakq;
   private PendingResult zakr;
   private Status zaks;
   private final zaco zakt;
   private boolean zaku;

   public zacm(WeakReference param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zaa(zacm param0, Result param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void zaa(zacm param0, Status param1) {
      // $FF: Couldn't be decompiled
   }

   private static void zab(Result param0) {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mSyncToken")
   private final void zabu() {
      // $FF: Couldn't be decompiled
   }

   @GuardedBy("mSyncToken")
   private final boolean zabw() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ResultTransform zac(zacm param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static zaco zad(zacm param0) {
      // $FF: Couldn't be decompiled
   }

   private final void zad(Status param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static WeakReference zae(zacm param0) {
      // $FF: Couldn't be decompiled
   }

   private final void zae(Status param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Object zaf(zacm param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static zacm zag(zacm param0) {
      // $FF: Couldn't be decompiled
   }

   public final void andFinally(ResultCallbacks param1) {
      // $FF: Couldn't be decompiled
   }

   public final void onResult(Result param1) {
      // $FF: Couldn't be decompiled
   }

   public final TransformedResult then(ResultTransform param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zaa(PendingResult param1) {
      // $FF: Couldn't be decompiled
   }

   final void zabv() {
      // $FF: Couldn't be decompiled
   }
}
