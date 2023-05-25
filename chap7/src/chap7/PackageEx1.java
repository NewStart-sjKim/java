package chap7;


/*
 * 
 * 패키지 예제
 * package
 * 		- 클래스들의 모임
 * 		- 클래스의 이름은 패키지명을 포함
 * 		- 패키지의 설정은 파일의 처음에 한번만 가능
 * 		=> 하나의 파일에 존재하는 모든 클래스는 같은 패키지에 속한 클래스임.
 * impert : 클래스 이름의 패키지명을 생락 할 수 있도록 미리 사용될 클래스 이름을 선언함
 * 
 * 클래스의 패키지명을 생략 할 수 있는 경우
 * 1. 같은 패키지에 속한 클래스 사용시
 * 2. java.lang 패키지에 속한 클래스를 사용시
 * 3. import 구문으로 선언된 클래스 사용시
 */
// import java.utill.Scanner;
// import java.utill.Date;
import java.util.*;
import java.util.Scanner; 
// jaca.utill 패키지의 모든 클래스는 패키지명 생략
class Pack1{
	void method() {
		System.out.println("chap7.Pack1 클래스의 method() 메서드");
	}
}
public class PackageEx1 { //chap7.PackageEx1
	public static void main(String[] args) {
		Pack1 p = new Pack1();
		p.method();
//		java.util.Svanner scan = newe java.util.Scanner(System.in);
		Scanner scan = new Scanner(System.in);
//		java.util.Date today = new java.til.Date();
		Date today = new Date ();
	}
}
