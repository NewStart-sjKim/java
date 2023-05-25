package chap6;
/*
 * 생성자 예제
 * 생성자란 객체화시 호출괴는 메서드.
 * 생성자 없이 객체 생성은 불가함.
 * 생성자의 주요 기능은 인스턴스 변수의 초기화를 담당.
 * 생성자는 클래스의 인스턴스 맴버임.
 * 오버로딩이 가능함.=>다른 매개변수를 가지고 있는 생성자가 여러개 존재 가능
 * 
 * 기본생성자
 * 클래스 내부에 생성자를 구현하지 않으면 컴파일러가 자동으로 추가해주는 생성자.
 * public 클래스명(){}
 * 
 * 생성자의 구현방법
 * 1. 생성자의 이름은 클래스명과 같다.
 * 2. 리턴타입이 없다.void도 기술하지 않는다.
 */
class Number1 { // 생성자 구현안됨. 기본생성자 제공
	int num;
}
class Number2 {
	int num;
	Number2(int n) // 생성자. 객체생성시 정수값을 넣어서 생성.
	// <- 생성자 : 리턴타입이 없고 ,클래스명과 같다.
	{	num = n;	}
}
public class ConstructorEx1 {
	public static void main(String[] args) {
		Number1 n1 = new Number1();
		/*
		 * new 예약어 기능
		 * 1. 메모리 할당.
		 * 2. 기본값으로 초기화.
		 * 3. 생성자 호출 => 클래스에 구현된 생성자 형태로 호출해야함.
		 */
		Number2 n2 = new Number2(10);
		System.out.println(n1.num);//0
		System.out.println(n2.num);//10
		System.out.println(0.1+0.2);
	}
}
