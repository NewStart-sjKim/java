package chap11;
/*
 * switch 구문에서 조건값으로 사용할 수 있는 자료형
 * 		: byte,short,int,char,String
 * 		  Byte,Short,Integer,CharActer
 */
public class WrapperEx3 {
	public static void main(String[] args) {
		int data = 0;
		switch(data) {
			default : System.out.println("switch 테스트");
		}
	}
}
/*
 * java.lang 패키지의 클래스
 * Object : 모든 클래스의 부모 클래스
 * String : 문자열. 대입연산자, +연산자 사용가능.
 * 			정적문자열. 변경불가 문자열
 * StringBuffer : 문자열의 보조 클래스. 동적문자열.
 * 				equals 메서드 오버리이딩 안됨 => 내용비교는 toString() 이용하여 함.
 * Math : 수치 계산을 위한 기능. 모든 멤버는 static임. 객체화 불가능\
 * Wrapper : Boolean,Byte,Short,Integer,Long,Character,Float,Double
 * 			 8개의 클래스 통칭.
 * 			 기본자료형과 형변환 가능 : auto Boxing, auto UnBoxing
 */
