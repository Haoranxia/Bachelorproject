package com.google.android.gms.vision;

import android.util.SparseArray;

public class MultiProcessor implements Detector.Processor {
   private int zzak;
   private MultiProcessor.Factory zzax;
   private SparseArray zzay;

   private MultiProcessor() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   MultiProcessor(zze param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static int zza(MultiProcessor param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static MultiProcessor.Factory zza(MultiProcessor param0, MultiProcessor.Factory param1) {
      // $FF: Couldn't be decompiled
   }

   public void receiveDetections(Detector.Detections param1) {
      // $FF: Couldn't be decompiled
   }

   public void release() {
      // $FF: Couldn't be decompiled
   }

   public static class Builder {
      private MultiProcessor zzba;

      public Builder(MultiProcessor.Factory param1) {
         // $FF: Couldn't be decompiled
      }

      public MultiProcessor build() {
         // $FF: Couldn't be decompiled
      }

      public MultiProcessor.Builder setMaxGapFrames(int param1) {
         // $FF: Couldn't be decompiled
      }
   }

   public interface Factory {
      Tracker create(Object var1);
   }

   final class zza {
      private Tracker zzaj;
      private int zzan;

      private zza(MultiProcessor param1) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      zza(MultiProcessor param1, zze param2) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static int zza(MultiProcessor.zza param0, int param1) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static Tracker zza(MultiProcessor.zza param0) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static Tracker zza(MultiProcessor.zza param0, Tracker param1) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static int zzb(MultiProcessor.zza param0) {
         // $FF: Couldn't be decompiled
      }

      // $FF: synthetic method
      static int zzc(MultiProcessor.zza param0) {
         // $FF: Couldn't be decompiled
      }
   }
}
