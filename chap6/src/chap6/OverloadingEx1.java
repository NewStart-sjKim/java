package chap6;
/*
 * 메서드 오버로딩 : 메서드 다형성
 * 1. 같은 클래스 내보에 같은 이름을 가진 메서드가 여러개 존재할 수 있다.
 * 2. 단 매개변수 목록이 달라야 한다 (자료형 기준,갯수,순서)
 * 
 * 오버로딩 조건
 * 1. 메서드 이름이 같다.
 * 2. 매개변수는 다르다.(매개변수명이 아니고 자료형으로 판단)
 */
class Math2{
	int a = 100;
	int add(int b) {
		System.out.print("1:");
		return a+b;
	}
	double add(double b) {
		System.out.print("2:");
		return a+b;
	}
	String add(String b) {
		System.out.print("3:");
		return a+b;
	}
}
public class OverloadingEx1 {
	public static void main(String[] args) {
		Math2 m = new Math2();
		System.out.println(m.add(10));
		System.out.println(m.add(10.5));
		System.out.println(m.add("번"));
		System.out.println(m.add(10L));
		System.out.println(m.add(10F));
	}

}

