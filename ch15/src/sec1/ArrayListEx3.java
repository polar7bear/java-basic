package sec1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Student> starr = new ArrayList<Student>();
		int cnt = 0;
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("작업 번호 [1-5] : 1.점수입력\t2.목록\t3.삭제\t4.편집\t5.종료");
			int job = Integer.parseInt(sc.nextLine());
			if(job==1){
				cnt++;
				Student st = new Student();
				st.setNo(cnt);
				System.out.println("이름 : ");
				st.setName(sc.nextLine());
				System.out.println("국어 점수 : ");
				st.setKor(Integer.parseInt(sc.nextLine()));
				System.out.println("영어 점수 : ");
				st.setEng(Integer.parseInt(sc.nextLine()));
				System.out.println("수학 점수 : ");
				st.setMat(Integer.parseInt(sc.nextLine()));
				starr.add(st);
			}else if(job==2){
				System.out.println("목록 : "+starr.get(cnt));
			}else if(job==3){
				starr.remove(Integer.parseInt(sc.nextLine()));
			}
		}

	}

}
