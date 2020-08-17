package kr.ac.kopo.day12.homework.StackQue;

public class StkQueMain {

	public static void main(String[] args) {
		
		System.out.println("< Stack 구현하기 >");
		Stk<Integer> stack = new Stk<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println("pop : 추출된 맨 뒤 데이터는 " + stack.pop());
		System.out.println("peek : 반환된 맨 뒤 데이터는 " + stack.peek());
		System.out.println("empty :	stack은 비었습니까? " + stack.empty());
		System.out.println("search : 데이터의 위치는 " + stack.search(1));
		
		System.out.println("< Queue 구현하기 >");
		Que<String> queue = new Que<>();
		queue.add("한국");
		queue.add("폴리텍");
		queue.add("대학교");
		queue.add("광명");
		queue.add("융합");
		queue.add("기술");
		queue.add("교육원");
		
		System.out.println("element : 맨 앞 데이터는 : " + queue.element());
		System.out.println("offer : 데이터가 잘 입력되었습니까? " + queue.offer("하나금융티아이"));
		System.out.println("peek : 맨 앞 데이터는 : " + queue.peek());
		System.out.println("poll : 맨 앞 삭제된 데이터는 : " + queue.poll());
		queue.remove();
		
	}

}
