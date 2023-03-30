package sec1;

public class ExceptionEx4 {
	static class Animal{}
	static class Dog extends Animal{}
	static class Cat extends Animal{}
	public static void main(String[] args) {
		
		try{
			Dog dog = new Dog();
			changeDog(dog);
		} catch(ClassCastException e){
			e.printStackTrace();
		}
		try{
			Cat cat = new Cat();
			changeDog(cat);
		} catch(ClassCastException e){
			e.printStackTrace();
		}
		
	}
	public static void changeDog(Animal animal){
		Dog dog = (Dog) animal;
	}
}
