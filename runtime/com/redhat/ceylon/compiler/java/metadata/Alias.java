package com.redhat.ceylon.compiler.java.metadata;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Specifies that a given class or interface is in fact an alias to
 * another type
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Alias {
    /**
     * The aliased type signature
     */
    String value();
}
