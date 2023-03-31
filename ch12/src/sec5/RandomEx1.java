package sec5;

import java.util.Arrays;
import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random random = new Random(3);
		System.out.println("선택 번호 : ");
		for(int a=0;a<6;a++){
			lotto[a] = random.nextInt(45)+1;
			System.out.println(lotto[a]+" ");
		}
		System.out.println();
		
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("당첨번호 : ");
		for(int a=0; a<6;a++){
			winningNumber[a] = random.nextInt(45) + 1;
			System.out.println(winningNumber[a]+" ");
		}
		System.out.println();
		
		Arrays.sort(lotto);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(lotto, winningNumber);
		System.out.print("당첨 여부 : ");
		if(result){
			System.out.println("1등에 당첨되셨습니다.");
		}else{
			System.out.println("당첨되지 않았습니다.");
		}

	}

}
