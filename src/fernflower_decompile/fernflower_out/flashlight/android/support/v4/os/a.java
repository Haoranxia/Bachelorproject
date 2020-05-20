package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {
   void a(int var1, Bundle var2);

   public abstract static class a extends Binder implements android.support.v4.os.a {
      public a() {
         // $FF: Couldn't be decompiled
      }

      public static android.support.v4.os.a a(IBinder param0) {
         // $FF: Couldn't be decompiled
      }

      public IBinder asBinder() {
         // $FF: Couldn't be decompiled
      }

      public boolean onTransact(int param1, Parcel param2, Parcel param3, int param4) {
         // $FF: Couldn't be decompiled
      }

      private static class a implements android.support.v4.os.a {
         private IBinder a;

         a(IBinder param1) {
            // $FF: Couldn't be decompiled
         }

         public void a(int param1, Bundle param2) {
            // $FF: Couldn't be decompiled
         }

         public IBinder asBinder() {
            // $FF: Couldn't be decompiled
         }
      }
   }
}
