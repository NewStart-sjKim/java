package chap8;
/*
 * 추상클래스와 인터페이스 객체화 : 이름없는 내부클래스
 * 		=> 일회성 객체로 생성함
 */
interface Action {
	void action();
}
abstract class Abs {
	int num = 100;
	abstract void method();
}
public class InterfaceEx4 {
	public static void main(String[] args) {
		//Action 인터페이스 객체
		Action a = new Action() {
			@Override
			public void action() {
				System.out.println("Action 인터페이스의 action 메서드");
				
			}
		};
		//Abs 클래스 객체화 : Abs 의 num 값 출력하기
		a.action();
		Abs ab = new Abs() {
			void method() {
				System.out.println(num);
			}
		};
		ab.method();
	}
}
