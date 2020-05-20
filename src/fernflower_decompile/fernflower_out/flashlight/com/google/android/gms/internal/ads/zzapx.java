package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@SafeParcelable.Class(
   creator = "AdResponseParcelCreator"
)
public final class zzapx extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      id = 5
   )
   private final int errorCode;
   @SafeParcelable.Field(
      id = 12
   )
   private final int orientation;
   @SafeParcelable.Field(
      id = 1
   )
   private final int versionCode;
   @SafeParcelable.Field(
      id = 37
   )
   private final zzapz zzbku;
   @SafeParcelable.Field(
      id = 49
   )
   private final boolean zzble;
   @SafeParcelable.Field(
      id = 53
   )
   private final boolean zzblf;
   @SafeParcelable.Field(
      id = 23
   )
   private final boolean zzbmc;
   @SafeParcelable.Field(
      id = 30
   )
   private final String zzbzo;
   @SafeParcelable.Field(
      id = 31
   )
   private final boolean zzccq;
   @SafeParcelable.Field(
      id = 32
   )
   private final boolean zzccr;
   @SafeParcelable.Field(
      id = 4
   )
   private final List zzdbq;
   @SafeParcelable.Field(
      id = 6
   )
   private final List zzdbr;
   @SafeParcelable.Field(
      id = 52
   )
   private final List zzdbs;
   @SafeParcelable.Field(
      id = 40
   )
   private final List zzdbu;
   @SafeParcelable.Field(
      id = 42
   )
   private final boolean zzdbv;
   @SafeParcelable.Field(
      id = 11
   )
   private final long zzdbx;
   @SafeParcelable.Field(
      id = 2
   )
   private final String zzdhr;
   @SafeParcelable.Field(
      id = 24
   )
   private final boolean zzdiv;
   @SafeParcelable.Field(
      id = 38
   )
   private final boolean zzdji;
   @SafeParcelable.Field(
      id = 39
   )
   private String zzdjj;
   @SafeParcelable.Field(
      id = 47
   )
   private final boolean zzdjv;
   @SafeParcelable.Field(
      id = 3
   )
   private String zzdki;
   @SafeParcelable.Field(
      id = 7
   )
   private final long zzdkj;
   @SafeParcelable.Field(
      id = 8
   )
   private final boolean zzdkk;
   @SafeParcelable.Field(
      id = 9
   )
   private final long zzdkl;
   @SafeParcelable.Field(
      id = 10
   )
   private final List zzdkm;
   @SafeParcelable.Field(
      id = 13
   )
   private final String zzdkn;
   @SafeParcelable.Field(
      id = 14
   )
   private final long zzdko;
   @SafeParcelable.Field(
      id = 15
   )
   private final String zzdkp;
   @SafeParcelable.Field(
      id = 18
   )
   private final boolean zzdkq;
   @SafeParcelable.Field(
      id = 19
   )
   private final String zzdkr;
   @SafeParcelable.Field(
      id = 21
   )
   private final String zzdks;
   @SafeParcelable.Field(
      id = 22
   )
   private final boolean zzdkt;
   @SafeParcelable.Field(
      id = 25
   )
   private final boolean zzdku;
   @SafeParcelable.Field(
      id = 26
   )
   private final boolean zzdkv;
   @SafeParcelable.Field(
      id = 28
   )
   private zzaqj zzdkw;
   @SafeParcelable.Field(
      id = 29
   )
   private String zzdkx;
   @SafeParcelable.Field(
      id = 33
   )
   private final zzasd zzdky;
   @SafeParcelable.Field(
      id = 34
   )
   private final List zzdkz;
   @SafeParcelable.Field(
      id = 35
   )
   private final List zzdla;
   @SafeParcelable.Field(
      id = 36
   )
   private final boolean zzdlb;
   @SafeParcelable.Field(
      id = 43
   )
   private final String zzdlc;
   @SafeParcelable.Field(
      id = 44
   )
   private final zzatn zzdld;
   @SafeParcelable.Field(
      id = 45
   )
   private final String zzdle;
   @SafeParcelable.Field(
      id = 46
   )
   private final boolean zzdlf;
   @SafeParcelable.Field(
      id = 48
   )
   private Bundle zzdlg;
   @SafeParcelable.Field(
      id = 50
   )
   private final int zzdlh;
   @SafeParcelable.Field(
      id = 51
   )
   private final boolean zzdli;
   @SafeParcelable.Field(
      id = 54
   )
   private final String zzdlj;
   @SafeParcelable.Field(
      id = 55
   )
   private String zzdlk;
   @SafeParcelable.Field(
      id = 56
   )
   private boolean zzdll;
   @SafeParcelable.Field(
      id = 57
   )
   private boolean zzdlm;

   static {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   zzapx(@SafeParcelable.Param(id = 1) int param1, @SafeParcelable.Param(id = 2) String param2, @SafeParcelable.Param(id = 3) String param3, @SafeParcelable.Param(id = 4) List param4, @SafeParcelable.Param(id = 5) int param5, @SafeParcelable.Param(id = 6) List param6, @SafeParcelable.Param(id = 7) long param7, @SafeParcelable.Param(id = 8) boolean param9, @SafeParcelable.Param(id = 9) long param10, @SafeParcelable.Param(id = 10) List param12, @SafeParcelable.Param(id = 11) long param13, @SafeParcelable.Param(id = 12) int param15, @SafeParcelable.Param(id = 13) String param16, @SafeParcelable.Param(id = 14) long param17, @SafeParcelable.Param(id = 15) String param19, @SafeParcelable.Param(id = 18) boolean param20, @SafeParcelable.Param(id = 19) String param21, @SafeParcelable.Param(id = 21) String param22, @SafeParcelable.Param(id = 22) boolean param23, @SafeParcelable.Param(id = 23) boolean param24, @SafeParcelable.Param(id = 24) boolean param25, @SafeParcelable.Param(id = 25) boolean param26, @SafeParcelable.Param(id = 26) boolean param27, @SafeParcelable.Param(id = 28) zzaqj param28, @SafeParcelable.Param(id = 29) String param29, @SafeParcelable.Param(id = 30) String param30, @SafeParcelable.Param(id = 31) boolean param31, @SafeParcelable.Param(id = 32) boolean param32, @SafeParcelable.Param(id = 33) zzasd param33, @SafeParcelable.Param(id = 34) List param34, @SafeParcelable.Param(id = 35) List param35, @SafeParcelable.Param(id = 36) boolean param36, @SafeParcelable.Param(id = 37) zzapz param37, @SafeParcelable.Param(id = 38) boolean param38, @SafeParcelable.Param(id = 39) String param39, @SafeParcelable.Param(id = 40) List param40, @SafeParcelable.Param(id = 42) boolean param41, @SafeParcelable.Param(id = 43) String param42, @SafeParcelable.Param(id = 44) zzatn param43, @SafeParcelable.Param(id = 45) String param44, @SafeParcelable.Param(id = 46) boolean param45, @SafeParcelable.Param(id = 47) boolean param46, @SafeParcelable.Param(id = 48) Bundle param47, @SafeParcelable.Param(id = 49) boolean param48, @SafeParcelable.Param(id = 50) int param49, @SafeParcelable.Param(id = 51) boolean param50, @SafeParcelable.Param(id = 52) List param51, @SafeParcelable.Param(id = 53) boolean param52, @SafeParcelable.Param(id = 54) String param53, @SafeParcelable.Param(id = 55) String param54, @SafeParcelable.Param(id = 56) boolean param55, @SafeParcelable.Param(id = 57) boolean param56) {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
