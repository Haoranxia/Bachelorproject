package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.core.g.aa;
import androidx.core.g.m;
import androidx.core.g.o;
import androidx.core.g.p;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Comparator;
import java.util.List;

public class CoordinatorLayout extends ViewGroup implements m {
   static final String a;
   static final Class[] b;
   static final ThreadLocal c;
   static final Comparator d;
   private static final androidx.core.f.d.a f;
   OnHierarchyChangeListener e;
   private final List g;
   private final androidx.coordinatorlayout.widget.a h;
   private final List i;
   private final int[] j;
   private Paint k;
   private boolean l;
   private boolean m;
   private int[] n;
   private View o;
   private View p;
   private CoordinatorLayout.e q;
   private boolean r;
   private aa s;
   private boolean t;
   private Drawable u;
   private p v;
   private final o w;

   static {
      // $FF: Couldn't be decompiled
   }

   private static int a(int param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   static CoordinatorLayout.b a(Context param0, AttributeSet param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   private static void a(Rect param0) {
      // $FF: Couldn't be decompiled
   }

   private void a(View param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private void a(View param1, int param2, Rect param3, Rect param4, CoordinatorLayout.d param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   private void a(View param1, Rect param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private void a(View param1, View param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private void a(CoordinatorLayout.d param1, Rect param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private void a(List param1) {
      // $FF: Couldn't be decompiled
   }

   private void a(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean a(MotionEvent param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private int b(int param1) {
      // $FF: Couldn't be decompiled
   }

   private aa b(aa param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean b(View param1) {
      // $FF: Couldn't be decompiled
   }

   private static int c(int param0) {
      // $FF: Couldn't be decompiled
   }

   private static int d(int param0) {
      // $FF: Couldn't be decompiled
   }

   private void d(View param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private static int e(int param0) {
      // $FF: Couldn't be decompiled
   }

   private static Rect e() {
      // $FF: Couldn't be decompiled
   }

   private void e(View param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private void f() {
      // $FF: Couldn't be decompiled
   }

   private void f(View param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private void g() {
      // $FF: Couldn't be decompiled
   }

   public CoordinatorLayout.d a(AttributeSet param1) {
      // $FF: Couldn't be decompiled
   }

   CoordinatorLayout.d a(View param1) {
      // $FF: Couldn't be decompiled
   }

   protected CoordinatorLayout.d a(LayoutParams param1) {
      // $FF: Couldn't be decompiled
   }

   final aa a(aa param1) {
      // $FF: Couldn't be decompiled
   }

   void a() {
      // $FF: Couldn't be decompiled
   }

   final void a(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(View param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(View param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   public void a(View param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   public void a(View param1, int param2, int param3, int[] param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   void a(View param1, int param2, Rect param3, Rect param4) {
      // $FF: Couldn't be decompiled
   }

   void a(View param1, Rect param2) {
      // $FF: Couldn't be decompiled
   }

   void a(View param1, boolean param2, Rect param3) {
      // $FF: Couldn't be decompiled
   }

   public boolean a(View param1, View param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   void b() {
      // $FF: Couldn't be decompiled
   }

   public void b(View param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   void b(View param1, Rect param2) {
      // $FF: Couldn't be decompiled
   }

   public void b(View param1, View param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   void c() {
      // $FF: Couldn't be decompiled
   }

   void c(View param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   void c(View param1, Rect param2) {
      // $FF: Couldn't be decompiled
   }

   protected boolean checkLayoutParams(LayoutParams param1) {
      // $FF: Couldn't be decompiled
   }

   protected CoordinatorLayout.d d() {
      // $FF: Couldn't be decompiled
   }

   protected boolean drawChild(Canvas param1, View param2, long param3) {
      // $FF: Couldn't be decompiled
   }

   protected void drawableStateChanged() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   protected LayoutParams generateDefaultLayoutParams() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public LayoutParams generateLayoutParams(AttributeSet param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   protected LayoutParams generateLayoutParams(LayoutParams param1) {
      // $FF: Couldn't be decompiled
   }

   final List getDependencySortedChildren() {
      // $FF: Couldn't be decompiled
   }

   public final aa getLastWindowInsets() {
      // $FF: Couldn't be decompiled
   }

   public int getNestedScrollAxes() {
      // $FF: Couldn't be decompiled
   }

   public Drawable getStatusBarBackground() {
      // $FF: Couldn't be decompiled
   }

   protected int getSuggestedMinimumHeight() {
      // $FF: Couldn't be decompiled
   }

   protected int getSuggestedMinimumWidth() {
      // $FF: Couldn't be decompiled
   }

   public void onAttachedToWindow() {
      // $FF: Couldn't be decompiled
   }

   public void onDetachedFromWindow() {
      // $FF: Couldn't be decompiled
   }

   public void onDraw(Canvas param1) {
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

   public boolean onNestedFling(View param1, float param2, float param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   public boolean onNestedPreFling(View param1, float param2, float param3) {
      // $FF: Couldn't be decompiled
   }

   public void onNestedPreScroll(View param1, int param2, int param3, int[] param4) {
      // $FF: Couldn't be decompiled
   }

   public void onNestedScroll(View param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   public void onNestedScrollAccepted(View param1, View param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   protected void onRestoreInstanceState(Parcelable param1) {
      // $FF: Couldn't be decompiled
   }

   protected Parcelable onSaveInstanceState() {
      // $FF: Couldn't be decompiled
   }

   public boolean onStartNestedScroll(View param1, View param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public void onStopNestedScroll(View param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean onTouchEvent(MotionEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean requestChildRectangleOnScreen(View param1, Rect param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   public void requestDisallowInterceptTouchEvent(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void setFitsSystemWindows(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void setOnHierarchyChangeListener(OnHierarchyChangeListener param1) {
      // $FF: Couldn't be decompiled
   }

   public void setStatusBarBackground(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   public void setStatusBarBackgroundColor(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setStatusBarBackgroundResource(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setVisibility(int param1) {
      // $FF: Couldn't be decompiled
   }

   protected boolean verifyDrawable(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   protected static class SavedState extends AbsSavedState {
      public static final Creator CREATOR;
      SparseArray a;

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

   public interface a {
      CoordinatorLayout.b a();
   }

   public abstract static class b {
      public b() {
         // $FF: Couldn't be decompiled
      }

      public int a(CoordinatorLayout param1, View param2) {
         // $FF: Couldn't be decompiled
      }

      public aa a(CoordinatorLayout param1, View param2, aa param3) {
         // $FF: Couldn't be decompiled
      }

      public void a() {
         // $FF: Couldn't be decompiled
      }

      public void a(CoordinatorLayout.d param1) {
         // $FF: Couldn't be decompiled
      }

      public void a(CoordinatorLayout param1, View param2, Parcelable param3) {
         // $FF: Couldn't be decompiled
      }

      public void a(CoordinatorLayout param1, View param2, View param3, int param4) {
         // $FF: Couldn't be decompiled
      }

      @Deprecated
      public void a(CoordinatorLayout param1, View param2, View param3, int param4, int param5, int param6, int param7) {
         // $FF: Couldn't be decompiled
      }

      public void a(CoordinatorLayout param1, View param2, View param3, int param4, int param5, int param6, int param7, int param8) {
         // $FF: Couldn't be decompiled
      }

      @Deprecated
      public void a(CoordinatorLayout param1, View param2, View param3, int param4, int param5, int[] param6) {
         // $FF: Couldn't be decompiled
      }

      public void a(CoordinatorLayout param1, View param2, View param3, int param4, int param5, int[] param6, int param7) {
         // $FF: Couldn't be decompiled
      }

      public boolean a(CoordinatorLayout param1, View param2, int param3) {
         // $FF: Couldn't be decompiled
      }

      public boolean a(CoordinatorLayout param1, View param2, int param3, int param4, int param5, int param6) {
         // $FF: Couldn't be decompiled
      }

      public boolean a(CoordinatorLayout param1, View param2, Rect param3) {
         // $FF: Couldn't be decompiled
      }

      public boolean a(CoordinatorLayout param1, View param2, Rect param3, boolean param4) {
         // $FF: Couldn't be decompiled
      }

      public boolean a(CoordinatorLayout param1, View param2, MotionEvent param3) {
         // $FF: Couldn't be decompiled
      }

      public boolean a(CoordinatorLayout param1, View param2, View param3) {
         // $FF: Couldn't be decompiled
      }

      public boolean a(CoordinatorLayout param1, View param2, View param3, float param4, float param5) {
         // $FF: Couldn't be decompiled
      }

      public boolean a(CoordinatorLayout param1, View param2, View param3, float param4, float param5, boolean param6) {
         // $FF: Couldn't be decompiled
      }

      @Deprecated
      public boolean a(CoordinatorLayout param1, View param2, View param3, View param4, int param5) {
         // $FF: Couldn't be decompiled
      }

      public boolean a(CoordinatorLayout param1, View param2, View param3, View param4, int param5, int param6) {
         // $FF: Couldn't be decompiled
      }

      public float b(CoordinatorLayout param1, View param2) {
         // $FF: Couldn't be decompiled
      }

      @Deprecated
      public void b(CoordinatorLayout param1, View param2, View param3, View param4, int param5) {
         // $FF: Couldn't be decompiled
      }

      public void b(CoordinatorLayout param1, View param2, View param3, View param4, int param5, int param6) {
         // $FF: Couldn't be decompiled
      }

      public boolean b(CoordinatorLayout param1, View param2, MotionEvent param3) {
         // $FF: Couldn't be decompiled
      }

      public boolean b(CoordinatorLayout param1, View param2, View param3) {
         // $FF: Couldn't be decompiled
      }

      public void c(CoordinatorLayout param1, View param2, View param3) {
         // $FF: Couldn't be decompiled
      }

      public boolean c(CoordinatorLayout param1, View param2) {
         // $FF: Couldn't be decompiled
      }

      public Parcelable d(CoordinatorLayout param1, View param2) {
         // $FF: Couldn't be decompiled
      }

      @Deprecated
      public void d(CoordinatorLayout param1, View param2, View param3) {
         // $FF: Couldn't be decompiled
      }
   }

   @Deprecated
   @Retention(RetentionPolicy.RUNTIME)
   public @interface c {
      Class a();
   }

   public static class d extends MarginLayoutParams {
      CoordinatorLayout.b a;
      boolean b;
      public int c;
      public int d;
      public int e;
      int f;
      public int g;
      public int h;
      int i;
      int j;
      View k;
      View l;
      final Rect m;
      Object n;
      private boolean o;
      private boolean p;
      private boolean q;
      private boolean r;

      public d(int param1, int param2) {
         // $FF: Couldn't be decompiled
      }

      d(Context param1, AttributeSet param2) {
         // $FF: Couldn't be decompiled
      }

      public d(LayoutParams param1) {
         // $FF: Couldn't be decompiled
      }

      public d(MarginLayoutParams param1) {
         // $FF: Couldn't be decompiled
      }

      public d(CoordinatorLayout.d param1) {
         // $FF: Couldn't be decompiled
      }

      private void a(View param1, CoordinatorLayout param2) {
         // $FF: Couldn't be decompiled
      }

      private boolean a(View param1, int param2) {
         // $FF: Couldn't be decompiled
      }

      private boolean b(View param1, CoordinatorLayout param2) {
         // $FF: Couldn't be decompiled
      }

      public CoordinatorLayout.b a() {
         // $FF: Couldn't be decompiled
      }

      void a(int param1) {
         // $FF: Couldn't be decompiled
      }

      void a(int param1, boolean param2) {
         // $FF: Couldn't be decompiled
      }

      void a(Rect param1) {
         // $FF: Couldn't be decompiled
      }

      public void a(CoordinatorLayout.b param1) {
         // $FF: Couldn't be decompiled
      }

      void a(boolean param1) {
         // $FF: Couldn't be decompiled
      }

      boolean a(CoordinatorLayout param1, View param2) {
         // $FF: Couldn't be decompiled
      }

      boolean a(CoordinatorLayout param1, View param2, View param3) {
         // $FF: Couldn't be decompiled
      }

      Rect b() {
         // $FF: Couldn't be decompiled
      }

      View b(CoordinatorLayout param1, View param2) {
         // $FF: Couldn't be decompiled
      }

      boolean b(int param1) {
         // $FF: Couldn't be decompiled
      }

      boolean c() {
         // $FF: Couldn't be decompiled
      }

      boolean d() {
         // $FF: Couldn't be decompiled
      }

      void e() {
         // $FF: Couldn't be decompiled
      }

      boolean f() {
         // $FF: Couldn't be decompiled
      }

      void g() {
         // $FF: Couldn't be decompiled
      }
   }

   class e implements OnPreDrawListener {
      // $FF: synthetic field
      final CoordinatorLayout a;

      e(CoordinatorLayout param1) {
         // $FF: Couldn't be decompiled
      }

      public boolean onPreDraw() {
         // $FF: Couldn't be decompiled
      }
   }

   static class f implements Comparator {
      f() {
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
