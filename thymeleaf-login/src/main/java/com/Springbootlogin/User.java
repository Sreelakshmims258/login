package com.Springbootlogin;



public class User {
    private String username;
    private String pass;
    
    public User(String username, String password) {
        this.username = username;
        this.pass = password;
    }
    
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

    
}
