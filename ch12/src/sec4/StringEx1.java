package sec4;

import java.util.Arrays;

public class StringEx1 {

	public static void main(String[] args) {
		String data = "자바프로그래밍";
		
		byte[] arr = data.getBytes();
		System.out.println(data);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		String str = new String(arr);
		System.out.println(str);

	}
}
