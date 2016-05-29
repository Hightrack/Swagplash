package com.github.albertosh.swagplash.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
@Inherited
public @interface ApiModel {
    /**
     * Provide an alternative name for the model.
     * <p>
     * By default, the class name is used.
     */
    String value() default "";

    /**
     * Provide a longer description of the class.
     */
    String description() default "";

    /**
     * Allows a model to be hidden in the Swagger model definition.
     */
    boolean hidden() default false;
}
