package com.mykheikin.AnnotationWithTwoVariables;

import java.lang.reflect.Method;

public class RunAnnotatedMethod {

	public static void main(String[] args) throws Exception {

		Class<?> cls = Calculator.class;
		Calculator calculator = new Calculator();

		if (cls.isAnnotationPresent(MyAnnotationWithAB.class)) {
			System.out.println("Class is annotated");
		}

		MyAnnotationWithAB ab = cls.getAnnotation(MyAnnotationWithAB.class);
		System.out.println(ab.a() + " " + ab.b());

		Method[] methods = cls.getMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(MyAnnotationMethod.class)) {
				System.out.println("Method " + method.getName() + " is marked with MethodAnnotation");
				System.out.println(method.invoke(calculator, new Integer(ab.a()), new Integer(ab.b())));
			}
		}
	}
}
