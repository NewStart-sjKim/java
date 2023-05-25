package chap12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Iterator 인터페이스 객체 : 반복자.
 * 	 Collection 객체는 Iterator 객체로 변환이 가능함 : iterator() 메서드 사용
 * 		주요 메서드
 * 			boolean hasNext() : 조회 대상 객체 존재?
 * 			Object next()	  : 조회 대상 객체 리턴
 * 			void remove()	  : 조회한 객체를 제거. next() 실행 이후에 가능
 * Enumeration 인터페이스 : Iterator 반복자 이전 버전
 * 						Collection 프레임워크 이전에 사용하던 반복자
 * 						vector,Hashtabler 클래스 에서만 사용가능
 * 		주요 메서드
 * 			boolean hasNextElement()	: 조회 대상 객체 존재?
 * 			Object nextElement()		: 조회 대상 객체 리턴
 */
public class InteratorEx1 {
	public static void main(String[] args) {
		Iterator it = null;
		List list = new ArrayList();
		Set set = new HashSet();
		for(int i=1;i<=5;i++) {
			list.add(i+10);
			set.add(i*10);
		}
		it = list.iterator();
		print(it);
		it = set.iterator();
		print(it);
		System.out.println("print() 이후 list : " + list);
		System.out.println("print() 이후 set : " + set);
	}
	private static void print(Iterator it) {
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
	}
}
