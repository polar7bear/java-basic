package sec1;


public class Example1 {

	public static void main(String[] args) {
		//기본 타입 (Primitive type) : 원시형 - boolean, byte, char, short, int, long, float, double
		//참조 타입 (Reference type) : 열거형 = 배열, 열거, 클래스(DAO=VO), 인터페이스
		int[] arr = {1,80,90,70};
		int[][] arr2 = {{1,80,90,70}, {2, 100, 90, 95}};
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"\t");
		}

		System.out.println("번호\t국어\t영어\t수학");
		for(int i=0;i<2;i++){
			for(int k=0;k<4;k++){
				System.out.print(arr2[i][k]+"\t");
			}System.out.println();
		}
	}

}
