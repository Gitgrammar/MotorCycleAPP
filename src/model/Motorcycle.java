package model;

import java.io.Serializable;

public class Motorcycle implements Serializable {
	private String type;
	private String number;
	private String resulted;

	public String getResulted() {
		return resulted;
	}

	public void setResulted(String resulted) {
		this.resulted = resulted;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}


	}



