package com.google.android.gms.flags;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzc extends IInterface {
   boolean getBooleanFlagValue(String var1, boolean var2, int var3);

   int getIntFlagValue(String var1, int var2, int var3);

   long getLongFlagValue(String var1, long var2, int var4);

   String getStringFlagValue(String var1, String var2, int var3);

   void init(IObjectWrapper var1);
}
