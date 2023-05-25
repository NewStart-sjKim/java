package test;

import java.util.Scanner;

/*
점수를 입력받아 
    95점 이상인 경우 A+ 90 ~ 94 : A0  
    89 ~ 85점 이상인 경우 B+ 80 ~ 84 : B0 
    79 ~ 75점 이상인 경우 C+ 70 ~ 74 : C0 
    69 ~ 65점 이상인 경우 D+ 60 ~ 64 : D0 
       그외는 F 로 출력하기.
    중첩 조건문을 이용하여 구현하기 
*/
public class Test5 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		if(p>=95) {
			System.out.println("A+");
		} else if(p<=94 && p>=90) {
				System.out.println("A0");
		}else if(p<=89 && p>=85) { 
				System.out.println("B+");
		}else if(p<=84 && p>=80) {
				System.out.println("B0");
		}else if(p<=79 && p>=75) {
				System.out.println("C+");
		}else if(p<=74 && p>=70) {
				System.out.println("C0");
		}else if(p<=69 && p>=65) {
				System.out.println("D+");
		}else if(p<=64 && p>=60) {
				System.out.println("D0");
		}else System.out.println("F");
		
		}
	}
