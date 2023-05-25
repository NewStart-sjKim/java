package chap9;

import chap9.Outer1.InstanceInner;

/*
 * 내부 클래스 예제 : 클래스 내부에 존재하는 클래스
 * 	인스턴스 	내부클래스	:
 * 	static 	내부클래스	:
 * 	지역		내부클래스	:	메서드 내부에서 선언된 클래스.
 * 						선언된 메서드에서만 사용이 가능한 클래스
 * 	내부 클래스 특징
 * 		1. 참조 자료형으로 사용됨. 외부클래스명.내부클래스명
 * 		2. 객체화 가능. Object 클래스의 하위 클래스.
 * 		3. 멤버 소유 가능. 생성자 구현 가능
 * 
 * 		4. 외부 클래스의 멤버임.
 * 			=> 외부클래스의 private 멤버에 접근 가능.
 * 			=> 인스턴스 내부클래스 : 외부클래스가 객체화 되어야 내부클래스의 객체화 가능.
 * 			=> static 내부클래스 : 외부클래스의 객체화화 없이 내부클래스의 객체화 가능.
 */
public class Outer1 {
	class InstanceInner extends Object {
		int iv = 100;
		static int cv = 10;
		final static int MAX=200;
	}
	static class StaticInner {
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	void method() {
		class LocalInner {
		int iv = 600;
		static int cv =700;
		final static int MAX = 800;
		}
		LocalInner lc = new LocalInner();
		System.out.println("lv.iv=" + lc.iv);
		System.out.println("lv.cv=" + lc.cv);
		System.out.println("lv.cv=" + LocalInner.cv);
		System.out.println("lv.cv=" + LocalInner.MAX);
	}
	void method2() {
		//LocalInner 클래스는 method() 내부에서만 사용 가능
//		LocalInner lc = new LocalInner();
	}
}
public class InnerEx1 {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		out.method();
		//Outer1.InstanceInner inner1 = new Outer1.InstanceInner(); 오류
		//Outer1.InstanceInner inner1 = out.new InstanceInner(); 정상
		Outer1.InstanceInner inner1 = new Outer1().new InstanceInner();
		//Outer1.StaticInner inner2 = out.new StaticInner(); 오류
		Outer1.StaticInner inner2 = new Outer1.StaticInner();
		System.out.println("inner1.iv=" + inner1.iv);
		System.out.println("inner1.cv=" + inner1.cv);
		System.out.println("inner1.cv=" + Outer1.InstanceInner.cv);
		System.out.println("inner1.MAX=" + Outer1.InstanceInner.MAX);
		System.out.println("inner2.iv=" + inner2.iv);
		System.out.println("inner2.cv=" + inner2.cv);
		System.out.println("inner2.cv=" + Outer1.InstanceInner.cv);
		System.out.println("inner2.MAX=" + Outer1.InstanceInner.MAX);
		
	}
}
