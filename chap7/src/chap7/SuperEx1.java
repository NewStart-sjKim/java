package chap7;
/*
 * super 예약어
 * 
 * super 생성자 : 부모클래스 생성자 호출. 첫줄에 사용해야 함
 * 			부모클래스의 생성자의 매개변수 설정에 맞도록 자손클래스에서 호출해야함.
 * 			부모클래스의 생성자 중 매개변수가 없는 생성자가 있는 경우
 * 			자손클래스에서 부모클래스의 생성자 호출을 생략해도 됨.
 * super 참조변수(reference)	: 부모클래스의 객체를 참조하는 변수
 */
class Parent{
	int x = 10;
	Parent(int x){
		super();//생략가능
		this.x = x;
	}
	Parent(){}
}
class Child extends Parent{
	//	int x = 20;
		Child(){
			super(100);
//			super(100);//부모클래스의 생성자 호출. 생략불가
		}
		void method() {
		//	int x = 30;
			System.out.println("x="+x); //20
			System.out.println("this.x="+this.x); //20
			System.out.println("super.x="+super.x); //100
		}
	}
public class SuperEx1 {
	public static void main(String[] args) {
		Child c = new Child();	
		c.method();
	}
}
