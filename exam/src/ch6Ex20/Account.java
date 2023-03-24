package ch6Ex20;

public class Account {
	private String acNum;
	private String client;
	private int balance;
	
	public Account(String acNum, String client, int balance) {
		super();
		this.acNum = acNum;
		this.client = client;
		this.balance = balance;
	}
	public String getAcNum() {
		return acNum;
	}
	public void setAcNum(String acNum) {
		this.acNum = acNum;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
