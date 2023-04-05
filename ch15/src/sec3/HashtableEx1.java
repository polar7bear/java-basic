package sec3;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashtableEx1 {

	public static void main(String[] args) {
		Map<String, String> table1 = new Hashtable<>();
		table1.put("bno", "1");
		table1.put("title", "제목");
		table1.put("content", "내용");
		table1.put("author", "관리자");
		//Entry를 사용한 요소 접근
		for(Entry<String, String> entry : table1.entrySet()){
			System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		System.out.println();
		//.keySet()을 사용한 요소 접근
		for(String i : table1.keySet()){
			System.out.println("[Key]:" + i + " [Value]:" + table1.get(i));
		}
		System.out.println("--------------------------------");
		
		Map<Integer, String> table2 = new Hashtable<Integer, String>();
		table2.put(0, "홍길동");
		table2.put(1, "유재석");
		table2.put(2, "박명수");
		table2.put(3, "정준하");
		table2.put(4, "정형돈");
		
		for(Entry<Integer, String> entry : table2.entrySet()){
			System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		System.out.println();
		
		for(Integer i : table2.keySet()){
			System.out.println("[Key]:" + i + " [Value]:" + table2.get(i));
		}
	}

}
