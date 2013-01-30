package com.yanshare.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yanshare.entity.Periodical;
import com.yanshare.utils.DBUtils;

public class PeriodicalDaoImpl implements PeriodicalDao{
	private DBUtils dbUtils;
	private JdbcTemplate jdbcTempplate;
	public List<Periodical> findPeriodicalList() {
		// TODO Auto-generated method stub
		String sql = "select * from periodical";
		return dbUtils.getArrayList(sql, Periodical.class, new HashMap<String, Object>());
	}

	public Periodical findPeriodicalByName(Periodical periodical) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM periodical where pname=:pname";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pname", periodical.getPname());
		return dbUtils.getObject(sql, Periodical.class, map);
	}

	public List<String> findPeriodicalName(String key) {
		String sql = "SELECT pname FROM periodical WHERE pname LIKE '"+key+"%' GROUP BY pname";
		return dbUtils.getArrayList(sql, String.class, new HashMap<String,Object>());
	}
	public int delPeriodical(Periodical periodical) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM periodical WHERE pid=?";
		return jdbcTempplate.update(sql,new Object[]{periodical.getPid()});
	}
	public int addPeriodical(Periodical periodical,String opr) {
		String sql = "insert into periodical(pname,pno,pproperties,punit,psearch,phonour,pissn,pcn,ptype) values (?,?,?,?,?,?,?,?,?)";
		if(("update").equals(opr)){
			sql = "update periodical set pname=?,pno=?,pproperties=?,punit=?,psearch=?,phonour=?,pissn=?,pcn=?,ptype=? where pid=?";
			return jdbcTempplate.update(sql,new Object[]{periodical.getPname(),periodical.getPno(),periodical.getPproperties(),periodical.getPunit(),periodical.getPsearch(),periodical.getPhonour(),periodical.getPissn(),periodical.getPcn(),periodical.getPtype(),periodical.getPid()});
		}
		return jdbcTempplate.update(sql,new Object[]{periodical.getPname(),periodical.getPno(),periodical.getPproperties(),periodical.getPunit(),periodical.getPsearch(),periodical.getPhonour(),periodical.getPissn(),periodical.getPcn(),periodical.getPtype()});
	}
	public Periodical findPeriodicalById(Periodical periodical) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM periodical where pid=:pid";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pid", periodical.getPid());
		return dbUtils.getObject(sql, Periodical.class, map);
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
