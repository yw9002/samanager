package com.yanshare.service;

import java.util.List;

import com.yanshare.entity.User;
import com.yanshare.entity.UserRole;

public interface UserService {
	/**
	 * ��¼ʱʹ�ã����ݵ�¼��Ϣ��������û�
	 * @param user ��¼��Ϣ
	 * @return ����ҵ�����û�����user������δ�ҵ��򷵻�null
	 */
	public int findUserbyUser(User user);
	/**
	 * ��ȡ���й����û���Ϣ
	 * @return �����û��б�
	 */
	public List<User> getUserList();
	/**
	 * �༭�û�
	 * @param user �û�����
	 * @return ���س��޸Ķ���������һ�������Ϊ1
	 */

	public User findUserById(User user);
	/**
	 * �����û���ɫ�б�
	 * @return �û���ɫ�б�
	 */
	public List<UserRole> getUserRoleList();
	/**
	 * ��ӡ��޸Ĺ����û�
	 * @param user �����û�����
	 * @param opr ��ӡ��޸ı�ʶ
	 * @return �ɹ���ӻ��޸�������һ��Ϊ1
	 */
	public int addUser(User user,String opr);
	/**
	 *�����û�Idɾ���û�
	 * @param user ֻҪ��uid����
	 * @return �ɹ�ɾ������
	 */
	public int delUser(User user);
}
