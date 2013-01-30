package com.yanshare.service;

import java.util.List;

import com.yanshare.dao.TeacherDao;
import com.yanshare.entity.Teacher;

public class TeacherServiceImpl implements TeacherService{
	private TeacherDao teacherDao;
	public List<Teacher> getTeacherList() {
		// TODO Auto-generated method stub
		return teacherDao.getTeacherList();
	}

	public List<Teacher> getTeacherName(String q) {
		// TODO Auto-generated method stub
		return teacherDao.getTeacherName(q);
	}

	public int saveTeacher(Teacher teacher, String flag) {
		// TODO Auto-generated method stub
		return teacherDao.saveTeacher(teacher, flag);
	}

	public int delTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherDao.delTeacher(teacher);
	}

	
	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	public Teacher getTeacherById(Teacher teacher) {
		return teacherDao.getTeacherById(teacher);
	}
	
}
