package com.mykheikin.ClassForSerialization;

import java.io.Serializable;

@SavePath
public class FieldsForSerilization implements Serializable {

	private static final long serialVersionUID = 1L;
	@Save
	private String firstField;
	private int secondField;
	private Long thirdField;
	@Save
	private double fourthField;
	@Save
	private int lastField;

	public FieldsForSerilization(String firstField, int secondField, Long thirdField, double fourthField,
			int lastField) {
		super();
		this.firstField = firstField;
		this.secondField = secondField;
		this.thirdField = thirdField;
		this.fourthField = fourthField;
		this.lastField = lastField;
	}

	public FieldsForSerilization() {
	}

	public String getFirstField() {
		return firstField;
	}

	public void setFirstField(String firstField) {
		this.firstField = firstField;
	}

	public int getSecondField() {
		return secondField;
	}

	public void setSecondField(int secondField) {
		this.secondField = secondField;
	}

	public Long getThirdField() {
		return thirdField;
	}

	public void setThirdField(Long thirdField) {
		this.thirdField = thirdField;
	}

	public double getFourthField() {
		return fourthField;
	}

	public void setFourthField(double fourthField) {
		this.fourthField = fourthField;
	}

	public int getLastField() {
		return lastField;
	}

	public void setLastField(int lastField) {
		this.lastField = lastField;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
