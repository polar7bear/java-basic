package sec4;

public class BoardEx1 {

	public static void main(String[] args) {
		//static field나 static method는 객체 생성없이 사용할 것
		Board board1 = new Board();
		Board board2 = new Board();
		board1.title = "제목연습";
		board1.content = "내용연습";
		
		System.out.println(board1.title);
		System.out.println(board2.title);
		System.out.println(Board.allData);
		System.out.println(board2.con);
		
		System.out.println();
		
		Board.outputData();

	}

}
