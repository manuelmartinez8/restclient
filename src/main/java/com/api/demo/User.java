package com.api.demo;

import java.io.Serializable;

public class User	implements Serializable{
		
	    public int id;
	    public String email;
	    public String first_name;
	    public String last_name;
	    public String avatar;
	    
	    
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(int id, String email, String first_name, String last_name, String avatar) {
			super();
			this.id = id;
			this.email = email;
			this.first_name = first_name;
			this.last_name = last_name;
			this.avatar = avatar;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getAvatar() {
			return avatar;
		}
		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}
	    

}
