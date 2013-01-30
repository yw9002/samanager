package com.yanshare.entity;
/**
 * 期刊对象
 * @author Yanshare
 *
 */
public class Periodical {
	private int pid;//期刊ID
	private String pname;//期刊名称
	private String pno;//刊号
	private String pproperties;//期刊性质
	private String punit;//主办单位
	private String psearch;//检索情况
	private String phonour;//期刊荣誉
	private String pissn;//ISSN
	private String pcn;//CN
	private String ptype;//期刊分类
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getPproperties() {
		return pproperties;
	}
	public void setPproperties(String pproperties) {
		this.pproperties = pproperties;
	}
	public String getPunit() {
		return punit;
	}
	public void setPunit(String punit) {
		this.punit = punit;
	}
	public String getPsearch() {
		return psearch;
	}
	public void setPsearch(String psearch) {
		this.psearch = psearch;
	}
	public String getPhonour() {
		return phonour;
	}
	public void setPhonour(String phonour) {
		this.phonour = phonour;
	}
	public String getPissn() {
		return pissn;
	}
	public void setPissn(String pissn) {
		this.pissn = pissn;
	}
	public String getPcn() {
		return pcn;
	}
	public void setPcn(String pcn) {
		this.pcn = pcn;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	@Override
	public String toString() {
		return "periodical [pid=" + pid + ", pname=" + pname + ", pno=" + pno
				+ ", pproperties=" + pproperties + ", punit=" + punit
				+ ", psearch=" + psearch + ", phonour=" + phonour + ", pissn="
				+ pissn + ", pcn=" + pcn + ", ptype=" + ptype + "]";
	}
	
}
