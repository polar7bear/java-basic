package sec1;

import java.util.ArrayList;

public class CastingListEx1 {

	public static void main(String[] args) {
		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("박명수");
		arrayList1.add("박수홍");
		arrayList1.add("박기철");
		arrayList1.add("유재석");
		System.out.println(arrayList1.toString());
		System.out.println();
		
		String[] arr1 = new String[arrayList1.size()];
		int i = 0;
		
		for(String tmp : arrayList1){
			arr1[i++] = tmp;
			System.out.println(tmp.toString());
		}
		System.out.println();
		
		for(String a : arr1){
			System.out.println(a);
		}
		System.out.println();
		
		String[] arr2 = arrayList1.toArray(new String[arrayList1.size()]);
		for(String a : arr2){
			System.out.println(a);
		}
	}
}
