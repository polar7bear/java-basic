package sec2;

public interface Mix extends User, Guest{
	//인터페이스 다중 상속을 할경우 족보가 꼬이는것처럼 클래스들의 관계가 쓸데없이 혼잡해질 수 있으므로 자바는 다중상속을 가급적 사용X
	public String method5();
	public int method6();
	
}
