package chap15;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * IntStream 예제 : int형(정수형)값들의 모임
 */
public class IntStreamEx1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("Arrays.Stream() : 배열을 이용하여 IntStream 생성");
		IntStream is1 = Arrays.stream(arr);
		is1.forEach(System.out::print);
		System.out.println("IntStream.of() : 배열을 이용하여 IntStream 생성");
		IntStream.of(arr).forEach(s->System.out.print(s));
		System.out.println("IntStream.range(1,11) 메서드를 이용하여 IntStream 생성");
		IntStream.range(1,11).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("IntStream.rangeClosed(1,10) 메서드를 이용하여 IntStream 생성");
		IntStream.rangeClosed(1,10).forEach(s->System.out.print(s+" "));
		System.out.println("IntStream 을 이용하여 1~100까지의 합 구하기" +
							IntStream.rangeClosed(1,100).sum());
		System.out.println("IntStream 을 이용하여 1~100까지의 짝수의 합 구하기" +
				IntStream.range(1,101).filter(i->i%2==0).sum());
		System.out.println("IntStream 을 이용하여 1~100까지의 홀수의 갯수 구하기" +
				IntStream.range(1,101).filter(i->i%2==1).count());
		System.out.println("IntStream 을 이용하여 1~100까지의 홀수의 평균 구하기" +
				IntStream.range(1,101).filter(i->i%2==1).average().getAsDouble());
	}
}
