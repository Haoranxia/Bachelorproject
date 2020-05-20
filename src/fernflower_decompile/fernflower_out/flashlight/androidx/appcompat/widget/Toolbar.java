package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
   private ColorStateList A;
   private ColorStateList B;
   private boolean C;
   private boolean D;
   private final ArrayList E;
   private final ArrayList F;
   private final int[] G;
   private final ActionMenuView.e H;
   private aw I;
   private ActionMenuPresenter J;
   private Toolbar.a K;
   private androidx.appcompat.view.menu.m.a L;
   private androidx.appcompat.view.menu.g.a M;
   private boolean N;
   private final Runnable O;
   ImageButton a;
   View b;
   int c;
   Toolbar.c d;
   private ActionMenuView e;
   private TextView f;
   private TextView g;
   private ImageButton h;
   private ImageView i;
   private Drawable j;
   private CharSequence k;
   private Context l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private int t;
   private an u;
   private int v;
   private int w;
   private int x;
   private CharSequence y;
   private CharSequence z;

   public Toolbar(Context param1, AttributeSet param2) {
      // $FF: Couldn't be decompiled
   }

   public Toolbar(Context param1, AttributeSet param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private int a(View param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private int a(View param1, int param2, int param3, int param4, int param5, int[] param6) {
      // $FF: Couldn't be decompiled
   }

   private int a(View param1, int param2, int[] param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private int a(List param1, int[] param2) {
      // $FF: Couldn't be decompiled
   }

   private void a(View param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   private void a(View param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   private void a(List param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private boolean a(View param1) {
      // $FF: Couldn't be decompiled
   }

   private int b(int param1) {
      // $FF: Couldn't be decompiled
   }

   private int b(View param1) {
      // $FF: Couldn't be decompiled
   }

   private int b(View param1, int param2, int[] param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private int c(int param1) {
      // $FF: Couldn't be decompiled
   }

   private int c(View param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean d(View param1) {
      // $FF: Couldn't be decompiled
   }

   private MenuInflater getMenuInflater() {
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

   private void p() {
      // $FF: Couldn't be decompiled
   }

   private void q() {
      // $FF: Couldn't be decompiled
   }

   private boolean r() {
      // $FF: Couldn't be decompiled
   }

   private void s() {
      // $FF: Couldn't be decompiled
   }

   public Toolbar.b a(AttributeSet param1) {
      // $FF: Couldn't be decompiled
   }

   protected Toolbar.b a(LayoutParams param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(Context param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(androidx.appcompat.view.menu.g param1, ActionMenuPresenter param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(androidx.appcompat.view.menu.m.a param1, androidx.appcompat.view.menu.g.a param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean a() {
      // $FF: Couldn't be decompiled
   }

   public void b(Context param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean b() {
      // $FF: Couldn't be decompiled
   }

   public boolean c() {
      // $FF: Couldn't be decompiled
   }

   protected boolean checkLayoutParams(LayoutParams param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean d() {
      // $FF: Couldn't be decompiled
   }

   public boolean e() {
      // $FF: Couldn't be decompiled
   }

   public void f() {
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

   // $FF: synthetic method
   protected LayoutParams generateLayoutParams(LayoutParams param1) {
      // $FF: Couldn't be decompiled
   }

   public CharSequence getCollapseContentDescription() {
      // $FF: Couldn't be decompiled
   }

   public Drawable getCollapseIcon() {
      // $FF: Couldn't be decompiled
   }

   public int getContentInsetEnd() {
      // $FF: Couldn't be decompiled
   }

   public int getContentInsetEndWithActions() {
      // $FF: Couldn't be decompiled
   }

   public int getContentInsetLeft() {
      // $FF: Couldn't be decompiled
   }

   public int getContentInsetRight() {
      // $FF: Couldn't be decompiled
   }

   public int getContentInsetStart() {
      // $FF: Couldn't be decompiled
   }

   public int getContentInsetStartWithNavigation() {
      // $FF: Couldn't be decompiled
   }

   public int getCurrentContentInsetEnd() {
      // $FF: Couldn't be decompiled
   }

   public int getCurrentContentInsetLeft() {
      // $FF: Couldn't be decompiled
   }

   public int getCurrentContentInsetRight() {
      // $FF: Couldn't be decompiled
   }

   public int getCurrentContentInsetStart() {
      // $FF: Couldn't be decompiled
   }

   public Drawable getLogo() {
      // $FF: Couldn't be decompiled
   }

   public CharSequence getLogoDescription() {
      // $FF: Couldn't be decompiled
   }

   public Menu getMenu() {
      // $FF: Couldn't be decompiled
   }

   public CharSequence getNavigationContentDescription() {
      // $FF: Couldn't be decompiled
   }

   public Drawable getNavigationIcon() {
      // $FF: Couldn't be decompiled
   }

   ActionMenuPresenter getOuterActionMenuPresenter() {
      // $FF: Couldn't be decompiled
   }

   public Drawable getOverflowIcon() {
      // $FF: Couldn't be decompiled
   }

   Context getPopupContext() {
      // $FF: Couldn't be decompiled
   }

   public int getPopupTheme() {
      // $FF: Couldn't be decompiled
   }

   public CharSequence getSubtitle() {
      // $FF: Couldn't be decompiled
   }

   final TextView getSubtitleTextView() {
      // $FF: Couldn't be decompiled
   }

   public CharSequence getTitle() {
      // $FF: Couldn't be decompiled
   }

   public int getTitleMarginBottom() {
      // $FF: Couldn't be decompiled
   }

   public int getTitleMarginEnd() {
      // $FF: Couldn't be decompiled
   }

   public int getTitleMarginStart() {
      // $FF: Couldn't be decompiled
   }

   public int getTitleMarginTop() {
      // $FF: Couldn't be decompiled
   }

   final TextView getTitleTextView() {
      // $FF: Couldn't be decompiled
   }

   public ac getWrapper() {
      // $FF: Couldn't be decompiled
   }

   public void h() {
      // $FF: Couldn't be decompiled
   }

   void i() {
      // $FF: Couldn't be decompiled
   }

   protected Toolbar.b j() {
      // $FF: Couldn't be decompiled
   }

   void k() {
      // $FF: Couldn't be decompiled
   }

   void l() {
      // $FF: Couldn't be decompiled
   }

   protected void onDetachedFromWindow() {
      // $FF: Couldn't be decompiled
   }

   public boolean onHoverEvent(MotionEvent param1) {
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

   public void onRtlPropertiesChanged(int param1) {
      // $FF: Couldn't be decompiled
   }

   protected Parcelable onSaveInstanceState() {
      // $FF: Couldn't be decompiled
   }

   public boolean onTouchEvent(MotionEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public void setCollapseContentDescription(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setCollapseContentDescription(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   public void setCollapseIcon(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setCollapseIcon(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   public void setCollapsible(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void setContentInsetEndWithActions(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setContentInsetStartWithNavigation(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setLogo(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setLogo(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   public void setLogoDescription(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setLogoDescription(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   public void setNavigationContentDescription(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setNavigationContentDescription(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   public void setNavigationIcon(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setNavigationIcon(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   public void setNavigationOnClickListener(OnClickListener param1) {
      // $FF: Couldn't be decompiled
   }

   public void setOnMenuItemClickListener(Toolbar.c param1) {
      // $FF: Couldn't be decompiled
   }

   public void setOverflowIcon(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   public void setPopupTheme(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setSubtitle(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setSubtitle(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   public void setSubtitleTextColor(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setSubtitleTextColor(ColorStateList param1) {
      // $FF: Couldn't be decompiled
   }

   public void setTitle(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setTitle(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   public void setTitleMarginBottom(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setTitleMarginEnd(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setTitleMarginStart(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setTitleMarginTop(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setTitleTextColor(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setTitleTextColor(ColorStateList param1) {
      // $FF: Couldn't be decompiled
   }

   public static class SavedState extends AbsSavedState {
      public static final Creator CREATOR;
      int a;
      boolean b;

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

   private class a implements androidx.appcompat.view.menu.m {
      androidx.appcompat.view.menu.g a;
      androidx.appcompat.view.menu.i b;
      // $FF: synthetic field
      final Toolbar c;

      a(Toolbar param1) {
         // $FF: Couldn't be decompiled
      }

      public void a(Context param1, androidx.appcompat.view.menu.g param2) {
         // $FF: Couldn't be decompiled
      }

      public void a(androidx.appcompat.view.menu.g param1, boolean param2) {
         // $FF: Couldn't be decompiled
      }

      public void a(androidx.appcompat.view.menu.m.a param1) {
         // $FF: Couldn't be decompiled
      }

      public void a(boolean param1) {
         // $FF: Couldn't be decompiled
      }

      public boolean a(androidx.appcompat.view.menu.g param1, androidx.appcompat.view.menu.i param2) {
         // $FF: Couldn't be decompiled
      }

      public boolean a(androidx.appcompat.view.menu.r param1) {
         // $FF: Couldn't be decompiled
      }

      public boolean b() {
         // $FF: Couldn't be decompiled
      }

      public boolean b(androidx.appcompat.view.menu.g param1, androidx.appcompat.view.menu.i param2) {
         // $FF: Couldn't be decompiled
      }
   }

   public static class b extends androidx.appcompat.app.a.a {
      int b;

      public b(int param1, int param2) {
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

      public b(androidx.appcompat.app.a.a param1) {
         // $FF: Couldn't be decompiled
      }

      public b(Toolbar.b param1) {
         // $FF: Couldn't be decompiled
      }

      void a(MarginLayoutParams param1) {
         // $FF: Couldn't be decompiled
      }
   }

   public interface c {
      boolean a(MenuItem var1);
   }
}
