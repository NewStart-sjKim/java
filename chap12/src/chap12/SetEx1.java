package chap12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * set  인터페이스 : Collection 인터페이스의 하위 인터페이스
 * 					중복불가.
 * 		구현클래스 : 
 * 					HashSet : 중복불가. 순서모름
 * 					TreeSet : 중복불가. 정렬됨.
 * 				LinkedHashSet : 중복불가. 순서유지
 * 
 * 		bolean add(Object) : true : 추가 성공.
 * 							 false: 추가 실패.
 */
public class SetEx1 {
	public static void main(String[] args) {
		Object[] arr = {"홍길동",1,"1","김삿갓","이몽룡","홍길동","성춘향","향단이","홍길동","김삿갓"};
		//Set<Object> set1 = new HashSet<>();
		Set<Object> set1 = new LinkedHashSet<>();
		Set<Object> set2 = new HashSet<>();
		Set<Object> set3 = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(!set1.add(arr[i])) {
				if(!set2.add(arr[i])) {
					set3.add(arr[i]);
				}
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		//Collection 객체는 개선된 for 구문 사용가능
		System.out.println("set1");
		for(Object o : set1) {
			System.out.println(o);
		}
		System.out.println("set2");
		for(Object o : set2) {
			System.out.println(o);
		}
		System.out.println("set3");
		for(Object o : set3) {
			System.out.println(o);
		}
	}
}
