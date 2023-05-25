package chap4;

import java.util.Scanner;

public class Exam8 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= h; i++)
			sum += i;
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= h; j++) {
				if (i <= j)
					System.out.print(sum-- + "\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}

	}
}