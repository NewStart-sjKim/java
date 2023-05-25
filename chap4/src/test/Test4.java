package test;
import java.util.Scanner;
/*
 * 윤년 구하기
 *  윤년은 4의 배수 중  100의 배수인경우는 평년, 100의 배수가 아닌 경우는 윤년, 
 *  단 400의 배수는 윤년. 
 *  년도를 입력받아서 윤년, 평년 인지를 출력하기.
 *  [결과]
 *  년도를 입력하세요
 *  2020
 *  윤년
 *  
 *  년도를 입력하세요
 *  2100
 *  평년
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.println("년도를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		if(y%4 == 0 && y%100 != 0){
			System.out.println("윤년");
		}else {
			if(y%400 == 0);
		System.out.println("평년");}
		
//		if(y%400=0 || (y%4 == 0 && y % 100 != 0))
//			System.out.println("윤년");
		
		
//		if(y%4 == 0 ) {
//			if(y % 100 == 0) {
//				if(y% 400 == 0) {
//					System.out.println("윤년");
//				}else {
//					System.out.println("평년");
//				}
//			}else {
//				System.out.println("윤년");
//			}
//		}else {
//			System.out.println("평년");
//		}
//	
	}
}