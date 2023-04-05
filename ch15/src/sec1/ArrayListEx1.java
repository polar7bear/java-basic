package sec1;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		/*배열은 각 요소의 값들이 어떠한 특성을 가지고 있는지 불분명하며, 선언시 반드시 개수가 규정되어야함.
		 * ArrayList는 각 특성이 무엇인지 분명하고 선언시 개수를 규정할 이유가 없이 원하는 만큼 요소의 값을 저장할 수 있음*/
		/*.add(인덱스, 값) or .add(값) - 요소추가
		 *.size() - 요소의 개수
		 *.get(인덱스) - 특정요소 접근
		 *.remove(인덱스) - 특정요소 제거 
		 *.indexOf(값) - 값의 인덱스 위치
		 *.contains(값) - 값의 존재 유무*/
		
		ArrayList<Integer> jum = new ArrayList<>();
		jum.add(100);
		jum.add(95);
		jum.add(85);
		jum.add(90);
		
		System.out.println(jum);
		
		for(int i=0;i<jum.size();i++){ 
			int a = jum.get(i);		   
			System.out.println("점수 : "+a);
		}

	}

}
