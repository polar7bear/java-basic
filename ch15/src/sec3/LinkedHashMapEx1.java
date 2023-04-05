package sec3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx1 {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();
		map1.put("guest", "홍길동");
		map1.put("member", "유재석");
		map1.put("administrator", "박명수");
		System.out.println("HashMap");
		for(Map.Entry<String, String> entry : map1.entrySet()){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println("\nLinkedHashMap");
		Map<String, String> map2 = new LinkedHashMap<String, String>();
		map2.put("guest", "홍길동");
		map2.put("member", "유재석");
		map2.put("administrator", "박명수");
		
		for(Map.Entry<String, String> entry : map2.entrySet()){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		map2.put("nomember", "정준하");
		map2.remove("guest");
		boolean b1 = map2.containsValue("홍길동");
		boolean b2 = map2.containsKey("member");
		
		System.out.println("\n\'홍길동\'의 존재유무 : " + b1);	//위에서 홍길동의 key인 guest를 remove 했으므로 false 출력
		System.out.println("map2의 \'member\' key 존재유무 : " + b2);

	}

}
