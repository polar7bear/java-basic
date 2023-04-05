package sec3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("name", "손승기");
		map1.put("age", "26");
		map1.put("blood", "A");
		//HashMap의 순회1 (Entry를 사용한 요소 접근)
		for(Entry<String, String> entry : map1.entrySet()){
			System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		System.out.println();
		//HashMap의 순회1(.keySet()을 사용한 요소 접근)
		for(String i : map1.keySet()){ //저장된 key값 확인
			System.out.println("[Key]:" + i + " [Value]:" + map1.get(i));
		}
		System.out.println();
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "포도");
		map2.put(2, "사과");
		map2.put(3, "수박");
		//Entry를 사용한 요소 접근
		for(Entry<Integer, String> entry : map2.entrySet()){
			System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		map2.put(1, "딸기"); // key 1의 value 변경
		map2.put(4, "키위");
		map2.remove(2); //.remove(key) 특정 요소 제거
		System.out.println();
		
		//keySet()을 사용한 요소 접근
		for(Integer i : map2.keySet()){
			System.out.println("[Key]:" + i + " [Value]:" + map2.get(i));
		}
		System.out.println("\nHashMap의 크기 : "+map1.size());
		System.out.println("HashMap의 특정 키 확인 : "+map1.containsKey("age"));
		System.out.println("HashMap의 특정 값 확인 : "+map1.containsValue("A"));
		System.out.println("빈 HashMap인지 확인 : "+map1.isEmpty());
		System.out.println("HashMap의 키 확인 : "+map1.keySet());
	}

}
