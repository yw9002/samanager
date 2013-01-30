package com.yanshare.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yanshare.entity.PageModel;
import com.yanshare.entity.ResearchProject;
import com.yanshare.entity.UploadFiles;
import com.yanshare.service.FileService;
import com.yanshare.service.ResearchProjectService;
import com.yanshare.utils.UuidUtil;

public class ResearchProjectsAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private ResearchProjectService researchProjectService;
	private ResearchProject researchProject;
	private PageModel pageModel;
	List<ResearchProject> researchProjectList;
	private FileService fileService;
	private String msg;
	private String opr;
	private int pageNum;
	private int numPerPage;
	private List<UploadFiles>filelist;
	/**
	 * 添加科研项目
	 * @return
	 */
	public String add(){
		researchProject.setProUuid(ActionContext.getContext().getSession().get("uuid").toString());
		if(researchProjectService.addResearchProject(researchProject, opr)>0){
			msg = "操作成功";
		}else{
			msg = "操作失败，请稍后再试";
		}
		return SUCCESS;
	}
	/**
	 * 更新科研项目
	 * @return
	 */
	public String update(){
		researchProject = researchProjectService.queryResearchProjectById(researchProject);
		filelist = fileService.getFileList(researchProject.getProUuid());
		ActionContext.getContext().getSession().put("uuid", researchProject.getProUuid());
		return SUCCESS;
	}
	/**
	 * 跳转至添加科研项目页
	 * @return
	 */
	public String toAddProPage(){
		ActionContext.getContext().getSession().put("uuid", UuidUtil.getUUID());
		return SUCCESS;
	}
	/**
	 * 获取第一页科研项目
	 * @return
	 */
	public String queryResearchProjectList(){
		pageModel = new PageModel();
		if(pageNum==0||numPerPage==0){
			pageModel.setPageNum(1);
			pageModel.setPageSize(20);
		}else{
			pageModel.setPageNum(pageNum);
			pageModel.setPageSize(numPerPage);
		}
		researchProjectList = researchProjectService.queryResearchProjectList(pageModel);
		pageModel.setTotalRecord(researchProjectService.queryResearchProjectsCount(pageModel));
		pageNum = 0;
		numPerPage = 0;
		return SUCCESS;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public ResearchProject getResearchProject() {
		return researchProject;
	}

	public void setResearchProject(ResearchProject researchProject) {
		this.researchProject = researchProject;
	}
	public ResearchProjectService getResearchProjectService() {
		return researchProjectService;
	}
	public void setResearchProjectService(
			ResearchProjectService researchProjectService) {
		this.researchProjectService = researchProjectService;
	}
	public PageModel getPageModel() {
		return pageModel;
	}
	public void setPageModel(PageModel pageModel) {
		this.pageModel = pageModel;
	}
	public List<ResearchProject> getResearchProjectList() {
		return researchProjectList;
	}
	public void setResearchProjectList(List<ResearchProject> researchProjectList) {
		this.researchProjectList = researchProjectList;
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
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getNumPerPage() {
		return numPerPage;
	}
	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}
	public FileService getFileService() {
		return fileService;
	}
	public void setFileService(FileService fileService) {
		this.fileService = fileService;
	}
	public List<UploadFiles> getFilelist() {
		return filelist;
	}
	public void setFilelist(List<UploadFiles> filelist) {
		this.filelist = filelist;
	}
	
	
	
}
