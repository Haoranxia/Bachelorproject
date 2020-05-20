package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
   public static final Creator CREATOR;
   ArrayList a;
   ArrayList b;
   BackStackState[] c;
   String d;
   int e;

   static {
      // $FF: Couldn't be decompiled
   }

   public FragmentManagerState() {
      // $FF: Couldn't be decompiled
   }

   public FragmentManagerState(Parcel param1) {
      // $FF: Couldn't be decompiled
   }

   public int describeContents() {
      // $FF: Couldn't be decompiled
   }

   public void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
