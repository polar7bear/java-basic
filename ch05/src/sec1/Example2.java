package sec1;

public class Example2 {

	public static void main(String[] args) {
		//배열 선언
		int[] i_arr; //기본타입[] 배열명 -> 몇 개의 원소인지 부정확하므로 주소 배정이 안됨
		int i_arr2[]; //기본타입 배열명[]
		float[] f_arr;
		float f_arr2[];
		
		//기본타입[] 배열명 = new 기본타입[개수]
		//기본타입 배열명[] = new 기본타입[개수]
		int[] io_arr = new int[8];
		int io_arr2[] = new int[5];
		
		System.out.println("io_arr 주소 : "+io_arr);
		System.out.println("io_arr2 주소 : "+io_arr2);
		
		int[] arr = {1, 80, 90, 70};
		int arr2[] = {2, 90, 100, 80};
		
		System.out.println("배열 arr의 주소 : "+arr);
		System.out.println("배열 arr2의 주소 : "+arr2);
		
		for(int a=0;a<arr.length;a++){
			System.out.print(arr[a]+"\t");
		}
		System.out.println();
		for(int data : arr2){
			System.out.print(data+"\t");
		}
		

	}

}
