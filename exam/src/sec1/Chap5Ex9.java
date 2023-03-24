package sec1;

import java.util.Scanner;


public class Chap5Ex9 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		 
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");
		 
			int num = Integer.parseInt(sc.nextLine());
		 
			if(num == 1) {
				
				System.out.print("학생수> ");
				
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				} 
			else if(num == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(sc.nextLine());
		 }
	} 		else if(num == 3) {
		 	 	for(int i=0; i<scores.length; i++) {
		 	 		System.out.println("scores[" + i + "]: " + scores[i]);
		 }
	} 		else if(num == 4) {
		 		int max = 0;
		 		int sum = 0;
		 		double avg = 0;
		 		
		 		for(int i= 0; i<scores.length; i++) {
		 			max = (max<scores[i])? scores[i] : max;
		 			sum += scores[i];
		 }
		 		avg = (double) sum / studentNum;
		 		System.out.println("최고 점수: " + max);
		 		System.out.println("평균 점수: " + avg);
	} 		else if(num == 5) {
			 	run = false;
		 }
	}
		 System.out.println("프로그램 종료");
		}
	}
