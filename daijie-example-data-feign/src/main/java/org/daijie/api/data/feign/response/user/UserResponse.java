package org.daijie.api.data.feign.response.user;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "用户信息")
public class UserResponse implements Serializable {

	private static final long serialVersionUID = 4879398543405139154L;

	@ApiModelProperty(name = "userId", value = "用户ID", required = true)
	private Integer userId;
	
	@ApiModelProperty(name = "userName", value = "用户名", required = true)
	private String userName;
	
	@ApiModelProperty(name = "password", value = "密码")
	private String password;
	
	@ApiModelProperty(name = "salt", value = "盐")
	private String salt;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

}
