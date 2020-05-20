package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@SafeParcelable.Class(
   creator = "AdRequestInfoParcelCreator"
)
public final class zzapv extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 6
   )
   private final ApplicationInfo applicationInfo;
   @SafeParcelable.Field(
      id = 1
   )
   private final int versionCode;
   @SafeParcelable.Field(
      id = 11
   )
   private final zzazb zzbll;
   @SafeParcelable.Field(
      id = 4
   )
   private final zzuj zzblm;
   @SafeParcelable.Field(
      id = 20
   )
   private final float zzboh;
   @SafeParcelable.Field(
      id = 5
   )
   private final String zzbqz;
   @SafeParcelable.Field(
      id = 10
   )
   private final String zzcdu;
   @SafeParcelable.Field(
      id = 42
   )
   private final boolean zzdbv;
   @SafeParcelable.Field(
      id = 29
   )
   private final zzaby zzddz;
   @SafeParcelable.Field(
      id = 14
   )
   private final List zzdea;
   @SafeParcelable.Field(
      id = 18
   )
   private final int zzdgf;
   @SafeParcelable.Field(
      id = 19
   )
   private final int zzdgg;
   @SafeParcelable.Field(
      id = 2
   )
   private final Bundle zzdin;
   @SafeParcelable.Field(
      id = 3
   )
   private final zzug zzdio;
   @SafeParcelable.Field(
      id = 7
   )
   private final PackageInfo zzdip;
   @SafeParcelable.Field(
      id = 8
   )
   private final String zzdiq;
   @SafeParcelable.Field(
      id = 9
   )
   private final String zzdir;
   @SafeParcelable.Field(
      id = 12
   )
   private final Bundle zzdis;
   @SafeParcelable.Field(
      id = 13
   )
   private final int zzdit;
   @SafeParcelable.Field(
      id = 15
   )
   private final Bundle zzdiu;
   @SafeParcelable.Field(
      id = 16
   )
   private final boolean zzdiv;
   @SafeParcelable.Field(
      id = 21
   )
   private final String zzdiw;
   @SafeParcelable.Field(
      id = 25
   )
   private final long zzdix;
   @SafeParcelable.Field(
      id = 26
   )
   private final String zzdiy;
   @SafeParcelable.Field(
      id = 27
   )
   private final List zzdiz;
   @SafeParcelable.Field(
      id = 28
   )
   private final String zzdja;
   @SafeParcelable.Field(
      id = 30
   )
   private final List zzdjb;
   @SafeParcelable.Field(
      id = 31
   )
   private final long zzdjc;
   @SafeParcelable.Field(
      id = 33
   )
   private final String zzdjd;
   @SafeParcelable.Field(
      id = 34
   )
   private final float zzdje;
   @SafeParcelable.Field(
      id = 35
   )
   private final int zzdjf;
   @SafeParcelable.Field(
      id = 36
   )
   private final int zzdjg;
   @SafeParcelable.Field(
      id = 37
   )
   private final boolean zzdjh;
   @SafeParcelable.Field(
      id = 38
   )
   private final boolean zzdji;
   @SafeParcelable.Field(
      id = 39
   )
   private final String zzdjj;
   @SafeParcelable.Field(
      id = 40
   )
   private final boolean zzdjk;
   @SafeParcelable.Field(
      id = 41
   )
   private final String zzdjl;
   @SafeParcelable.Field(
      id = 43
   )
   private final int zzdjm;
   @SafeParcelable.Field(
      id = 44
   )
   private final Bundle zzdjn;
   @SafeParcelable.Field(
      id = 45
   )
   private final String zzdjo;
   @SafeParcelable.Field(
      id = 46
   )
   private final zzxh zzdjp;
   @SafeParcelable.Field(
      id = 47
   )
   private final boolean zzdjq;
   @SafeParcelable.Field(
      id = 48
   )
   private final Bundle zzdjr;
   @SafeParcelable.Field(
      id = 49
   )
   private final String zzdjs;
   @SafeParcelable.Field(
      id = 50
   )
   private final String zzdjt;
   @SafeParcelable.Field(
      id = 51
   )
   private final String zzdju;
   @SafeParcelable.Field(
      id = 52
   )
   private final boolean zzdjv;
   @SafeParcelable.Field(
      id = 53
   )
   private final List zzdjw;
   @SafeParcelable.Field(
      id = 54
   )
   private final String zzdjx;
   @SafeParcelable.Field(
      id = 55
   )
   private final List zzdjy;
   @SafeParcelable.Field(
      id = 56
   )
   private final int zzdjz;
   @SafeParcelable.Field(
      id = 57
   )
   private final boolean zzdka;
   @SafeParcelable.Field(
      id = 58
   )
   private final boolean zzdkb;
   @SafeParcelable.Field(
      id = 59
   )
   private final boolean zzdkc;
   @SafeParcelable.Field(
      id = 60
   )
   private final ArrayList zzdkd;
   @SafeParcelable.Field(
      id = 61
   )
   private final String zzdke;
   @SafeParcelable.Field(
      id = 63
   )
   private final zzagz zzdkf;
   @SafeParcelable.Field(
      id = 64
   )
   private final String zzdkg;
   @SafeParcelable.Field(
      id = 65
   )
   private final Bundle zzdkh;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zzapv(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) Bundle param2, @SafeParcelable.Param(id = 3) zzug param3, @SafeParcelable.Param(id = 4) zzuj param4, @SafeParcelable.Param(id = 5) String param5, @SafeParcelable.Param(id = 6) ApplicationInfo param6, @SafeParcelable.Param(id = 7) PackageInfo param7, @SafeParcelable.Param(id = 8) String param8, @SafeParcelable.Param(id = 9) String param9, @SafeParcelable.Param(id = 10) String param10, @SafeParcelable.Param(id = 11) zzazb param11, @SafeParcelable.Param(id = 12) Bundle param12, @SafeParcelable.Param(id = 13) int param13, @SafeParcelable.Param(id = 14) List param14, @SafeParcelable.Param(id = 15) Bundle param15, @SafeParcelable.Param(id = 16) boolean param16, @SafeParcelable.Param(id = 18) int param17, @SafeParcelable.Param(id = 19) int param18, @SafeParcelable.Param(id = 20) float param19, @SafeParcelable.Param(id = 21) String param20, @SafeParcelable.Param(id = 25) long param21, @SafeParcelable.Param(id = 26) String param23, @SafeParcelable.Param(id = 27) List param24, @SafeParcelable.Param(id = 28) String param25, @SafeParcelable.Param(id = 29) zzaby param26, @SafeParcelable.Param(id = 30) List param27, @SafeParcelable.Param(id = 31) long param28, @SafeParcelable.Param(id = 33) String param30, @SafeParcelable.Param(id = 34) float param31, @SafeParcelable.Param(id = 40) boolean param32, @SafeParcelable.Param(id = 35) int param33, @SafeParcelable.Param(id = 36) int param34, @SafeParcelable.Param(id = 37) boolean param35, @SafeParcelable.Param(id = 38) boolean param36, @SafeParcelable.Param(id = 39) String param37, @SafeParcelable.Param(id = 41) String param38, @SafeParcelable.Param(id = 42) boolean param39, @SafeParcelable.Param(id = 43) int param40, @SafeParcelable.Param(id = 44) Bundle param41, @SafeParcelable.Param(id = 45) String param42, @SafeParcelable.Param(id = 46) zzxh param43, @SafeParcelable.Param(id = 47) boolean param44, @SafeParcelable.Param(id = 48) Bundle param45, @SafeParcelable.Param(id = 49) String param46, @SafeParcelable.Param(id = 50) String param47, @SafeParcelable.Param(id = 51) String param48, @SafeParcelable.Param(id = 52) boolean param49, @SafeParcelable.Param(id = 53) List param50, @SafeParcelable.Param(id = 54) String param51, @SafeParcelable.Param(id = 55) List param52, @SafeParcelable.Param(id = 56) int param53, @SafeParcelable.Param(id = 57) boolean param54, @SafeParcelable.Param(id = 58) boolean param55, @SafeParcelable.Param(id = 59) boolean param56, @SafeParcelable.Param(id = 60) ArrayList param57, @SafeParcelable.Param(id = 61) String param58, @SafeParcelable.Param(id = 63) zzagz param59, @SafeParcelable.Param(id = 64) String param60, @SafeParcelable.Param(id = 65) Bundle param61) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
