package chap6;

import java.net.MulticastSocket;

/*
 * 선언 위치에 따른 변수의 종류
 * 				선언위치		선언방법			메모리 할당지점		메모리 할당 위치
 * 클래스 변수		클래스 내부	static int num;	클래스정보로드시		클래스영억
 * 				객체화와 관련없음.  모든 객체의 공통변수로 사용됨.
 * 				클래스명.변수명 호출함
 * 
 * 인스턴스 변수	클래스 내부	int num;		객체화시			힙영역
 * 				인스턴스 변수를 사용하려면 반드시 객체화 되어야함.
 * 				참조변수명.변수명 호출됨
 * 				
 * 지역변수		메서드 내부	int num;		선언문 실행시		스택영역
 * 				메서드 내부에서만 사용 가능함.
 * 				반드시 초기화 되어야 함.
 * 				매개변수는 지역변수임.
 * 
 */
class Car{
	String color;			//인스턴스(객체)변수
	int num; 				//인스턴스(객체)변수
	static int width = 200;	// 클래스변수
	static int height= 120;	// 클래스변수
	// 객체의 문자열로 표현하기 위한 메서드
	// 참조변수명만 출력하면 자동으로 호출됨.
	public String toString() {
		return color + ":" + num + "("+ width + "," + height+")";
	}
}
public class CarEx1 {
	public static void main(String[] args) {
		System.out.println("자동차의 크기:" + Car.width + "," + Car.height);
		//car1 : 지역변수
		Car car1 = new Car();
		car1.color = "White";
		car1.num = 1234;
		System.out.println(car1); 
		// 참조변조값 출력시 toString() 메서드 호출
		System.out.println(car1.toString());// 
		//car2 : 지역변수
		Car car2 = new Car();
		car2.color = "Black";
		car2.num = 3456;
		System.out.println(car2);
		car1.width = 300;
		car1.height = 150;
		System.out.println(car1);
		System.out.println(car2);
	}
}
