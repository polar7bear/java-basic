package sec1;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<Student> starr = new ArrayList<Student>();
		
		Student st1 = new Student();
		st1.setNo(1);
		st1.setName("홍길동");
		st1.setKor(100);
		st1.setEng(100);
		st1.setMat(100);
		starr.add(st1);
		
		Student st2 = new Student();
		st2.setNo(2);
		st2.setName("김기철");
		st2.setKor(85);
		st2.setEng(70);
		st2.setMat(90);
		starr.add(st2);
		
		Student st3 = new Student();
		st3.setNo(3);
		st3.setName("박기영");
		st3.setKor(80);
		st3.setEng(100);
		st3.setMat(90);
		starr.add(st3);
		
		Student st4 = new Student();
		st4.setNo(4);
		st4.setName("이수영");
		st4.setKor(95);
		st4.setEng(80);
		st4.setMat(85);
		starr.add(st4);
		
		Student st5 = new Student();
		st5.setNo(5);
		st5.setName("김철수");
		st5.setKor(95);
		st5.setEng(100);
		st5.setMat(100);
		starr.add(st5);
		
		System.out.println(starr);
		System.out.println();
		
		for(int i=0;i<starr.size();i++){
			System.out.println(starr.get(i));
		}
	
	}

}
