package sec1;

public class ExceptionEx2 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		for(int i=0;i<=3;i++){
			try{
				arr[i] = i;
				System.out.println(arr[i]);
		} 	catch(ArrayIndexOutOfBoundsException e){
				break;
				//e.printStackTrace();
			}
		}

	}

}
