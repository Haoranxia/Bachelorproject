package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;

public abstract class DialogRedirect implements OnClickListener {
   public DialogRedirect() {
      // $FF: Couldn't be decompiled
   }

   public static DialogRedirect getInstance(Activity param0, Intent param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public static DialogRedirect getInstance(Fragment param0, Intent param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public static DialogRedirect getInstance(LifecycleFragment param0, Intent param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public void onClick(DialogInterface param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   protected abstract void redirect();
}
