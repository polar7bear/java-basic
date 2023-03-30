package sec1;

public class Member {
	public String id;
	public String pw;
	
	public Member(){}
	
	public Member(String id) {
		super();
		this.id = id;
	}
	
	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member){
			return true;
		}
		return false;
	}
	
}
