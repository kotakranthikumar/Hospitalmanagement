package com.infy.pojo;

public class doctor {

	public String doctorname;
	public int doctorid;
	public String doctorcompletedata;

	@Override
	public String toString() {
		return "doctor [doctorname=" + doctorname + ", doctorid=" + doctorid + ", doctorcompletedata="
				+ doctorcompletedata + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	public int getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}

	public String getDoctorcompletedata() {
		return doctorcompletedata;
	}

	public void setDoctorcompletedata(String doctorcompletedata) {
		this.doctorcompletedata = doctorcompletedata;
	}

}
