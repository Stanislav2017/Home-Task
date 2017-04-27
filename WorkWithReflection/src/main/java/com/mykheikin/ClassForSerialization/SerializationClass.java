package com.mykheikin.ClassForSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class SerializationClass {

	public static void serializationFields(Object ob, String path) {
		try (FileOutputStream fos = new FileOutputStream(path); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(ob);
			oos.flush();
			System.out.println("Serialization is completed");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void deSerializationFields(Object ob, String path) {
		try (FileInputStream fis = new FileInputStream(path); ObjectInputStream ois = new ObjectInputStream(fis);) {
			ob = ois.readObject();
			System.out.println("DeSerialization is completed");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {

		FieldsForSerilization fieldsForSerilization = new FieldsForSerilization();
		Class<?> cls = fieldsForSerilization.getClass();
		SavePath savePath = (SavePath) cls.getAnnotation(SavePath.class);

		Field[] fields = cls.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			if (!fields[i].isAnnotationPresent(Save.class)) {
				fields[i].setAccessible(true);
				Field mF = Field.class.getDeclaredField("modifiers");
				mF.setAccessible(true);
				mF.setInt(fields[i], Modifier.TRANSIENT);
			}
		}

		serializationFields(fieldsForSerilization, savePath.path());

		deSerializationFields(fieldsForSerilization, savePath.path());
	}
}
