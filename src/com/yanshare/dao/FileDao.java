package com.yanshare.dao;

import java.util.List;

import com.yanshare.entity.UploadFiles;

public interface FileDao {
	/**
	 * 保存上传文件列表
	 * @param files 文件列表
	 * @param uuid 当前操作uuid标识
	 * @return 保存文件个数
	 */
	public int saveFiles(List<UploadFiles> files,String uuid);
	/**
	 * 根据当前操作标识获取文件列表
	 * @param uuid 当前操作标识符
	 * @return 文件列表
	 */
	public List<UploadFiles> getFileList(String uuid);
	/**
	 * 根据文件名和uuid获取文件保存名
	 * @param fileName 文件名
	 * @param uuid 当前操作标识
	 * @return 文件信息对象
	 */	
	public UploadFiles getFilebyUuidAndName(String fileName,String uuid);
	/**
	 * 删除文件根据uuid和文件保存名
	 * @param fileName 文件保存名
	 * @param uuid 当次操作标识符
	 * @return
	 */
	public int delFileByUuidAndName(String fileName,String uuid);
}
