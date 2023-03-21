package dao;

public class Services extends Product {
	public String sid = super.pid;
	public String stage = super.style;
	
			public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	//접근제한이 protected인 style 멤버 필드는 부모 클래스(super class)에 있는 속성이므로 접근 가능
	//super 객체로 접근이 가능
}
