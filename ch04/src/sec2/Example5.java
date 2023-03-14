package sec2;

public class Example5 {

	public static void main(String[] args) {
		//do=while : 실행부터 하고, 조건식을 비교하게 되므로, 1번씩 실행을 보장함
		int n = 0;
		int sum = 0;
		do{
			n++;
			sum+=n;
		}while(n>=10);
		System.out.println("sum = "+sum);
		
		n = 0;
		sum = 0;
		
		while(n>=10){
			n++;
			sum+=n;
			
		}System.out.println("sum = "+sum);
	
	}

}
