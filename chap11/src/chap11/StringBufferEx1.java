package chap11;
/*
 * StringBuffer/StringBuilder 클래스 : 동적 문자열
 *  - 두개의 클래스는 같은 메서드를 멤버로 가짐
 *  - equals 메서드가 오버라이딩 되어 있지 않다. => 내용비교 안됨.
 *  	=> 내용비교를 위해서는 문자열로 변경하여 비교해야 함.
 *  
 *  StringBuffer 클래스를 문자열(String)로 변경 : toString()이용함
 */
public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		if(sb1 == sb2)System.out.println("sb1 == sb2 : 같은 객체");
		else System.out.println("sb1 != sb2 : 다른 객체");
		//equals : 내용 비교를 위한 메서드 => 오버라이딩 되지 않음
		if(sb1.equals(sb2))System.out.println("!sb1.equals(sb2) : 같은 내용");
		else System.out.println("!sb1.equals(sb2) : 다른 내용");
		//내용비교를 위해서는 String 타입으로 변환
		if(sb1.toString().equals(sb2.toString()))
			System.out.println("sb1.toString().equals(sb2.thString()) : 같은 내용");
		else System.out.println("!sb1.toString().equals(sb2.toString()) : 다른 내용");
	}
}
