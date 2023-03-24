package ch6Ex20;

import java.util.Scanner;
public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		boolean run = true;
		while(run){
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------");
			System.out.println("선택> ");
			
			int num = Integer.parseInt(sc.nextLine());
			if(num==1){
				createAccount();
			}else if(num==2){
				accountList();
			}else if(num==3){
				deposit();
			}else if(num==4){
				withdraw();
			}else if(num==5){
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	private static void createAccount(){
		System.out.println("-----");
		System.out.println("계좌생성");
		System.out.println("-----");
		
		System.out.print("계좌번호: ");
		String acNum = sc.nextLine();
		
		System.out.print("계좌주: ");
		String client = sc.nextLine();
		
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(sc.nextLine());
		
		Account newAccount = new Account(acNum, client, balance);
		for(int i=0;i<accountArray.length;i++){
			if(accountArray[i]==null){
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	private static void accountList() {
		System.out.println("-----");
		System.out.println("계좌목록");
		System.out.println("-----");
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.print(account.getAcNum());
				System.out.print(" ");
				System.out.print(account.getClient());
				System.out.print(" ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}
	private static void deposit() {
		System.out.println("---");
		System.out.println("예금");
		System.out.println("---");
		System.out.print("계좌번호: ");
		String acNum = sc.nextLine();
		System.out.print("예금액: ");
		
		int money = Integer.parseInt(sc.nextLine());
		Account account = findAccount(acNum);
		
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 예금이 성공되었습니다.");
	}
	private static void withdraw() {
		System.out.println("---");
		System.out.println("출금");
		System.out.println("---");
		System.out.print("계좌번호: ");
		String ano = sc.nextLine();
		System.out.print("출금액: ");
		
		int money = Integer.parseInt(sc.nextLine());
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	private static Account findAccount(String ano) {
		Account account = null;
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAcNum();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}

}
