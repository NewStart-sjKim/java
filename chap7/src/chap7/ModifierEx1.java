package chap7;

import chap7.test.Modifier2;

/*
 * 제한자 : 접근제한자, 그외 제한자(static,abstract,final)
 * 
 * 접근제한자
 * private < (default) < protected < public
 * 
 * 				동일 클래스 	동일패키지		상속관계		그외
 * private		    O			X		  X		 	 X	 
 * (default)		O			O		  X			 X
 * protected		O			O		  O			 X
 * public			O			O		  O			 O	
 * 						O : 접근가능  X : 접근불가
 */
class Modifier{
	private 	int v1 = 100;
				int v2 = 200; // 아무것도 없으면 default 제한자
	protected 	int v3 = 300;
	public		int v4 = 400;
	public void method() {
		System.out.println("chap7.Modifier 클래스의 method()");
//Modifier 클래스의 v1맴버의 접근 제한자가 private이므로 다른 클래스에서 접근 불가
//		System.out.println("v1="+v1);	
		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
		
	}
}
class Modifier3 extends Modifier2{
	public void method() {
		System.out.println("chap7.Modifier3 클래스의 method");
		//v1 : chap7.test.Modifier2.Modifier2 클래스 내에서만 접근 허용
		//System.out.println("v1="+v1);
		//v2 : chap7.test 패키지 내에서만 접근 허용
		//	   chap7.Modifier3 클래스에서는 접근 불가
		//System.out.println("v2="+v2);
		//Modifier2,Modifier3 클래스가 다른 패키지의 클래스 이지만,
		//상속관계이므로 접근 허용
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
		//생성자의 접근 제한자 : private => 객체 생성 제한
		System.out.println(Math.random());
		//생성자가 없어도 기본생성자가 만들어져서 컴파일에서 볼 수 있다.
		//Math 클래스의 생성자의 접근제한자가 private => 외부에서는 객체 생성 불가
		//Math m = new Math();// 오류 발생 
		
	}
}
public class ModifierEx1 {
	public static void main(String[] args) {
	Modifier m = new Modifier();
	m.method();
	//System.out.println("m.v1="+m.v1);
	System.out.println("m.v2="+m.v2);
	System.out.println("m.v3="+m.v3);
	System.out.println("m.v4="+m.v4);
	
//	chap4.test.Modifier2 m2 = new chap.thes.Modifier2();
	Modifier2 m2 = new Modifier2();
	m2.method();
//	System.out.println("m2.v1="+m2.v1);
//	System.out.println("m2.v2="+m2.v2);
//	System.out.println("m2.v3="+m2.v3);
	System.out.println("m2.v4="+m2.v4);
	}
}
