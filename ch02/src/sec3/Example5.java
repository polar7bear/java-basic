package sec3;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.println("영어 점수: ");
		int eng = sc.nextInt();
		
		System.out.println("수학 점수 : ");
		int math = sc.nextInt();
		
		System.out.println("총점 : "+(kor+eng+math));
		
		System.out.println("평균 : "+(kor+eng+math)/3.0f);

	}

}
