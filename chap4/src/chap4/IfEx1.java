package chap4;

import java.util.Scanner;

/*
 * if 조건문 예제
 * 	 if(조건문) {
 * 		조건문의 결과가 참인 경우 실행되는 문장들
 * 		}else{
 * 		조건문의 결과가 거짓인 경우 실행되는 문장들
 * 		}
 * {} : 블럭
 * if,else 블럭에서 실행되는 문장이 한개인 경우 {} 생략가능
 */
public class IfEx1 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		//if(조건문)
		if(score >= 60) //{} 생략 가능
				// score >= 60인 경우만 실행되는 문장
			System.out.println("합격입니다.");
		
		if(score >= 60) {
			System.out.println("합격입니다.");
		}else{
			System.out.println("불합격입니다.");
		}
		//점수별 학점 출력하기
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	
}
}