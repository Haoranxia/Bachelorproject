package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Iterator;

public abstract class AbstractDataBuffer implements DataBuffer {
   protected final DataHolder mDataHolder;

   @KeepForSdk
   protected AbstractDataBuffer(DataHolder param1) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public final void close() {
      // $FF: Couldn't be decompiled
   }

   public abstract Object get(int var1);

   public int getCount() {
      // $FF: Couldn't be decompiled
   }

   public Bundle getMetadata() {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public boolean isClosed() {
      // $FF: Couldn't be decompiled
   }

   public Iterator iterator() {
      // $FF: Couldn't be decompiled
   }

   public void release() {
      // $FF: Couldn't be decompiled
   }

   public Iterator singleRefIterator() {
      // $FF: Couldn't be decompiled
   }
}
