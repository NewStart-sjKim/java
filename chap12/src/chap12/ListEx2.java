package chap12;

import java.util.List;
import java.util.Vector;

/*
 * Vector 클래스
 * 		- Collection 프레임워크 이전 클래스
 * 		- List 인터페이스의 구현클래스
 * 		- 이전에 사용된 메서드와 List를 구현한 메서드가 함께 존재함
 */
public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<>();
//		List<Double> list = new Vector<>();
		list.add(0.3);		//List 인터페이스 메서드
		list.add(Math.PI);
		list.addElement(5.0);	//Vector 클래스의 메서드. add() 메서드와 같은 기능
		System.out.println(list);
//		요소의 위치 찾기
		double num = 5.0;
		int index = list.indexOf(num);
		if(index < 0)System.out.println(num + "은 list에 없는 요소입니다.");
		else System.out.println(num + "의 위치 : " + index);
		//contains() : list의 요소 존재?
		if(list.contains(num)) {
			System.out.println(num + "은 존재함");
		}
		//0.3 요소를 제거하기
		list.remove(0.3);
		System.out.println(list);
		System.out.println(list.get(0));
	}
}
