package androidx.f.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class c extends h implements androidx.f.a.a.b {
   ArrayList a;
   final Callback b;
   private c.a d;
   private Context e;
   private ArgbEvaluator f;
   private AnimatorListener g;

   c() {
      // $FF: Couldn't be decompiled
   }

   private c(Context param1) {
      // $FF: Couldn't be decompiled
   }

   private c(Context param1, c.a param2, Resources param3) {
      // $FF: Couldn't be decompiled
   }

   public static c a(Context param0, Resources param1, XmlPullParser param2, AttributeSet param3, Theme param4) {
      // $FF: Couldn't be decompiled
   }

   private void a(Animator param1) {
      // $FF: Couldn't be decompiled
   }

   private void a(String param1, Animator param2) {
      // $FF: Couldn't be decompiled
   }

   public void applyTheme(Theme param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean canApplyTheme() {
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

   public ColorFilter getColorFilter() {
      // $FF: Couldn't be decompiled
   }

   public ConstantState getConstantState() {
      // $FF: Couldn't be decompiled
   }

   public int getIntrinsicHeight() {
      // $FF: Couldn't be decompiled
   }

   public int getIntrinsicWidth() {
      // $FF: Couldn't be decompiled
   }

   public int getOpacity() {
      // $FF: Couldn't be decompiled
   }

   public void inflate(Resources param1, XmlPullParser param2, AttributeSet param3) {
      // $FF: Couldn't be decompiled
   }

   public void inflate(Resources param1, XmlPullParser param2, AttributeSet param3, Theme param4) {
      // $FF: Couldn't be decompiled
   }

   public boolean isAutoMirrored() {
      // $FF: Couldn't be decompiled
   }

   public boolean isRunning() {
      // $FF: Couldn't be decompiled
   }

   public boolean isStateful() {
      // $FF: Couldn't be decompiled
   }

   public Drawable mutate() {
      // $FF: Couldn't be decompiled
   }

   protected void onBoundsChange(Rect param1) {
      // $FF: Couldn't be decompiled
   }

   protected boolean onLevelChange(int param1) {
      // $FF: Couldn't be decompiled
   }

   protected boolean onStateChange(int[] param1) {
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

   public void setTint(int param1) {
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

   public void start() {
      // $FF: Couldn't be decompiled
   }

   public void stop() {
      // $FF: Couldn't be decompiled
   }

   private static class a extends ConstantState {
      int a;
      i b;
      AnimatorSet c;
      ArrayList d;
      androidx.b.a e;

      public a(Context param1, c.a param2, Callback param3, Resources param4) {
         // $FF: Couldn't be decompiled
      }

      public void a() {
         // $FF: Couldn't be decompiled
      }

      public int getChangingConfigurations() {
         // $FF: Couldn't be decompiled
      }

      public Drawable newDrawable() {
         // $FF: Couldn't be decompiled
      }

      public Drawable newDrawable(Resources param1) {
         // $FF: Couldn't be decompiled
      }
   }

   private static class b extends ConstantState {
      private final ConstantState a;

      public b(ConstantState param1) {
         // $FF: Couldn't be decompiled
      }

      public boolean canApplyTheme() {
         // $FF: Couldn't be decompiled
      }

      public int getChangingConfigurations() {
         // $FF: Couldn't be decompiled
      }

      public Drawable newDrawable() {
         // $FF: Couldn't be decompiled
      }

      public Drawable newDrawable(Resources param1) {
         // $FF: Couldn't be decompiled
      }

      public Drawable newDrawable(Resources param1, Theme param2) {
         // $FF: Couldn't be decompiled
      }
   }
}
