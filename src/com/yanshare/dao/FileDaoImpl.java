package com.yanshare.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import com.yanshare.entity.UploadFiles;
import com.yanshare.utils.DBUtils;

public class FileDaoImpl implements FileDao{
private JdbcTemplate jdbcTemplate;
private DBUtils dbUtils;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveFiles(List<UploadFiles> files,String uuid) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO file(uploadFileName,uploadContentType,uploadRealName,uuid)VALUES(?,?,?,?)";
		int count = 0;
		for(UploadFiles file:files){
			count += jdbcTemplate.update(sql, new Object[]{file.getUploadFileName(),file.getUploadContentType(),file.getUploadRealName(),uuid});
		}
		return count;
	}

	public List<UploadFiles> getFileList(String uuid) {
		// TODO Auto-generated method stub
		String sql = "select uploadFileName,uploadContentType,uploadRealName,uuid from file where uuid=:uuid";
		Map<String,Object>paramMap = new HashMap<String,Object>();
		paramMap.put("uuid", uuid);
		return dbUtils.getArrayList(sql, UploadFiles.class, paramMap);
	}

	public DBUtils getDbUtils() {
		return dbUtils;
	}

	public void setDbUtils(DBUtils dbUtils) {
		this.dbUtils = dbUtils;
	}

	public UploadFiles getFilebyUuidAndName(String fileName, String uuid) {
		// TODO Auto-generated method stub
		String sql = "select uploadFileName,uploadContentType,uploadRealName,uuid from file where uuid=:uuid and uploadFileName=:uploadFileName";
		Map<String,Object>paramMap = new HashMap<String,Object>();
		paramMap.put("uuid", uuid);
		paramMap.put("uploadFileName", fileName);
		return dbUtils.getObject(sql, UploadFiles.class, paramMap);
	}

	public int delFileByUuidAndName(String fileName, String uuid) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM file WHERE uuid=? and uploadRealName=?";
		return jdbcTemplate.update(sql, new Object[]{uuid,fileName});
	}
	

}
