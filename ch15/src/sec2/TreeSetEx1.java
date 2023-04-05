package sec2;

import java.util.*;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(70);
		set1.add(40);
		set1.add(90);
		set1.add(100);
		set1.add(50);
		set1.add(80);
		set1.add(90);//중복 발생으로 인해 작업 안함
		set1.add(70);//중복 발생으로 인해 작업 안함
		System.out.println(set1);
		System.out.println("요소의 수 : "+set1.size());
		set1.remove(90);
		System.out.println("90의 존재 유무 : "+set1.contains(90));
		set1.clear();
		System.out.println("set1이 비어있습니까? : "+set1.isEmpty());
	}

}
