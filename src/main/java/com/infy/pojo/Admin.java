package com.infy.pojo;

public class Admin {

	public String adminname;
	public int adminid;
	public String adminaddress;
	public String adminjoined;

	@Override
	public String toString() {
		return "Admin [adminname=" + adminname + ", adminid=" + adminid + ", adminaddress=" + adminaddress
				+ ", adminjoined=" + adminjoined + "]";
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getAdminaddress() {
		return adminaddress;
	}

	public void setAdminaddress(String adminaddress) {
		this.adminaddress = adminaddress;
	}

	public String getAdminjoined() {
		return adminjoined;
	}

	public void setAdminjoined(String adminjoined) {
		this.adminjoined = adminjoined;
	}

}
