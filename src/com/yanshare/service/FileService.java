package com.yanshare.service;

import java.util.List;

import com.yanshare.entity.UploadFiles;

public interface FileService {
	/**
	 * �����ļ���Ϣ
	 * @param files �ļ���Ϣlist
	 * @param uuid ���β�����ʶ��
	 * @return �����ļ���Ϣ����
	 */
	public int saveFiles(List<UploadFiles> files,String uuid);
	/**
	 * ��ȡ�ļ��б��β���
	 * @param uuid ���β�����ʶ��
	 * @return �ļ��б�
	 */
	public List<UploadFiles> getFileList(String uuid);
	/**
	 * ����filename,uuid ��ȡ�ļ���Ϣ
	 * @param fileName �ϴ��ļ���
	 * @param uuid ���β�����ʶ��
	 * @return �ļ���Ϣ
	 */
	public UploadFiles getFilebyUuidAndName(String fileName, String uuid);
	/**
	 * ����uuid,fileName ɾ���ļ���¼
	 * @param fileName �ϴ��ļ���
	 * @param uuid ���β�����ʶ�� 
	 * @return ɾ���ɹ���¼����
	 */
	public int delFileByUuidAndName(String fileName, String uuid);
}
