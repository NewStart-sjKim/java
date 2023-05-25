package chap4; 

import java.util.Scanner;

/*
 * 숫자를 입력받아서
 * 1. 양수,음수,영 출력
 * 2. 짝수,홀수 출력
 */
public class Exac1 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<0) {
		System.out.println("음수");
		}else if(num>0) {
			System.out.println("양수");
		}else if(num==0) {
			System.out.println("영");
		}
		System.out.println((num>0)?"양수입니다.":(num<0)?"음수입니다.":"영입니다.");
		
		if(num%2 == 0) {
			System.out.println("짝수입니다.");
		}else if (num % 2 != 0)
			System.out.println("홀수입니다.");
		System.out.println((num%2==0)?"짝수입니다.":"홀수입니다.");
	}

}
