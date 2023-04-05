package sec4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {

	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<>();
		Queue<String> q2 = new LinkedList<>();
		q1.add(90);
		q1.add(70);
		q1.offer(100);	//add와 offer 둘다 값 추가하는 명령어 offer는 queue에서만 사용가능
		q1.add(80);
		q1.add(75);
		System.out.println(q1.toString());
		System.out.println(q1.peek());	//queue에 첫번째 값인 90을 반환
		System.out.println(q1.poll());	//Queue에 첫번째 값인 90을 반환하고 제거, 비어있다면 null
		q1.remove();	//Queue의 첫번째 값 제거
		System.out.println(q1.toString());
		q2.clear();
		for(Integer i : q1){	//요소 순회
			System.out.println("요소 값 : "+i);
		}

	}

}
