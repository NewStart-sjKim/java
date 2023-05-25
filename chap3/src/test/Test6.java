package test;

import java.util.Scanner;

//  반지름을 입력받아 원의 둘레와 면적을 구하시오
public class Test6 {
	public static void main(String[] args) {
	
		System.out.println("둘레를 입력하세요");
		Scanner sc = new Scanner(System.in);
		double pi = 3.141592;
		
		double r = sc.nextInt();
		double c = r*r*pi;
		double d = 2*r*pi;
		System.out.println(c);
		System.out.println(d);
	}
}