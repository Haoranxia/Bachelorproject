package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

class AlertController {
   private int A;
   private boolean B;
   private CharSequence C;
   private Drawable D;
   private CharSequence E;
   private Drawable F;
   private CharSequence G;
   private Drawable H;
   private int I;
   private Drawable J;
   private ImageView K;
   private TextView L;
   private TextView M;
   private View N;
   private int O;
   private int P;
   private boolean Q;
   private int R;
   private final OnClickListener S;
   final f a;
   ListView b;
   Button c;
   Message d;
   Button e;
   Message f;
   Button g;
   Message h;
   NestedScrollView i;
   ListAdapter j;
   int k;
   int l;
   int m;
   int n;
   int o;
   Handler p;
   private final Context q;
   private final Window r;
   private final int s;
   private CharSequence t;
   private CharSequence u;
   private View v;
   private int w;
   private int x;
   private int y;
   private int z;

   public AlertController(Context param1, f param2, Window param3) {
      // $FF: Couldn't be decompiled
   }

   private ViewGroup a(View param1, View param2) {
      // $FF: Couldn't be decompiled
   }

   static void a(View param0, View param1, View param2) {
      // $FF: Couldn't be decompiled
   }

   private void a(ViewGroup param1) {
      // $FF: Couldn't be decompiled
   }

   private void a(ViewGroup param1, View param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private void a(Button param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean a(Context param0) {
      // $FF: Couldn't be decompiled
   }

   static boolean a(View param0) {
      // $FF: Couldn't be decompiled
   }

   private void b(ViewGroup param1) {
      // $FF: Couldn't be decompiled
   }

   private int c() {
      // $FF: Couldn't be decompiled
   }

   private void c(ViewGroup param1) {
      // $FF: Couldn't be decompiled
   }

   private void d() {
      // $FF: Couldn't be decompiled
   }

   private void d(ViewGroup param1) {
      // $FF: Couldn't be decompiled
   }

   public void a() {
      // $FF: Couldn't be decompiled
   }

   public void a(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(int param1, CharSequence param2, android.content.DialogInterface.OnClickListener param3, Message param4, Drawable param5) {
      // $FF: Couldn't be decompiled
   }

   public void a(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(View param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   public void a(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean a(int param1, KeyEvent param2) {
      // $FF: Couldn't be decompiled
   }

   public ListView b() {
      // $FF: Couldn't be decompiled
   }

   public void b(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void b(View param1) {
      // $FF: Couldn't be decompiled
   }

   public void b(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean b(int param1, KeyEvent param2) {
      // $FF: Couldn't be decompiled
   }

   public int c(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void c(View param1) {
      // $FF: Couldn't be decompiled
   }

   public static class RecycleListView extends ListView {
      private final int a;
      private final int b;

      public RecycleListView(Context param1, AttributeSet param2) {
         // $FF: Couldn't be decompiled
      }

      public void a(boolean param1, boolean param2) {
         // $FF: Couldn't be decompiled
      }
   }

   public static class a {
      public int A;
      public int B;
      public int C;
      public int D;
      public boolean E;
      public boolean[] F;
      public boolean G;
      public boolean H;
      public int I;
      public OnMultiChoiceClickListener J;
      public Cursor K;
      public String L;
      public String M;
      public OnItemSelectedListener N;
      public AlertController.a.a O;
      public boolean P;
      public final Context a;
      public final LayoutInflater b;
      public int c;
      public Drawable d;
      public int e;
      public CharSequence f;
      public View g;
      public CharSequence h;
      public CharSequence i;
      public Drawable j;
      public android.content.DialogInterface.OnClickListener k;
      public CharSequence l;
      public Drawable m;
      public android.content.DialogInterface.OnClickListener n;
      public CharSequence o;
      public Drawable p;
      public android.content.DialogInterface.OnClickListener q;
      public boolean r;
      public OnCancelListener s;
      public OnDismissListener t;
      public OnKeyListener u;
      public CharSequence[] v;
      public ListAdapter w;
      public android.content.DialogInterface.OnClickListener x;
      public int y;
      public View z;

      public a(Context param1) {
         // $FF: Couldn't be decompiled
      }

      private void b(AlertController param1) {
         // $FF: Couldn't be decompiled
      }

      public void a(AlertController param1) {
         // $FF: Couldn't be decompiled
      }

      public interface a {
         void a(ListView var1);
      }
   }

   private static final class b extends Handler {
      private WeakReference a;

      public b(DialogInterface param1) {
         // $FF: Couldn't be decompiled
      }

      public void handleMessage(Message param1) {
         // $FF: Couldn't be decompiled
      }
   }

   private static class c extends ArrayAdapter {
      public c(Context param1, int param2, int param3, CharSequence[] param4) {
         // $FF: Couldn't be decompiled
      }

      public long getItemId(int param1) {
         // $FF: Couldn't be decompiled
      }

      public boolean hasStableIds() {
         // $FF: Couldn't be decompiled
      }
   }
}
