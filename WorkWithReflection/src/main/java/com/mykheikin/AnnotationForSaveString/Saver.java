package com.mykheikin.AnnotationForSaveString;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Saver {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		TextConteiner textConteiner = new TextConteiner();
		Class cls = textConteiner.getClass();
		Class[] parameterTypes = new Class[]{String.class, String.class}; 
		
		Field field = cls.getField("text"); 
		String nameValue = (String) field.get(textConteiner); 
		
		SaveTo saveTo = (SaveTo) cls.getAnnotation(SaveTo.class);
		Method method = cls.getMethod("save", parameterTypes);
		
		method.invoke(textConteiner, saveTo.path(), nameValue);
	}

}
