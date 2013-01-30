package com.yanshare.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.yanshare.entity.Periodical;
import com.yanshare.service.PeriodicalService;

public class PeriodicalAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private PeriodicalService periodicalService;
	private List<Periodical> periodicalList;
	private List<String> periodicalNameList;
	private String key;
	private Periodical periodical;
	private String msg;
	private String opr;
	/**
	 * 显示所有期刊action
	 * @return
	 */
	public String findPeriodidcalList(){
		periodicalList = periodicalService.findPeriodicalList();
		return SUCCESS;
	}
	/**
	 * 获取期刊名称列表
	 * @return
	 */
	public String findPeriodicalName(){
		periodicalNameList = periodicalService.findPeriodicalName(key);
		return SUCCESS;
	}
	/**
	 * 根据期刊名称查找期刊信息
	 * @return 设置期刊信息到页面
	 */
	public String findPeriodicalByName(){
		periodical = periodicalService.findPeriodicalByName(periodical);
		return SUCCESS;
	}
	/**
	 * 添加期刊action
	 * @return
	 */
	public String savePeriodical(){
		if(periodicalService.addPeriodical(periodical, opr)>0){
			msg = "操作成功";
		}else{
			msg = "操作失败";
		}
		return SUCCESS;
	}
	
	public String toUpdate(){
		periodical = periodicalService.findPeriodicalById(periodical);
		return SUCCESS;
	}
	
	public String delPeriodical(){
		if(periodicalService.delPeriodical(periodical)>0){
			msg = "操作成功";
		}else{
			msg = "操作失败";
		}
		return SUCCESS;
	}
	
	
	public PeriodicalService getPeriodicalService() {
		return periodicalService;
	}
	public void setPeriodicalService(PeriodicalService periodicalService) {
		this.periodicalService = periodicalService;
	}
	public List<Periodical> getPeriodicalList() {
		return periodicalList;
	}
	public void setPeriodicalList(List<Periodical> periodicalList) {
		this.periodicalList = periodicalList;
	}

	public List<String> getPeriodicalNameList() {
		return periodicalNameList;
	}

	public void setPeriodicalNameList(List<String> periodicalNameList) {
		this.periodicalNameList = periodicalNameList;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	public Periodical getPeriodical() {
		return periodical;
	}
	public void setPeriodical(Periodical periodical) {
		this.periodical = periodical;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getOpr() {
		return opr;
	}
	public void setOpr(String opr) {
		this.opr = opr;
	}
	
	
	
	
	
}
