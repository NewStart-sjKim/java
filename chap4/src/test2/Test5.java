package test2;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
3
*****
 ***
  *
 
 */
public class Test5 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하시오");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		for(int i=1;i<=h;++i) {
			System.out.print("*");
			for(int j=1;j<i;++j) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}