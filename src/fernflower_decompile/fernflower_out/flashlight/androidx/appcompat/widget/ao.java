package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class ao extends HorizontalScrollView implements OnItemSelectedListener {
   private static final Interpolator j;
   Runnable a;
   ah b;
   int c;
   int d;
   private ao.b e;
   private Spinner f;
   private boolean g;
   private int h;
   private int i;

   static {
      // $FF: Couldn't be decompiled
   }

   private boolean a() {
      // $FF: Couldn't be decompiled
   }

   private void b() {
      // $FF: Couldn't be decompiled
   }

   private boolean c() {
      // $FF: Couldn't be decompiled
   }

   private Spinner d() {
      // $FF: Couldn't be decompiled
   }

   ao.c a(androidx.appcompat.app.a.c param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void onAttachedToWindow() {
      // $FF: Couldn't be decompiled
   }

   protected void onConfigurationChanged(Configuration param1) {
      // $FF: Couldn't be decompiled
   }

   public void onDetachedFromWindow() {
      // $FF: Couldn't be decompiled
   }

   public void onItemSelected(AdapterView param1, View param2, int param3, long param4) {
      // $FF: Couldn't be decompiled
   }

   public void onMeasure(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public void onNothingSelected(AdapterView param1) {
      // $FF: Couldn't be decompiled
   }

   public void setAllowCollapse(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void setContentHeight(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setTabSelected(int param1) {
      // $FF: Couldn't be decompiled
   }

   private class a extends BaseAdapter {
      // $FF: synthetic field
      final ao a;

      a(ao param1) {
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

      public View getView(int param1, View param2, ViewGroup param3) {
         // $FF: Couldn't be decompiled
      }
   }

   private class b implements OnClickListener {
      // $FF: synthetic field
      final ao a;

      b(ao param1) {
         // $FF: Couldn't be decompiled
      }

      public void onClick(View param1) {
         // $FF: Couldn't be decompiled
      }
   }

   private class c extends LinearLayout {
      // $FF: synthetic field
      final ao a;
      private final int[] b;
      private androidx.appcompat.app.a.c c;
      private TextView d;
      private ImageView e;
      private View f;

      public c(ao param1, Context param2, androidx.appcompat.app.a.c param3, boolean param4) {
         // $FF: Couldn't be decompiled
      }

      public void a() {
         // $FF: Couldn't be decompiled
      }

      public void a(androidx.appcompat.app.a.c param1) {
         // $FF: Couldn't be decompiled
      }

      public androidx.appcompat.app.a.c b() {
         // $FF: Couldn't be decompiled
      }

      public void onInitializeAccessibilityEvent(AccessibilityEvent param1) {
         // $FF: Couldn't be decompiled
      }

      public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo param1) {
         // $FF: Couldn't be decompiled
      }

      public void onMeasure(int param1, int param2) {
         // $FF: Couldn't be decompiled
      }

      public void setSelected(boolean param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
