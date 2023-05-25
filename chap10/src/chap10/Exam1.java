package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 1.화면에서 1~10사이의 숫자를 입력받아, 숫자만큼 * 출력하기
 * 입력값이 숫자 아닌경우 InputMismatchException 예외가 발생함
 * 예외 발생시 숫자만 입력하세요. 메세지 출력하고 다시 입력 받도록 구현하기
 * catch scan.next();추가하기
 * 
 * 2. 1 ~ 10 사이의 숫자가 아닌 경우 예외 강제 발생하고 다시 숫자를 입력받기
 */
public class Exam1 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		while(true) {
		try {
			System.out.println("1~10 사이의 숫자를 입력하세요");
			int num = scan.nextInt();
			if(num<1 || num > 10) {
			//	throw new Exception("1~10 사이만 가능");
				throw new RuntimeException();
				}
			System.out.println(num+":");
			for(int i=1;i<=num;i++) {
				System.out.print("*");
		}
			System.out.println();
			break;
		}catch(InputMismatchException e){
			System.out.println("숫자만 입력하세요.");
			scan.next();
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
			System.out.println("숫자만 입력하세요.");
			scan.next();
		}
	}
}
}
