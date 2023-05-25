package chap2;
/*
 * 기본자료형 중 boolean을 제외한 7개의 자료형은 서로 변환이 가능
 * 
 * 자동형변환	: 큰자료형<=작은자료형. 형변환연산자 생략가능
 * 명시적변환	: 작은자료형 <= 큰자료형. 형변환연산자 생략불가
 *
 * <- 명시적형변환	(방향)	-> 자동형변환
 * byte,short,int,long,float,double
 * 		char
 */
public class VarEx4 {

	public static void main(String[] args) {
		long l = 100;
		float f= l;
		System.out.println("f="+f);
		
		// 리터널에 사양되는 접미사
		
	/*
	 * L,l : long 타입의 리터럴값
	 * F,f : float 타입의 리터널값
	 * D,d : double 타입의 리터널값
	 */
		long l1= (long)1000;
		long l2= 1000L; //long타입의 1000
		float f1 = (float)10.5; //실수타입의 리터널의 기본 자료형은 double임.
		float f2 = 10.5f; // f 접미사를 이용하여 float타입의 리터럴 값을 저장
		double d1 = 10.5; // 실수타입의 리터널의 자료형은 double임

	}

}
