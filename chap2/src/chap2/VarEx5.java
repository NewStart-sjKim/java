package chap2;
/*
 *  String 클래스의 연산
 *  1.참조자료형. 문자열 객체
 *  2. 클래스 중 유일하게 대입연산자(=)로 객체 생성이 가능
 *  3. 클래스 중 유일하게 + 연산자 사용 가능
 *  	String+기본자료형 => String
 */
public class VarEx5 {

	public static void main(String[] args) {
		String str = "abc";		// 대입연산자를 이용한 객체생성
		String str2 = str+100;
		String str1 = new String("abc");// 객체생성방식
		System.out.println(str2);
		str2 = str+true;
		System.out.println(str2);
		str2 = str+1+2+3;
		System.out.println(str2);
		str2= 1+2+3+str;
		System.out.println(str2);
	}

}
