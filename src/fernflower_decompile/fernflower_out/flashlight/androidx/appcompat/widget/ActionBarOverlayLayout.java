package androidx.appcompat.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window.Callback;
import android.widget.OverScroller;

public class ActionBarOverlayLayout extends ViewGroup implements ab, androidx.core.g.l, androidx.core.g.m, androidx.core.g.n {
   static final int[] e;
   private final Runnable A;
   private final androidx.core.g.o B;
   ActionBarContainer a;
   boolean b;
   ViewPropertyAnimator c;
   final AnimatorListenerAdapter d;
   private int f;
   private int g;
   private ContentFrameLayout h;
   private ac i;
   private Drawable j;
   private boolean k;
   private boolean l;
   private boolean m;
   private boolean n;
   private int o;
   private int p;
   private final Rect q;
   private final Rect r;
   private final Rect s;
   private final Rect t;
   private final Rect u;
   private final Rect v;
   private final Rect w;
   private ActionBarOverlayLayout.a x;
   private OverScroller y;
   private final Runnable z;

   static {
      // $FF: Couldn't be decompiled
   }

   public ActionBarOverlayLayout(Context param1, AttributeSet param2) {
      // $FF: Couldn't be decompiled
   }

   private ac a(View param1) {
      // $FF: Couldn't be decompiled
   }

   private void a(Context param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean a(float param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   private boolean a(View param1, Rect param2, boolean param3, boolean param4, boolean param5, boolean param6) {
      // $FF: Couldn't be decompiled
   }

   private void l() {
      // $FF: Couldn't be decompiled
   }

   private void m() {
      // $FF: Couldn't be decompiled
   }

   private void n() {
      // $FF: Couldn't be decompiled
   }

   private void o() {
      // $FF: Couldn't be decompiled
   }

   public ActionBarOverlayLayout.b a(AttributeSet param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(Menu param1, androidx.appcompat.view.menu.m.a param2) {
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

   public boolean a() {
      // $FF: Couldn't be decompiled
   }

   public boolean a(View param1, View param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   protected ActionBarOverlayLayout.b b() {
      // $FF: Couldn't be decompiled
   }

   public void b(View param1, View param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   void c() {
      // $FF: Couldn't be decompiled
   }

   protected boolean checkLayoutParams(LayoutParams param1) {
      // $FF: Couldn't be decompiled
   }

   void d() {
      // $FF: Couldn't be decompiled
   }

   public void draw(Canvas param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean e() {
      // $FF: Couldn't be decompiled
   }

   public boolean f() {
      // $FF: Couldn't be decompiled
   }

   protected boolean fitSystemWindows(Rect param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean g() {
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

   protected LayoutParams generateLayoutParams(LayoutParams param1) {
      // $FF: Couldn't be decompiled
   }

   public int getActionBarHideOffset() {
      // $FF: Couldn't be decompiled
   }

   public int getNestedScrollAxes() {
      // $FF: Couldn't be decompiled
   }

   public CharSequence getTitle() {
      // $FF: Couldn't be decompiled
   }

   public boolean h() {
      // $FF: Couldn't be decompiled
   }

   public boolean i() {
      // $FF: Couldn't be decompiled
   }

   public void j() {
      // $FF: Couldn't be decompiled
   }

   public void k() {
      // $FF: Couldn't be decompiled
   }

   protected void onConfigurationChanged(Configuration param1) {
      // $FF: Couldn't be decompiled
   }

   protected void onDetachedFromWindow() {
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

   public boolean onStartNestedScroll(View param1, View param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public void onStopNestedScroll(View param1) {
      // $FF: Couldn't be decompiled
   }

   public void onWindowSystemUiVisibilityChanged(int param1) {
      // $FF: Couldn't be decompiled
   }

   protected void onWindowVisibilityChanged(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setActionBarHideOffset(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setActionBarVisibilityCallback(ActionBarOverlayLayout.a param1) {
      // $FF: Couldn't be decompiled
   }

   public void setHasNonEmbeddedTabs(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void setHideOnContentScrollEnabled(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void setIcon(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setIcon(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   public void setLogo(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setOverlayMode(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void setShowingForActionMode(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void setUiOptions(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setWindowCallback(Callback param1) {
      // $FF: Couldn't be decompiled
   }

   public void setWindowTitle(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean shouldDelayChildPressedState() {
      // $FF: Couldn't be decompiled
   }

   public interface a {
      void a(int var1);

      void g(boolean var1);

      void j();

      void k();

      void l();

      void m();
   }

   public static class b extends MarginLayoutParams {
      public b(int param1, int param2) {
         // $FF: Couldn't be decompiled
      }

      public b(Context param1, AttributeSet param2) {
         // $FF: Couldn't be decompiled
      }

      public b(LayoutParams param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
