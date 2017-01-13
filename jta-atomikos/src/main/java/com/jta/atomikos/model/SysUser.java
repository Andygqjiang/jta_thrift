package com.jta.atomikos.model;

import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.validator.constraints.Length;

public class SysUser extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8816232688473343995L;

	/**
	 * 公司ID db_column: COMPANY_ID
	 */
	@JSONField(serialize = false)
	private Long companyId;

	/**
	 * 工作圈圈封面图片
	 */
	private String workImg;

	/**
	 * 姓名 db_column: NAME
	 */
	@Length(max = 30)
	private String name;

	/**
	 * 联系电话 db_column: TELEPHONE
	 */
	@Length(max = 30)
	private String telephone;

	/**
	 * 用户账户 db_column: ACCOUNT
	 */
	@Length(max = 30)
	private String account;

	/**
	 * 用户密码 db_column: PASSWORD
	 */
	@Length(max = 50)
	@JSONField(serialize = false)
	private String password;

	/**
	 * IM帐号 db_column: IM_ACCOUNT
	 */
	@Length(max = 50)
	private String imAccount;

	/**
	 * 性别 SEX
	 */
	@Length(max = 2)
	private String sex;

	/**
	 * 邮箱 EMAIL
	 */
	@Length(max = 50)
	private String email;

	/**
	 * 头像 db_column: ICON
	 */
	@Length(max = 100)
	private String icon;

	/****
	 * 非数据库字段 原密码
	 */
	private String oldPassword;

	/****
	 * 非数据库字段 新密码
	 */
	private String newPassword;
	
	/**
	 * 是否为客服 1 不是  2 是 db_column: USER_TYPE
	 */
	private String userType;
	

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getWorkImg() {
		return workImg;
	}

	public void setWorkImg(String workImg) {
		this.workImg = workImg;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getTelephone() {
		return telephone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone == null ? null : telephone.trim();
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account == null ? null : account.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getImAccount() {
		return imAccount;
	}

	public void setImAccount(String imAccount) {
		this.imAccount = imAccount == null ? null : imAccount.trim();
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon == null ? null : icon.trim();
	}

	@Override
	public String toString() {
		return "SysUser [companyId=" + companyId + ", name=" + name
				+ ", telephone=" + telephone + ", account=" + account
				+ ", password=" + password + ", imAccount=" + imAccount
				+ ", sex=" + sex + ", email=" + email + ", icon=" + icon
				+ ", oldPassword=" + oldPassword + ", newPassword="
				+ newPassword + ", getEid()=" + getEid() + ", getCreateTime()="
				+ getCreateTime() + ", getErpBtype()=" + getErpBtype()
				+ ", getUpdateTime()=" + getUpdateTime()
				+ ", getReturnParam()=" + getReturnParam() + "]";
	}

}