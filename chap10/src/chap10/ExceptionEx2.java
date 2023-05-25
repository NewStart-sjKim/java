package chap10;

import java.nio.file.spi.FileSystemProvider;

/*
 * 다중 catch 구문
 *  - 한개의 try블럭에 여러개의 catch 블럭이 존재.
 *  => try 블럭에서 발생 가능한 예외 종류에 따라 다른 예외 처리 가능
 *  - 상위 예외클래스(Exception)는 catch 구문의 하단에 배치해야 함.
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
		System.out.print(1);
		try {
			System.out.print(2);
			System.out.print(3); // ArithmeticException 예외 발생
			System.out.print(4);
			System.out.println(args[0]); //ArrayIndexOutOfBoundsException
			//String s = null;
			String s = "abc";
			System.out.println(s.trim()); //NullPointerException
			System.out.println(Integer.parseInt("a"));//NumberFormatException
		} catch(ArithmeticException e) {
			System.out.print(5);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("command line에 파라미터를 설정하세요");
		} catch(Exception e) {
			System.out.println("전산부로 연락하세요. 프로그램 오류입니다.");
		}
		System.out.println(6);
	}
}
