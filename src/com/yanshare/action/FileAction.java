package com.yanshare.action;

import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yanshare.entity.UploadFiles;
import com.yanshare.service.FileService;
import com.yanshare.utils.UploadConfigurationRead;

public class FileAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private File[] upload;// 实际上传文件
	private String[] uploadContentType; // 文件的内容类型
	private String[] uploadFileName; // 上传文件名
	private List<UploadFiles> uploadFiles;
	private FileService fileService;
	private List<UploadFiles> filelist;
	private String fileName;
	private String fileRealName;
	private String fileRName;
	/**
	 * 文件上传action
	 * @return
	 * @throws Exception
	 */
	public String upload() throws Exception
	{
		String targetDirectory = ServletActionContext.getServletContext().getRealPath("/"+ UploadConfigurationRead.getInstance().getConfigItem("uploadFilePath").trim());
		uploadFiles  = new ArrayList<UploadFiles>();
		try
		{
			for (int i = 0; i < upload.length; i++)
			{
				String fileName = uploadFileName[i];// 上传的文件名
				String type = uploadContentType[i];// 文件类型
				String realName = fileName +"-"+ UUID.randomUUID().toString()+ getExt(fileName);// 保存的文件名称，使用UUID+后缀进行保存
				File target = new File(targetDirectory, realName);
				FileUtils.copyFile(upload[i], target);// 上传至服务器的目录，一般都这样操作， 在把路径写入数据库即可
				UploadFiles uf = new UploadFiles();// 创建文件
				uf.setUploadContentType(type);
				uf.setUploadFileName(fileName);
				uf.setUploadRealName(realName);
				uploadFiles.add(uf);// 添加到需要下载文件的List集合中
			}
			if(uploadFiles.size()>0){
				fileService.saveFiles(uploadFiles,ActionContext.getContext().getSession().get("uuid").toString());
			}else{
				return INPUT;
			}
		} catch (Exception e)
		{
			e.printStackTrace();
			addActionError(e.getMessage());

			return INPUT;
		}
		//getFileList();
		return SUCCESS;

	}
	/**
	 *根据uuid 获取上传文件列表action
	 * @return
	 */
	public String getFileList(){
		filelist = fileService.getFileList(ActionContext.getContext().getSession().get("uuid").toString());
		return SUCCESS;
	}
	/**
	 * 文件下载action
	 * @return
	 */
	public String download(){
		
		return SUCCESS;
	}
	/**
	 * 获取文件流信息
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public InputStream getDownloadFile()
	{	
		return ServletActionContext.getServletContext().getResourceAsStream("/"+UploadConfigurationRead.getInstance().getConfigItem("uploadFilePath").trim()+"/" + fileRealName);
	}
	/**
	 * 上传文件时删除文件action
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public String  delFile() throws UnsupportedEncodingException{
		fileService.delFileByUuidAndName(fileRName, ActionContext.getContext().getSession().get("uuid").toString());
		filelist = fileService.getFileList(ActionContext.getContext().getSession().get("uuid").toString());
		return SUCCESS;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public File[] getUpload()
	{
		return upload;
	}

	public void setUpload(File[] upload)
	{
		this.upload = upload;
	}

	public String[] getUploadContentType()
	{
		return uploadContentType;
	}

	public void setUploadContentType(String[] uploadContentType)
	{
		this.uploadContentType = uploadContentType;
	}

	public String[] getUploadFileName()
	{
		return uploadFileName;
	}

	public void setUploadFileName(String[] uploadFileName)
	{
		this.uploadFileName = uploadFileName;
	}

	public static String getExt(String fileName)
	{
		return fileName.substring(fileName.lastIndexOf("."));
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
	public String getFileName() throws UnsupportedEncodingException {
		fileName = new String(fileName.getBytes(), "ISO-8859-1");
		return fileName;
	}
	public void setFileName(String fileName) throws UnsupportedEncodingException{
		this.fileName = new String(fileName.getBytes("ISO-8859-1"),"UTF-8");
	}
	public String getFileRealName() throws UnsupportedEncodingException {
		fileRealName = new String(fileRealName.getBytes(),"ISO-8859-1");
		return fileRealName;
	}
	public void setFileRealName(String fileRealName) throws UnsupportedEncodingException {
		this.fileRealName = new String(fileRealName.getBytes("ISO-8859-1"),"UTF-8");
		this.setFileRName(fileRealName);
	}
	public String getFileRName() {
		return fileRName;
	}
	public void setFileRName(String fileRName) {
		this.fileRName = fileRName;
	}
	
}
