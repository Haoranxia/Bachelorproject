package androidx.appcompat.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.SparseArray;

class b extends Drawable implements Callback {
   private androidx.appcompat.b.a.b.b a;
   private Rect b;
   private Drawable c;
   private Drawable d;
   private int e;
   private boolean f;
   private int g;
   private int h;
   private boolean i;
   private Runnable j;
   private long k;
   private long l;
   private androidx.appcompat.b.a.b.a m;

   b() {
      // $FF: Couldn't be decompiled
   }

   static int a(Resources param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private void a(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean a() {
      // $FF: Couldn't be decompiled
   }

   final void a(Resources param1) {
      // $FF: Couldn't be decompiled
   }

   void a(androidx.appcompat.b.a.b.b param1) {
      // $FF: Couldn't be decompiled
   }

   void a(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   boolean a(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void applyTheme(Theme param1) {
      // $FF: Couldn't be decompiled
   }

   androidx.appcompat.b.a.b.b c() {
      // $FF: Couldn't be decompiled
   }

   public boolean canApplyTheme() {
      // $FF: Couldn't be decompiled
   }

   int d() {
      // $FF: Couldn't be decompiled
   }

   public void draw(Canvas param1) {
      // $FF: Couldn't be decompiled
   }

   public int getAlpha() {
      // $FF: Couldn't be decompiled
   }

   public int getChangingConfigurations() {
      // $FF: Couldn't be decompiled
   }

   public final ConstantState getConstantState() {
      // $FF: Couldn't be decompiled
   }

   public Drawable getCurrent() {
      // $FF: Couldn't be decompiled
   }

   public void getHotspotBounds(Rect param1) {
      // $FF: Couldn't be decompiled
   }

   public int getIntrinsicHeight() {
      // $FF: Couldn't be decompiled
   }

   public int getIntrinsicWidth() {
      // $FF: Couldn't be decompiled
   }

   public int getMinimumHeight() {
      // $FF: Couldn't be decompiled
   }

   public int getMinimumWidth() {
      // $FF: Couldn't be decompiled
   }

   public int getOpacity() {
      // $FF: Couldn't be decompiled
   }

   public void getOutline(Outline param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean getPadding(Rect param1) {
      // $FF: Couldn't be decompiled
   }

   public void invalidateDrawable(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean isAutoMirrored() {
      // $FF: Couldn't be decompiled
   }

   public boolean isStateful() {
      // $FF: Couldn't be decompiled
   }

   public void jumpToCurrentState() {
      // $FF: Couldn't be decompiled
   }

   public Drawable mutate() {
      // $FF: Couldn't be decompiled
   }

   protected void onBoundsChange(Rect param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean onLayoutDirectionChanged(int param1) {
      // $FF: Couldn't be decompiled
   }

   protected boolean onLevelChange(int param1) {
      // $FF: Couldn't be decompiled
   }

   protected boolean onStateChange(int[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void scheduleDrawable(Drawable param1, Runnable param2, long param3) {
      // $FF: Couldn't be decompiled
   }

   public void setAlpha(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setAutoMirrored(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void setColorFilter(ColorFilter param1) {
      // $FF: Couldn't be decompiled
   }

   public void setDither(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void setHotspot(float param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   public void setHotspotBounds(int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public void setTintList(ColorStateList param1) {
      // $FF: Couldn't be decompiled
   }

   public void setTintMode(Mode param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean setVisible(boolean param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public void unscheduleDrawable(Drawable param1, Runnable param2) {
      // $FF: Couldn't be decompiled
   }

   static class a implements Callback {
      private Callback a;

      a() {
         // $FF: Couldn't be decompiled
      }

      public Callback a() {
         // $FF: Couldn't be decompiled
      }

      public androidx.appcompat.b.a.b.a a(Callback param1) {
         // $FF: Couldn't be decompiled
      }

      public void invalidateDrawable(Drawable param1) {
         // $FF: Couldn't be decompiled
      }

      public void scheduleDrawable(Drawable param1, Runnable param2, long param3) {
         // $FF: Couldn't be decompiled
      }

      public void unscheduleDrawable(Drawable param1, Runnable param2) {
         // $FF: Couldn't be decompiled
      }
   }

   abstract static class b extends ConstantState {
      boolean A;
      int B;
      int C;
      int D;
      boolean E;
      ColorFilter F;
      boolean G;
      ColorStateList H;
      Mode I;
      boolean J;
      boolean K;
      final androidx.appcompat.b.a.b c;
      Resources d;
      int e;
      int f;
      int g;
      SparseArray h;
      Drawable[] i;
      int j;
      boolean k;
      boolean l;
      Rect m;
      boolean n;
      boolean o;
      int p;
      int q;
      int r;
      int s;
      boolean t;
      int u;
      boolean v;
      boolean w;
      boolean x;
      boolean y;
      boolean z;

      b(androidx.appcompat.b.a.b.b param1, androidx.appcompat.b.a.b param2, Resources param3) {
         // $FF: Couldn't be decompiled
      }

      private Drawable b(Drawable param1) {
         // $FF: Couldn't be decompiled
      }

      private void o() {
         // $FF: Couldn't be decompiled
      }

      public final int a(Drawable param1) {
         // $FF: Couldn't be decompiled
      }

      void a() {
         // $FF: Couldn't be decompiled
      }

      final void a(Theme param1) {
         // $FF: Couldn't be decompiled
      }

      final void a(Resources param1) {
         // $FF: Couldn't be decompiled
      }

      public final void a(boolean param1) {
         // $FF: Couldn't be decompiled
      }

      public final Drawable b(int param1) {
         // $FF: Couldn't be decompiled
      }

      void b() {
         // $FF: Couldn't be decompiled
      }

      public final void b(boolean param1) {
         // $FF: Couldn't be decompiled
      }

      final int c() {
         // $FF: Couldn't be decompiled
      }

      public final void c(int param1) {
         // $FF: Couldn't be decompiled
      }

      public boolean canApplyTheme() {
         // $FF: Couldn't be decompiled
      }

      public final int d() {
         // $FF: Couldn't be decompiled
      }

      public final void d(int param1) {
         // $FF: Couldn't be decompiled
      }

      final boolean d(int param1, int param2) {
         // $FF: Couldn't be decompiled
      }

      public final Rect e() {
         // $FF: Couldn't be decompiled
      }

      public void e(int param1, int param2) {
         // $FF: Couldn't be decompiled
      }

      public final boolean f() {
         // $FF: Couldn't be decompiled
      }

      public final int g() {
         // $FF: Couldn't be decompiled
      }

      public int getChangingConfigurations() {
         // $FF: Couldn't be decompiled
      }

      public final int h() {
         // $FF: Couldn't be decompiled
      }

      public final int i() {
         // $FF: Couldn't be decompiled
      }

      public final int j() {
         // $FF: Couldn't be decompiled
      }

      protected void k() {
         // $FF: Couldn't be decompiled
      }

      public final int l() {
         // $FF: Couldn't be decompiled
      }

      public final boolean m() {
         // $FF: Couldn't be decompiled
      }

      public boolean n() {
         // $FF: Couldn't be decompiled
      }
   }
}
