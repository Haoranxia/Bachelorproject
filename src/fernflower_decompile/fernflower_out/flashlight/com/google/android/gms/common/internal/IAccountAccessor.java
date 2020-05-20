package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IAccountAccessor extends IInterface {
   Account getAccount();

   public abstract static class Stub extends com.google.android.gms.internal.common.zzb implements IAccountAccessor {
      public Stub() {
         // $FF: Couldn't be decompiled
      }

      public static IAccountAccessor asInterface(IBinder param0) {
         // $FF: Couldn't be decompiled
      }

      protected final boolean zza(int param1, Parcel param2, Parcel param3, int param4) {
         // $FF: Couldn't be decompiled
      }

      public static final class zza extends com.google.android.gms.internal.common.zza implements IAccountAccessor {
         zza(IBinder param1) {
            // $FF: Couldn't be decompiled
         }

         public final Account getAccount() {
            // $FF: Couldn't be decompiled
         }
      }
   }
}
