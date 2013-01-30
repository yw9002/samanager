package com.yanshare.service;

import java.util.List;

import com.yanshare.dao.ResearchProjectDao;
import com.yanshare.entity.PageModel;
import com.yanshare.entity.ResearchProject;

public class ResearchProjectServiceImpl implements ResearchProjectService{
	private ResearchProjectDao researchProjectDao;
	public int addResearchProject(ResearchProject researchProject, String opr) {
		// TODO Auto-generated method stub
		return researchProjectDao.addResearchProject(researchProject, opr);
	}
	public List<ResearchProject> queryResearchProjectList(PageModel pageModel) {
		// TODO Auto-generated method stub
		return researchProjectDao.queryResearchProjectList(pageModel);
	}
	public int queryResearchProjectsCount(PageModel pageModel) {
		// TODO Auto-generated method stub
		return researchProjectDao.queryResearchProjectsCount(pageModel);
	}
	public ResearchProject queryResearchProjectById(ResearchProject rp) {
		// TODO Auto-generated method stub
		return researchProjectDao.queryResearchProjectById(rp);
	}
	
	
	
	public ResearchProjectDao getResearchProjectDao() {
		return researchProjectDao;
	}
	public void setResearchProjectDao(ResearchProjectDao researchProjectDao) {
		this.researchProjectDao = researchProjectDao;
	}

}
