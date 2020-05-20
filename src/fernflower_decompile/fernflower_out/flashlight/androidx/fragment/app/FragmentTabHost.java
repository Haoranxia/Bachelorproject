package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

@Deprecated
public class FragmentTabHost extends TabHost implements OnTabChangeListener {
   private final ArrayList a;
   private Context b;
   private h c;
   private int d;
   private OnTabChangeListener e;
   private FragmentTabHost.a f;
   private boolean g;

   private FragmentTabHost.a a(String param1) {
      // $FF: Couldn't be decompiled
   }

   private k a(String param1, k param2) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   protected void onAttachedToWindow() {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   protected void onDetachedFromWindow() {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   protected void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable param1) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   protected Parcelable onSaveInstanceState() {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public void onTabChanged(String param1) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public void setOnTabChangedListener(OnTabChangeListener param1) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public void setup() {
      // $FF: Couldn't be decompiled
   }

   static class SavedState extends BaseSavedState {
      public static final Creator CREATOR;
      String a;

      static {
         // $FF: Couldn't be decompiled
      }

      SavedState(Parcel param1) {
         // $FF: Couldn't be decompiled
      }

      SavedState(Parcelable param1) {
         // $FF: Couldn't be decompiled
      }

      public String toString() {
         // $FF: Couldn't be decompiled
      }

      public void writeToParcel(Parcel param1, int param2) {
         // $FF: Couldn't be decompiled
      }
   }

   static final class a {
      final String a;
      final Class b;
      final Bundle c;
      Fragment d;
   }
}
