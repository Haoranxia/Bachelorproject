package androidx.core.b.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;
import android.view.View;

public interface b extends MenuItem {
   b a(androidx.core.g.b var1);

   b a(CharSequence var1);

   androidx.core.g.b a();

   b b(CharSequence var1);

   boolean collapseActionView();

   boolean expandActionView();

   View getActionView();

   int getAlphabeticModifiers();

   CharSequence getContentDescription();

   ColorStateList getIconTintList();

   Mode getIconTintMode();

   int getNumericModifiers();

   CharSequence getTooltipText();

   boolean isActionViewExpanded();

   MenuItem setActionView(int var1);

   MenuItem setActionView(View var1);

   MenuItem setAlphabeticShortcut(char var1, int var2);

   MenuItem setIconTintList(ColorStateList var1);

   MenuItem setIconTintMode(Mode var1);

   MenuItem setNumericShortcut(char var1, int var2);

   MenuItem setShortcut(char var1, char var2, int var3, int var4);

   void setShowAsAction(int var1);

   MenuItem setShowAsActionFlags(int var1);
}
