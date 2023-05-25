package chap15;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * Stream 예제
 * 
 *  Collection 방식과 Stream 방식 비교
 */
public class StreamEx1 {
	public static void main(String ... args) {// String ... args : 배열과 args 값이 여러개 있어도 돼
		//
		//Arrays.asList(String...a) : 가변매개변수 ( ...있으면 문자열 여러개 넣어도 된다)
		//				String 매개변수 0개 이상.
		List<String> list = Arrays.asList("홍길동","김삿갓","이몽룡","임꺽정");
		System.out.println("iterator 방식");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) System.out.print(it.next()+",");
		System.out.println();
		System.out.println("Stream 방식");
//		list.stream().forEach(name->System.out.print(name + ","));
		Stream<String> st = list.stream();
		st.forEach(name->System.out.print(name+","));
		System.out.println();
	}
}
