package chap2;
/*
 * 변수의 형변환 : 8개의 기본자료형 중 boolean을 제외한 나머지 7가지는 서로 형변환이 가능하다
 * 자바의 자료형
 * 기본자료형 :
 * 		논리형: boolean(1byte)
 * 		문자형: char(2byte)
 * 		정수형: byte(1byte),short(2byte),int(4byte),lon(8byte)
 * 		실수형: float(4byte),double(8byte)
 * 참조자료형	: 객체,인스턴스
 * 		배열(array)
 * 		클래스(class)
 * 		인터페이스(interface)
 * 
 * 형변환
 * 		1. 기본자료형 중 boolean을 제외한 7개의 자료형은 서로 형변환이 됨
 * 		2. 기본자료형과 참조형은 형변환 불가(wrapper 클래스는 예외.)
 * 		3. 형변환 연산자 생략가능 : 자동 형변환 : 큰자료형 <= 작은자료형
 * 		   형번환 연산자 생략불가 : 명시적 형변환 : 작은자료형 <= 큰자료형
 */
public class VarEx3 {
	public static void main(String[] args) {
		byte b1 = 10;
		short s1 = 20 ;
		int i1 = 30;
		long l1 = 40;
		float f1 = i1;	// 형변환 float<- int
		System.out.println("i1="+i1);
		System.out.println("f1="+f1);
		System.out.println("f1+0.5="+(f1+0.5));
		System.out.println("i1+0.5="+(f1+0.5));
		// (int) : 형변환 연산자.
		System.out.println("(int)(i1+0.5)="+(int)(f1+0.5));

	}

}
