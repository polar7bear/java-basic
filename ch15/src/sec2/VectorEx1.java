package sec2;

import java.util.*;

import sec1.Student;

public class VectorEx1 {

	public static void main(String[] args) {
		List<Integer> v1 = new Vector<>();
		v1.add(90);
		v1.add(100);
		v1.add(95);
		
		v1.add(2, 95);
		v1.remove(0);
		
		for(int i=0;i < v1.size();i++){
			System.out.println(v1.get(i));
		}
		System.out.println("--------------------------");
		for(Integer d : v1){
			System.out.println(d);
		}
		System.out.println("**************************");
		v1.clear();		//비우기
		
		List<String> v2 = new Vector<>();
		v2.add("홍길동");
		v2.add("김철수");
		v2.add("김벡터");
		
		
		List<Student> v3 = new Vector<Student>();
		Student st1 = new Student();
		st1.setNo(1);
		st1.setName("김자바");
		st1.setKor(100);
		st1.setEng(100);
		st1.setMat(100);
		v3.add(st1);
		
		for(Student s : v3){
			System.out.println(s.toString());
		}
		
		Iterator iter = v2.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}

	}

}
