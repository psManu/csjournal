package com.psmanu.csjournal.core.entity;

public class Admin {
	
	private String name;
	private String userId;
	private String password;
	private String proPic;
	
	public Admin(){}
	
	public Admin(String name, String useId, String password, String proPic) {
		super();
		this.name = name;
		this.userId = useId;
		this.password = password;
		this.proPic = proPic;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUseId() {
		return userId;
	}
	
	public void setUseId(String useId) {
		this.userId = useId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getProPic() {
		return proPic;
	}
	
	public void setProPic(String proPic) {
		this.proPic = proPic;
	}

	
	public String toString() {
		return "Admin [name=" + name + ", useId=" + userId + ", password=" + password + ", proPic=" + proPic + "]";
	}
	
	

}
