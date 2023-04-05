package sec3;

import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		map1.put(1, "사과");
		map1.put(2, "복숭아");
		map1.put(3, "수박");
		
		TreeMap<Integer, String> map2 = new TreeMap<Integer, String>(){{
			put(1, "사과");
			put(2, "복숭아");
			put(3, "수박");
		}};
		map2.remove(1);
		map2.clear();
		
		System.out.println(map1);
		System.out.println(map1.get(1));
		System.out.println(map1.firstEntry());
		System.out.println(map1.firstKey());
		System.out.println(map1.lastEntry());
		System.out.println(map1.lastKey());
	}

}
