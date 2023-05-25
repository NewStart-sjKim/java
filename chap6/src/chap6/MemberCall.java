package chap6;

public class MemberCall {

	static int cv1 = 10;
	static int cv2 = cv1; //클래스 맴버간 호출
	int iv1 = 100;
	int iv2 = iv1;// 인스턴스 맴버간 호출
	int iv3 = cv1;// 인스턴스 맴버에서 클래스맴버 호출
//	static int cv3 = iv1;//클래스 멤버에서 인스턴스 멤버 호출 오류
	static int cv3 = new MemberCall().iv1;
	void method1() {
		System.out.println("cv1 + cv2=" + (cv1+cv2));
		System.out.println("iv1 + iv2=" + (iv1+iv2));
	}
	static void method2() {
		System.out.println("cv1 + cv2=" + (cv1+cv2));
		// 클래스 맴버에서 인스턴스 멤버 호출 오류 => 객체화 필요
//		System.out.println("iv1 + iv2=" + (iv1+iv2));
		MemberCall mc = new MemberCall();
		System.out.println("iv1 + iv2=" + (mc.iv1+mc.iv2));
	}
	void method3() {
		method1();
		method2();
	}
	static void method4() {
		// 클래스 맴버에서 인스턴스 멤버 호출 오류 => 객체화 필요
		//method1();
		new MemberCall().method1();
		method2();
	}
	public static void main(String[] args) {
		//method1 ~ nmethod4 함수 호출하기
		//인스턴스 메서드이므로 클래스 멤버인 main 메서드에서 호출시 객체화 필요
		MemberCall r = new MemberCall();
		r.method1();	
		method2();
		r.method3();
		method4();
	}

}
