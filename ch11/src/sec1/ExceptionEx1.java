package sec1;

public class ExceptionEx1 {

	public static void main(String[] args) {
		String data = null;
		try{
		System.out.println(data.toString());
		} catch(NullPointerException e){
			e.printStackTrace();
		}
	}

}
