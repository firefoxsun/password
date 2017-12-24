package com.zxr.domain;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/** 
* @author zxr:zhaoxinran_dlmuit@163.com 
* @version 创建时间：2017年12月21日 下午3:32:47 
* 类说明 数据访问层
*/
import com.zxr.project.JdbcUtils;


public class UserDaoImpl implements UserDao {
	
	// ==添加用户==
	@Override
	public void addUser(User user) {
		Connection conn = null;
		PreparedStatement st = null;
		// 连接数据库
		try {
			conn = JdbcUtils.getConnection();
			String sql = "insert into t_passinfo(website,urls,userName,email,password,tel,timeStamp) values(?,?,?,?,?,?,?)";
			// 创建语句
			st = conn.prepareStatement(sql);
			st.setString(1, user.getWebsite());
			st.setString(2, user.getUrls());
			st.setString(3, user.getUserName());
			st.setString(4, user.getEmail());
			st.setString(5, user.getPassword());
			st.setString(6, user.getTel());
			st.setString(7, user.getTimeStamp());
			// 执行语句
			int count = st.executeUpdate();
			System.out.println("添加记录的条数:" + count);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JdbcUtils.free(null, st, conn);
		}
		
	}

	// ===删除用户====
	@Override
	public int delete(String website) {
		int count = 0;
		Connection conn = null;
		PreparedStatement st = null;
		String sql = "delete from t_passinfo where website=?";
		try {
			// 连接数据库
			conn = JdbcUtils.getConnection();
			// 创建语句
			st = conn.prepareStatement(sql);
			st.setString(1, website);
			// 执行语句
			count = st.executeUpdate();
			System.out.println("删除记录的条数:" + count);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, st, conn);
		}
		return count;
	}

	// ===通过用户名获取用户信息===
	@Override
	public User getUserByWebsite(String website) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "select * from t_passinfo where website=?";

		try {
			// 连接数据库
			conn = JdbcUtils.getConnection();
			// 创建语句
			st = conn.prepareStatement(sql);
			
			st.setString(1, website);
			rs = st.executeQuery();
			// 执行语句
			if (rs.next()) {
				User user = new User();
				user.setUrls(rs.getString("urls"));
				user.setUserName(rs.getString("userName"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setTel(rs.getString("tel"));
				user.setTimeStamp(rs.getString("timeStamp"));
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(rs, st, conn);
		}

		return null;
	}

	// ===更新用户信息====
	@Override
	public int update(User user) {
		System.out.println("处于UserDaoImpl的数据层Update");
		Connection conn = null;
		PreparedStatement st = null;
		String sql = "UPDATE t_passinfo SET urls=?,userName=?,email=?,PASSWORD=?,tel=?,TIMESTAMP=? WHERE website=?;";
		
		int count = 0;
		try {
			conn = JdbcUtils.getConnection();
			st = conn.prepareStatement(sql);
			
			
			//将其转化为sql数据类型
			st.setObject(1, user.getUrls());
			st.setObject(2, user.getUserName());
			st.setObject(3, user.getEmail());
			st.setObject(4, user.getPassword());
			st.setObject(5, user.getTel());
			st.setObject(6, user.getTimeStamp());
			st.setObject(7, user.getWebsite());
			
			System.out.println(count);
			count = st.executeUpdate();
			System.out.println("@"+count);
			System.out.println("更新的记录数是:" + count);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.free(null, st, conn);
		}
		return count;
	}

}
