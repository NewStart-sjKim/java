package chap3;

import java.util.Scanner;

/*
 * 사과를 담기위한 사과 상자 갯수 구하기
 * 1개의 상자에 10개의 사과를 담을 수 있다고 가정 할 때 필요한 상자의 갯수 구하기
 * 
 * [결과]
 * 사과의 갯수를 입력하세요
 * 31
 * 푤요한 상자 갯수 : 4개
 * [결과]
 * 사과의 갯수를 입력하세요
 * 30
 * 푤요한 상자 갯수 : 3개
 */
public class Exam5 {

	public static void main(String[] args) {
		System.out.println("사과 갯수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int apple = scan.nextInt();
				
		System.out.println("필요한 상자 갯수 :" + ((apple%10==0)?apple/10:(apple/10+1)) +"개");
		System.out.println("필요한 상자 갯수 :" + (apple/10+((apple%10==0)?0:1)) +"개");
		int result = (apple%10==0)? 0:1;
		System.out.println("필요한 상자 갯수 : " + (apple/10 + result)+ "개");

	}

}
