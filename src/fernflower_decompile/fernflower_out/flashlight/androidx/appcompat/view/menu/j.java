package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ActionProvider.VisibilityListener;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

public class j extends androidx.appcompat.view.menu.c implements MenuItem {
   private final androidx.core.b.a.b b;
   private Method c;

   public j(Context param1, androidx.core.b.a.b param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean collapseActionView() {
      // $FF: Couldn't be decompiled
   }

   public boolean expandActionView() {
      // $FF: Couldn't be decompiled
   }

   public ActionProvider getActionProvider() {
      // $FF: Couldn't be decompiled
   }

   public View getActionView() {
      // $FF: Couldn't be decompiled
   }

   public int getAlphabeticModifiers() {
      // $FF: Couldn't be decompiled
   }

   public char getAlphabeticShortcut() {
      // $FF: Couldn't be decompiled
   }

   public CharSequence getContentDescription() {
      // $FF: Couldn't be decompiled
   }

   public int getGroupId() {
      // $FF: Couldn't be decompiled
   }

   public Drawable getIcon() {
      // $FF: Couldn't be decompiled
   }

   public ColorStateList getIconTintList() {
      // $FF: Couldn't be decompiled
   }

   public Mode getIconTintMode() {
      // $FF: Couldn't be decompiled
   }

   public Intent getIntent() {
      // $FF: Couldn't be decompiled
   }

   public int getItemId() {
      // $FF: Couldn't be decompiled
   }

   public ContextMenuInfo getMenuInfo() {
      // $FF: Couldn't be decompiled
   }

   public int getNumericModifiers() {
      // $FF: Couldn't be decompiled
   }

   public char getNumericShortcut() {
      // $FF: Couldn't be decompiled
   }

   public int getOrder() {
      // $FF: Couldn't be decompiled
   }

   public SubMenu getSubMenu() {
      // $FF: Couldn't be decompiled
   }

   public CharSequence getTitle() {
      // $FF: Couldn't be decompiled
   }

   public CharSequence getTitleCondensed() {
      // $FF: Couldn't be decompiled
   }

   public CharSequence getTooltipText() {
      // $FF: Couldn't be decompiled
   }

   public boolean hasSubMenu() {
      // $FF: Couldn't be decompiled
   }

   public boolean isActionViewExpanded() {
      // $FF: Couldn't be decompiled
   }

   public boolean isCheckable() {
      // $FF: Couldn't be decompiled
   }

   public boolean isChecked() {
      // $FF: Couldn't be decompiled
   }

   public boolean isEnabled() {
      // $FF: Couldn't be decompiled
   }

   public boolean isVisible() {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setActionProvider(ActionProvider param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setActionView(int param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setActionView(View param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setAlphabeticShortcut(char param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setAlphabeticShortcut(char param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setCheckable(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setChecked(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setContentDescription(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setEnabled(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setIcon(int param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setIcon(Drawable param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setIconTintList(ColorStateList param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setIconTintMode(Mode param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setIntent(Intent param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setNumericShortcut(char param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setNumericShortcut(char param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setOnActionExpandListener(OnActionExpandListener param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setShortcut(char param1, char param2) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setShortcut(char param1, char param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public void setShowAsAction(int param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setShowAsActionFlags(int param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setTitle(int param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setTitle(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setTitleCondensed(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setTooltipText(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   public MenuItem setVisible(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private class a extends androidx.core.g.b {
      final ActionProvider a;
      // $FF: synthetic field
      final j b;

      a(j param1, Context param2, ActionProvider param3) {
         // $FF: Couldn't be decompiled
      }

      public View a() {
         // $FF: Couldn't be decompiled
      }

      public void a(SubMenu param1) {
         // $FF: Couldn't be decompiled
      }

      public boolean b() {
         // $FF: Couldn't be decompiled
      }

      public boolean c() {
         // $FF: Couldn't be decompiled
      }
   }

   private class b extends j.a implements VisibilityListener {
      // $FF: synthetic field
      final j c;
      private androidx.core.g.b.b d;

      b(j param1, Context param2, ActionProvider param3) {
         // $FF: Couldn't be decompiled
      }

      public View a(MenuItem param1) {
         // $FF: Couldn't be decompiled
      }

      public void a(androidx.core.g.b.b param1) {
         // $FF: Couldn't be decompiled
      }

      public boolean d() {
         // $FF: Couldn't be decompiled
      }

      public boolean e() {
         // $FF: Couldn't be decompiled
      }

      public void onActionProviderVisibilityChanged(boolean param1) {
         // $FF: Couldn't be decompiled
      }
   }

   static class c extends FrameLayout implements androidx.appcompat.view.c {
      final CollapsibleActionView a;

      c(View param1) {
         // $FF: Couldn't be decompiled
      }

      public void a() {
         // $FF: Couldn't be decompiled
      }

      public void b() {
         // $FF: Couldn't be decompiled
      }

      View c() {
         // $FF: Couldn't be decompiled
      }
   }

   private class d implements OnActionExpandListener {
      // $FF: synthetic field
      final j a;
      private final OnActionExpandListener b;

      d(j param1, OnActionExpandListener param2) {
         // $FF: Couldn't be decompiled
      }

      public boolean onMenuItemActionCollapse(MenuItem param1) {
         // $FF: Couldn't be decompiled
      }

      public boolean onMenuItemActionExpand(MenuItem param1) {
         // $FF: Couldn't be decompiled
      }
   }

   private class e implements OnMenuItemClickListener {
      // $FF: synthetic field
      final j a;
      private final OnMenuItemClickListener b;

      e(j param1, OnMenuItemClickListener param2) {
         // $FF: Couldn't be decompiled
      }

      public boolean onMenuItemClick(MenuItem param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
