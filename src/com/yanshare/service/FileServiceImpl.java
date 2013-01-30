package com.yanshare.service;

import java.util.List;

import com.yanshare.dao.FileDao;
import com.yanshare.entity.UploadFiles;

public class FileServiceImpl implements FileService {
	private FileDao fileDao;
	
	public FileDao getFileDao() {
		return fileDao;
	}

	public void setFileDao(FileDao fileDao) {
		this.fileDao = fileDao;
	}

	public int saveFiles(List<UploadFiles> files,String uuid) {
		// TODO Auto-generated method stub
		return fileDao.saveFiles(files,uuid);
	}

	public List<UploadFiles> getFileList(String uuid) {
		// TODO Auto-generated method stub
		return fileDao.getFileList(uuid);
	}

	public UploadFiles getFilebyUuidAndName(String fileName, String uuid) {
		// TODO Auto-generated method stub
		return fileDao.getFilebyUuidAndName(fileName, uuid);
	}

	public int delFileByUuidAndName(String fileName, String uuid) {
		// TODO Auto-generated method stub
		return fileDao.delFileByUuidAndName(fileName, uuid);
	}

}
