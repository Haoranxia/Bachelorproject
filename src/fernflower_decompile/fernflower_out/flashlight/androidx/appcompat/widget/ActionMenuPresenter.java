package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;

class ActionMenuPresenter extends androidx.appcompat.view.menu.b implements androidx.core.g.b.a {
   ActionMenuPresenter.d g;
   ActionMenuPresenter.e h;
   ActionMenuPresenter.a i;
   ActionMenuPresenter.c j;
   final ActionMenuPresenter.f k;
   int l;
   private Drawable m;
   private boolean n;
   private boolean o;
   private boolean p;
   private int q;
   private int r;
   private int s;
   private boolean t;
   private boolean u;
   private boolean v;
   private boolean w;
   private int x;
   private final SparseBooleanArray y;
   private ActionMenuPresenter.b z;

   public ActionMenuPresenter(Context param1) {
      // $FF: Couldn't be decompiled
   }

   private View a(MenuItem param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static androidx.appcompat.view.menu.g a(ActionMenuPresenter param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static androidx.appcompat.view.menu.g b(ActionMenuPresenter param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static androidx.appcompat.view.menu.n c(ActionMenuPresenter param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static androidx.appcompat.view.menu.g d(ActionMenuPresenter param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static androidx.appcompat.view.menu.g e(ActionMenuPresenter param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static androidx.appcompat.view.menu.n f(ActionMenuPresenter param0) {
      // $FF: Couldn't be decompiled
   }

   public View a(androidx.appcompat.view.menu.i param1, View param2, ViewGroup param3) {
      // $FF: Couldn't be decompiled
   }

   public androidx.appcompat.view.menu.n a(ViewGroup param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(Context param1, androidx.appcompat.view.menu.g param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(Configuration param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(androidx.appcompat.view.menu.g param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(androidx.appcompat.view.menu.i param1, androidx.appcompat.view.menu.n.a param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(ActionMenuView param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean a(int param1, androidx.appcompat.view.menu.i param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean a(ViewGroup param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean a(androidx.appcompat.view.menu.r param1) {
      // $FF: Couldn't be decompiled
   }

   public void b(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean b() {
      // $FF: Couldn't be decompiled
   }

   public Drawable c() {
      // $FF: Couldn't be decompiled
   }

   public void c(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void d(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean d() {
      // $FF: Couldn't be decompiled
   }

   public boolean e() {
      // $FF: Couldn't be decompiled
   }

   public boolean f() {
      // $FF: Couldn't be decompiled
   }

   public boolean g() {
      // $FF: Couldn't be decompiled
   }

   public boolean h() {
      // $FF: Couldn't be decompiled
   }

   public boolean i() {
      // $FF: Couldn't be decompiled
   }

   @SuppressLint({"BanParcelableUsage"})
   private static class SavedState implements Parcelable {
      public static final Creator CREATOR;
      public int a;

      static {
         // $FF: Couldn't be decompiled
      }

      SavedState() {
         // $FF: Couldn't be decompiled
      }

      SavedState(Parcel param1) {
         // $FF: Couldn't be decompiled
      }

      public int describeContents() {
         // $FF: Couldn't be decompiled
      }

      public void writeToParcel(Parcel param1, int param2) {
         // $FF: Couldn't be decompiled
      }
   }

   private class a extends androidx.appcompat.view.menu.l {
      // $FF: synthetic field
      final ActionMenuPresenter a;

      public a(ActionMenuPresenter param1, Context param2, androidx.appcompat.view.menu.r param3, View param4) {
         // $FF: Couldn't be decompiled
      }

      protected void e() {
         // $FF: Couldn't be decompiled
      }
   }

   private class b extends ActionMenuItemView.b {
      // $FF: synthetic field
      final ActionMenuPresenter a;

      b(ActionMenuPresenter param1) {
         // $FF: Couldn't be decompiled
      }

      public androidx.appcompat.view.menu.p a() {
         // $FF: Couldn't be decompiled
      }
   }

   private class c implements Runnable {
      // $FF: synthetic field
      final ActionMenuPresenter a;
      private ActionMenuPresenter.e b;

      public c(ActionMenuPresenter param1, ActionMenuPresenter.e param2) {
         // $FF: Couldn't be decompiled
      }

      public void run() {
         // $FF: Couldn't be decompiled
      }
   }

   private class d extends o implements ActionMenuView.a {
      // $FF: synthetic field
      final ActionMenuPresenter a;
      private final float[] b;

      public d(ActionMenuPresenter param1, Context param2) {
         // $FF: Couldn't be decompiled
      }

      public boolean c() {
         // $FF: Couldn't be decompiled
      }

      public boolean d() {
         // $FF: Couldn't be decompiled
      }

      public boolean performClick() {
         // $FF: Couldn't be decompiled
      }

      protected boolean setFrame(int param1, int param2, int param3, int param4) {
         // $FF: Couldn't be decompiled
      }
   }

   private class e extends androidx.appcompat.view.menu.l {
      // $FF: synthetic field
      final ActionMenuPresenter a;

      public e(ActionMenuPresenter param1, Context param2, androidx.appcompat.view.menu.g param3, View param4, boolean param5) {
         // $FF: Couldn't be decompiled
      }

      protected void e() {
         // $FF: Couldn't be decompiled
      }
   }

   private class f implements androidx.appcompat.view.menu.m.a {
      // $FF: synthetic field
      final ActionMenuPresenter a;

      f(ActionMenuPresenter param1) {
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
