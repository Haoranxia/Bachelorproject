package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
public class ResultReceiver implements Parcelable {
   public static final Creator CREATOR;
   final boolean a;
   final Handler b;
   android.support.v4.os.a c;

   static {
      // $FF: Couldn't be decompiled
   }

   ResultReceiver(Parcel param1) {
      // $FF: Couldn't be decompiled
   }

   protected void a(int param1, Bundle param2) {
      // $FF: Couldn't be decompiled
   }

   public int describeContents() {
      // $FF: Couldn't be decompiled
   }

   public void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   class a extends android.support.v4.os.a.a {
      // $FF: synthetic field
      final ResultReceiver a;

      a(ResultReceiver param1) {
         // $FF: Couldn't be decompiled
      }

      public void a(int param1, Bundle param2) {
         // $FF: Couldn't be decompiled
      }
   }

   class b implements Runnable {
      final int a;
      final Bundle b;
      // $FF: synthetic field
      final ResultReceiver c;

      b(ResultReceiver param1, int param2, Bundle param3) {
         // $FF: Couldn't be decompiled
      }

      public void run() {
         // $FF: Couldn't be decompiled
      }
   }
}
