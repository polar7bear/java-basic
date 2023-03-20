package sec2;

public class FoodEx1 {

	public static void main(String[] args) {
		Food f0 = new Food();
		Food f1 = new Food("쫄면");
		Food f2 = new Food("쫄면", 400);
		Food f3 = new Food("쫄면", 400, 4500);
		
		System.out.println(f0.toString());
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		

	}

}
