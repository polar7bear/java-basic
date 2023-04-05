package sec2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2 {

	public static void main(String[] args) {
		HashSet<Board> boardArr = new HashSet<Board>();
		for(int i=0;i<11;i++){
			boardArr.add(new Board(i, "제목"+i, "내용"+i, "2023-04-05"));
		}
		for(Board b : boardArr){
			System.out.println(b.toString());
		}
		System.out.println();
		
		Iterator it = boardArr.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println(boardArr.toString());
		boardArr.clear();
		System.out.println("boardArr이 비어 있습니까? "+boardArr.isEmpty());

	}

}
