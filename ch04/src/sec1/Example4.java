package sec1;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int money, su;
		int balance = 0;
		String id;
		boolean ps = true;
		
		while(ps){
			System.out.println("작업번호[1:입금, 2:출금, 3:조회, 4:가입, 0:종료");
			 su = sc.nextInt();
			switch (su){
			case 0:
				System.out.println("종료");
				ps = false;
				break;
			case 1:
				System.out.println("입금 업무를 선택하였습니다.");
				System.out.println("입금할 금액을 입력하세요 : ");
				money = sc.nextInt();
				balance += money;
				System.out.println("잔여 금액 : "+ balance);
				break;
			case 2:
				System.out.println("출금 업무를 선택하였습니다.");
				System.out.println("출금할 금액을 입력하세요 : ");
				money = sc.nextInt();
				balance -= money;
				System.out.println("잔여 금액 : "+ balance);
				break;
			case 3:
				System.out.println("조회 업무를 선택하였습니다.");
				System.out.println("잔액 : "+balance);
				break;
			case 4:
				System.out.println("가입 업무를 선택하였습니다.");
				System.out.println("가입 할 계좌번호를 입력하세요.");
				id = sc2.nextLine();
				System.out.println("가입한 계좌 번호 : "+id);
				break;
				default:
					System.out.println("번호를 잘못 입력하였습니다.");
					break;
		}
		}
	}

}
