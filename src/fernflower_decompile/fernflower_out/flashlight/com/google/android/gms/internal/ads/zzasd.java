package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONArray;

@SafeParcelable.Class(
   creator = "RewardItemParcelCreator"
)
@SafeParcelable.Reserved({1})
public final class zzasd extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 2
   )
   public final String type;
   @SafeParcelable.Field(
      id = 3
   )
   public final int zzdno;

   static {
      // $FF: Couldn't be decompiled
   }

   public zzasd(RewardItem param1) {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzasd(@SafeParcelable.Param(id = 2) String param1, @SafeParcelable.Param(id = 3) int param2) {
      // $FF: Couldn't be decompiled
   }

   public static zzasd zza(JSONArray param0) {
      // $FF: Couldn't be decompiled
   }

   public final boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public final int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
