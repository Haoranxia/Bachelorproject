package com.google.android.gms.common.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface ISignInButtonCreator extends IInterface {
   IObjectWrapper newSignInButton(IObjectWrapper var1, int var2, int var3);

   IObjectWrapper newSignInButtonFromConfig(IObjectWrapper var1, SignInButtonConfig var2);
}
