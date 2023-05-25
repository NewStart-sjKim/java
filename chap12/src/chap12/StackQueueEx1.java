package chap12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack : LIFO (Last in First out)
 * 	Stack 클래스 : Vector 클래스의 하위 클래스. List 객체.
 * 	 push(Object o) : 객체를 stack에 추가
 * 	 Object pop()	: stack에서 객체를 꺼내 리턴. 객체 제거
 * 	 Object peek()	: stack에서 객체를 꺼내 리턴. 객체 조회
 * Queue : FIFO (First in First out)
 * 	 Queue 인터페이스 : LinkedList가 구현 클래스임.
 * 	 offer(Object o) : 객체를 Queue에 추가
 * 	 Object poll()	 : 객체를 Queue에서 꺼내 리턴. 객체 제거
 * 	 Object peek()	 : 객체를 Queue에서 조회.
 */
public class StackQueueEx1 {
	public static void main(String[] args) {
		String[] cars = {"소나다","그렌저","SM5","k9"};
		Stack<String> stack = new Stack<>();
		Queue<String> queue = new LinkedList<>();
		for(String s : cars) {
			stack.push(s);
			queue.offer(s);
		}
		System.out.println("스택에 저장된 객체의 갯수 : " + stack.size());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println("스택에 저장된 객체의 갯수 : " + stack.size());
		System.out.println("큐에 저장된 객체의 갯수 : " + queue.size());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println("큐에 저장된 객체의 갯수 : " + queue.size());
	}
}
