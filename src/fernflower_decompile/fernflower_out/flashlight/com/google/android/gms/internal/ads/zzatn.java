package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import org.json.JSONObject;

@SafeParcelable.Class(
   creator = "SafeBrowsingConfigParcelCreator"
)
@SafeParcelable.Reserved({1})
public final class zzatn extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 2
   )
   public final String zzdos;
   @SafeParcelable.Field(
      id = 3
   )
   public final String zzdot;
   @SafeParcelable.Field(
      id = 4
   )
   public final boolean zzdou;
   @SafeParcelable.Field(
      id = 5
   )
   public final boolean zzdov;
   @SafeParcelable.Field(
      id = 6
   )
   public final List zzdow;
   @SafeParcelable.Field(
      id = 7
   )
   public final boolean zzdox;
   @SafeParcelable.Field(
      id = 8
   )
   public final boolean zzdoy;
   @SafeParcelable.Field(
      id = 9
   )
   public final List zzdoz;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzatn(@SafeParcelable.Param(id = 2) String param1, @SafeParcelable.Param(id = 3) String param2, @SafeParcelable.Param(id = 4) boolean param3, @SafeParcelable.Param(id = 5) boolean param4, @SafeParcelable.Param(id = 6) List param5, @SafeParcelable.Param(id = 7) boolean param6, @SafeParcelable.Param(id = 8) boolean param7, @SafeParcelable.Param(id = 9) List param8) {
      // $FF: Couldn't be decompiled
   }

   public static zzatn zzg(JSONObject param0) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
