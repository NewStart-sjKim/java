package test;

import java.util.Scanner;

/*
 * 1부터 100까지의 숫자 중 2의 배수이거나, 3의 배수의 합을 구하기 
 */
public class Test6 {
	public static void main(String[] args) {
		int s=0, i=0;
		for (i=1; i<=100; i++) {
			if(i%2==0) {  
				s+=i;
			}else {
				if(i%3==0)
						s+=i;
			}
		} System.out.println(s);
		
//		int sum = 0;
//		System.out.println("for 구문");
//		for(int i=1;i<=100;i++) {
//			if(i%2==0||i%3==0) sum +=i;
//		}
//		
	}
}