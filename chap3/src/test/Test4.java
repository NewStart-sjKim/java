package test;

import java.util.Scanner;

/*
 *  화면에서 두수를 입력받아서 더큰수를 출력하기 
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.println("두수를 입력:");
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		int n3 = n1>n2? n1:n2;
		
		System.out.print(n1+","+n2);// (print)옆으로출력
		System.out.println(n3); // (println)한줄출력
		System.out.println(n1>n2?n1:(n1<n2)?n2:"같다");
	}
}