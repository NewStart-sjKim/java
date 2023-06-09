package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

/*
 * FlatMap 예제
 * flatMap() : Stream의 구조를변경, Stream => Stream
 * flatMapToInt() : Stream => IntStream
 */
public class FlatMapEx1 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList
				("자바 8 버전에 ","초가된 스트림을","공부하고 있습니다.");
		list1.stream().flatMap(data -> Arrays.stream(data.split(" ")))
		.forEach(s->System.out.println(s));
		//flatMapToInt() : IntStream 으로 변경
		List<String> list2 = Arrays.asList("10,20,30","40,50,60,70");
		Function<String,IntStream> f = data->{
//		IntStream isr = list2.stream().flatMapToInt(data->{
			//data : "10,20,30"
			String[] strArr = data.split(","); //[10,20,30]
			int[] intArr = new int[strArr.length]; //
			for(int i = 0; i<strArr.length;i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr); //IntStream
		};
		IntStream isr = list2.stream().flatMapToInt(f);
		System.out.println("전체합 :"
				+ isr.peek(s->System.out.print(s + ",")).sum());
		System.out.println("요소의 건수 :"
				+ list2.stream().flatMapToInt(f).count());
		System.out.println("전체합 :"
				+ list2.stream().flatMapToInt(f).average().getAsDouble());
//			System.out.println("전체합: "	+ isr.sum());
//			System.out.println("요소의 건수 :" + isr.count());
//			System.out.println("요소의 평균 :" + isr.average().getAsDouble());
		}
	}

