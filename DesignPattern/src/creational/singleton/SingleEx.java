package creational.singleton;

public class SingleEx {

	public static void main(String[] args) {
		SingleObject object1 = SingleObject.getInstance();
		SingleObject object2 = SingleObject.getInstance();
		
		object1.showMessage();
		object2.showMessage();
		
		System.out.println(object1==object2);

	}

}
