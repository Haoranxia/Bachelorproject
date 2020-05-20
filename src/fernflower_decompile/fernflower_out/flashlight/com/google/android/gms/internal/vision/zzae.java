package com.google.android.gms.internal.vision;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(
   creator = "RecognitionOptionsCreator"
)
@SafeParcelable.Reserved({1})
public final class zzae extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 2
   )
   public final Rect zzeq;

   static {
      // $FF: Couldn't be decompiled
   }

   public zzae() {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   public zzae(@SafeParcelable.Param(id = 2) Rect param1) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
