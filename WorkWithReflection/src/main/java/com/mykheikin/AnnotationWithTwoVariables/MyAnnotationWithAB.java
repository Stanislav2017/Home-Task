package com.mykheikin.AnnotationWithTwoVariables;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Target(value=ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotationWithAB {
	
	int a();
	int b();
	
}

@Target(value=ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotationMethod{
	
}
