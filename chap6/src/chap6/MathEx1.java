package chap6;
/*
 * 멤버 메서드(함수,function)
 * 메서드 구성
 * [접근제어자][제어자] 리턴타입 메서드 이름(매개변수목록) 	=> 메서드의 선언부
 * {										 	=> 구현부 : 알고리즘
 * }
 * 리턴타입 : 메서드 종료 후 전달되는 값의 자료형
 * 		void : 값의 전달이 없음.
 * 매개변수 : 메서드 호출시 필요한 값의 자료형과 변수명 목록
 * 
 * return 예약어 : 메서드 종료.
 * 			리턴타입이 void 인경우 : 생략가능.
 * 								 메서드의 마지막 }를 만나면 메서드 종료.
 * 			리턴타입이 void가 아닌경우 : 생략 불가.
 * 									return 리턴값;
 * 추상 메서드 : 메서드 중 선언부만 존재하는 메서드
 */
class Math1 {
	int add1(int a, int b) {
		return a+b;
	}
	long add2(int a, int b) {
		return a+b;
	}
	void add3(int a, int b) {
		System.out.println(a+b);
		return; // 생략 가능 (리턴타입이 void인 경우 생략가능)
	}
}
public class MathEx1 {// 구동 클래스 : main 메서드를 멤버로 가지고 있는 클래스
	public static void main(String[] args) {
		Math1 m1 = new Math1();
		int a1 = m1.add1(10,20);
		System.out.println(a1);
		long a2 = m1.add2(10,20);
		System.out.println(a1);
		m1.add3(10,20);
	}

}
