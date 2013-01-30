package com.yanshare.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yanshare.entity.User;
import com.yanshare.entity.UserRole;
import com.yanshare.service.UserService;

/**
 * @author Yanshare
 *
 */
public class UserAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private User user;
	private List<User> userList;
	private List<UserRole> userRoleList;
	private String msg;
	private String opr;
	/**
	 * 用户登录action处理方法
	 * @return
	 */
	public String login(){
		if(userService.findUserbyUser(user)>0){
			ActionContext.getContext().getSession().put("user", user);
			return SUCCESS;
		}
		return ERROR;
	}
	/**
	 * 获取用户列表action处理方法
	 * @return
	 */
	public String getUList(){
		this.userList = userService.getUserList();
		return SUCCESS;
	}
	/**
	 * 根据ID查找用户
	 * @return
	 */
	public String findUserById(){
		user = userService.findUserById(user);
		userRoleList = userService.getUserRoleList();
		return SUCCESS;
	}
	/**
	 * 获取用户类型
	 * @return
	 */
	public String getRoleList(){
		userRoleList = userService.getUserRoleList();
		return SUCCESS;
	}
	/**
	 * 添加、修改用户
	 * @return
	 */
	public String saveUser(){
		int flag = userService.addUser(user,opr);
		if(flag == -1){
			msg = "用户名已存在，请更换后再试";
		}else if(flag == 1){
			msg = "操作成功";
		}else{
			msg = "操作失败，请稍后再试";
		}
		return SUCCESS;
	}
	/**
	 * 删除用户action
	 * @return
	 */
	public String delUser(){
		int flag = userService.delUser(user);
		if(flag > 0){
			msg = "操作成功";
		}else if(flag == 1){
			msg = "操作成功";
		}else{
			msg = "操作失败，请稍后再试";
		}
		return SUCCESS;
	}
	
	
	
	
	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<UserRole> getUserRoleList() {
		return userRoleList;
	}
	public void setUserRoleList(List<UserRole> userRoleList) {
		this.userRoleList = userRoleList;
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
	
	
}
