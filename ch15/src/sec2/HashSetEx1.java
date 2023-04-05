package sec2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(80);
		set1.add(90);
		set1.add(100);
		set1.add(100); //Set은 중복 불가
		System.out.println("set에서 100이 존재하는가 ? "+set1.contains(100));
		for(Integer s : set1){
			System.out.println(s);
		}
		set1.add(70);
		set1.remove(100);
		System.out.println();
		
		Iterator<Integer> it = set1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println(set1.toString());

	}

}
