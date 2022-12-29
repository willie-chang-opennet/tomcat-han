package com.lcpan.bean;



public class UsersBean implements java.io.Serializable {
		private static final long serialVersionUID = 1L;
		private String usersid;
		private String usersname;
		private String userspassword;
		public String getUsersid() {
			return usersid;
		}
		public void setUsersid(String usersid) {
			this.usersid = usersid;
		}
		public String getUsersname() {
			return usersname;
		}
		public void setUsersname(String usersname) {
			this.usersname = usersname;
		}
		public String getUserspassword() {
			return userspassword;
		}
		public void setUserspassword(String userspassword) {
			this.userspassword = userspassword;
		}
		@Override
		public String toString() {
			return "HoloBean [usersid=" + usersid + ", usersname=" + usersname + ", userspassword=" + userspassword + "]";
		}
		
	}