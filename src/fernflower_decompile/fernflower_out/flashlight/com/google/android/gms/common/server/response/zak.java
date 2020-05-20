package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class(
   creator = "FieldMappingDictionaryCreator"
)
public final class zak extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.VersionField(
      id = 1
   )
   private final int zalf;
   private final HashMap zaqv;
   @SafeParcelable.Field(
      getter = "getSerializedDictionary",
      id = 2
   )
   private final ArrayList zaqw;
   @SafeParcelable.Field(
      getter = "getRootClassName",
      id = 3
   )
   private final String zaqx;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zak(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) ArrayList param2, @SafeParcelable.Param(id = 3) String param3) {
      // $FF: Couldn't be decompiled
   }

   public zak(java.lang.Class param1) {
      // $FF: Couldn't be decompiled
   }

   public final String toString() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void zaa(java.lang.Class param1, Map param2) {
      // $FF: Couldn't be decompiled
   }

   public final boolean zaa(java.lang.Class param1) {
      // $FF: Couldn't be decompiled
   }

   public final void zacr() {
      // $FF: Couldn't be decompiled
   }

   public final void zacs() {
      // $FF: Couldn't be decompiled
   }

   public final String zact() {
      // $FF: Couldn't be decompiled
   }

   public final Map zai(String param1) {
      // $FF: Couldn't be decompiled
   }
}
