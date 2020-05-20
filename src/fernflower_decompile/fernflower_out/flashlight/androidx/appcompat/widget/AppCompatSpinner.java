package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.BaseSavedState;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class AppCompatSpinner extends Spinner implements androidx.core.g.r {
   private static final int[] c;
   int a;
   final Rect b;
   private final e d;
   private final Context e;
   private ag f;
   private SpinnerAdapter g;
   private final boolean h;
   private AppCompatSpinner.d i;

   static {
      // $FF: Couldn't be decompiled
   }

   public AppCompatSpinner(Context param1, AttributeSet param2) {
      // $FF: Couldn't be decompiled
   }

   public AppCompatSpinner(Context param1, AttributeSet param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public AppCompatSpinner(Context param1, AttributeSet param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public AppCompatSpinner(Context param1, AttributeSet param2, int param3, int param4, Theme param5) {
      // $FF: Couldn't be decompiled
   }

   int a(SpinnerAdapter param1, Drawable param2) {
      // $FF: Couldn't be decompiled
   }

   void a() {
      // $FF: Couldn't be decompiled
   }

   protected void drawableStateChanged() {
      // $FF: Couldn't be decompiled
   }

   public int getDropDownHorizontalOffset() {
      // $FF: Couldn't be decompiled
   }

   public int getDropDownVerticalOffset() {
      // $FF: Couldn't be decompiled
   }

   public int getDropDownWidth() {
      // $FF: Couldn't be decompiled
   }

   final AppCompatSpinner.d getInternalPopup() {
      // $FF: Couldn't be decompiled
   }

   public Drawable getPopupBackground() {
      // $FF: Couldn't be decompiled
   }

   public Context getPopupContext() {
      // $FF: Couldn't be decompiled
   }

   public CharSequence getPrompt() {
      // $FF: Couldn't be decompiled
   }

   public ColorStateList getSupportBackgroundTintList() {
      // $FF: Couldn't be decompiled
   }

   public Mode getSupportBackgroundTintMode() {
      // $FF: Couldn't be decompiled
   }

   protected void onDetachedFromWindow() {
      // $FF: Couldn't be decompiled
   }

   protected void onMeasure(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public void onRestoreInstanceState(Parcelable param1) {
      // $FF: Couldn't be decompiled
   }

   public Parcelable onSaveInstanceState() {
      // $FF: Couldn't be decompiled
   }

   public boolean onTouchEvent(MotionEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean performClick() {
      // $FF: Couldn't be decompiled
   }

   public void setAdapter(SpinnerAdapter param1) {
      // $FF: Couldn't be decompiled
   }

   public void setBackgroundDrawable(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   public void setBackgroundResource(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setDropDownHorizontalOffset(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setDropDownVerticalOffset(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setDropDownWidth(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setPopupBackgroundDrawable(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   public void setPopupBackgroundResource(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setPrompt(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   public void setSupportBackgroundTintList(ColorStateList param1) {
      // $FF: Couldn't be decompiled
   }

   public void setSupportBackgroundTintMode(Mode param1) {
      // $FF: Couldn't be decompiled
   }

   static class SavedState extends BaseSavedState {
      public static final Creator CREATOR;
      boolean a;

      static {
         // $FF: Couldn't be decompiled
      }

      SavedState(Parcel param1) {
         // $FF: Couldn't be decompiled
      }

      SavedState(Parcelable param1) {
         // $FF: Couldn't be decompiled
      }

      public void writeToParcel(Parcel param1, int param2) {
         // $FF: Couldn't be decompiled
      }
   }

   class a implements OnClickListener, AppCompatSpinner.d {
      androidx.appcompat.app.b a;
      // $FF: synthetic field
      final AppCompatSpinner b;
      private ListAdapter c;
      private CharSequence d;

      a(AppCompatSpinner param1) {
         // $FF: Couldn't be decompiled
      }

      public CharSequence a() {
         // $FF: Couldn't be decompiled
      }

      public void a(int param1) {
         // $FF: Couldn't be decompiled
      }

      public void a(int param1, int param2) {
         // $FF: Couldn't be decompiled
      }

      public void a(Drawable param1) {
         // $FF: Couldn't be decompiled
      }

      public void a(ListAdapter param1) {
         // $FF: Couldn't be decompiled
      }

      public void a(CharSequence param1) {
         // $FF: Couldn't be decompiled
      }

      public Drawable b() {
         // $FF: Couldn't be decompiled
      }

      public void b(int param1) {
         // $FF: Couldn't be decompiled
      }

      public int b_() {
         // $FF: Couldn't be decompiled
      }

      public void c() {
         // $FF: Couldn't be decompiled
      }

      public void c(int param1) {
         // $FF: Couldn't be decompiled
      }

      public boolean d() {
         // $FF: Couldn't be decompiled
      }

      public int f() {
         // $FF: Couldn't be decompiled
      }

      public void onClick(DialogInterface param1, int param2) {
         // $FF: Couldn't be decompiled
      }
   }

   private static class b implements ListAdapter, SpinnerAdapter {
      private SpinnerAdapter a;
      private ListAdapter b;

      public b(SpinnerAdapter param1, Theme param2) {
         // $FF: Couldn't be decompiled
      }

      public boolean areAllItemsEnabled() {
         // $FF: Couldn't be decompiled
      }

      public int getCount() {
         // $FF: Couldn't be decompiled
      }

      public View getDropDownView(int param1, View param2, ViewGroup param3) {
         // $FF: Couldn't be decompiled
      }

      public Object getItem(int param1) {
         // $FF: Couldn't be decompiled
      }

      public long getItemId(int param1) {
         // $FF: Couldn't be decompiled
      }

      public int getItemViewType(int param1) {
         // $FF: Couldn't be decompiled
      }

      public View getView(int param1, View param2, ViewGroup param3) {
         // $FF: Couldn't be decompiled
      }

      public int getViewTypeCount() {
         // $FF: Couldn't be decompiled
      }

      public boolean hasStableIds() {
         // $FF: Couldn't be decompiled
      }

      public boolean isEmpty() {
         // $FF: Couldn't be decompiled
      }

      public boolean isEnabled(int param1) {
         // $FF: Couldn't be decompiled
      }

      public void registerDataSetObserver(DataSetObserver param1) {
         // $FF: Couldn't be decompiled
      }

      public void unregisterDataSetObserver(DataSetObserver param1) {
         // $FF: Couldn't be decompiled
      }
   }

   class c extends ai implements AppCompatSpinner.d {
      ListAdapter a;
      // $FF: synthetic field
      final AppCompatSpinner b;
      private CharSequence h;
      private final Rect i;
      private int j;

      public c(AppCompatSpinner param1, Context param2, AttributeSet param3, int param4) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static void a(AppCompatSpinner.c param0) {
         // $FF: Couldn't be decompiled
      }

      public CharSequence a() {
         // $FF: Couldn't be decompiled
      }

      public void a(int param1, int param2) {
         // $FF: Couldn't be decompiled
      }

      public void a(ListAdapter param1) {
         // $FF: Couldn't be decompiled
      }

      public void a(CharSequence param1) {
         // $FF: Couldn't be decompiled
      }

      boolean a(View param1) {
         // $FF: Couldn't be decompiled
      }

      public void c(int param1) {
         // $FF: Couldn't be decompiled
      }

      void g() {
         // $FF: Couldn't be decompiled
      }

      public int h() {
         // $FF: Couldn't be decompiled
      }
   }

   interface d {
      CharSequence a();

      void a(int var1);

      void a(int var1, int var2);

      void a(Drawable var1);

      void a(ListAdapter var1);

      void a(CharSequence var1);

      Drawable b();

      void b(int var1);

      int b_();

      void c();

      void c(int var1);

      boolean d();

      int f();
   }
}
