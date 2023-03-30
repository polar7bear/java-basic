package sec1;

public class Product {
	public int no;
	public String pname;
	
	public Product(int no, String pname) {
		super();
		this.no = no;
		this.pname = pname;
	}
	public Product(int no) {
		super();
		this.no = no;
	}
	public Product() {
		super();
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() % 1000;
	}
	@Override
	public String toString() {
		return "no : "+this.no+", pname : "+this.pname;
	}
	@Override
	protected Product clone() throws CloneNotSupportedException {
		return this.clone();
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("요청하신 객체를 제거하였습니다.");
		this.finalize();
	}
	
	
}
