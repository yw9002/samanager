package com.yanshare.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yanshare.entity.PageModel;
import com.yanshare.entity.ResearchProject;
import com.yanshare.utils.DBUtils;

public class ResearchProjectDaoImpl implements ResearchProjectDao {
	private JdbcTemplate jdbcTemplate;
	private DBUtils dbUtils;

	public int addResearchProject(ResearchProject rp, String opr) {
		// TODO Auto-generated method stub
		StringBuffer sql = new StringBuffer();
		Object[] args = null;
		if("add".equals(opr)){
			sql = sql.append("INSERT INTO researchprojects(proNo,proTopic,proType,proPrincipal,proParticipate,proSubsidize,proMoney,proSupporting,proStartDate,proEndDate,proApproval,proSign,proIsExpect,prouuid)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			args = new Object[]{rp.getProNo(),rp.getProTopic(),rp.getProType(),rp.getProPrincipal(),rp.getProParticipate(),rp.getProSubsidize(),rp.getProMoney(),rp.getProSupporting(),rp.getProStartDate(),rp.getProEndDate(),rp.getProApproval(),rp.getProSign(),rp.getProIsExpect(),rp.getProUuid()};
		}else{
			sql = sql.append("UPDATE researchprojects SET proNo=?,proTopic=?,proType=?,proPrincipal=?,proParticipate=?,proSubsidize=?,proMoney=?,proSupporting=?,proStartDate=?,proEndDate=?,proApproval=?,proSign=?,proIsExpect=?,prouuid=? where proId=?");
			args = new Object[]{rp.getProNo(),rp.getProTopic(),rp.getProType(),rp.getProPrincipal(),rp.getProParticipate(),rp.getProSubsidize(),rp.getProMoney(),rp.getProSupporting(),rp.getProStartDate(),rp.getProEndDate(),rp.getProApproval(),rp.getProSign(),rp.getProIsExpect(),rp.getProUuid(),rp.getProId()};
		}
		return jdbcTemplate.update(sql.toString(), args);
	}

	public List<ResearchProject> queryResearchProjectList(PageModel pageModel) {
		// TODO Auto-generated method stub
		int index = (pageModel.getPageNum()-1)*pageModel.getPageSize();
		Map<String, Object> map= new HashMap<String, Object>();
		map.put("index", index);
		map.put("page", pageModel.getPageSize());
		String sql = "SELECT * FROM researchprojects ORDER BY proId LIMIT :index,:page";
		return dbUtils.getArrayList(sql, ResearchProject.class, map);
	}
	
	public int queryResearchProjectsCount(PageModel pageModel) {
		String sql = "SELECT COUNT(proId) FROM researchprojects";
		return dbUtils.getCount(sql, new HashMap<String,Object>());
	}
	public ResearchProject queryResearchProjectById(ResearchProject rp) {
		String sql = "SELECT * FROM researchprojects WHERE proId=:proId";
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("proId", rp.getProId());
		return dbUtils.getObject(sql, ResearchProject.class, paramMap);
	}
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public DBUtils getDbUtils() {
		return dbUtils;
	}

	public void setDbUtils(DBUtils dbUtils) {
		this.dbUtils = dbUtils;
	}

	
}
