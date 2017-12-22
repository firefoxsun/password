package com.zxr.domain;

import java.util.Date;

/**
 * @author zxr:zhaoxinran_dlmuit@163.com
 * @version 创建时间：2017年12月21日 下午3:24:23 类说明
 */
public class User {
	private String website;
	private String urls;
	private String userName;
	private String email;
	private String password;
	private String tel;
	private Date timeStamp;

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getUrls() {
		return urls;
	}

	public void setUrls(String urls) {
		this.urls = urls;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public User(String website, String urls, String userName, String email, String password, String tel,
			Date timeStamp) {
		super();
		this.website = website;
		this.urls = urls;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.tel = tel;
		this.timeStamp = timeStamp;
	}

	public User() {
		super();
	}

}
