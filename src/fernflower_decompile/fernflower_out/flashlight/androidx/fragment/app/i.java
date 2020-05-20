package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater.Factory2;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class i extends h implements Factory2 {
   static final Interpolator D;
   static final Interpolator E;
   static boolean b;
   SparseArray A;
   ArrayList B;
   Runnable C;
   private OnBackPressedDispatcher F;
   private final androidx.activity.c G;
   private final CopyOnWriteArrayList H;
   private j I;
   ArrayList c;
   boolean d;
   int e;
   final ArrayList f;
   final HashMap g;
   ArrayList h;
   ArrayList i;
   ArrayList j;
   ArrayList k;
   ArrayList l;
   int m;
   androidx.fragment.app.g n;
   androidx.fragment.app.d o;
   Fragment p;
   Fragment q;
   boolean r;
   boolean s;
   boolean t;
   boolean u;
   boolean v;
   ArrayList w;
   ArrayList x;
   ArrayList y;
   Bundle z;

   static {
      // $FF: Couldn't be decompiled
   }

   i() {
      // $FF: Couldn't be decompiled
   }

   private void D() {
      // $FF: Couldn't be decompiled
   }

   private void E() {
      // $FF: Couldn't be decompiled
   }

   private void F() {
      // $FF: Couldn't be decompiled
   }

   private void G() {
      // $FF: Couldn't be decompiled
   }

   private void H() {
      // $FF: Couldn't be decompiled
   }

   private void I() {
      // $FF: Couldn't be decompiled
   }

   private int a(ArrayList param1, ArrayList param2, int param3, int param4, androidx.b.b param5) {
      // $FF: Couldn't be decompiled
   }

   static i.a a(float param0, float param1) {
      // $FF: Couldn't be decompiled
   }

   static i.a a(float param0, float param1, float param2, float param3) {
      // $FF: Couldn't be decompiled
   }

   private void a(androidx.b.b param1) {
      // $FF: Couldn't be decompiled
   }

   private void a(Fragment param1, i.a param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private void a(RuntimeException param1) {
      // $FF: Couldn't be decompiled
   }

   private void a(ArrayList param1, ArrayList param2) {
      // $FF: Couldn't be decompiled
   }

   private void a(ArrayList param1, ArrayList param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private boolean a(String param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public static int b(int param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private void b(androidx.b.b param1) {
      // $FF: Couldn't be decompiled
   }

   private void b(ArrayList param1, ArrayList param2) {
      // $FF: Couldn't be decompiled
   }

   private static void b(ArrayList param0, ArrayList param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private void c(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean c(ArrayList param1, ArrayList param2) {
      // $FF: Couldn't be decompiled
   }

   public static int d(int param0) {
      // $FF: Couldn't be decompiled
   }

   private void e(int param1) {
      // $FF: Couldn't be decompiled
   }

   private Fragment u(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   private void v(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean w(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   public Fragment A() {
      // $FF: Couldn't be decompiled
   }

   boolean B() {
      // $FF: Couldn't be decompiled
   }

   Factory2 C() {
      // $FF: Couldn't be decompiled
   }

   public int a(androidx.fragment.app.a param1) {
      // $FF: Couldn't be decompiled
   }

   public Fragment a(Bundle param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public Fragment a(String param1) {
      // $FF: Couldn't be decompiled
   }

   i.a a(Fragment param1, int param2, boolean param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public k a() {
      // $FF: Couldn't be decompiled
   }

   public void a(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(int param1, androidx.fragment.app.a param2) {
      // $FF: Couldn't be decompiled
   }

   void a(int param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(Configuration param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(Bundle param1, String param2, Fragment param3) {
      // $FF: Couldn't be decompiled
   }

   void a(Parcelable param1) {
      // $FF: Couldn't be decompiled
   }

   void a(Fragment param1, int param2, int param3, int param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   void a(Fragment param1, Context param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   void a(Fragment param1, Bundle param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   void a(Fragment param1, View param2, Bundle param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   public void a(Fragment param1, androidx.lifecycle.e.b param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(Fragment param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   void a(androidx.fragment.app.a param1, boolean param2, boolean param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   public void a(androidx.fragment.app.g param1, androidx.fragment.app.d param2, Fragment param3) {
      // $FF: Couldn't be decompiled
   }

   public void a(i.e param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(String param1, FileDescriptor param2, PrintWriter param3, String[] param4) {
      // $FF: Couldn't be decompiled
   }

   public void a(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   boolean a(int param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean a(Menu param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean a(Menu param1, MenuInflater param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean a(MenuItem param1) {
      // $FF: Couldn't be decompiled
   }

   boolean a(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   boolean a(ArrayList param1, ArrayList param2, String param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   public Fragment b(int param1) {
      // $FF: Couldn't be decompiled
   }

   public Fragment b(String param1) {
      // $FF: Couldn't be decompiled
   }

   s b(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   public void b(Menu param1) {
      // $FF: Couldn't be decompiled
   }

   void b(Fragment param1, Context param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   void b(Fragment param1, Bundle param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   void b(Fragment param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   void b(androidx.fragment.app.a param1) {
      // $FF: Couldn't be decompiled
   }

   public void b(i.e param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public void b(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean b() {
      // $FF: Couldn't be decompiled
   }

   public boolean b(MenuItem param1) {
      // $FF: Couldn't be decompiled
   }

   j c(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   public void c(int param1) {
      // $FF: Couldn't be decompiled
   }

   void c(Fragment param1, Bundle param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   void c(Fragment param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean c() {
      // $FF: Couldn't be decompiled
   }

   public List d() {
      // $FF: Couldn't be decompiled
   }

   void d(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   void d(Fragment param1, Bundle param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   void d(Fragment param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public androidx.fragment.app.f e() {
      // $FF: Couldn't be decompiled
   }

   void e(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   void e(Fragment param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   void f() {
      // $FF: Couldn't be decompiled
   }

   public void f(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   void f(Fragment param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public int g() {
      // $FF: Couldn't be decompiled
   }

   void g(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   void g(Fragment param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   void h(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   void h(Fragment param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean h() {
      // $FF: Couldn't be decompiled
   }

   void i() {
      // $FF: Couldn't be decompiled
   }

   void i(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   void j(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean j() {
      // $FF: Couldn't be decompiled
   }

   void k() {
      // $FF: Couldn't be decompiled
   }

   void k(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   void l(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean l() {
      // $FF: Couldn't be decompiled
   }

   void m() {
      // $FF: Couldn't be decompiled
   }

   public void m(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   void n() {
      // $FF: Couldn't be decompiled
   }

   public void n(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   Parcelable o() {
      // $FF: Couldn't be decompiled
   }

   public void o(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   public View onCreateView(View param1, String param2, Context param3, AttributeSet param4) {
      // $FF: Couldn't be decompiled
   }

   public View onCreateView(String param1, Context param2, AttributeSet param3) {
      // $FF: Couldn't be decompiled
   }

   public void p() {
      // $FF: Couldn't be decompiled
   }

   public void p(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   public void q() {
      // $FF: Couldn't be decompiled
   }

   public void q(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   public void r() {
      // $FF: Couldn't be decompiled
   }

   void r(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   Bundle s(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   public void s() {
      // $FF: Couldn't be decompiled
   }

   public void t() {
      // $FF: Couldn't be decompiled
   }

   public void t(Fragment param1) {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      // $FF: Couldn't be decompiled
   }

   public void u() {
      // $FF: Couldn't be decompiled
   }

   public void v() {
      // $FF: Couldn't be decompiled
   }

   public void w() {
      // $FF: Couldn't be decompiled
   }

   public void x() {
      // $FF: Couldn't be decompiled
   }

   public void y() {
      // $FF: Couldn't be decompiled
   }

   void z() {
      // $FF: Couldn't be decompiled
   }

   private static class a {
      public final Animation a;
      public final Animator b;

      a(Animator param1) {
         // $FF: Couldn't be decompiled
      }

      a(Animation param1) {
         // $FF: Couldn't be decompiled
      }
   }

   private static class b extends AnimationSet implements Runnable {
      private final ViewGroup a;
      private final View b;
      private boolean c;
      private boolean d;
      private boolean e;

      b(Animation param1, ViewGroup param2, View param3) {
         // $FF: Couldn't be decompiled
      }

      public boolean getTransformation(long param1, Transformation param3) {
         // $FF: Couldn't be decompiled
      }

      public boolean getTransformation(long param1, Transformation param3, float param4) {
         // $FF: Couldn't be decompiled
      }

      public void run() {
         // $FF: Couldn't be decompiled
      }
   }

   private static final class c {
      final h.a a;
      final boolean b;
   }

   static class d {
      public static final int[] a;

      static {
         // $FF: Couldn't be decompiled
      }
   }

   interface e {
      boolean a(ArrayList var1, ArrayList var2);
   }

   private class f implements i.e {
      final String a;
      final int b;
      final int c;
      // $FF: synthetic field
      final i d;

      f(i param1, String param2, int param3, int param4) {
         // $FF: Couldn't be decompiled
      }

      public boolean a(ArrayList param1, ArrayList param2) {
         // $FF: Couldn't be decompiled
      }
   }

   static class g implements Fragment.c {
      final boolean a;
      final androidx.fragment.app.a b;
      private int c;

      g(androidx.fragment.app.a param1, boolean param2) {
         // $FF: Couldn't be decompiled
      }

      public void a() {
         // $FF: Couldn't be decompiled
      }

      public void b() {
         // $FF: Couldn't be decompiled
      }

      public boolean c() {
         // $FF: Couldn't be decompiled
      }

      public void d() {
         // $FF: Couldn't be decompiled
      }

      public void e() {
         // $FF: Couldn't be decompiled
      }
   }
}
