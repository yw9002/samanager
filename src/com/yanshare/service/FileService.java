package com.yanshare.service;

import java.util.List;

import com.yanshare.entity.UploadFiles;

public interface FileService {
	/**
	 * 保存文件信息
	 * @param files 文件信息list
	 * @param uuid 当次操作标识符
	 * @return 保存文件信息条数
	 */
	public int saveFiles(List<UploadFiles> files,String uuid);
	/**
	 * 获取文件列表当次操作
	 * @param uuid 当次操作标识符
	 * @return 文件列表
	 */
	public List<UploadFiles> getFileList(String uuid);
	/**
	 * 根据filename,uuid 获取文件信息
	 * @param fileName 上传文件名
	 * @param uuid 当次操作标识符
	 * @return 文件信息
	 */
	public UploadFiles getFilebyUuidAndName(String fileName, String uuid);
	/**
	 * 根据uuid,fileName 删除文件记录
	 * @param fileName 上传文件名
	 * @param uuid 当次操作标识符 
	 * @return 删除成功记录条数
	 */
	public int delFileByUuidAndName(String fileName, String uuid);
}
