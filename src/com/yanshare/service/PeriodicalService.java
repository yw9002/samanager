package com.yanshare.service;

import java.util.List;
import com.yanshare.entity.Periodical;

public interface PeriodicalService {
	/**
	 * ��ȡ���б�
	 * @return ��ȡ���б�
	 */
	public List<Periodical> findPeriodicalList();
	/**
	 * �����ڿ�����ȡ�ڿ���Ϣ
	 * @param periodical Ҫ�����ڿ���
	 * @return �ڿ�����
	 */
	public Periodical findPeriodicalByName(Periodical periodical);
	/**
	 * ���ݹؼ��ַ����ڿ������б�
	 * @param key �ؼ���
	 * @return �ڿ������б�
	 */
	public List<String> findPeriodicalName(String key);
	/**
	 * ����ڿ�
	 * @param periodical �ڿ�����
	 * @param opt ��������
	 * @return �ɹ�����������������Ϊ1��ʧ��Ϊ0
	 */
	public int addPeriodical(Periodical periodical, String opr);
	/**
	 * ����ID�����ڿ�����
	 * @param periodical Ҫ�����ڿ�ID
	 * @return �ڿ�����
	 */
	public Periodical findPeriodicalById(Periodical periodical);
	/**
	 * ����IDɾ���ڿ�����
	 * @param periodical Ҫ�����ڿ�ID
	 * @return �ɹ�ɾ��������
	 */
	public int delPeriodical(Periodical periodical);
}
