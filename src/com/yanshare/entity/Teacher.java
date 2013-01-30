package com.yanshare.entity;
/**
 * 教师对象
 * @author Yanshare
 *
 */
public class Teacher {
	private int tid;//教师标识符
	private String tname;//教师姓名
	private String tsex;//教师姓名
	private String tdept;//教师系别
	private String ttitle;//教师职称
	private String ttel;//教师电话
	private String tmobile;//教师手机
	private String tposition;//教师职位
	private String tremark;	//备注
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", tsex=" + tsex
				+ ", tdept=" + tdept + ", ttitle=" + ttitle + ", ttel=" + ttel
				+ ", tmobile=" + tmobile + ", tposition=" + tposition
				+ ", tremark=" + tremark + "]";
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTsex() {
		return tsex;
	}
	public void setTsex(String tsex) {
		this.tsex = tsex;
	}
	public String getTdept() {
		return tdept;
	}
	public void setTdept(String tdept) {
		this.tdept = tdept;
	}
	public String getTtitle() {
		return ttitle;
	}
	public void setTtitle(String ttitle) {
		this.ttitle = ttitle;
	}
	public String getTtel() {
		return ttel;
	}
	public void setTtel(String ttel) {
		this.ttel = ttel;
	}
	public String getTmobile() {
		return tmobile;
	}
	public void setTmobile(String tmobile) {
		this.tmobile = tmobile;
	}
	public String getTposition() {
		return tposition;
	}
	public void setTposition(String tposition) {
		this.tposition = tposition;
	}
	public String getTremark() {
		return tremark;
	}
	public void setTremark(String tremark) {
		this.tremark = tremark;
	}
	
}
