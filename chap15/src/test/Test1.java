package test;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntPredicate;

/*
 * 1부터 100까지의 정수형 임의의 난수 100개를 저장하고,
 * 그중 소수인 숫자의 목록과, 갯수를 출력하기
 * Random 클래스를 이용
 */
public class Test1 {
	public static void main(String[] args) {
		//new Random().ints(갯수,시작값,종료값+1) : 난수를 IntStream 객체
		//toArray() : IntStream -> int[] 배열로 변환 메서드
		int[] arr = new Random().ints(100, 1, 101).toArray();
		//소수값 검증
		IntPredicate f = a -> {
			int cnt = 0;
			for (int i = 2; i < a; i++) {
				if (a % i == 0) cnt++;
			}
			if (cnt > 0) return false; // cnt가 0보다 커? = 소수가 아님
			else 		 return true; // 		"		  소수
		};
		System.out.print("소수 목록 :");
		Arrays.stream(arr).filter(f).distinct().sorted().
			forEach(a -> System.out.print(a + ","));
			System.out.println();
			System.out.print("소수 갯수 :");
		long count = Arrays.stream(arr).filter(f)
				.distinct().count();
		System.out.println(count);
		System.out.println("===================");
		System.out.print("소수 목록 :");
		count = Arrays.stream(arr).filter(f).distinct()//.sorted() : 알아서 정렬
				.peek(s -> System.out.print(s + ",")).count();
		System.out.println();
		System.out.println("소수의 갯수:" + count);
	}
}