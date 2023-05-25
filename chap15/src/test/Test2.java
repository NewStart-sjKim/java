package test;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
  화면에서 정수를 입력받아 
  입력된 숫자까지의 합, 짝수의 합, 홀수의 합을 구하는 프로그램 작성하기
 IntStream.rangeClosed
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = scan.nextInt();
		System.out.printf("1부터 %d까지의 합:%d\n",num,
				IntStream.rangeClosed(1, num).sum());
		System.out.printf("1부터 %d까지의 짝수의 합:%d\n",num,
				IntStream.rangeClosed(1, num).filter(i->i%2==0).sum());
		System.out.printf("1부터 %d까지의 홀수의 합:%d\n",num,
				IntStream.rangeClosed(1, num).filter(i->i%2==1).sum());
	}
}