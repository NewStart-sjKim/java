package chap3;

import java.util.Scanner;

/*
 * 화면(키보드)에서 초를 입력받아, 몇시간 몇분 몇초인지 출력하기
 * 1. Scanner 생성
 * 2. second = scan.nextInt()
 * 3. 시간 second/3600
 * 4. 분	  (second%3600)/60
 * 5. 초   second%60
 * [결과]
 * 초를 입력하세요
 * 3662
 * 1시간1분2초
 */
public class Exam2 {

	public static void main(String[] args) {
		System.out.println("초를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int second = scan.nextInt();
		int h = second/3600;
		int m = (second%3600)/60;
		int s = second%60;
		System.out.println(h+"시간"+m+"분"+s+"초");
		

	}

}
