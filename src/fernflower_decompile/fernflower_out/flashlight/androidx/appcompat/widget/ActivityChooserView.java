package androidx.appcompat.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;

public class ActivityChooserView extends ViewGroup {
   final ActivityChooserView.a a;
   final FrameLayout b;
   final FrameLayout c;
   androidx.core.g.b d;
   final DataSetObserver e;
   OnDismissListener f;
   boolean g;
   int h;
   private final ActivityChooserView.b i;
   private final View j;
   private final ImageView k;
   private final int l;
   private final OnGlobalLayoutListener m;
   private ai n;
   private boolean o;
   private int p;

   void a(int param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean a() {
      // $FF: Couldn't be decompiled
   }

   public boolean b() {
      // $FF: Couldn't be decompiled
   }

   public boolean c() {
      // $FF: Couldn't be decompiled
   }

   public c getDataModel() {
      // $FF: Couldn't be decompiled
   }

   ai getListPopupWindow() {
      // $FF: Couldn't be decompiled
   }

   protected void onAttachedToWindow() {
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

   public void setActivityChooserModel(c param1) {
      // $FF: Couldn't be decompiled
   }

   public void setDefaultActionButtonContentDescription(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setExpandActivityOverflowButtonContentDescription(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setExpandActivityOverflowButtonDrawable(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   public void setInitialActivityCount(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setOnDismissListener(OnDismissListener param1) {
      // $FF: Couldn't be decompiled
   }

   public void setProvider(androidx.core.g.b param1) {
      // $FF: Couldn't be decompiled
   }

   public static class InnerLayout extends LinearLayout {
      private static final int[] a;

      static {
         // $FF: Couldn't be decompiled
      }

      public InnerLayout(Context param1, AttributeSet param2) {
         // $FF: Couldn't be decompiled
      }
   }

   private class a extends BaseAdapter {
      // $FF: synthetic field
      final ActivityChooserView a;
      private c b;
      private int c;
      private boolean d;
      private boolean e;
      private boolean f;

      public int a() {
         // $FF: Couldn't be decompiled
      }

      public void a(int param1) {
         // $FF: Couldn't be decompiled
      }

      public void a(c param1) {
         // $FF: Couldn't be decompiled
      }

      public void a(boolean param1) {
         // $FF: Couldn't be decompiled
      }

      public void a(boolean param1, boolean param2) {
         // $FF: Couldn't be decompiled
      }

      public ResolveInfo b() {
         // $FF: Couldn't be decompiled
      }

      public int c() {
         // $FF: Couldn't be decompiled
      }

      public c d() {
         // $FF: Couldn't be decompiled
      }

      public boolean e() {
         // $FF: Couldn't be decompiled
      }

      public int getCount() {
         // $FF: Couldn't be decompiled
      }

      public Object getItem(int param1) {
         // $FF: Couldn't be decompiled
      }

      public long getItemId(int param1) {
         // $FF: Couldn't be decompiled
      }

      public int getItemViewType(int param1) {
         // $FF: Couldn't be decompiled
      }

      public View getView(int param1, View param2, ViewGroup param3) {
         // $FF: Couldn't be decompiled
      }

      public int getViewTypeCount() {
         // $FF: Couldn't be decompiled
      }
   }

   private class b implements OnClickListener, OnLongClickListener, OnItemClickListener, OnDismissListener {
      // $FF: synthetic field
      final ActivityChooserView a;

      private void a() {
         // $FF: Couldn't be decompiled
      }

      public void onClick(View param1) {
         // $FF: Couldn't be decompiled
      }

      public void onDismiss() {
         // $FF: Couldn't be decompiled
      }

      public void onItemClick(AdapterView param1, View param2, int param3, long param4) {
         // $FF: Couldn't be decompiled
      }

      public boolean onLongClick(View param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
