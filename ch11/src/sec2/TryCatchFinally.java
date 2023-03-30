package sec2;
//finally 구문은 try의 성공이나 실패와 관계없이 무조건 실행해야 할 것이 필요할 때 사용 (생략도 가능함)
public class TryCatchFinally {

	public static void main(String[] args) {
		try{
			String data = null;
			data = "김기태";
			System.out.println(data.toString());
		} catch(Exception e){
			System.out.println("이유를 알 수 없는 예외가 발생");
		} finally{
			System.out.println("프로그램 종료");
		}

	}

}
