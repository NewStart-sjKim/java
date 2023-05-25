package chap4;

import java.util.Scanner;

/*
 * 삼각형의 높이를 입력받아서 *로 삼각형 출력하기
 * [결과]
 * 삼각형의 높이
 * 3
 * 1:
 * *
 * **
 * ***
 * 
 * 2:
 * ***
 * **
 * *
 * 
 * 3:
 *   *
 *  **
 * ***
 * 
 * 4.
 * ***
 * 	**
 * 	 *
 * 
 * 5.
 *   *  
 *  ***
 * *****
 */
public class Exam6 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하시오");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		System.out.println("1");
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println("2");
		for (int i = h; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("3");
		for (int i = h; i >= 1; i--) {
			for (int j = 1; j <= h; j++) {
				if (i <= j)
					System.out.print("*");
				else if (i > j)
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("4");
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= h; j++) {
				if (i <= j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("5");
		int b = h * 2 - 1; // 바닥의 *의 갯수
		int m = b / 2; // *중간 인덱스
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < b; j++) {
				if (j >= m - i && j <= m + i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
