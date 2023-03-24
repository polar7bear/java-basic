package sec4;

public class Product {
	private int num;
	private String name;
	private String std;
	private int amount;
	private String des;
	private String pic;
	private int aprice;
	private int oprice;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getAprice() {
		return aprice;
	}
	public void setAprice(int aprice) {
		this.aprice = aprice;
	}
	public int getOprice() {
		return oprice;
	}
	public void setOprice(int oprice) {
		this.oprice = oprice;
	}
	@Override
	public String toString() {
		return "Product [num=" + num + ", name=" + name + ", std=" + std
				+ ", amount=" + amount + ", des=" + des + ", pic=" + pic
				+ ", aprice=" + aprice + ", oprice=" + oprice + "]";
	}
	
}
