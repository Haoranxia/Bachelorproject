package com.google.android.gms.tasks;

public abstract class CancellationToken {
   public CancellationToken() {
      // $FF: Couldn't be decompiled
   }

   public abstract boolean isCancellationRequested();

   public abstract CancellationToken onCanceledRequested(OnTokenCanceledListener var1);
}
