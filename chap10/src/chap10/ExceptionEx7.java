package chap10;

import java.io.IOException;

/*
 * 오버라이딩에서의 예외 처리 : 부모클래스의 메서드의 에외처리보다
 * 						자손클래스의 메서드는 같거나,작은범위만 가능하다.
 * 접근제한자 : 부모클래스의 메서드의 접근제한자보다
 * 						자손클래스의 메서드의 접근제한자는 같거나,넓은 범위만 가능
 */
class Parent{
	public void method() throws RuntimeException{
		System.out.println("Parent 클래스의 method()");
	}
}
class Child extends Parent{
	public void method() throws RuntimeException{
		System.out.println("Child 클래스의 method()");
	}
}
public class ExceptionEx7 {
	public static void main(String[] args) throws InterruptedException {
		Child c = new Child();
		c.method();
		Thread.sleep(1000);
	}
}
