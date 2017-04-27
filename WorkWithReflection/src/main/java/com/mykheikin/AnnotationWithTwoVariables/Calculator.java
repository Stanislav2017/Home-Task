package com.mykheikin.AnnotationWithTwoVariables;

@MyAnnotationWithAB(a = 2, b = 3)
public class Calculator {
	
	public double plus(int a, int b){
		return a + b;
	}
	
	public double minus(int a, int b){
		return a - b;
	}
	
	@MyAnnotationMethod
	public double multiply(int a, int b){
		return a * b;
	}
	
	public double divide(int a, int b){
		return a / b;
	}

}
