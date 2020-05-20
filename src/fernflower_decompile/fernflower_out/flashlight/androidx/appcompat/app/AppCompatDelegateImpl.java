package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.LayoutInflater.Factory2;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ab;
import androidx.core.g.w;
import java.util.List;
import java.util.Map;

class AppCompatDelegateImpl extends androidx.appcompat.app.e implements Factory2, androidx.appcompat.view.menu.g.a {
   private static final Map t;
   private static final boolean u;
   private static final int[] v;
   private static boolean w;
   private static final boolean x;
   private ab A;
   private AppCompatDelegateImpl.a B;
   private AppCompatDelegateImpl.h C;
   private boolean D;
   private boolean E;
   private ViewGroup F;
   private TextView G;
   private View H;
   private boolean I;
   private boolean J;
   private boolean K;
   private AppCompatDelegateImpl.PanelFeatureState[] L;
   private AppCompatDelegateImpl.PanelFeatureState M;
   private boolean N;
   private boolean O;
   private boolean P;
   private boolean Q;
   private int R;
   private int S;
   private boolean T;
   private boolean U;
   private AppCompatDelegateImpl.e V;
   private AppCompatDelegateImpl.e W;
   private final Runnable X;
   private boolean Y;
   private Rect Z;
   final Object a;
   private Rect aa;
   private AppCompatViewInflater ab;
   final Context b;
   Window c;
   final androidx.appcompat.app.d d;
   androidx.appcompat.app.a e;
   MenuInflater f;
   androidx.appcompat.view.b g;
   ActionBarContextView h;
   PopupWindow i;
   Runnable j;
   w k;
   boolean l;
   boolean m;
   boolean n;
   boolean o;
   boolean p;
   boolean q;
   boolean r;
   int s;
   private AppCompatDelegateImpl.c y;
   private CharSequence z;

   static {
      // $FF: Couldn't be decompiled
   }

   AppCompatDelegateImpl(Activity param1, androidx.appcompat.app.d param2) {
      // $FF: Couldn't be decompiled
   }

   AppCompatDelegateImpl(Dialog param1, androidx.appcompat.app.d param2) {
      // $FF: Couldn't be decompiled
   }

   private AppCompatDelegateImpl(Context param1, Window param2, androidx.appcompat.app.d param3, Object param4) {
      // $FF: Couldn't be decompiled
   }

   private void A() {
      // $FF: Couldn't be decompiled
   }

   private androidx.appcompat.app.c B() {
      // $FF: Couldn't be decompiled
   }

   private void C() {
      // $FF: Couldn't be decompiled
   }

   private int D() {
      // $FF: Couldn't be decompiled
   }

   private AppCompatDelegateImpl.e E() {
      // $FF: Couldn't be decompiled
   }

   private boolean F() {
      // $FF: Couldn't be decompiled
   }

   private void a(Window param1) {
      // $FF: Couldn't be decompiled
   }

   private void a(AppCompatDelegateImpl.PanelFeatureState param1, KeyEvent param2) {
      // $FF: Couldn't be decompiled
   }

   private void a(androidx.appcompat.view.menu.g param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   private boolean a(ViewParent param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean a(AppCompatDelegateImpl.PanelFeatureState param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean a(AppCompatDelegateImpl.PanelFeatureState param1, int param2, KeyEvent param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private boolean a(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean b(int param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   private boolean b(AppCompatDelegateImpl.PanelFeatureState param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean b(AppCompatDelegateImpl.PanelFeatureState param1, KeyEvent param2) {
      // $FF: Couldn't be decompiled
   }

   private void c(int param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   private boolean c(AppCompatDelegateImpl.PanelFeatureState param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean d(int param1, KeyEvent param2) {
      // $FF: Couldn't be decompiled
   }

   private boolean e(int param1, KeyEvent param2) {
      // $FF: Couldn't be decompiled
   }

   private void k(int param1) {
      // $FF: Couldn't be decompiled
   }

   private int l(int param1) {
      // $FF: Couldn't be decompiled
   }

   private void v() {
      // $FF: Couldn't be decompiled
   }

   private void w() {
      // $FF: Couldn't be decompiled
   }

   private void x() {
      // $FF: Couldn't be decompiled
   }

   private void y() {
      // $FF: Couldn't be decompiled
   }

   private ViewGroup z() {
      // $FF: Couldn't be decompiled
   }

   public View a(View param1, String param2, Context param3, AttributeSet param4) {
      // $FF: Couldn't be decompiled
   }

   protected AppCompatDelegateImpl.PanelFeatureState a(int param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   AppCompatDelegateImpl.PanelFeatureState a(Menu param1) {
      // $FF: Couldn't be decompiled
   }

   public androidx.appcompat.app.a a() {
      // $FF: Couldn't be decompiled
   }

   public androidx.appcompat.view.b a(androidx.appcompat.view.b.a param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(int param1) {
      // $FF: Couldn't be decompiled
   }

   void a(int param1, AppCompatDelegateImpl.PanelFeatureState param2, Menu param3) {
      // $FF: Couldn't be decompiled
   }

   public void a(Context param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(Configuration param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(Bundle param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(View param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(View param1, LayoutParams param2) {
      // $FF: Couldn't be decompiled
   }

   void a(ViewGroup param1) {
      // $FF: Couldn't be decompiled
   }

   void a(AppCompatDelegateImpl.PanelFeatureState param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(androidx.appcompat.view.menu.g param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   boolean a(int param1, KeyEvent param2) {
      // $FF: Couldn't be decompiled
   }

   boolean a(KeyEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean a(androidx.appcompat.view.menu.g param1, MenuItem param2) {
      // $FF: Couldn't be decompiled
   }

   public MenuInflater b() {
      // $FF: Couldn't be decompiled
   }

   public View b(int param1) {
      // $FF: Couldn't be decompiled
   }

   androidx.appcompat.view.b b(androidx.appcompat.view.b.a param1) {
      // $FF: Couldn't be decompiled
   }

   public void b(Bundle param1) {
      // $FF: Couldn't be decompiled
   }

   public void b(View param1, LayoutParams param2) {
      // $FF: Couldn't be decompiled
   }

   void b(androidx.appcompat.view.menu.g param1) {
      // $FF: Couldn't be decompiled
   }

   boolean b(int param1, KeyEvent param2) {
      // $FF: Couldn't be decompiled
   }

   public void c() {
      // $FF: Couldn't be decompiled
   }

   public void c(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void c(Bundle param1) {
      // $FF: Couldn't be decompiled
   }

   boolean c(int param1, KeyEvent param2) {
      // $FF: Couldn't be decompiled
   }

   public void d() {
      // $FF: Couldn't be decompiled
   }

   public boolean d(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void e() {
      // $FF: Couldn't be decompiled
   }

   void e(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void f() {
      // $FF: Couldn't be decompiled
   }

   void f(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void g() {
      // $FF: Couldn't be decompiled
   }

   void g(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void h() {
      // $FF: Couldn't be decompiled
   }

   void h(int param1) {
      // $FF: Couldn't be decompiled
   }

   public int i() {
      // $FF: Couldn't be decompiled
   }

   int i(int param1) {
      // $FF: Couldn't be decompiled
   }

   int j(int param1) {
      // $FF: Couldn't be decompiled
   }

   final androidx.appcompat.app.a k() {
      // $FF: Couldn't be decompiled
   }

   final Callback l() {
      // $FF: Couldn't be decompiled
   }

   final Context m() {
      // $FF: Couldn't be decompiled
   }

   final CharSequence n() {
      // $FF: Couldn't be decompiled
   }

   final boolean o() {
      // $FF: Couldn't be decompiled
   }

   public final View onCreateView(View param1, String param2, Context param3, AttributeSet param4) {
      // $FF: Couldn't be decompiled
   }

   public View onCreateView(String param1, Context param2, AttributeSet param3) {
      // $FF: Couldn't be decompiled
   }

   public boolean p() {
      // $FF: Couldn't be decompiled
   }

   void q() {
      // $FF: Couldn't be decompiled
   }

   boolean r() {
      // $FF: Couldn't be decompiled
   }

   void s() {
      // $FF: Couldn't be decompiled
   }

   public boolean t() {
      // $FF: Couldn't be decompiled
   }

   final AppCompatDelegateImpl.e u() {
      // $FF: Couldn't be decompiled
   }

   protected static final class PanelFeatureState {
      int a;
      int b;
      int c;
      int d;
      int e;
      int f;
      ViewGroup g;
      View h;
      View i;
      androidx.appcompat.view.menu.g j;
      androidx.appcompat.view.menu.e k;
      Context l;
      boolean m;
      boolean n;
      boolean o;
      public boolean p;
      boolean q;
      boolean r;
      Bundle s;

      PanelFeatureState(int param1) {
         // $FF: Couldn't be decompiled
      }

      n a(m.a param1) {
         // $FF: Couldn't be decompiled
      }

      void a(Context param1) {
         // $FF: Couldn't be decompiled
      }

      void a(androidx.appcompat.view.menu.g param1) {
         // $FF: Couldn't be decompiled
      }

      public boolean a() {
         // $FF: Couldn't be decompiled
      }

      @SuppressLint({"BanParcelableUsage"})
      private static class SavedState implements Parcelable {
         public static final Creator CREATOR;
         int a;
         boolean b;
         Bundle c;

         static {
            // $FF: Couldn't be decompiled
         }

         SavedState() {
            // $FF: Couldn't be decompiled
         }

         static AppCompatDelegateImpl.PanelFeatureState.SavedState a(Parcel param0, ClassLoader param1) {
            // $FF: Couldn't be decompiled
         }

         public int describeContents() {
            // $FF: Couldn't be decompiled
         }

         public void writeToParcel(Parcel param1, int param2) {
            // $FF: Couldn't be decompiled
         }
      }
   }

   private final class a implements m.a {
      // $FF: synthetic field
      final AppCompatDelegateImpl a;

      a(AppCompatDelegateImpl param1) {
         // $FF: Couldn't be decompiled
      }

      public void a(androidx.appcompat.view.menu.g param1, boolean param2) {
         // $FF: Couldn't be decompiled
      }

      public boolean a(androidx.appcompat.view.menu.g param1) {
         // $FF: Couldn't be decompiled
      }
   }

   class b implements androidx.appcompat.view.b.a {
      // $FF: synthetic field
      final AppCompatDelegateImpl a;
      private androidx.appcompat.view.b.a b;

      public b(AppCompatDelegateImpl param1, androidx.appcompat.view.b.a param2) {
         // $FF: Couldn't be decompiled
      }

      public void a(androidx.appcompat.view.b param1) {
         // $FF: Couldn't be decompiled
      }

      public boolean a(androidx.appcompat.view.b param1, Menu param2) {
         // $FF: Couldn't be decompiled
      }

      public boolean a(androidx.appcompat.view.b param1, MenuItem param2) {
         // $FF: Couldn't be decompiled
      }

      public boolean b(androidx.appcompat.view.b param1, Menu param2) {
         // $FF: Couldn't be decompiled
      }
   }

   class c extends androidx.appcompat.view.i {
      // $FF: synthetic field
      final AppCompatDelegateImpl a;

      c(AppCompatDelegateImpl param1, Callback param2) {
         // $FF: Couldn't be decompiled
      }

      final ActionMode a(android.view.ActionMode.Callback param1) {
         // $FF: Couldn't be decompiled
      }

      public boolean dispatchKeyEvent(KeyEvent param1) {
         // $FF: Couldn't be decompiled
      }

      public boolean dispatchKeyShortcutEvent(KeyEvent param1) {
         // $FF: Couldn't be decompiled
      }

      public void onContentChanged() {
         // $FF: Couldn't be decompiled
      }

      public boolean onCreatePanelMenu(int param1, Menu param2) {
         // $FF: Couldn't be decompiled
      }

      public boolean onMenuOpened(int param1, Menu param2) {
         // $FF: Couldn't be decompiled
      }

      public void onPanelClosed(int param1, Menu param2) {
         // $FF: Couldn't be decompiled
      }

      public boolean onPreparePanel(int param1, View param2, Menu param3) {
         // $FF: Couldn't be decompiled
      }

      public void onProvideKeyboardShortcuts(List param1, Menu param2, int param3) {
         // $FF: Couldn't be decompiled
      }

      public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback param1) {
         // $FF: Couldn't be decompiled
      }

      public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback param1, int param2) {
         // $FF: Couldn't be decompiled
      }
   }

   private class d extends AppCompatDelegateImpl.e {
      // $FF: synthetic field
      final AppCompatDelegateImpl a;
      private final PowerManager c;

      d(AppCompatDelegateImpl param1, Context param2) {
         // $FF: Couldn't be decompiled
      }

      public int a() {
         // $FF: Couldn't be decompiled
      }

      public void b() {
         // $FF: Couldn't be decompiled
      }

      IntentFilter c() {
         // $FF: Couldn't be decompiled
      }
   }

   abstract class e {
      private BroadcastReceiver a;
      // $FF: synthetic field
      final AppCompatDelegateImpl b;

      e(AppCompatDelegateImpl param1) {
         // $FF: Couldn't be decompiled
      }

      abstract int a();

      abstract void b();

      abstract IntentFilter c();

      void d() {
         // $FF: Couldn't be decompiled
      }

      void e() {
         // $FF: Couldn't be decompiled
      }
   }

   private class f extends AppCompatDelegateImpl.e {
      // $FF: synthetic field
      final AppCompatDelegateImpl a;
      private final j c;

      f(AppCompatDelegateImpl param1, j param2) {
         // $FF: Couldn't be decompiled
      }

      public int a() {
         // $FF: Couldn't be decompiled
      }

      public void b() {
         // $FF: Couldn't be decompiled
      }

      IntentFilter c() {
         // $FF: Couldn't be decompiled
      }
   }

   private class g extends ContentFrameLayout {
      // $FF: synthetic field
      final AppCompatDelegateImpl a;

      public g(AppCompatDelegateImpl param1, Context param2) {
         // $FF: Couldn't be decompiled
      }

      private boolean a(int param1, int param2) {
         // $FF: Couldn't be decompiled
      }

      public boolean dispatchKeyEvent(KeyEvent param1) {
         // $FF: Couldn't be decompiled
      }

      public boolean onInterceptTouchEvent(MotionEvent param1) {
         // $FF: Couldn't be decompiled
      }

      public void setBackgroundResource(int param1) {
         // $FF: Couldn't be decompiled
      }
   }

   private final class h implements m.a {
      // $FF: synthetic field
      final AppCompatDelegateImpl a;

      h(AppCompatDelegateImpl param1) {
         // $FF: Couldn't be decompiled
      }

      public void a(androidx.appcompat.view.menu.g param1, boolean param2) {
         // $FF: Couldn't be decompiled
      }

      public boolean a(androidx.appcompat.view.menu.g param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
