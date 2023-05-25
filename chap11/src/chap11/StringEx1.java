package chap11;
/*
 * String 클래스 : 정적인 문자열(변경 불가 객체)
 * String 객체는 한번 생성하면 그 값이 변하지 않는다.
 */
public class StringEx1 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		if(s1==s2) System.out.println("s1==s2");
		else System.out.println("s1!=s2");
		if(s1.equals(s2)) System.out.println("s1.equals(s2)");
		else System.out.println("!s1.equals(s2)");
		String s3 = new String("abc");
		String s4 = new String("abc");
		if(s3==s4) System.out.println("s3==s4");
		else System.out.println("s3!=s4");
		if(s3.equals(s4)) System.out.println("s1.equals(s4)");
		else System.out.println("!s3.equals(s4)");
		}
}
