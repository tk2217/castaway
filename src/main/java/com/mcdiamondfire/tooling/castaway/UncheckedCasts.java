package com.mcdiamondfire.tooling.castaway;

import java.lang.annotation.*;

/**
 * Indicates that a method should have all {@code castcheck} bytecode
 * operations stripped.
 *
 * <p><b>This should only be used in high-load areas! It can have
 * unintended side effects, including creating JVM level crashes
 * or quietly corrupting objects that are casted.
 * </b></p>
 *
 * <p><pre>
 * &#64;UncheckedCasts
 * public &lt;T&gt; T[] castArray(Object[] in) {
 * 	return (T[]) in;
 * }
 * </pre></p>
 */
@Target(ElementType.METHOD)
public @interface UncheckedCasts {
}
