package chap8;
/*
 * jdk8 이전에는 인터페이스의 멤버 : 상수, 추상메서드만 가능
 * jdk8 부터 추바 멤버 : default 메서드, static 메서드
 * 				  =>  구현부가 존재.
 * 		default 메서드 : 인스턴스 멤버	.참조변수.메서드명
 * 		static 메서드 : 클래스 멤버		인터페이스명;메서드명
 * 
 * 		인터페이스는 다중 구현이 가능함 
 * 		=> 구현객체에 같은메서드(선언부가 같다)가 여러개 존재 가능함
 * 		=> 구현클래스에서 default 메서드를 오버라이딩 필요.
 */
interface MyInterface1{
	void method();
	default void method1() {
		System.out.println("MyInterface1 의 default 메서드 : method1");
	}
	static void method2() {
		System.out.println("MyInterface1 의 static 메서드 : method2");
	}
}
class Parent{
	public void pmethod() {
		System.out.println("Parent 클래스의 멤버 메서드 : pmethod");
	}
}
class Child extends Parent implements MyInterface1{

	@Override
	public void method() {
		System.out.println("Child 클래스의 method");
	}
}
interface MyInterface2{
	void method();
	default void method1() {
		System.out.println("MyInterface1 의 default 메서드 : method1");
	}
	static void method2() {
		System.out.println("MyInterface1 의 static 메서드 : method2");
	}
}
class Child extends Parent implements MyInterface1,MyInterface2{

	@Override
	public void method() {
		System.out.println("Child 클래스의 method");
	}
	@Override
	public void method1() {
		MyInterface1.super.method1();
		MyInterface2.super.method1();
	}
}
public class InterfaceEx5 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.method1();
		MyInterface1.method2();
		MyInterface2.method2();
		c.pmethod();
	}
}
