package chap9;
//내부 클래스에서 사용되는 this
class Outer3{
	int iv = 10;
	int iv2 = 20;
	class InstanceInner{
		int iv = 100;
		void method1() {
			int iv = 300;
			//지역변수 > 내부클래스멤버 > 외부클래스의 멤버
			 System.out.println("iv=" + iv);
			 System.out.println("iv2=" + iv2);
			 //this : 내부클래스의 객체
			 System.out.println("this.iv=" + this.iv);
			 // 외부클래스명.this.멤버명 : 외부클래스의 멤버
			 System.out.println("Outer3.this.iv=" + Outer3.this.iv);
		}
	}
}
public class InnerEx3 {
	public static void main(String[] args) {
		new Outer3().new InstanceInner().method1();
	}
}
