package chap7;
/*
 * final 메서드 : 재졍의 불가 메서드. 오버라이딩 불가 메서드
 */
public class FinalMethod {
	void method() { //재정의 불가 메서드
		System.out.println("FinalMethod 클래스의 method");
	}
}
class SubMethod extends FinalMethod{
	void method() {
		System.out.println("SubMethod 클래스의 method");
	}
}
