package com.google.android.gms.vision;

import android.util.SparseArray;
import javax.annotation.concurrent.GuardedBy;

public abstract class Detector {
   private final Object zzah;
   @GuardedBy("processorLock")
   private Detector.Processor zzai;

   public Detector() {
      // $FF: Couldn't be decompiled
   }

   public abstract SparseArray detect(Frame var1);

   public boolean isOperational() {
      // $FF: Couldn't be decompiled
   }

   public void receiveFrame(Frame param1) {
      // $FF: Couldn't be decompiled
   }

   public void release() {
      // $FF: Couldn't be decompiled
   }

   public boolean setFocus(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void setProcessor(Detector.Processor param1) {
      // $FF: Couldn't be decompiled
   }

   public static class Detections {
      private final SparseArray zzae;
      private final Frame.Metadata zzaf;
      private final boolean zzag;

      public Detections(SparseArray param1, Frame.Metadata param2, boolean param3) {
         // $FF: Couldn't be decompiled
      }

      public boolean detectorIsOperational() {
         // $FF: Couldn't be decompiled
      }

      public SparseArray getDetectedItems() {
         // $FF: Couldn't be decompiled
      }

      public Frame.Metadata getFrameMetadata() {
         // $FF: Couldn't be decompiled
      }
   }

   public interface Processor {
      void receiveDetections(Detector.Detections var1);

      void release();
   }
}
