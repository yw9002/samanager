package com.yanshare.service;

import java.util.List;

import com.yanshare.entity.User;
import com.yanshare.entity.UserRole;

public interface UserService {
	/**
	 * 登录时使用，根据登录信息查找相关用户
	 * @param user 登录信息
	 * @return 如果找到相关用户返回user对象，如未找到则返回null
	 */
	public int findUserbyUser(User user);
	/**
	 * 获取所有管理用户信息
	 * @return 管理用户列表
	 */
	public List<User> getUserList();
	/**
	 * 编辑用户
	 * @param user 用户对象
	 * @return 返回成修改对象条件，一般情况下为1
	 */

	public User findUserById(User user);
	/**
	 * 返回用户角色列表
	 * @return 用户角色列表
	 */
	public List<UserRole> getUserRoleList();
	/**
	 * 添加、修改管理用户
	 * @param user 管理用户对象
	 * @param opr 添加、修改标识
	 * @return 成功添加或修改条数，一般为1
	 */
	public int addUser(User user,String opr);
	/**
	 *根据用户Id删除用户
	 * @param user 只要求传uid即可
	 * @return 成功删除条数
	 */
	public int delUser(User user);
}
