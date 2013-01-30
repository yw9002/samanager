package com.yanshare.service;

import java.util.List;

import com.yanshare.entity.Teacher;

public interface TeacherService {
	/**
	 *获取所有老师列表
	 * @return 返回教师列表
	 */
	public List<Teacher> getTeacherList();
	/**
	 * 查找所有教师姓名-关键字
	 * @return 返回所有教师姓名列表
	 */
	public List<Teacher> getTeacherName(String q);
	/**
	 * 添加、修改教师信息
	 * @param teacher 教师对象
	 * @param flag 添加修改操作标识
	 * @return 成功修改或保存成功条数
	 */
	public int saveTeacher(Teacher teacher, String flag);
	/**
	 * 删除教师（传ID即可）
	 * @param teacher 教师对象
	 * @return 成功删除条数，一般为1
	 */
	public int delTeacher(Teacher teacher);
	/**
	 * 根据ID查找teacher(传ID即可)
	 * @param teacher 教师对象
	 * @return 教师教师对象
	 */
	public Teacher getTeacherById(Teacher teacher);
}
