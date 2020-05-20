package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzaew;
import com.google.android.gms.internal.ads.zzaey;
import com.google.android.gms.internal.ads.zzazb;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzty;

@SafeParcelable.Class(
   creator = "AdOverlayInfoCreator"
)
@SafeParcelable.Reserved({1})
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 11
   )
   public final int orientation;
   @SafeParcelable.Field(
      id = 13
   )
   public final String url;
   @SafeParcelable.Field(
      id = 14
   )
   public final zzazb zzbll;
   @SafeParcelable.Field(
      getter = "getAdClickListenerAsBinder",
      id = 3,
      type = "android.os.IBinder"
   )
   public final zzty zzcbt;
   @SafeParcelable.Field(
      getter = "getAdMetadataGmsgListenerAsBinder",
      id = 18,
      type = "android.os.IBinder"
   )
   public final zzaew zzcwq;
   @SafeParcelable.Field(
      getter = "getAppEventGmsgListenerAsBinder",
      id = 6,
      type = "android.os.IBinder"
   )
   public final zzaey zzcws;
   @SafeParcelable.Field(
      getter = "getAdWebViewAsBinder",
      id = 5,
      type = "android.os.IBinder"
   )
   public final zzbdi zzcza;
   @SafeParcelable.Field(
      id = 2
   )
   public final zzd zzdhp;
   @SafeParcelable.Field(
      getter = "getAdOverlayListenerAsBinder",
      id = 4,
      type = "android.os.IBinder"
   )
   public final zzo zzdhq;
   @SafeParcelable.Field(
      id = 7
   )
   public final String zzdhr;
   @SafeParcelable.Field(
      id = 8
   )
   public final boolean zzdhs;
   @SafeParcelable.Field(
      id = 9
   )
   public final String zzdht;
   @SafeParcelable.Field(
      getter = "getLeaveApplicationListenerAsBinder",
      id = 10,
      type = "android.os.IBinder"
   )
   public final zzt zzdhu;
   @SafeParcelable.Field(
      id = 12
   )
   public final int zzdhv;
   @SafeParcelable.Field(
      id = 16
   )
   public final String zzdhw;
   @SafeParcelable.Field(
      id = 17
   )
   public final com.google.android.gms.ads.internal.zzg zzdhx;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   AdOverlayInfoParcel(@SafeParcelable.Param(id = 2) zzd param1, @SafeParcelable.Param(id = 3) IBinder param2, @SafeParcelable.Param(id = 4) IBinder param3, @SafeParcelable.Param(id = 5) IBinder param4, @SafeParcelable.Param(id = 6) IBinder param5, @SafeParcelable.Param(id = 7) String param6, @SafeParcelable.Param(id = 8) boolean param7, @SafeParcelable.Param(id = 9) String param8, @SafeParcelable.Param(id = 10) IBinder param9, @SafeParcelable.Param(id = 11) int param10, @SafeParcelable.Param(id = 12) int param11, @SafeParcelable.Param(id = 13) String param12, @SafeParcelable.Param(id = 14) zzazb param13, @SafeParcelable.Param(id = 16) String param14, @SafeParcelable.Param(id = 17) com.google.android.gms.ads.internal.zzg param15, @SafeParcelable.Param(id = 18) IBinder param16) {
      // $FF: Couldn't be decompiled
   }

   public AdOverlayInfoParcel(zzd param1, zzty param2, zzo param3, zzt param4, zzazb param5) {
      // $FF: Couldn't be decompiled
   }

   public AdOverlayInfoParcel(zzty param1, zzo param2, zzt param3, zzbdi param4, int param5, zzazb param6, String param7, com.google.android.gms.ads.internal.zzg param8, String param9, String param10) {
      // $FF: Couldn't be decompiled
   }

   public AdOverlayInfoParcel(zzty param1, zzo param2, zzt param3, zzbdi param4, boolean param5, int param6, zzazb param7) {
      // $FF: Couldn't be decompiled
   }

   public AdOverlayInfoParcel(zzty param1, zzo param2, zzaew param3, zzaey param4, zzt param5, zzbdi param6, boolean param7, int param8, String param9, zzazb param10) {
      // $FF: Couldn't be decompiled
   }

   public AdOverlayInfoParcel(zzty param1, zzo param2, zzaew param3, zzaey param4, zzt param5, zzbdi param6, boolean param7, int param8, String param9, String param10, zzazb param11) {
      // $FF: Couldn't be decompiled
   }

   public static void zza(Intent param0, AdOverlayInfoParcel param1) {
      // $FF: Couldn't be decompiled
   }

   public static AdOverlayInfoParcel zzc(Intent param0) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
