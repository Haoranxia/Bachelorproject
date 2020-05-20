package androidx.c.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

public abstract class a extends BaseAdapter implements Filterable, androidx.c.a.b.a {
   protected boolean a;
   protected boolean b;
   protected Cursor c;
   protected Context d;
   protected int e;
   protected androidx.c.a.a.a f;
   protected DataSetObserver g;
   protected androidx.c.a.b h;
   protected FilterQueryProvider i;

   public a(Context param1, Cursor param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   public Cursor a() {
      // $FF: Couldn't be decompiled
   }

   public Cursor a(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   public abstract View a(Context var1, Cursor var2, ViewGroup var3);

   void a(Context param1, Cursor param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public void a(Cursor param1) {
      // $FF: Couldn't be decompiled
   }

   public abstract void a(View var1, Context var2, Cursor var3);

   public View b(Context param1, Cursor param2, ViewGroup param3) {
      // $FF: Couldn't be decompiled
   }

   public CharSequence b(Cursor param1) {
      // $FF: Couldn't be decompiled
   }

   protected void b() {
      // $FF: Couldn't be decompiled
   }

   public Cursor c(Cursor param1) {
      // $FF: Couldn't be decompiled
   }

   public int getCount() {
      // $FF: Couldn't be decompiled
   }

   public View getDropDownView(int param1, View param2, ViewGroup param3) {
      // $FF: Couldn't be decompiled
   }

   public Filter getFilter() {
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

   public boolean hasStableIds() {
      // $FF: Couldn't be decompiled
   }

   private class a extends ContentObserver {
      // $FF: synthetic field
      final androidx.c.a.a a;

      a(androidx.c.a.a param1) {
         // $FF: Couldn't be decompiled
      }

      public boolean deliverSelfNotifications() {
         // $FF: Couldn't be decompiled
      }

      public void onChange(boolean param1) {
         // $FF: Couldn't be decompiled
      }
   }

   private class b extends DataSetObserver {
      // $FF: synthetic field
      final androidx.c.a.a a;

      b(androidx.c.a.a param1) {
         // $FF: Couldn't be decompiled
      }

      public void onChanged() {
         // $FF: Couldn't be decompiled
      }

      public void onInvalidated() {
         // $FF: Couldn't be decompiled
      }
   }
}
