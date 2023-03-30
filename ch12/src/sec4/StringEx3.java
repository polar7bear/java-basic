package sec4;

import java.util.StringTokenizer;

public class StringEx3 {

	public static void main(String[] args) {
		String data = "김세종&허준&이유섭&이상혁&조규성";
		StringTokenizer st = new StringTokenizer(data, "&");
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
		}
		
		String[] arr = data.split("&");
		for(String token : arr){
			System.out.println(token);
		}

	}

}
