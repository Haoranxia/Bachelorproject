package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import java.util.Iterator;

public interface DataBuffer extends Releasable, Iterable {
   @Deprecated
   void close();

   Object get(int var1);

   int getCount();

   @KeepForSdk
   Bundle getMetadata();

   @Deprecated
   boolean isClosed();

   Iterator iterator();

   void release();

   Iterator singleRefIterator();
}
