package androidx.viewpager.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
   static final int[] a;
   private static final ViewPager.h ai;
   private static final Comparator e;
   private static final Interpolator f;
   private int A;
   private boolean B;
   private boolean C;
   private int D;
   private int E;
   private int F;
   private float G;
   private float H;
   private float I;
   private float J;
   private int K;
   private VelocityTracker L;
   private int M;
   private int N;
   private int O;
   private int P;
   private boolean Q;
   private EdgeEffect R;
   private EdgeEffect S;
   private boolean T;
   private boolean U;
   private boolean V;
   private int W;
   private List aa;
   private ViewPager.e ab;
   private ViewPager.e ac;
   private List ad;
   private ViewPager.f ae;
   private int af;
   private int ag;
   private ArrayList ah;
   private final Runnable aj;
   private int ak;
   androidx.viewpager.widget.a b;
   int c;
   private int d;
   private final ArrayList g;
   private final ViewPager.b h;
   private final Rect i;
   private int j;
   private Parcelable k;
   private ClassLoader l;
   private Scroller m;
   private boolean n;
   private ViewPager.g o;
   private int p;
   private Drawable q;
   private int r;
   private int s;
   private float t;
   private float u;
   private int v;
   private int w;
   private boolean x;
   private boolean y;
   private boolean z;

   static {
      // $FF: Couldn't be decompiled
   }

   private int a(int param1, float param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private Rect a(Rect param1, View param2) {
      // $FF: Couldn't be decompiled
   }

   private void a(int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private void a(int param1, boolean param2, int param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   private void a(MotionEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private void a(ViewPager.b param1, int param2, ViewPager.b param3) {
      // $FF: Couldn't be decompiled
   }

   private void a(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean a(float param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   private void b(int param1, float param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private void b(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean b(float param1) {
      // $FF: Couldn't be decompiled
   }

   private void c(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean c(View param0) {
      // $FF: Couldn't be decompiled
   }

   private boolean d(int param1) {
      // $FF: Couldn't be decompiled
   }

   private void e() {
      // $FF: Couldn't be decompiled
   }

   private void e(int param1) {
      // $FF: Couldn't be decompiled
   }

   private void f() {
      // $FF: Couldn't be decompiled
   }

   private void f(int param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean g() {
      // $FF: Couldn't be decompiled
   }

   private int getClientWidth() {
      // $FF: Couldn't be decompiled
   }

   private ViewPager.b h() {
      // $FF: Couldn't be decompiled
   }

   private void i() {
      // $FF: Couldn't be decompiled
   }

   private void setScrollingCacheEnabled(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   float a(float param1) {
      // $FF: Couldn't be decompiled
   }

   ViewPager.b a(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   ViewPager.b a(View param1) {
      // $FF: Couldn't be decompiled
   }

   void a() {
      // $FF: Couldn't be decompiled
   }

   void a(int param1) {
      // $FF: Couldn't be decompiled
   }

   protected void a(int param1, float param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   void a(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public void a(int param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   void a(int param1, boolean param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   void a(int param1, boolean param2, boolean param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public boolean a(KeyEvent param1) {
      // $FF: Couldn't be decompiled
   }

   protected boolean a(View param1, boolean param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   public void addFocusables(ArrayList param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public void addTouchables(ArrayList param1) {
      // $FF: Couldn't be decompiled
   }

   public void addView(View param1, int param2, LayoutParams param3) {
      // $FF: Couldn't be decompiled
   }

   ViewPager.b b(int param1) {
      // $FF: Couldn't be decompiled
   }

   ViewPager.b b(View param1) {
      // $FF: Couldn't be decompiled
   }

   void b() {
      // $FF: Couldn't be decompiled
   }

   boolean c() {
      // $FF: Couldn't be decompiled
   }

   public boolean c(int param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean canScrollHorizontally(int param1) {
      // $FF: Couldn't be decompiled
   }

   protected boolean checkLayoutParams(LayoutParams param1) {
      // $FF: Couldn't be decompiled
   }

   public void computeScroll() {
      // $FF: Couldn't be decompiled
   }

   boolean d() {
      // $FF: Couldn't be decompiled
   }

   public boolean dispatchKeyEvent(KeyEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public void draw(Canvas param1) {
      // $FF: Couldn't be decompiled
   }

   protected void drawableStateChanged() {
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

   public androidx.viewpager.widget.a getAdapter() {
      // $FF: Couldn't be decompiled
   }

   protected int getChildDrawingOrder(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public int getCurrentItem() {
      // $FF: Couldn't be decompiled
   }

   public int getOffscreenPageLimit() {
      // $FF: Couldn't be decompiled
   }

   public int getPageMargin() {
      // $FF: Couldn't be decompiled
   }

   protected void onAttachedToWindow() {
      // $FF: Couldn't be decompiled
   }

   protected void onDetachedFromWindow() {
      // $FF: Couldn't be decompiled
   }

   protected void onDraw(Canvas param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean onInterceptTouchEvent(MotionEvent param1) {
      // $FF: Couldn't be decompiled
   }

   protected void onLayout(boolean param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   protected void onMeasure(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   protected boolean onRequestFocusInDescendants(int param1, Rect param2) {
      // $FF: Couldn't be decompiled
   }

   public void onRestoreInstanceState(Parcelable param1) {
      // $FF: Couldn't be decompiled
   }

   public Parcelable onSaveInstanceState() {
      // $FF: Couldn't be decompiled
   }

   protected void onSizeChanged(int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public boolean onTouchEvent(MotionEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public void removeView(View param1) {
      // $FF: Couldn't be decompiled
   }

   public void setAdapter(androidx.viewpager.widget.a param1) {
      // $FF: Couldn't be decompiled
   }

   public void setCurrentItem(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setOffscreenPageLimit(int param1) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public void setOnPageChangeListener(ViewPager.e param1) {
      // $FF: Couldn't be decompiled
   }

   public void setPageMargin(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setPageMarginDrawable(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setPageMarginDrawable(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   void setScrollState(int param1) {
      // $FF: Couldn't be decompiled
   }

   protected boolean verifyDrawable(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   public static class SavedState extends AbsSavedState {
      public static final Creator CREATOR;
      int a;
      Parcelable b;
      ClassLoader d;

      static {
         // $FF: Couldn't be decompiled
      }

      SavedState(Parcel param1, ClassLoader param2) {
         // $FF: Couldn't be decompiled
      }

      public SavedState(Parcelable param1) {
         // $FF: Couldn't be decompiled
      }

      public String toString() {
         // $FF: Couldn't be decompiled
      }

      public void writeToParcel(Parcel param1, int param2) {
         // $FF: Couldn't be decompiled
      }
   }

   @Inherited
   @Retention(RetentionPolicy.RUNTIME)
   @Target({ElementType.TYPE})
   public @interface a {
   }

   static class b {
      Object a;
      int b;
      boolean c;
      float d;
      float e;

      b() {
         // $FF: Couldn't be decompiled
      }
   }

   public static class c extends LayoutParams {
      public boolean a;
      public int b;
      float c;
      boolean d;
      int e;
      int f;

      public c() {
         // $FF: Couldn't be decompiled
      }

      public c(Context param1, AttributeSet param2) {
         // $FF: Couldn't be decompiled
      }
   }

   public interface d {
      void a(ViewPager var1, androidx.viewpager.widget.a var2, androidx.viewpager.widget.a var3);
   }

   public interface e {
      void a(int var1);

      void a(int var1, float var2, int var3);

      void b(int var1);
   }

   public interface f {
      void a(View var1, float var2);
   }

   private class g extends DataSetObserver {
      // $FF: synthetic field
      final ViewPager a;

      g(ViewPager param1) {
         // $FF: Couldn't be decompiled
      }

      public void onChanged() {
         // $FF: Couldn't be decompiled
      }

      public void onInvalidated() {
         // $FF: Couldn't be decompiled
      }
   }

   static class h implements Comparator {
      h() {
         // $FF: Couldn't be decompiled
      }

      public int a(View param1, View param2) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      public int compare(Object param1, Object param2) {
         // $FF: Couldn't be decompiled
      }
   }
}
