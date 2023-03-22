package sec2;

public class Member extends Customer {
	private String id;
	private	String pw;
	
	public Member(String name, String email, String tel, String addr, int age, String id, String pw) {
		super(name, email, tel, addr, age);
		this.id = id;
		this.pw = pw;
	}
	public Member(String name, String email, String tel, String addr, int age) {
		super(name, email, tel, addr, age);
	}
	public Member(String name, String email, String tel, String addr) {
		super(name, email, tel, addr);
	}
	public Member(String name, String email, String tel) {
		super(name, email, tel);
	}
	public Member(String name, String email) {
		super(name, email);
	}
	public Member(String name) {
		super(name);
	}
	public Member() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public void getCustom() {
		System.out.println("회원님 감사합니다.");
	}
	
	
}
