package sec3;

public final class Child extends Parents {	//final 클래스 - 상속 할 수 없는 클래스
	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public void getParents() {
		super.getParents();
	}
	
	

}
