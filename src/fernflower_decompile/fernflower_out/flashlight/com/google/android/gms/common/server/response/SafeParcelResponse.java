package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;

@KeepForSdk
@SafeParcelable.Class(
   creator = "SafeParcelResponseCreator"
)
@VisibleForTesting
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
   @KeepForSdk
   public static final Creator CREATOR;
   private final String mClassName;
   @SafeParcelable.VersionField(
      getter = "getVersionCode",
      id = 1
   )
   private final int zalf;
   @SafeParcelable.Field(
      getter = "getFieldMappingDictionary",
      id = 3
   )
   private final zak zapz;
   @SafeParcelable.Field(
      getter = "getParcel",
      id = 2
   )
   private final Parcel zarb;
   private final int zarc;
   private int zard;
   private int zare;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   SafeParcelResponse(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) Parcel param2, @SafeParcelable.Param(id = 3) zak param3) {
      // $FF: Couldn't be decompiled
   }

   private SafeParcelResponse(SafeParcelable param1, zak param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   public SafeParcelResponse(zak param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public static SafeParcelResponse from(FastJsonResponse param0) {
      // $FF: Couldn't be decompiled
   }

   private static void zaa(zak param0, FastJsonResponse param1) {
      // $FF: Couldn't be decompiled
   }

   private static void zaa(StringBuilder param0, int param1, Object param2) {
      // $FF: Couldn't be decompiled
   }

   private final void zaa(StringBuilder param1, Map param2, Parcel param3) {
      // $FF: Couldn't be decompiled
   }

   private final void zab(FastJsonResponse.Field param1) {
      // $FF: Couldn't be decompiled
   }

   private final void zab(StringBuilder param1, FastJsonResponse.Field param2, Object param3) {
      // $FF: Couldn't be decompiled
   }

   private final Parcel zacu() {
      // $FF: Couldn't be decompiled
   }

   public void addConcreteTypeArrayInternal(FastJsonResponse.Field param1, String param2, ArrayList param3) {
      // $FF: Couldn't be decompiled
   }

   public void addConcreteTypeInternal(FastJsonResponse.Field param1, String param2, FastJsonResponse param3) {
      // $FF: Couldn't be decompiled
   }

   public Map getFieldMappings() {
      // $FF: Couldn't be decompiled
   }

   public Object getValueObject(String param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean isPrimitiveFieldSet(String param1) {
      // $FF: Couldn't be decompiled
   }

   protected void setBooleanInternal(FastJsonResponse.Field param1, String param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   protected void setDecodedBytesInternal(FastJsonResponse.Field param1, String param2, byte[] param3) {
      // $FF: Couldn't be decompiled
   }

   protected void setIntegerInternal(FastJsonResponse.Field param1, String param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   protected void setLongInternal(FastJsonResponse.Field param1, String param2, long param3) {
      // $FF: Couldn't be decompiled
   }

   protected void setStringInternal(FastJsonResponse.Field param1, String param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   protected void setStringsInternal(FastJsonResponse.Field param1, String param2, ArrayList param3) {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      // $FF: Couldn't be decompiled
   }

   public void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   protected final void zaa(FastJsonResponse.Field param1, String param2, double param3) {
      // $FF: Couldn't be decompiled
   }

   protected final void zaa(FastJsonResponse.Field param1, String param2, float param3) {
      // $FF: Couldn't be decompiled
   }

   protected final void zaa(FastJsonResponse.Field param1, String param2, BigDecimal param3) {
      // $FF: Couldn't be decompiled
   }

   protected final void zaa(FastJsonResponse.Field param1, String param2, BigInteger param3) {
      // $FF: Couldn't be decompiled
   }

   protected final void zaa(FastJsonResponse.Field param1, String param2, ArrayList param3) {
      // $FF: Couldn't be decompiled
   }

   protected final void zaa(FastJsonResponse.Field param1, String param2, Map param3) {
      // $FF: Couldn't be decompiled
   }

   protected final void zab(FastJsonResponse.Field param1, String param2, ArrayList param3) {
      // $FF: Couldn't be decompiled
   }

   protected final void zac(FastJsonResponse.Field param1, String param2, ArrayList param3) {
      // $FF: Couldn't be decompiled
   }

   protected final void zad(FastJsonResponse.Field param1, String param2, ArrayList param3) {
      // $FF: Couldn't be decompiled
   }

   protected final void zae(FastJsonResponse.Field param1, String param2, ArrayList param3) {
      // $FF: Couldn't be decompiled
   }

   protected final void zaf(FastJsonResponse.Field param1, String param2, ArrayList param3) {
      // $FF: Couldn't be decompiled
   }

   protected final void zag(FastJsonResponse.Field param1, String param2, ArrayList param3) {
      // $FF: Couldn't be decompiled
   }
}
