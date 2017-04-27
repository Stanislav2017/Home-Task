package com.mykheikin.ClassForSerialization;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Target(value=ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SavePath {

	String path() default "C:\\Users\\User\\workspace\\WorkWithReflection\\src\\main\\java\\com\\mykheikin\\ClassForSerialization\\filds.txt";
}

@Target(value=ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Save{
	
}
