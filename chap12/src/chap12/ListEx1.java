package chap12;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/*
 * Collection 인터페이스 : 객체를 여러개 저장할 수 있는 객체.
 * List 예제
 * List 인터페이스	: Collection 인터페이스 하위 인터페이스
 * 				  객체들을 저장할대 순서를 유지함. => 첨자 사용가능
 * 				  가변배열이라고도 함
 * Set 인터페이스	: Collection 인터페이스 하위 인터페이스
 * 				  객체들을 중복해서 저장하지 않음.
 */
public class ListEx1 {
	public static void main(String[] args) {
			//<Integer> : 제네릭. Integer 객체만 List에 저장
			//jdk8 이후에 <> 표시가 가능함 : <Integer> 자료형
			List<Integer>list = new ArrayList<>();
			list.add(1);list.add(2);list.add(5);
			list.add(4);list.add(3);list.add(0);
			list.add(3);
			System.out.println(list);
			//첨자를 이용하여 출력하기
			//list.size() : Element(요소) 의 갯수 list 객체에 저장된 객체의 갯수
			for(int i=0;i<list.size();i++) {
				System.out.println(i+":"+list.get(i));
			}
			//정렬하기
			//Collection : 인터페이스.
			//Collection : 클래스. Collection 객체들의 보조 클래스
			Collections.sort(list); //정렬
			System.out.println(list);
			Collections.shuffle(list); //섞기
			System.out.println(list);
			//subList(시작인덱스, 종료인덱스) : 시작인덱스부터 종료인데긋 전까지
			//list.subList(1,4) : 1번 인덱스 부터 3번인덱스까지
			List<Integer> list2 = new ArrayList<>(list.subList(1, 4));
			System.out.println(list2);
	}
}
