package chap4;

import java.util.Scanner;

/*
 * 농장에 강아지,병아리가 있음.
 * 강아지 병아리 전체 마리수 입력받고
 * 강아지 다리수와 병아리 다리수 전체를 입력받는다.
 * [결과]
 * 강아지 병아리 마리수를 입력하세요
 * 20
 * 강아지 병아리 전체 다리수를 입력하세요
 * 30
 * 
 * 강아지 : xx마리
 * 병아리 : yy마리
 * 강아지 병아리 마리수를 입력하세요
 * 10
 * 강아지 병아리 전체 다리수를 입력하세요
 * 10
 * 계산안됨
 */
public class Exam9 {
	public static void main(String[] args) {
		System.out.println("강아지 병아리 마리수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		System.out.println("강아지 병아리 전체 다리수를 입력하세요");
		int leg = sc.nextInt();
		boolean check = false;
		for(int x=0;x<=cnt;x++) {
			for(int y=0;y<=cnt;y++) {
				if((x+y==cnt)&&((4*x)+(2*y)==leg)) {
					System.out.println("강아지수:"+x+','+"병아리수:"+y);
					check=true;
				}
			}
		}
		if(!check) {
			System.out.println("계산안됨");
		}
	}

}
