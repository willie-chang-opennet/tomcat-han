package com.lcpan.bean;



public class HoloBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String memberid;
	private String memberpicture;
	private String membername;
	private String memberdata;
	private String memberfrom;
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public  String getMemberpicture() {
		return memberpicture;
	}
	public void setMemberpicture( String memberpicture) {
		this.memberpicture = memberpicture;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getMemberdata() {
		return memberdata;
	}
	public void setMemberdata(String memberdata) {
		this.memberdata = memberdata;
	}
	public String getMemberfrom() {
		return memberfrom;
	}
	public void setMemberfrom(String memberfrom) {
		this.memberfrom = memberfrom;
	}
	@Override
	public String toString() {
		return "HoloBean [memberid=" + memberid + ", memberpicture=" + memberpicture + ", membername=" + membername
				+ ", memberdata=" + memberdata + ", memberfrom=" + memberfrom + "]";
	}
	
}