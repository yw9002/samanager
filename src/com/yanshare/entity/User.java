package com.yanshare.entity;
/**
 * 用户对象
 * @author Yanshare
 *
 */
public class User {
	private int uid;//用户ID
	private String username;//用户名
	private String password;//用户密码
	private int roleid;//角色ID
	private String rolename;//角色名称
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password="
				+ password + ", roleid=" + roleid + ", rolename=" + rolename
				+ "]";
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
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
	
}
