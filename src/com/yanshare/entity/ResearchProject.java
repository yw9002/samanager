package com.yanshare.entity;
/**
 * 科研项目对象
 * @author Yanshare
 *
 */
public class ResearchProject {
	private String proId;//项目ID
	private String proNo;//项目编号
	private String proTopic;//项目名称
	private String proType;	//项目类型
	private String proParticipate;//项目参与人
	private String proSubsidize;//项目资助机构
	private float proMoney;	//效用金额
	private float proSupporting;//配套金额
	private String proStartDate;//项目立项时间
	private String proEndDate;//项目结束时间
	private String proApproval;//批文号
	private String proSign;	//立项时间
	private String proPrincipal;//项目负责人
	private int proIsExpect;//是否预计完成准备项目
	private String proUuid;	//附件标识
	
	
	@Override
	public String toString() {
		return "ResearchProject [proNo=" + proNo + ", proTopic=" + proTopic
				+ ", proType=" + proType + ", proParticipate=" + proParticipate
				+ ", proSubsidize=" + proSubsidize + ", proMoney=" + proMoney
				+ ", proSupporting=" + proSupporting + ", proStartDate="
				+ proStartDate + ", proEndDate=" + proEndDate
				+ ", proApproval=" + proApproval + ", proSign=" + proSign
				+ ", proPrincipal=" + proPrincipal + ", proIsExpect="
				+ proIsExpect + ", proUuid=" + proUuid + "]";
	}
	public String getProUuid() {
		return proUuid;
	}
	public void setProUuid(String proUuid) {
		this.proUuid = proUuid;
	}
	public String getProNo() {
		return proNo;
	}
	public void setProNo(String proNo) {
		this.proNo = proNo;
	}
	public String getProTopic() {
		return proTopic;
	}
	public void setProTopic(String proTopic) {
		this.proTopic = proTopic;
	}
	public String getProType() {
		return proType;
	}
	public void setProType(String proType) {
		this.proType = proType;
	}
	
	public String getProSubsidize() {
		return proSubsidize;
	}
	public void setProSubsidize(String proSubsidize) {
		this.proSubsidize = proSubsidize;
	}
	public float getProMoney() {
		return proMoney;
	}
	public void setProMoney(float proMoney) {
		this.proMoney = proMoney;
	}
	
	public String getProStartDate() {
		return proStartDate;
	}
	public void setProStartDate(String proStartDate) {
		this.proStartDate = proStartDate;
	}
	public String getProEndDate() {
		return proEndDate;
	}
	public void setProEndDate(String proEndDate) {
		this.proEndDate = proEndDate;
	}
	public String getProApproval() {
		return proApproval;
	}
	public void setProApproval(String proApproval) {
		this.proApproval = proApproval;
	}
	public String getProParticipate() {
		return proParticipate;
	}
	public void setProParticipate(String proParticipate) {
		this.proParticipate = proParticipate;
	}
	public float getProSupporting() {
		return proSupporting;
	}
	public void setProSupporting(float proSupporting) {
		this.proSupporting = proSupporting;
	}
	public String getProSign() {
		return proSign;
	}
	public void setProSign(String proSign) {
		this.proSign = proSign;
	}
	public String getProPrincipal() {
		return proPrincipal;
	}
	public void setProPrincipal(String proPrincipal) {
		this.proPrincipal = proPrincipal;
	}
	public int getProIsExpect() {
		return proIsExpect;
	}
	public void setProIsExpect(int proIsExpect) {
		this.proIsExpect = proIsExpect;
	}
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	
}
