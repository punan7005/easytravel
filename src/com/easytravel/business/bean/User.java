package com.easytravel.business.bean;
/** 
 * 类说明 :用户实体
 * @author  joker 
 * 创建时间：2013-2-1 上午9:56:15 
 */
public class User {
	
//	用户id
	private String userId;
//	用户名
	private String userName;
//	用户密码
	private String userPassword;
//	用户邮箱
	private String userEmail;
//	用户注册时间
	private String userCreateTime;
//	用户验证状态
	private String userIsVal;
	
	public String getUserIsVal() {
		return userIsVal;
	}
	public void setUserIsVal(String userIsVal) {
		this.userIsVal = userIsVal;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserCreateTime() {
		return userCreateTime;
	}
	public void setUserCreateTime(String userCreateTime) {
		this.userCreateTime = userCreateTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
}
