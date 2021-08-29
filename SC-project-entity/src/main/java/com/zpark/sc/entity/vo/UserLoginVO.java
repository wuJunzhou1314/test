package com.zpark.sc.entity.vo;
/**
 * 	登陆成功后，返回浏览器的VO实体类
 * @author lenovo
 *
 */
public class UserLoginVO {
	
	private Integer id;
	
	private String username;
	
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserLoginVO(Integer id, String username, String email) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
	}

	public UserLoginVO() {
		super();
	}

	@Override
	public String toString() {
		return "UserLoginVO [id=" + id + ", username=" + username + ", email=" + email + "]";
	}
	
}
