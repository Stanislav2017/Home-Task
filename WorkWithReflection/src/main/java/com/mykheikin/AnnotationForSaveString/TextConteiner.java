package com.mykheikin.AnnotationForSaveString;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@SaveTo(path = "C:\\Users\\User\\workspace\\WorkWithReflection\\src\\main\\java\\com\\mykheikin\\AnnotationForSaveString\\string.txt")
public class TextConteiner {

	// Create string
	public String text = "This text for save with annotation";

//	@Save
//	public void save(String path, String text) {
//		File file = new File(path);
//		FileWriter fr = null;
//		try {
//			fr = new FileWriter(file);
//			fr.write(text);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fr.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
}
