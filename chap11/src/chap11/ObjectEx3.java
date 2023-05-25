package chap11;
/*
 * Object 클래스 : hashcode() 메서드
 * 	hashcode : 원래의미는 JVM 객체를 구별하기위한 고유 ID값(참조값)
 *  객체의 논리적 동등성을 위해 오버라이딩 필요함.
 *  
 *  내용비교를 위해서 equals 메서드를 오버라이딩 하는 경우
 *  hashcode 메서드도 오버라이딩 하는 것을 권장함.
 *  => 논리적 동등성비교에 관련 메서드임.(Collection 프레임워크 부분에서 다시 설명)
 *  
 *  String			StringBuffer
 *  				StringBuild
 *  
 *  정적인문자열		동적인 문자열
 *  병경불가			변경가능
 *  대입연산자객체
 *  생성가능
 *  X연산가능
 */
public class ObjectEx3 {
	public static void main(String[] args) {
//		String s1 = new String("abc");
//		String s2 = new String("abc");
		String s1 = "abc";
		String s2 = "abc";
		if(s1 == s2)
			System.out.println("s1과s2는 같은 객체임");
		else
			System.out.println("s1과s2는 다른 객체임");
		System.out.println("s1.hashCode():" + s1.hashCode());
		System.out.println("s2.hashCode():" + s2.hashCode());
		System.out.println("s1의 원래 hashcode값:" + 
				System.identityHashCode(s1));
		System.out.println("s2의 원래 hashcode값:" + 
				System.identityHashCode(s2));
	}
}
