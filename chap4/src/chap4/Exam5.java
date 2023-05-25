package chap4;

import java.util.Scanner;

/*
 * 화면에서 자연수를 입력받아서 각 자리수의 합을 구하기
 * [결과]
 * 자연수 입력
 * 123
 * 6
 */
public class Exam5 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("자리수합:" + sum);
	}

}
