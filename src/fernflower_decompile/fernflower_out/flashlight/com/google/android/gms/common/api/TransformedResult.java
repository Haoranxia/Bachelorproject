package com.google.android.gms.common.api;

public abstract class TransformedResult {
   public TransformedResult() {
      // $FF: Couldn't be decompiled
   }

   public abstract void andFinally(ResultCallbacks var1);

   public abstract TransformedResult then(ResultTransform var1);
}
