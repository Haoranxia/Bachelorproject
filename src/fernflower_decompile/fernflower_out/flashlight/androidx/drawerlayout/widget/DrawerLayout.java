package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup {
   static final int[] a;
   static final boolean b;
   private static final int[] c;
   private static final boolean d;
   private float A;
   private Drawable B;
   private Drawable C;
   private Drawable D;
   private Object E;
   private boolean F;
   private Drawable G;
   private Drawable H;
   private Drawable I;
   private Drawable J;
   private final ArrayList K;
   private Rect L;
   private Matrix M;
   private final DrawerLayout.a e;
   private float f;
   private int g;
   private int h;
   private float i;
   private Paint j;
   private final androidx.customview.a.a k;
   private final androidx.customview.a.a l;
   private final DrawerLayout.d m;
   private final DrawerLayout.d n;
   private int o;
   private boolean p;
   private boolean q;
   private int r;
   private int s;
   private int t;
   private int u;
   private boolean v;
   private boolean w;
   private DrawerLayout.b x;
   private List y;
   private float z;

   static {
      // $FF: Couldn't be decompiled
   }

   private boolean a(float param1, float param2, View param3) {
      // $FF: Couldn't be decompiled
   }

   private boolean a(Drawable param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private boolean a(MotionEvent param1, View param2) {
      // $FF: Couldn't be decompiled
   }

   private MotionEvent b(MotionEvent param1, View param2) {
      // $FF: Couldn't be decompiled
   }

   static String c(int param0) {
      // $FF: Couldn't be decompiled
   }

   private void c(View param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   private void d() {
      // $FF: Couldn't be decompiled
   }

   private Drawable e() {
      // $FF: Couldn't be decompiled
   }

   private Drawable f() {
      // $FF: Couldn't be decompiled
   }

   private boolean g() {
      // $FF: Couldn't be decompiled
   }

   private boolean h() {
      // $FF: Couldn't be decompiled
   }

   static boolean l(View param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean m(View param0) {
      // $FF: Couldn't be decompiled
   }

   public int a(int param1) {
      // $FF: Couldn't be decompiled
   }

   public int a(View param1) {
      // $FF: Couldn't be decompiled
   }

   View a() {
      // $FF: Couldn't be decompiled
   }

   public void a(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   void a(int param1, int param2, View param3) {
      // $FF: Couldn't be decompiled
   }

   void a(View param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(View param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(DrawerLayout.b param1) {
      // $FF: Couldn't be decompiled
   }

   void a(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   boolean a(View param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public void addFocusables(ArrayList param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public void addView(View param1, int param2, LayoutParams param3) {
      // $FF: Couldn't be decompiled
   }

   View b(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void b() {
      // $FF: Couldn't be decompiled
   }

   void b(View param1) {
      // $FF: Couldn't be decompiled
   }

   void b(View param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   public void b(View param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public void b(DrawerLayout.b param1) {
      // $FF: Couldn't be decompiled
   }

   View c() {
      // $FF: Couldn't be decompiled
   }

   void c(View param1) {
      // $FF: Couldn't be decompiled
   }

   void c(View param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   protected boolean checkLayoutParams(LayoutParams param1) {
      // $FF: Couldn't be decompiled
   }

   public void computeScroll() {
      // $FF: Couldn't be decompiled
   }

   float d(View param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean dispatchGenericMotionEvent(MotionEvent param1) {
      // $FF: Couldn't be decompiled
   }

   protected boolean drawChild(Canvas param1, View param2, long param3) {
      // $FF: Couldn't be decompiled
   }

   int e(View param1) {
      // $FF: Couldn't be decompiled
   }

   boolean f(View param1) {
      // $FF: Couldn't be decompiled
   }

   boolean g(View param1) {
      // $FF: Couldn't be decompiled
   }

   protected LayoutParams generateDefaultLayoutParams() {
      // $FF: Couldn't be decompiled
   }

   public LayoutParams generateLayoutParams(AttributeSet param1) {
      // $FF: Couldn't be decompiled
   }

   protected LayoutParams generateLayoutParams(LayoutParams param1) {
      // $FF: Couldn't be decompiled
   }

   public float getDrawerElevation() {
      // $FF: Couldn't be decompiled
   }

   public Drawable getStatusBarBackgroundDrawable() {
      // $FF: Couldn't be decompiled
   }

   public void h(View param1) {
      // $FF: Couldn't be decompiled
   }

   public void i(View param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean j(View param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean k(View param1) {
      // $FF: Couldn't be decompiled
   }

   protected void onAttachedToWindow() {
      // $FF: Couldn't be decompiled
   }

   protected void onDetachedFromWindow() {
      // $FF: Couldn't be decompiled
   }

   public void onDraw(Canvas param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean onInterceptTouchEvent(MotionEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean onKeyDown(int param1, KeyEvent param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean onKeyUp(int param1, KeyEvent param2) {
      // $FF: Couldn't be decompiled
   }

   protected void onLayout(boolean param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @SuppressLint({"WrongConstant"})
   protected void onMeasure(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   protected void onRestoreInstanceState(Parcelable param1) {
      // $FF: Couldn't be decompiled
   }

   public void onRtlPropertiesChanged(int param1) {
      // $FF: Couldn't be decompiled
   }

   protected Parcelable onSaveInstanceState() {
      // $FF: Couldn't be decompiled
   }

   public boolean onTouchEvent(MotionEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public void requestDisallowInterceptTouchEvent(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void requestLayout() {
      // $FF: Couldn't be decompiled
   }

   public void setDrawerElevation(float param1) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public void setDrawerListener(DrawerLayout.b param1) {
      // $FF: Couldn't be decompiled
   }

   public void setDrawerLockMode(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setScrimColor(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setStatusBarBackground(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setStatusBarBackground(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   public void setStatusBarBackgroundColor(int param1) {
      // $FF: Couldn't be decompiled
   }

   protected static class SavedState extends AbsSavedState {
      public static final Creator CREATOR;
      int a;
      int b;
      int d;
      int e;
      int f;

      static {
         // $FF: Couldn't be decompiled
      }

      public SavedState(Parcel param1, ClassLoader param2) {
         // $FF: Couldn't be decompiled
      }

      public SavedState(Parcelable param1) {
         // $FF: Couldn't be decompiled
      }

      public void writeToParcel(Parcel param1, int param2) {
         // $FF: Couldn't be decompiled
      }
   }

   static final class a extends androidx.core.g.a {
      public void a(View param1, androidx.core.g.a.b param2) {
         // $FF: Couldn't be decompiled
      }
   }

   public interface b {
      void a(int var1);

      void a(View var1);

      void a(View var1, float var2);

      void b(View var1);
   }

   public static class c extends MarginLayoutParams {
      public int a;
      float b;
      boolean c;
      int d;

      public c(int param1, int param2) {
         // $FF: Couldn't be decompiled
      }

      public c(Context param1, AttributeSet param2) {
         // $FF: Couldn't be decompiled
      }

      public c(LayoutParams param1) {
         // $FF: Couldn't be decompiled
      }

      public c(MarginLayoutParams param1) {
         // $FF: Couldn't be decompiled
      }

      public c(DrawerLayout.c param1) {
         // $FF: Couldn't be decompiled
      }
   }

   private class d extends androidx.customview.a.a.a {
      // $FF: synthetic field
      final DrawerLayout a;
      private final int b;
      private androidx.customview.a.a c;
      private final Runnable d;

      private void b() {
         // $FF: Couldn't be decompiled
      }

      public int a(View param1) {
         // $FF: Couldn't be decompiled
      }

      public int a(View param1, int param2, int param3) {
         // $FF: Couldn't be decompiled
      }

      public void a() {
         // $FF: Couldn't be decompiled
      }

      public void a(int param1) {
         // $FF: Couldn't be decompiled
      }

      public void a(int param1, int param2) {
         // $FF: Couldn't be decompiled
      }

      public void a(View param1, float param2, float param3) {
         // $FF: Couldn't be decompiled
      }

      public void a(View param1, int param2) {
         // $FF: Couldn't be decompiled
      }

      public void a(View param1, int param2, int param3, int param4, int param5) {
         // $FF: Couldn't be decompiled
      }

      public int b(View param1, int param2, int param3) {
         // $FF: Couldn't be decompiled
      }

      public void b(int param1, int param2) {
         // $FF: Couldn't be decompiled
      }

      public boolean b(int param1) {
         // $FF: Couldn't be decompiled
      }

      public boolean b(View param1, int param2) {
         // $FF: Couldn't be decompiled
      }
   }
}
