package chap7;
/*
 * final 변수 : 변경불가 변수 => 상수 . const 예약어 사용 안함
 * 		 final 변수도 생성자에서 한번은 초기화 가능 => 객체별로 다른 상수값이 가능
 * 		 => 명시적 초기화 되면 안됨.
 */
class FinalValue{
	final int NUM;// 상수값은 초기화가 필요
	FinalValue(int num){
		NUM=num;		//생성자에서 한번 초기화 가능. 객체별로 다른 상수값 가능함.
	}
}
public class FainalValueEx {
	public static void main(String[] args) {
		final int NUM = 100;
//		Num = 200;// 오류 변경 불가 변수
		FinalValue f1 = new FinalValue(100);
//		f1.NUM=200;//오류.변경 불가 변
		FinalValue f2 = new FinalValue(200);
		System.out.println(f1.NUM);
		System.out.println(f2.NUM);
		//final 변수 배열
		final int[] arr = {10,20,30,40,50};
		arr[0] = 100;
		arr[1] = 200;
		//arr	=	new int[5];// 상수값 변경 불가
		//package => 클래스,인터페이스의 모임
		//			 패키지명.클래스명.
	}
}
