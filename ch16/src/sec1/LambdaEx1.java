package sec1;

@FunctionalInterface

interface MyFnc1 {
	void fnc1();
}
class Person {
	public void action(MyFnc1 f1){
		f1.fnc1();
	}
}

public class LambdaEx1 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.action(() -> {System.out.println("Hi");});
		p1.action(() -> {System.out.println("Hello");});

	}

}
