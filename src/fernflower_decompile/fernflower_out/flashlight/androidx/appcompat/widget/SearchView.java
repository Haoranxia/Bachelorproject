package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView.OnEditorActionListener;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends ah implements androidx.appcompat.view.c {
   static final SearchView.a i;
   private SearchView.c A;
   private SearchView.b B;
   private SearchView.d C;
   private OnClickListener D;
   private boolean E;
   private boolean F;
   private boolean G;
   private CharSequence H;
   private boolean I;
   private boolean J;
   private int K;
   private boolean L;
   private CharSequence M;
   private CharSequence N;
   private boolean O;
   private int P;
   private Bundle Q;
   private final Runnable R;
   private Runnable S;
   private final WeakHashMap T;
   private final OnClickListener U;
   private final OnEditorActionListener V;
   private final OnItemClickListener W;
   final SearchView.SearchAutoComplete a;
   private final OnItemSelectedListener aa;
   private TextWatcher ab;
   final ImageView b;
   final ImageView c;
   final ImageView d;
   final ImageView e;
   OnFocusChangeListener f;
   androidx.c.a.a g;
   SearchableInfo h;
   OnKeyListener j;
   private final View k;
   private final View l;
   private final View m;
   private final View n;
   private SearchView.e o;
   private Rect p;
   private Rect q;
   private int[] r;
   private int[] s;
   private final ImageView t;
   private final Drawable u;
   private final int v;
   private final int w;
   private final Intent x;
   private final Intent y;
   private final CharSequence z;

   static {
      // $FF: Couldn't be decompiled
   }

   public SearchView(Context param1) {
      // $FF: Couldn't be decompiled
   }

   public SearchView(Context param1, AttributeSet param2) {
      // $FF: Couldn't be decompiled
   }

   public SearchView(Context param1, AttributeSet param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private Intent a(Intent param1, SearchableInfo param2) {
      // $FF: Couldn't be decompiled
   }

   private Intent a(Cursor param1, int param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   private Intent a(String param1, Uri param2, String param3, String param4, int param5, String param6) {
      // $FF: Couldn't be decompiled
   }

   private void a(Intent param1) {
      // $FF: Couldn't be decompiled
   }

   private void a(View param1, Rect param2) {
      // $FF: Couldn't be decompiled
   }

   private void a(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   static boolean a(Context param0) {
      // $FF: Couldn't be decompiled
   }

   private Intent b(Intent param1, SearchableInfo param2) {
      // $FF: Couldn't be decompiled
   }

   private void b(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean b(int param1, int param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   private CharSequence c(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   private void c(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private void e(int param1) {
      // $FF: Couldn't be decompiled
   }

   private int getPreferredHeight() {
      // $FF: Couldn't be decompiled
   }

   private int getPreferredWidth() {
      // $FF: Couldn't be decompiled
   }

   private boolean m() {
      // $FF: Couldn't be decompiled
   }

   private boolean n() {
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

   private void r() {
      // $FF: Couldn't be decompiled
   }

   private void s() {
      // $FF: Couldn't be decompiled
   }

   private void setQuery(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   private void t() {
      // $FF: Couldn't be decompiled
   }

   public void a() {
      // $FF: Couldn't be decompiled
   }

   void a(int param1, String param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   void a(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(CharSequence param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   boolean a(int param1) {
      // $FF: Couldn't be decompiled
   }

   boolean a(int param1, int param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   boolean a(View param1, int param2, KeyEvent param3) {
      // $FF: Couldn't be decompiled
   }

   public void b() {
      // $FF: Couldn't be decompiled
   }

   void b(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean c() {
      // $FF: Couldn't be decompiled
   }

   public void clearFocus() {
      // $FF: Couldn't be decompiled
   }

   void d() {
      // $FF: Couldn't be decompiled
   }

   void e() {
      // $FF: Couldn't be decompiled
   }

   void f() {
      // $FF: Couldn't be decompiled
   }

   void g() {
      // $FF: Couldn't be decompiled
   }

   public int getImeOptions() {
      // $FF: Couldn't be decompiled
   }

   public int getInputType() {
      // $FF: Couldn't be decompiled
   }

   public int getMaxWidth() {
      // $FF: Couldn't be decompiled
   }

   public CharSequence getQuery() {
      // $FF: Couldn't be decompiled
   }

   public CharSequence getQueryHint() {
      // $FF: Couldn't be decompiled
   }

   int getSuggestionCommitIconResId() {
      // $FF: Couldn't be decompiled
   }

   int getSuggestionRowLayout() {
      // $FF: Couldn't be decompiled
   }

   public androidx.c.a.a getSuggestionsAdapter() {
      // $FF: Couldn't be decompiled
   }

   void h() {
      // $FF: Couldn't be decompiled
   }

   void i() {
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

   protected void onLayout(boolean param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   protected void onMeasure(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   protected void onRestoreInstanceState(Parcelable param1) {
      // $FF: Couldn't be decompiled
   }

   protected Parcelable onSaveInstanceState() {
      // $FF: Couldn't be decompiled
   }

   public void onWindowFocusChanged(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean requestFocus(int param1, Rect param2) {
      // $FF: Couldn't be decompiled
   }

   public void setAppSearchData(Bundle param1) {
      // $FF: Couldn't be decompiled
   }

   public void setIconified(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void setIconifiedByDefault(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void setImeOptions(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setInputType(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setMaxWidth(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setOnCloseListener(SearchView.b param1) {
      // $FF: Couldn't be decompiled
   }

   public void setOnQueryTextFocusChangeListener(OnFocusChangeListener param1) {
      // $FF: Couldn't be decompiled
   }

   public void setOnQueryTextListener(SearchView.c param1) {
      // $FF: Couldn't be decompiled
   }

   public void setOnSearchClickListener(OnClickListener param1) {
      // $FF: Couldn't be decompiled
   }

   public void setOnSuggestionListener(SearchView.d param1) {
      // $FF: Couldn't be decompiled
   }

   public void setQueryHint(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   public void setQueryRefinementEnabled(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void setSearchableInfo(SearchableInfo param1) {
      // $FF: Couldn't be decompiled
   }

   public void setSubmitButtonEnabled(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void setSuggestionsAdapter(androidx.c.a.a param1) {
      // $FF: Couldn't be decompiled
   }

   static class SavedState extends AbsSavedState {
      public static final Creator CREATOR;
      boolean a;

      static {
         // $FF: Couldn't be decompiled
      }

      public SavedState(Parcel param1, ClassLoader param2) {
         // $FF: Couldn't be decompiled
      }

      SavedState(Parcelable param1) {
         // $FF: Couldn't be decompiled
      }

      public String toString() {
         // $FF: Couldn't be decompiled
      }

      public void writeToParcel(Parcel param1, int param2) {
         // $FF: Couldn't be decompiled
      }
   }

   public static class SearchAutoComplete extends androidx.appcompat.widget.d {
      final Runnable a;
      private int b;
      private SearchView c;
      private boolean d;

      public SearchAutoComplete(Context param1, AttributeSet param2) {
         // $FF: Couldn't be decompiled
      }

      public SearchAutoComplete(Context param1, AttributeSet param2, int param3) {
         // $FF: Couldn't be decompiled
      }

      private int getSearchViewTextMinWidthDp() {
         // $FF: Couldn't be decompiled
      }

      boolean a() {
         // $FF: Couldn't be decompiled
      }

      void b() {
         // $FF: Couldn't be decompiled
      }

      public boolean enoughToFilter() {
         // $FF: Couldn't be decompiled
      }

      public InputConnection onCreateInputConnection(EditorInfo param1) {
         // $FF: Couldn't be decompiled
      }

      protected void onFinishInflate() {
         // $FF: Couldn't be decompiled
      }

      protected void onFocusChanged(boolean param1, int param2, Rect param3) {
         // $FF: Couldn't be decompiled
      }

      public boolean onKeyPreIme(int param1, KeyEvent param2) {
         // $FF: Couldn't be decompiled
      }

      public void onWindowFocusChanged(boolean param1) {
         // $FF: Couldn't be decompiled
      }

      public void performCompletion() {
         // $FF: Couldn't be decompiled
      }

      protected void replaceText(CharSequence param1) {
         // $FF: Couldn't be decompiled
      }

      void setImeVisibility(boolean param1) {
         // $FF: Couldn't be decompiled
      }

      void setSearchView(SearchView param1) {
         // $FF: Couldn't be decompiled
      }

      public void setThreshold(int param1) {
         // $FF: Couldn't be decompiled
      }
   }

   private static class a {
      private Method a;
      private Method b;
      private Method c;

      a() {
         // $FF: Couldn't be decompiled
      }

      void a(AutoCompleteTextView param1) {
         // $FF: Couldn't be decompiled
      }

      void a(AutoCompleteTextView param1, boolean param2) {
         // $FF: Couldn't be decompiled
      }

      void b(AutoCompleteTextView param1) {
         // $FF: Couldn't be decompiled
      }
   }

   public interface b {
      boolean a();
   }

   public interface c {
      boolean a(String var1);

      boolean b(String var1);
   }

   public interface d {
      boolean a(int var1);

      boolean b(int var1);
   }

   private static class e extends TouchDelegate {
      private final View a;
      private final Rect b;
      private final Rect c;
      private final Rect d;
      private final int e;
      private boolean f;

      public e(Rect param1, Rect param2, View param3) {
         // $FF: Couldn't be decompiled
      }

      public void a(Rect param1, Rect param2) {
         // $FF: Couldn't be decompiled
      }

      public boolean onTouchEvent(MotionEvent param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
