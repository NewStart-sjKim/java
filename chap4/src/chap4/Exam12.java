package chap4;

import java.util.Scanner;

/*
 * 숫자 맞추기
 * 컴퓨터가 1~100 사이의 임의의 정수를 저장하고,
 * 사용자는 숫자를 입력하여 컴퓨터 저장한 숫자를 맞추기
 * 37 가정
 * [결과]
 * 1~100사이의 숫자를 입력하세요
 * 50
 * 작은수입니다.
 * 25
 * 큰수입니다.
 * 40
 * 작은수입니다
 * 37
 * 정답입니다.
 * 프로그램종료.
 */
public class Exam12 {
	public static void main(String[] args) {
		int ans = (int) (Math.random() * 100)+1;
		Scanner scan = new Scanner(System.in);
		int data = 0;
		do {
			System.out.println("정수를 입력하세요.");
			data = scan.nextInt();
			if(ans > data)
				System.out.println("큰수입니다.");
			else if (ans < data)
				System.out.println("작은수입니다.");
		}while(ans != data);
		System.out.println("정답입니다.");
		System.out.println("프로그램을 종료.");

		}
	}
