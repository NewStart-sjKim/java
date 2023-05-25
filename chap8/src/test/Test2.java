package test;
//다음 소스는 컴파일 오류가 발생한다. 결과가 "Tested" 가 출력되도록 프로그램을 수정하기
interface Beta {} // 멤버가 없다.

class Alpha implements Beta {
	String testIt() {
		return "Tested";
	}
}
class Gamma implements Beta {
	String testIt1() {
		return "Gamma";
	}
}
public class Test2 {
	static Beta getIt() {
		return new Alpha();
	}
	public static void main(String[] args) {
		//b : Alpha 객체.
		Beta b = getIt();
		//System.out.println(b.testIt());
		System.out.println(((Alpha)(b)).testIt());
		Alpha a = (Alpha)b; //구현클래스 타입 <= 인터페이스 타입 : 형변환 연산자 생략 불가.
		System.out.println(a.testIt());
		Gamma g = (Gamma)b; //ClassCastException 예외 발생
		System.out.println(g.testIt1());
	}
}