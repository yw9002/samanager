package com.yanshare.dao;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import com.yanshare.entity.Teacher;
import com.yanshare.entity.User;
import com.yanshare.entity.UserRole;
import com.yanshare.utils.DBUtils;

public class UserDaoImpl implements UserDao {
	private DBUtils dbUtils;
	private JdbcTemplate jdbcTemplate;
	
	public int findUserbyUser(User user) {
		// TODO Auto-generated method stub
		String sql = "select username,password from USER where username=:username and password=:password";
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("username", user.getUsername());
		map.put("password", user.getPassword());
		return dbUtils.getArrayList(sql, map).size();
	}
	public int addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
		return 0;
	}
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		String sql = "SELECT `user`.uid as uid,`user`.username as username,userrole.roleid as roleid,userrole.rolename as rolename FROM user LEFT JOIN userrole  on user.urole=userrole.roleid";
		return dbUtils.getArrayList(sql, User.class, new HashMap<String, Object>());
	}

	public User findUserById(User user) {
		// TODO Auto-generated method stub
		String sql = "SELECT `user`.uid as uid,`user`.password as password,`user`.username as username,userrole.roleid as roleid,userrole.rolename as rolename FROM user LEFT JOIN userrole  on user.urole=userrole.roleid WHERE uid=:uid";
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("uid", user.getUid());
		return dbUtils.getObject(sql, User.class, map);
	}
	public List<UserRole> getUserRoleList() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM userrole";
		return dbUtils.getArrayList(sql, UserRole.class, new HashMap<String, Object>());
	}
	public int addUser(User user,String opr) {
		// TODO Auto-generated method stub
		int flag = 0;
		String sql = "select COUNT(*) from user where username=:username";
		String sql2 = "insert into user(username,password,urole) values(?,?,?)";
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("username", user.getUsername());
		if(opr.equals("add")){
			if(dbUtils.getCount(sql, map)==0){
				flag = jdbcTemplate.update(sql2, new Object[]{user.getUsername(),user.getPassword(),user.getRoleid()});
			}else{
				flag = -1;
			}
		}else{
			sql = "select COUNT(*) from user where username=:username and uid<>:uid";
			map.put("uid", user.getUid());
			if(dbUtils.getCount(sql, map)!=0){
				flag = -1;
			}else{
				sql2 = "UPDATE `user` SET username=?,password=?,urole=? WHERE uid=?";
				flag = jdbcTemplate.update(sql2,new Object[]{user.getUsername(),user.getPassword(),user.getRoleid(),user.getUid()});
		
			}
		}
		return flag;
	}
	
	public int delUser(User user) {
		String sql = "delete from user where uid=?";
		return jdbcTemplate.update(sql,new Object[]{user.getUid()});
	}
	public DBUtils getDbUtils() {
		return dbUtils;
	}
	public void setDbUtils(DBUtils dbUtils) {
		this.dbUtils = dbUtils;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
