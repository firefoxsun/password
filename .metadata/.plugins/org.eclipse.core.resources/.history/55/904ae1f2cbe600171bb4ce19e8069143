package com.zxr.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/** 
* @author zxr:zhaoxinran_dlmuit@163.com 
* @version 创建时间：2017年12月21日 上午11:21:55 
* 类说明 
*/
public class Demo {
	public static void main(String[] args) {
		//模版代码
		templte();
	}

	public static void templte() {
		ResultSet rs = null;
		Statement st = null;
		Connection conn = null;
		try {
			//获取连接
			conn = JdbcUtils.getConnection();
			//创建语句
			st = conn.createStatement();
			//执行语句
			rs = st.executeQuery("select * from t_user");
			//处理结果
			while(rs.next()){
				System.out.println(rs.getObject(1)+"\t"+rs.getObject(2)+"\t"+rs.getObject(3)+"\t"+rs.getObject(4));
			}
		} catch (SQLException e) {
			System.out.println("SQLException");
		}finally{
			JdbcUtils.free(rs, st, conn);
		}
		
		
	}

	
}
