package com.patrones.entities;

public class Phone {
    private String number;
    private String extention;
    private String type;

    Phone() {}

    Phone(String num, String ext, String typ) {
        this.number = num;
        this.extention = ext;
        this.type = typ;
    }

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getExtention() {
		return extention;
	}
	public void setExtention(String extention) {
		this.extention = extention;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
};
