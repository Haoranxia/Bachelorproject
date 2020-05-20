package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.nio.ByteBuffer;

public interface zzdws extends Closeable {
   void close();

   long position();

   int read(ByteBuffer var1);

   long size();

   void zzfc(long var1);

   ByteBuffer zzh(long var1, long var3);
}
