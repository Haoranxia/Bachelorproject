package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzwc;

@SafeParcelable.Class(
   creator = "PublisherAdViewOptionsCreator"
)
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
   public static final Creator CREATOR;
   @SafeParcelable.Field(
      getter = "getManualImpressionsEnabled",
      id = 1
   )
   private final boolean zzbkh;
   @SafeParcelable.Field(
      getter = "getAppEventListenerBinder",
      id = 2,
      type = "android.os.IBinder"
   )
   private final zzwc zzbki;
   private AppEventListener zzbkj;
   @SafeParcelable.Field(
      getter = "getDelayedBannerAdListenerBinder",
      id = 3
   )
   private final IBinder zzbkk;

   static {
      // $FF: Couldn't be decompiled
   }

   private PublisherAdViewOptions(PublisherAdViewOptions.Builder param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PublisherAdViewOptions(PublisherAdViewOptions.Builder param1, zzb param2) {
      // $FF: Couldn't be decompiled
   }

   @SafeParcelable.Constructor
   PublisherAdViewOptions(@SafeParcelable.Param(id = 1) boolean param1, @SafeParcelable.Param(id = 2) IBinder param2, @SafeParcelable.Param(id = 3) IBinder param3) {
      // $FF: Couldn't be decompiled
   }

   public final AppEventListener getAppEventListener() {
      // $FF: Couldn't be decompiled
   }

   public final boolean getManualImpressionsEnabled() {
      // $FF: Couldn't be decompiled
   }

   public final void writeToParcel(Parcel param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final zzwc zzjm() {
      // $FF: Couldn't be decompiled
   }

   public final zzaea zzjn() {
      // $FF: Couldn't be decompiled
   }

   public static final class Builder {
      private boolean zzbkh;
      private AppEventListener zzbkj;
      private ShouldDelayBannerRenderingListener zzbkl;

      public Builder() {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static boolean zza(PublisherAdViewOptions.Builder param0) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static AppEventListener zzb(PublisherAdViewOptions.Builder param0) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static ShouldDelayBannerRenderingListener zzc(PublisherAdViewOptions.Builder param0) {
         // $FF: Couldn't be decompiled
      }

      public final PublisherAdViewOptions build() {
         // $FF: Couldn't be decompiled
      }

      public final PublisherAdViewOptions.Builder setAppEventListener(AppEventListener param1) {
         // $FF: Couldn't be decompiled
      }

      public final PublisherAdViewOptions.Builder setManualImpressionsEnabled(boolean param1) {
         // $FF: Couldn't be decompiled
      }

      @KeepForSdk
      public final PublisherAdViewOptions.Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener param1) {
         // $FF: Couldn't be decompiled
      }
   }
}
