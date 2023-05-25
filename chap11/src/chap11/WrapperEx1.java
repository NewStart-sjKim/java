package chap11;
/*
 * Wrapper 클래스 : 8개의 기본 자료형을 객체화 하기 위한  클래스
 * 		기본자료형			Wrapper 클래스
 * 		boolean			Boolean
 * 		char			Character
 * 		byte			Byte
 * 		short			Short
 * 		int				Integer
 * 		long			Long
 * 		float			Float
 * 		double			Double
 * 기본자료형과 참조자료형은 형변환이 불가함.
 * 		String str = 'A'; (x)
 * 예외적으로 기본자료형과 Wrapper 클래스간의 형변환은 가능하다.(jdk5 이후)
 * 기본형 <= 참조형 : auto UnBoxing
 * 참조형 <= 기본형 : auto Boxing
 */
public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = 100; //auto Boxing
		Integer i2 = 100;
		System.out.println("i1 == i2 : " + (i1 == i2));
		System.out.println("100 == i2 : " + (100 == i2));//auto UnBoxing
		System.out.println("i1.equals(i2)" + i1.equals(i2));
		//int 형 정보
		System.out.println("int 형의 최대값 : " + Integer.MAX_VALUE);
		System.out.println("int 형의 최소값 : " + Integer.MIN_VALUE);
		System.out.println("int 형의 bit 크기 : " + Integer.SIZE);
		//int 형 <- 문자열
		System.out.println(Integer.parseInt("123")+100); //223
		System.out.println(Integer.parseInt("12",8)+100);//110
		System.out.println(Integer.parseInt("10",16)+100);//116
		//255를 2진수 표현
		System.out.println(Integer.toBinaryString(255));
		//255를 8진수 표현
		System.out.println(Integer.toOctalString(255));
		//255를 16진수 표현
		System.out.println(Integer.toHexString(255));
		//
	}
}
