package com.google.ads.mediation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

@Deprecated
public class MediationServerParameters {
   public MediationServerParameters() {
      // $FF: Couldn't be decompiled
   }

   public void load(Map param1) {
      // $FF: Couldn't be decompiled
   }

   public static final class MappingException extends Exception {
      public MappingException(String param1) {
         // $FF: Couldn't be decompiled
      }
   }

   @Retention(RetentionPolicy.RUNTIME)
   @Target({ElementType.FIELD})
   public @interface Parameter {
      String name();

      boolean required() default true;
   }
}
