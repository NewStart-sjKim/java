package chap11;

import java.util.Random;

/*
 * Random 클래스 : 난수 발생 클래스
 *  1.	자료형별로 난수 발생
 * 		nextInt() : 정수형난수
 * 		nextInt(n) : 정수형 난수 0<=x < n
 * 		nextDouble() : 0<= x < 1.0
 * 		nextBoolean() : true/false
 *  2.	seed 값 설정 가능.
 */
public class RandomEx1 {
	public static void main(String[] args) {
		Random rand1 = new Random();
		rand1.setSeed(1);
		for(int i=0;i<5;i++)
			System.out.println(i + ":" + rand1.nextInt(100));
		System.out.println("rand2--------------------");
		Random rand2 = new Random();
		/*
		 * System.currentTimeMillis() : 1970년 이후부터 현재까지의 시간의 밀리초로 리턴
		 */
		System.out.println(System.currentTimeMillis());
		rand2.setSeed(System.currentTimeMillis());
		for(int i=0;i<5;i++)
			System.out.println(i + ":" + rand1.nextInt(100));
	}
}
