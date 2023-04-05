package sec1;

import java.util.ArrayList;
import java.util.Arrays;

public class CastingListEx2 {
	//일반 배열을 ArrayList로 변환
	public static void main(String[] args){
		String[] arr1 = {"박명수", "유재석", "정준하"}; //배열 선언
		
		for(String a : arr1){
			System.out.println(a);
		}
		System.out.println();
		
		ArrayList<String> arrayList1 = new ArrayList<String>();
		for(String a : arr1){			//for문을 이용하여 하나씩 넣는 방법
			arrayList1.add(a);
		}
		System.out.println(arrayList1);
		System.out.println();
		
		ArrayList<String> arrayList2 = new ArrayList<String>(Arrays.asList(arr1)); //이 방법이 제일 간단함
		System.out.println(arrayList2);
	}
}
