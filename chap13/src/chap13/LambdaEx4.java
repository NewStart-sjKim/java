package chap13;
/*
 * 
 */
class Outer{
	public int iv = 10;
	void method() {
		int iv = 20; //지역변수
		//iv++;		//함수객체에서 지역변수값 접근시 상수화 필요함.
		LambdaInterface1 f = ()->{
			System.out.println("iv=" + iv);
			System.out.println("this.iv=" + this.iv); //Outer 객체의 iv 값
			// 외부클래스의 멤버값 접근방식
			System.out.println("Outer.this.iv=" + Outer.this.iv);
		};
		f.method();
	}
}
public class LambdaEx4 {
	public static void main(String[] args) {
		new Outer().method();
	}
}
