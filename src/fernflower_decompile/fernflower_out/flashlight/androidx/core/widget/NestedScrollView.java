package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.g.n;
import androidx.core.g.o;

public class NestedScrollView extends FrameLayout implements androidx.core.g.j, n {
   private static final NestedScrollView.a w;
   private static final int[] x;
   private float A;
   private NestedScrollView.b B;
   private long a;
   private final Rect b;
   private OverScroller c;
   private EdgeEffect d;
   private EdgeEffect e;
   private int f;
   private boolean g;
   private boolean h;
   private View i;
   private boolean j;
   private VelocityTracker k;
   private boolean l;
   private boolean m;
   private int n;
   private int o;
   private int p;
   private int q;
   private final int[] r;
   private final int[] s;
   private int t;
   private int u;
   private NestedScrollView.SavedState v;
   private final o y;
   private final androidx.core.g.k z;

   static {
      // $FF: Couldn't be decompiled
   }

   public NestedScrollView(Context param1, AttributeSet param2) {
      // $FF: Couldn't be decompiled
   }

   public NestedScrollView(Context param1, AttributeSet param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private View a(boolean param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private void a() {
      // $FF: Couldn't be decompiled
   }

   private void a(int param1, int param2, int[] param3) {
      // $FF: Couldn't be decompiled
   }

   private void a(MotionEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private void a(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean a(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private boolean a(Rect param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   private boolean a(View param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean a(View param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private static boolean a(View param0, View param1) {
      // $FF: Couldn't be decompiled
   }

   private static int b(int param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private void b(View param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean b() {
      // $FF: Couldn't be decompiled
   }

   private void c() {
      // $FF: Couldn't be decompiled
   }

   private void d() {
      // $FF: Couldn't be decompiled
   }

   private boolean d(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private void e() {
      // $FF: Couldn't be decompiled
   }

   private void f() {
      // $FF: Couldn't be decompiled
   }

   private void g() {
      // $FF: Couldn't be decompiled
   }

   private void g(int param1) {
      // $FF: Couldn't be decompiled
   }

   private float getVerticalScrollFactorCompat() {
      // $FF: Couldn't be decompiled
   }

   private void h() {
      // $FF: Couldn't be decompiled
   }

   protected int a(Rect param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(int param1, int param2, int param3, int param4, int[] param5, int param6, int[] param7) {
      // $FF: Couldn't be decompiled
   }

   public void a(View param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(View param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   public void a(View param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
      // $FF: Couldn't be decompiled
   }

   public void a(View param1, int param2, int param3, int[] param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   public boolean a(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   boolean a(int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, boolean param9) {
      // $FF: Couldn't be decompiled
   }

   public boolean a(int param1, int param2, int[] param3, int[] param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   public boolean a(KeyEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean a(View param1, View param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public void addView(View param1) {
      // $FF: Couldn't be decompiled
   }

   public void addView(View param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public void addView(View param1, int param2, LayoutParams param3) {
      // $FF: Couldn't be decompiled
   }

   public void addView(View param1, LayoutParams param2) {
      // $FF: Couldn't be decompiled
   }

   public final void b(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public void b(View param1, View param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public boolean b(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void c(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean c(int param1) {
      // $FF: Couldn't be decompiled
   }

   public int computeHorizontalScrollExtent() {
      // $FF: Couldn't be decompiled
   }

   public int computeHorizontalScrollOffset() {
      // $FF: Couldn't be decompiled
   }

   public int computeHorizontalScrollRange() {
      // $FF: Couldn't be decompiled
   }

   public void computeScroll() {
      // $FF: Couldn't be decompiled
   }

   public int computeVerticalScrollExtent() {
      // $FF: Couldn't be decompiled
   }

   public int computeVerticalScrollOffset() {
      // $FF: Couldn't be decompiled
   }

   public int computeVerticalScrollRange() {
      // $FF: Couldn't be decompiled
   }

   public boolean d(int param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean dispatchKeyEvent(KeyEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean dispatchNestedFling(float param1, float param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   public boolean dispatchNestedPreFling(float param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean dispatchNestedPreScroll(int param1, int param2, int[] param3, int[] param4) {
      // $FF: Couldn't be decompiled
   }

   public boolean dispatchNestedScroll(int param1, int param2, int param3, int param4, int[] param5) {
      // $FF: Couldn't be decompiled
   }

   public void draw(Canvas param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean e(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void f(int param1) {
      // $FF: Couldn't be decompiled
   }

   protected float getBottomFadingEdgeStrength() {
      // $FF: Couldn't be decompiled
   }

   public int getMaxScrollAmount() {
      // $FF: Couldn't be decompiled
   }

   public int getNestedScrollAxes() {
      // $FF: Couldn't be decompiled
   }

   int getScrollRange() {
      // $FF: Couldn't be decompiled
   }

   protected float getTopFadingEdgeStrength() {
      // $FF: Couldn't be decompiled
   }

   public boolean hasNestedScrollingParent() {
      // $FF: Couldn't be decompiled
   }

   public boolean isNestedScrollingEnabled() {
      // $FF: Couldn't be decompiled
   }

   protected void measureChild(View param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   protected void measureChildWithMargins(View param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   public void onAttachedToWindow() {
      // $FF: Couldn't be decompiled
   }

   public boolean onGenericMotionEvent(MotionEvent param1) {
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

   protected void onOverScrolled(int param1, int param2, boolean param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   protected boolean onRequestFocusInDescendants(int param1, Rect param2) {
      // $FF: Couldn't be decompiled
   }

   protected void onRestoreInstanceState(Parcelable param1) {
      // $FF: Couldn't be decompiled
   }

   protected Parcelable onSaveInstanceState() {
      // $FF: Couldn't be decompiled
   }

   protected void onScrollChanged(int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   protected void onSizeChanged(int param1, int param2, int param3, int param4) {
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

   public void requestChildFocus(View param1, View param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean requestChildRectangleOnScreen(View param1, Rect param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   public void requestDisallowInterceptTouchEvent(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void requestLayout() {
      // $FF: Couldn't be decompiled
   }

   public void scrollTo(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public void setFillViewport(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void setNestedScrollingEnabled(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void setOnScrollChangeListener(NestedScrollView.b param1) {
      // $FF: Couldn't be decompiled
   }

   public void setSmoothScrollingEnabled(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean shouldDelayChildPressedState() {
      // $FF: Couldn't be decompiled
   }

   public boolean startNestedScroll(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void stopNestedScroll() {
      // $FF: Couldn't be decompiled
   }

   static class SavedState extends BaseSavedState {
      public static final Creator CREATOR;
      public int a;

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

   static class a extends androidx.core.g.a {
      a() {
         // $FF: Couldn't be decompiled
      }

      public void a(View param1, androidx.core.g.a.b param2) {
         // $FF: Couldn't be decompiled
      }

      public boolean a(View param1, int param2, Bundle param3) {
         // $FF: Couldn't be decompiled
      }

      public void d(View param1, AccessibilityEvent param2) {
         // $FF: Couldn't be decompiled
      }
   }

   public interface b {
      void a(NestedScrollView var1, int var2, int var3, int var4, int var5);
   }
}
