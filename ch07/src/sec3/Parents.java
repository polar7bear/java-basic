package sec3;

public class Parents {
	private String lastName;
	private String firstName;
	private int age;
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//자식에게 변화를 허용할 경우
	public void getParents(){
		System.out.println("부모1");
	}
	//자식에게 변화를 허용하고 싶지 않을 경우 > final <
	public final void getParents2(){
		System.out.println("부모2");
	}
	
}
