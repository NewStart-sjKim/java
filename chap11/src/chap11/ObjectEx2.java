package chap11;
/*
 * Object클래스 : toString 메서드 예제
 * 		toString 메서드 : 객체의 문자열 변환하는 메서드
 * 		=> 참조변수값을 출력하면 자동으로 호출되는 메서드
 * 		=> 클래스명@16진수 해쉬코드 리턴
 * 		=> 객체의 내용을 출력하기 위해서는 오버라이딩 필요.
 * 			Exam1.java 소스의 Card 클래스에 toString 메서드 오버라이딩 필요
 */
public class ObjectEx2 {
	public static void main(String[] args) {
		Card c1 = new Card("Space",1);
		Card c2 = new Card("Space",1);
		System.out.println(c1);
		System.out.println(c2);
	}
}
