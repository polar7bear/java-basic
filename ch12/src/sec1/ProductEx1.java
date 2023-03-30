package sec1;

public class ProductEx1 {

	public static void main(String[] args) {
		Product pro1 = new Product(1234 , "iphone");
		Product pro2 = new Product(5678, "galaxy");
		Product pro3;
		
		try{
			pro3 = pro1.clone();
		} catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		Product pro4 = pro1;
		
		System.out.println("pro1과 pro2가 같나요? "+pro1.equals(pro2)+"\n");
		
		System.out.println(pro1.hashCode());
		System.out.println(pro1.toString()+"\n");
		
		System.out.println(pro2.hashCode());
		System.out.println(pro2.toString());
		
		try{
			pro1.finalize();
		} catch(Throwable e){
			e.printStackTrace();
		}
	}

}
