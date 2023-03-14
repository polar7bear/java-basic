package sec2;

public class Example1 {

	public static void main(String[] args) {
		//반복실행문 : 특정 조건이 만족하는 동안 반복 실행하는 문장
		//for, while, do~while
		int sum = 0;
		for(int i=0;i<=100;i++){
			sum+=i;
		}
		System.out.println("0~100 합계"+sum);
		
		//0~100의 짝수의 합계1
		sum = 0;
		for(int i=0;i<=100;i+=2){
			sum+=i;
		}System.out.println("0~100의 짝수의 합계"+sum);
		
		//0~100의 짝수의 합계2
		sum = 0;
		for(int i=0;i<=100;i++){
			if(i % 2 == 0) sum+=i;
		}	System.out.println("0~100의 짝수의 합계2 : "+sum);
			
			
		
		

		
	}

}
