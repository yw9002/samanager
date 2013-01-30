package com.yanshare.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.yanshare.entity.Teacher;
import com.yanshare.service.TeacherService;

public class TeacherAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private List<Teacher> teachList;
	private TeacherService teacherService;
	private Teacher teacher;
	private String opr;
	private String msg;
	private String key;
	private List<Teacher> teacherNameList;
	private String q;
	private String term;
	
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	/**
	 * 跳转到教师管理页面
	 * @return
	 */
	public String toManager(){
		teachList = teacherService.getTeacherList();
		return SUCCESS;
	}
	/**
	 * 跳转到教师添加页面
	 * @return
	 */
	public String toAdd(){
		return SUCCESS;
	}
	/**
	 * 跳转到教师更新页面
	 * @return
	 */
	public String toUpdate(){
		teacher = teacherService.getTeacherById(teacher);
		return SUCCESS;
	}
	/**
	 * 添加教师action
	 * @param teacher
	 * @return
	 */
	public String saveTeacher(){
		if(teacherService.saveTeacher(teacher, opr)>0){
			msg = new String("操作成功");
		}else{
			msg = new String("操作失败");
		}
		return SUCCESS;
	}
	/**
	 * 删除教师action
	 * @return
	 */
	public String delTeacher(){
		if(teacherService.delTeacher(teacher)>0){
			msg = "操作成功";
		}else{
			msg = "操作失败";
		}
		return SUCCESS;
	}
	/**
	 * 自动完成 - 教师输入
	 * @return
	 */
	public String queryTeacherName(){
		System.out.println("term:"+term);
		teacherNameList = teacherService.getTeacherName(term);
		return SUCCESS;
	}
	
	
	
	
	
	
	
	
	
	
	public List<Teacher> getTeachList() {
		return teachList;
	}
	public void setTeachList(List<Teacher> teachList) {
		this.teachList = teachList;
	}
	public TeacherService getTeacherService() {
		return teacherService;
	}
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public String getOpr() {
		return opr;
	}
	public void setOpr(String opr) {
		this.opr = opr;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<Teacher> getTeacherNameList() {
		return teacherNameList;
	}
	public void setTeacherNameList(List<Teacher> teacherNameList) {
		this.teacherNameList = teacherNameList;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getQ() {
		return q;
	}
	public void setQ(String q) {
		this.q = q;
	}
	
	
}
