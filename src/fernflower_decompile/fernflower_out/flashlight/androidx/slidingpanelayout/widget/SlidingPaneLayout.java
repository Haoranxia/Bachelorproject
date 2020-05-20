package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {
   View a;
   float b;
   int c;
   boolean d;
   final androidx.customview.a.a e;
   boolean f;
   final ArrayList g;
   private int h;
   private int i;
   private Drawable j;
   private Drawable k;
   private final int l;
   private boolean m;
   private float n;
   private int o;
   private float p;
   private float q;
   private SlidingPaneLayout.c r;
   private boolean s;
   private final Rect t;
   private Method u;
   private Field v;
   private boolean w;

   private void a(float param1) {
      // $FF: Couldn't be decompiled
   }

   private void a(View param1, float param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private boolean a(View param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private boolean b(View param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private static boolean d(View param0) {
      // $FF: Couldn't be decompiled
   }

   void a() {
      // $FF: Couldn't be decompiled
   }

   void a(View param1) {
      // $FF: Couldn't be decompiled
   }

   boolean a(float param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   void b(View param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean b() {
      // $FF: Couldn't be decompiled
   }

   public boolean c() {
      // $FF: Couldn't be decompiled
   }

   boolean c(View param1) {
      // $FF: Couldn't be decompiled
   }

   protected boolean checkLayoutParams(LayoutParams param1) {
      // $FF: Couldn't be decompiled
   }

   public void computeScroll() {
      // $FF: Couldn't be decompiled
   }

   public boolean d() {
      // $FF: Couldn't be decompiled
   }

   public void draw(Canvas param1) {
      // $FF: Couldn't be decompiled
   }

   protected boolean drawChild(Canvas param1, View param2, long param3) {
      // $FF: Couldn't be decompiled
   }

   public boolean e() {
      // $FF: Couldn't be decompiled
   }

   boolean f() {
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

   public int getCoveredFadeColor() {
      // $FF: Couldn't be decompiled
   }

   public int getParallaxDistance() {
      // $FF: Couldn't be decompiled
   }

   public int getSliderFadeColor() {
      // $FF: Couldn't be decompiled
   }

   protected void onAttachedToWindow() {
      // $FF: Couldn't be decompiled
   }

   protected void onDetachedFromWindow() {
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

   protected void onRestoreInstanceState(Parcelable param1) {
      // $FF: Couldn't be decompiled
   }

   protected Parcelable onSaveInstanceState() {
      // $FF: Couldn't be decompiled
   }

   protected void onSizeChanged(int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public boolean onTouchEvent(MotionEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public void requestChildFocus(View param1, View param2) {
      // $FF: Couldn't be decompiled
   }

   public void setCoveredFadeColor(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setPanelSlideListener(SlidingPaneLayout.c param1) {
      // $FF: Couldn't be decompiled
   }

   public void setParallaxDistance(int param1) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public void setShadowDrawable(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   public void setShadowDrawableLeft(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   public void setShadowDrawableRight(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public void setShadowResource(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setShadowResourceLeft(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setShadowResourceRight(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setSliderFadeColor(int param1) {
      // $FF: Couldn't be decompiled
   }

   static class SavedState extends AbsSavedState {
      public static final Creator CREATOR;
      boolean a;

      static {
         // $FF: Couldn't be decompiled
      }

      SavedState(Parcel param1, ClassLoader param2) {
         // $FF: Couldn't be decompiled
      }

      SavedState(Parcelable param1) {
         // $FF: Couldn't be decompiled
      }

      public void writeToParcel(Parcel param1, int param2) {
         // $FF: Couldn't be decompiled
      }
   }

   private class a implements Runnable {
      final View a;
      // $FF: synthetic field
      final SlidingPaneLayout b;

      a(SlidingPaneLayout param1, View param2) {
         // $FF: Couldn't be decompiled
      }

      public void run() {
         // $FF: Couldn't be decompiled
      }
   }

   public static class b extends MarginLayoutParams {
      private static final int[] e;
      public float a;
      boolean b;
      boolean c;
      Paint d;

      static {
         // $FF: Couldn't be decompiled
      }

      public b() {
         // $FF: Couldn't be decompiled
      }

      public b(Context param1, AttributeSet param2) {
         // $FF: Couldn't be decompiled
      }

      public b(LayoutParams param1) {
         // $FF: Couldn't be decompiled
      }

      public b(MarginLayoutParams param1) {
         // $FF: Couldn't be decompiled
      }
   }

   public interface c {
   }
}
