package chap4;

import java.util.Scanner;

/*
 * 1 부터 100까지 합이 1000이 넘는 순간의값을 출력하기
 */
public class Exam10 {
	public static void main(String[] args) {
		int s = 0,i = 0 ;
		for (i = 1; i <= 100; i++) {
			s += i;
			if (s >= 1000)break;
		}
		System.out.println(i);
	}
}
