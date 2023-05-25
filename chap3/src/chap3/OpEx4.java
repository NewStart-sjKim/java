package chap3;
/*
 * 비교연산자(관계연산자) : ==,!=,>,< ...
 * 			=> 결과는 boolean
 * 논리연산지 : &&(AND), ||(OR) => boolean && boolean
 * T && T => T
 * T && F => F
 * F && T => F
 * F && F => F
 * && 연산자에서 앞쪽의 결과가 F 인 경우는 뒤쪽 부분 실행 안함
 * T || T => T
 * T || F => T
 * F || T => T
 * F || F => F
 * || 연산자에서 앞쪽의 결과가 T인 경우는 뒤쪽 부분 실행 안함.
 */
public class OpEx4 {
	public static void main(String[] args) {
		int x=1,y=1;
		System.out.println("1 == 1 :" + (x==y));
		System.out.println("1 != 1 :" + (x!=y));
		System.out.println("1 > 1 :" + (x>y));
		System.out.println("1 >= 1 :" + (x>=y));
		//논리연산자
		System.out.println("x==1 && y==2 : " + (x==1 && y==2));
		System.out.println("x==1 || y==2 : " + (x==1 || y==2));
		

	}

}
