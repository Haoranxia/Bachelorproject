package com.google.android.gms.common.server.response;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.io.BufferedReader;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Stack;

@KeepForSdk
@ShowFirstParty
public class FastParser {
   private static final char[] zaqg;
   private static final char[] zaqh;
   private static final char[] zaqi;
   private static final char[] zaqj;
   private static final char[] zaqk;
   private static final char[] zaql;
   private static final FastParser.zaa zaqn;
   private static final FastParser.zaa zaqo;
   private static final FastParser.zaa zaqp;
   private static final FastParser.zaa zaqq;
   private static final FastParser.zaa zaqr;
   private static final FastParser.zaa zaqs;
   private static final FastParser.zaa zaqt;
   private static final FastParser.zaa zaqu;
   private final char[] zaqb;
   private final char[] zaqc;
   private final char[] zaqd;
   private final StringBuilder zaqe;
   private final StringBuilder zaqf;
   private final Stack zaqm;

   static {
      // $FF: Couldn't be decompiled
   }

   public FastParser() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static int zaa(FastParser param0, BufferedReader param1) {
      // $FF: Couldn't be decompiled
   }

   private final int zaa(BufferedReader param1, char[] param2) {
      // $FF: Couldn't be decompiled
   }

   private final String zaa(BufferedReader param1) {
      // $FF: Couldn't be decompiled
   }

   private final String zaa(BufferedReader param1, char[] param2, StringBuilder param3, char[] param4) {
      // $FF: Couldn't be decompiled
   }

   private final ArrayList zaa(BufferedReader param1, FastJsonResponse.Field param2) {
      // $FF: Couldn't be decompiled
   }

   private final ArrayList zaa(BufferedReader param1, FastParser.zaa param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean zaa(FastParser param0, BufferedReader param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   private final boolean zaa(BufferedReader param1, FastJsonResponse param2) {
      // $FF: Couldn't be decompiled
   }

   private final boolean zaa(BufferedReader param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static long zab(FastParser param0, BufferedReader param1) {
      // $FF: Couldn't be decompiled
   }

   private final String zab(BufferedReader param1) {
      // $FF: Couldn't be decompiled
   }

   private static String zab(BufferedReader param0, char[] param1, StringBuilder param2, char[] param3) {
      // $FF: Couldn't be decompiled
   }

   private final void zab(BufferedReader param1, char[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static float zac(FastParser param0, BufferedReader param1) {
      // $FF: Couldn't be decompiled
   }

   private final String zac(BufferedReader param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static double zad(FastParser param0, BufferedReader param1) {
      // $FF: Couldn't be decompiled
   }

   private final int zad(BufferedReader param1) {
      // $FF: Couldn't be decompiled
   }

   private final long zae(BufferedReader param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static String zae(FastParser param0, BufferedReader param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static BigInteger zaf(FastParser param0, BufferedReader param1) {
      // $FF: Couldn't be decompiled
   }

   private final BigInteger zaf(BufferedReader param1) {
      // $FF: Couldn't be decompiled
   }

   private final float zag(BufferedReader param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static BigDecimal zag(FastParser param0, BufferedReader param1) {
      // $FF: Couldn't be decompiled
   }

   private final double zah(BufferedReader param1) {
      // $FF: Couldn't be decompiled
   }

   private final BigDecimal zai(BufferedReader param1) {
      // $FF: Couldn't be decompiled
   }

   private final char zaj(BufferedReader param1) {
      // $FF: Couldn't be decompiled
   }

   private final void zak(int param1) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   public void parse(InputStream param1, FastJsonResponse param2) {
      // $FF: Couldn't be decompiled
   }

   @KeepForSdk
   @ShowFirstParty
   public static class ParseException extends Exception {
      public ParseException(String param1) {
         // $FF: Couldn't be decompiled
      }

      public ParseException(String param1, Throwable param2) {
         // $FF: Couldn't be decompiled
      }

      public ParseException(Throwable param1) {
         // $FF: Couldn't be decompiled
      }
   }

   private interface zaa {
      Object zah(FastParser var1, BufferedReader var2);
   }
}
