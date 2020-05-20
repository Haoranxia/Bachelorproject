package com.google.android.gms.tasks;

import android.app.Activity;
import java.util.concurrent.Executor;

public abstract class Task {
   public Task() {
      // $FF: Couldn't be decompiled
   }

   public Task addOnCanceledListener(Activity param1, OnCanceledListener param2) {
      // $FF: Couldn't be decompiled
   }

   public Task addOnCanceledListener(OnCanceledListener param1) {
      // $FF: Couldn't be decompiled
   }

   public Task addOnCanceledListener(Executor param1, OnCanceledListener param2) {
      // $FF: Couldn't be decompiled
   }

   public Task addOnCompleteListener(Activity param1, OnCompleteListener param2) {
      // $FF: Couldn't be decompiled
   }

   public Task addOnCompleteListener(OnCompleteListener param1) {
      // $FF: Couldn't be decompiled
   }

   public Task addOnCompleteListener(Executor param1, OnCompleteListener param2) {
      // $FF: Couldn't be decompiled
   }

   public abstract Task addOnFailureListener(Activity var1, OnFailureListener var2);

   public abstract Task addOnFailureListener(OnFailureListener var1);

   public abstract Task addOnFailureListener(Executor var1, OnFailureListener var2);

   public abstract Task addOnSuccessListener(Activity var1, OnSuccessListener var2);

   public abstract Task addOnSuccessListener(OnSuccessListener var1);

   public abstract Task addOnSuccessListener(Executor var1, OnSuccessListener var2);

   public Task continueWith(Continuation param1) {
      // $FF: Couldn't be decompiled
   }

   public Task continueWith(Executor param1, Continuation param2) {
      // $FF: Couldn't be decompiled
   }

   public Task continueWithTask(Continuation param1) {
      // $FF: Couldn't be decompiled
   }

   public Task continueWithTask(Executor param1, Continuation param2) {
      // $FF: Couldn't be decompiled
   }

   public abstract Exception getException();

   public abstract Object getResult();

   public abstract Object getResult(Class var1);

   public abstract boolean isCanceled();

   public abstract boolean isComplete();

   public abstract boolean isSuccessful();

   public Task onSuccessTask(SuccessContinuation param1) {
      // $FF: Couldn't be decompiled
   }

   public Task onSuccessTask(Executor param1, SuccessContinuation param2) {
      // $FF: Couldn't be decompiled
   }
}
