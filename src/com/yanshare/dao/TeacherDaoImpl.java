package com.yanshare.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yanshare.entity.Teacher;
import com.yanshare.utils.DBUtils;

public class TeacherDaoImpl implements TeacherDao{
	private DBUtils dbUtils;
	private JdbcTemplate jdbcTempplate;
	public List<Teacher> getTeacherList() {
		// TODO Auto-generated method stub
		String sql = "SELECT tid,tName,tSex,tDept,tTitle,tTel,tMobile,tPosition,tRemark FROM teacher";
		return dbUtils.getArrayList(sql, Teacher.class, new HashMap<String, Object>());
	}

	public List<Teacher> getTeacherName(String q) {
		// TODO Auto-generated method stub
		String sql = "select tid,tName from teacher where tName like '"+q+"%'";
		// group by tName where tName like "+key+"%"
		return dbUtils.getArrayList(sql, Teacher.class,new HashMap<String,Object>());
	}

	public int saveTeacher(Teacher teacher, String flag) {
		// TODO Auto-generated method stub
		Object[] args = null;
		String sql = null;
		if(flag.equals("add")){
			sql = "insert into teacher(tName,tSex,tDept,tTitle,tTel,tMobile,tPosition,tRemark) values(?,?,?,?,?,?,?,?)";
			args =new Object[]{teacher.getTname(),teacher.getTsex(),teacher.getTdept(),teacher.getTtitle(),teacher.getTtel(),teacher.getTmobile(),teacher.getTposition(),teacher.getTremark()};
		}else{
			sql = "update teacher set tName=?,tSex=?,tDept=?,tTitle=?,ttel=?,tMobile=?,tPosition=?,tRemark=? where tid=?";
			args = new Object[]{teacher.getTname(),teacher.getTsex(),teacher.getTdept(),teacher.getTtitle(),teacher.getTtel(),teacher.getTmobile(),teacher.getTposition(),teacher.getTremark(),teacher.getTid()};
		}
		return jdbcTempplate.update(sql, args);
	}

	public int delTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		String sql = "delete from teacher where tid=?";
		return jdbcTempplate.update(sql,new Object[]{teacher.getTid()});
	}

	public Teacher getTeacherById(Teacher teacher) {
		// TODO Auto-generated method stub
		String sql = "select * from teacher where tid=:tid";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tid", teacher.getTid());
		return dbUtils.getObject(sql, Teacher.class, map);
	}
	
	
	
	
	
	
	
	
	public DBUtils getDbUtils() {
		return dbUtils;
	}

	public void setDbUtils(DBUtils dbUtils) {
		this.dbUtils = dbUtils;
	}

	public JdbcTemplate getJdbcTempplate() {
		return jdbcTempplate;
	}

	public void setJdbcTempplate(JdbcTemplate jdbcTempplate) {
		this.jdbcTempplate = jdbcTempplate;
	}
	
	
}
