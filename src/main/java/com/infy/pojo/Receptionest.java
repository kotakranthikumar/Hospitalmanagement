package com.infy.pojo;

public class Receptionest {

	public String receptionestname;
	public int receptionestid;
	public String receptionestadd;
	public String receptionestjoineddate;

	@Override
	public String toString() {
		return "Receptionest [receptionestname=" + receptionestname + ", receptionestid=" + receptionestid
				+ ", receptionestadd=" + receptionestadd + ", receptionestjoineddate=" + receptionestjoineddate + "]";
	}

	public String getReceptionestname() {
		return receptionestname;
	}

	public void setReceptionestname(String receptionestname) {
		this.receptionestname = receptionestname;
	}

	public int getReceptionestid() {
		return receptionestid;
	}

	public void setReceptionestid(int receptionestid) {
		this.receptionestid = receptionestid;
	}

	public String getReceptionestadd() {
		return receptionestadd;
	}

	public void setReceptionestadd(String receptionestadd) {
		this.receptionestadd = receptionestadd;
	}

	public String getReceptionestjoineddate() {
		return receptionestjoineddate;
	}

	public void setReceptionestjoineddate(String receptionestjoineddate) {
		this.receptionestjoineddate = receptionestjoineddate;
	}

}
