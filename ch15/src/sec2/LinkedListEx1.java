package sec2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx1 {

	public static void main(String[] args) {
		List<Integer> link = new LinkedList<Integer>();
		link.add(100);
		link.add(90);
		link.add(90);
		
		for(Integer d : link){
			System.out.println(d);
		}
		

	}

}
