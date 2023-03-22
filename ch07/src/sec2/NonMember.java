package sec2;

public class NonMember extends Customer {
	private String tempId;
	private String tempPw;
	private int orderNum;
	
	
	public NonMember(String name, String email, String tel, String addr, int age, String tempId, String tempPw, int orderNum) {
		super(name, email, tel, addr, age);
		this.tempId = tempId;
		this.tempPw = tempPw;
		this.orderNum = orderNum;
	}
	public NonMember(String name, String email, String tel, String addr, int age) {
		super(name, email, tel, addr, age);
	}
	public NonMember(String name, String email, String tel, String addr) {
		super(name, email, tel, addr);
	}
	public NonMember(String name, String email, String tel) {
		super(name, email, tel);
	}
	public NonMember(String name, String email) {
		super(name, email);
	}
	public NonMember(String name) {
		super(name);
	}
	public NonMember() {
		
	}
	public String getTempId() {
		return tempId;
	}
	public void setTempId(String tempId) {
		this.tempId = tempId;
	}
	public String getTempPw() {
		return tempPw;
	}
	public void setTempPw(String tempPw) {
		this.tempPw = tempPw;
	}
	
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	@Override
	public void getCustom() {
		System.out.println("비회원입니다.");
	}
	
}
