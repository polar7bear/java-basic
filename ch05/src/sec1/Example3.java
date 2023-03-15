package sec1;

public class Example3 {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[]{1,2,3,4};
		arr2 = new int[]{1,2,3,4};
		arr3 = arr2; //얕은 복제는 주소만 전달
		//데이터 개수와 실체가 파악되어 실제 주소 배정이 이루어짐 이때 배정된 주소를 포인터라 함
		
		//arr4는 포인터인 실제 주소를 배정하지 않았으므로 NullPointerException 에러이다.
		

	}

}
