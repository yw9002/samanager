package com.yanshare.service;

import java.util.List;

import com.yanshare.entity.PageModel;
import com.yanshare.entity.ResearchProject;

public interface ResearchProjectService {
	/**
	 * 保存科研项目
	 * @param researchProject 科研项目对象 
	 * @return 返回成功保存个数，正常应该是1
	 */
	public int addResearchProject(ResearchProject rp, String opr);
	/**
	 * 显示所有科研项目
	 * @return 科研项目列表
	 */
	public List<ResearchProject> queryResearchProjectList(PageModel pageModel);
	/**
	 * 查询所有科研项目数据条数
	 * @return 数据条数
	 */
	public int queryResearchProjectsCount(PageModel pageModel);
	/**
	 * 根据id查找科研项目
	 * @param rp
	 * @return
	 */
	public ResearchProject queryResearchProjectById(ResearchProject rp);
}
