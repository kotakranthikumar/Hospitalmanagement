package com.infy.DAO;

public class Songs {
	public String songsname;
	public int songsid;
	public String songsdirecter;
	public String songssinger;
	@Override
	public String toString() {
		return "Songs [songsname=" + songsname + ", songsid=" + songsid + ", songsdirecter=" + songsdirecter
				+ ", songssinger=" + songssinger + "]";
	}
	public String getSongsname() {
		return songsname;
	}
	public void setSongsname(String songsname) {
		this.songsname = songsname;
	}
	public int getSongsid() {
		return songsid;
	}
	public void setSongsid(int songsid) {
		this.songsid = songsid;
	}
	public String getSongsdirecter() {
		return songsdirecter;
	}
	public void setSongsdirecter(String songsdirecter) {
		this.songsdirecter = songsdirecter;
	}
	public String getSongssinger() {
		return songssinger;
	}
	public void setSongssinger(String songssinger) {
		this.songssinger = songssinger;
	}
	

}
