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
			String sql = "insert into t_user(id,name,email,password) values(?,?,?,?)";
			// 创建语句
			st = conn.prepareStatement(sql);
			st.setString(2, user.getName());
			st.setString(3, user.getEmail());
			st.setString(4, user.getPassword());
			// 执行语句
			int count = st.executeUpdate();
			System.out.println("添加记录的条数:" + count);
		} catch (SQLException e) {
			System.out.println("添加用户:SQLException");
		} finally {
			JdbcUtils.free(null, st, conn);
		}
	}

	// ===删除用户====
	@Override
	public int delete(User user) {
		int count = 0;
		Connection conn = null;
		PreparedStatement st = null;
		String sql = "delete from t_user where name=?";
		try {
			// 连接数据库
			conn = JdbcUtils.getConnection();
			// 创建语句
			st = conn.prepareStatement(sql);
			st.setString(2, user.getName());
			// 执行语句
			count = st.executeUpdate();
			System.out.println("删除记录的条数:" + count);
		} catch (SQLException e) {
			System.out.println("删除用户:SQLException");
		} finally {
			JdbcUtils.free(null, st, conn);
		}
		return count;
	}

	// ===通过用户名获取用户信息===
	@Override
	public User getUserByName(String userName) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "select name from t_user where name=?";

		try {
			// 连接数据库
			conn = JdbcUtils.getConnection();
			// 创建语句
			st = conn.prepareStatement(sql);
			st.setString(2, userName);
			rs = st.executeQuery();
			// 执行语句
			if (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				return user;
			}
		} catch (SQLException e) {
			System.out.println("通过用户名获取用户信息:SQLException");
		} finally {
			JdbcUtils.free(rs, st, conn);
		}

		return null;
	}

	// ===更新用户信息====
	@Override
	public int update(User user) {
		Connection conn = null;
		PreparedStatement st = null;
		String sql = "update t_user set name = ?,email = ?,password = ? where name=?";
		int count = 0;
		try {
			conn = JdbcUtils.getConnection();
			st = conn.prepareStatement(sql);

			st.setString(2, user.getName());
			st.setString(3, user.getEmail());
			st.setString(4, user.getPassword());

			count = st.executeUpdate();
			System.out.println("更新的记录数是:" + count);
		} catch (SQLException e) {
			System.out.println("更新用户信息:SQLException");
		} finally {
			JdbcUtils.free(null, st, conn);
		}
		return count;
	}

}
