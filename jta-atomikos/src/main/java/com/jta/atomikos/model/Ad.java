package com.jta.atomikos.model;

public class Ad extends BaseModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 图片地址       db_column: ICON_PATH
	 */
	private String iconPath;
    
	/**
	 * 链接地址       db_column: URL_LINK
	 */
	private String urlLink;

	public String getIconPath() {
		return iconPath;
	}

	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}

	public String getUrlLink() {
		return urlLink;
	}

	public void setUrlLink(String urlLink) {
		this.urlLink = urlLink;
	}
	
	
}
