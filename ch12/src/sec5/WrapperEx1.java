package sec5;

public class WrapperEx1 {

	public static void main(String[] args) {
		//Boxing(Wrapping) : 기본형을 래퍼형으로 바꿀 경우
		int a = 1004;	//기본형
		Integer b = a;	//래퍼형
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		float f1 = 3.14f;	//기본형
		Float f2 = f1;		//래퍼형
		
		//Unboxing : 래퍼형을 기본형으로 바꿀 경우
		int c = b;
		float f3 =f2;
		Integer d = 1004;
		System.out.println("비교 : "+ (a==d));
		System.out.println("비교 : "+(b==d));
		System.out.println("비교 : "+(b.equals(d)));
	}

}
