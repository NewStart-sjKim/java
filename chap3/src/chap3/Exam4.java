package chap3;

import java.util.Scanner;

/*
 * 숫자를 입력받아서, 양수인 경우 "양수", 음수인경우 " 음수", 0인경우 "영"
 * 입력받은 수가 짝수 또는 홀수 출력하기 score%2 == 0 " 짝수
 * [결과]
 * 숫자를 입력하세요
 * -10
 * -10은 음수
 * -10은 짝수
 *  [결과]
 * 숫자를 입력하세요
 * 10
 * 10은 양수
 * 10은 짝수
 *  [결과]
 * 숫자를 입력하세요
 * 0
 * 0은 영
 */
public class Exam4 {

	public static void main(String[] args) {
	
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		System.out.println(score  + "은" +((score < 0)?"음수":(score>0)?"양수":"영"));
		System.out.println(score  + "은" +((score %2==0)?"짝수":"홀수"));
		
	}

}
