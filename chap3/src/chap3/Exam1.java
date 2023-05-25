package chap3;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		int x=10;
		//++ 연산자를 이용하여 x=10 결과가 나오도록 수정
		System.out.println("1.x="+ x++); //1.x=10
		//++ 연산자를 이용하여 x=10 결과가 나오도록 수정
		System.out.println("1.x="+ --x); //2.x=10
		
		//화면에서 숫자를 입력받아 증감 연산자를 이용하여 같은값이 나오도록
		//프로그램 작성하기
		//new Scanner(System.in) : 키보드로부터 데이터 입력받기위한 객체 생성
		//nextInt() : 정수값을 입력받는 함수
		System.out.println("숫자를입력하세요");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		System.out.println("1.x="+ x++);
		System.out.println("2.x="+ --x);
	}

}
