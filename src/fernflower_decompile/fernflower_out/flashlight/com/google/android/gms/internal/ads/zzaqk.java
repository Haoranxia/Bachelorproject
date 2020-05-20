package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@SafeParcelable.Class(
   creator = "NonagonRequestParcelCreator"
)
public final class zzaqk extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 3
   )
   public final ApplicationInfo applicationInfo;
   @SafeParcelable.Field(
      id = 4
   )
   public final String packageName;
   @SafeParcelable.Field(
      id = 2
   )
   public final zzazb zzdij;
   @SafeParcelable.Field(
      id = 6
   )
   public final PackageInfo zzdip;
   @SafeParcelable.Field(
      id = 5
   )
   public final List zzdiz;
   @SafeParcelable.Field(
      id = 7
   )
   public final String zzdjj;
   @SafeParcelable.Field(
      id = 1
   )
   public final Bundle zzdlu;
   @SafeParcelable.Field(
      id = 8
   )
   public final boolean zzdlv;
   @SafeParcelable.Field(
      id = 9
   )
   public final String zzdlw;
   @SafeParcelable.Field(
      id = 10
   )
   public zzdbe zzdlx;
   @SafeParcelable.Field(
      id = 11
   )
   public String zzdly;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzaqk(@SafeParcelable.Param(id = 1) Bundle param1, @SafeParcelable.Param(id = 2) zzazb param2, @SafeParcelable.Param(id = 3) ApplicationInfo param3, @SafeParcelable.Param(id = 4) String param4, @SafeParcelable.Param(id = 5) List param5, @SafeParcelable.Param(id = 6) PackageInfo param6, @SafeParcelable.Param(id = 7) String param7, @SafeParcelable.Param(id = 8) boolean param8, @SafeParcelable.Param(id = 9) String param9, @SafeParcelable.Param(id = 10) zzdbe param10, @SafeParcelable.Param(id = 11) String param11) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
