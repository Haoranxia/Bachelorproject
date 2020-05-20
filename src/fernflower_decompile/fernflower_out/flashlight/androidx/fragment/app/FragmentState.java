package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
   public static final Creator CREATOR;
   final String a;
   final String b;
   final boolean c;
   final int d;
   final int e;
   final String f;
   final boolean g;
   final boolean h;
   final boolean i;
   final Bundle j;
   final boolean k;
   final int l;
   Bundle m;
   Fragment n;

   static {
      // $FF: Couldn't be decompiled
   }

   FragmentState(Parcel param1) {
      // $FF: Couldn't be decompiled
   }

   FragmentState(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   public Fragment a(ClassLoader param1, f param2) {
      // $FF: Couldn't be decompiled
   }

   public int describeContents() {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      // $FF: Couldn't be decompiled
   }

   public void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
