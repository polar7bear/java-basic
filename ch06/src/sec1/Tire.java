package sec1;

public class Tire {
	String name;
	int count;
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Tire [name=" + name + ", count=" + count + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
