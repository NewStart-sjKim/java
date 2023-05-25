package chap12;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * TreeSet : 중복불가, 정렬됨
 * Set 인터페이스의 하위 인터페이스인 SortedSet의 구현 클래스.
 */
public class SetEx3 {
	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<>();
		String from = "bat";
		String to = "d";
		set.add("abc");set.add("alien");
		set.add("bat");set.add("azz");
		set.add("car");set.add("Car");
		set.add("disc");set.add("dance");
		set.add("dzzzz");set.add("dZZZZ");
		set.add("elev");set.add("fan");set.add("flower");
		System.out.println(set);
		for(String s : set) System.out.print(s + ",");
		System.out.println();
		System.out.println("from:" + from + ", to:" + to);
		//suvSet : 부분집합
		System.out.println(set.subSet(from, to)); // bat와 d 값의 사이의 집합
		// subSet(from,to) : from 값부터 to 사이의 부분집합. to 값은 포함안됨.
		System.out.println("from:" + from + ", to:" + to + "zzzz");
		System.out.println(set.subSet(from, to + "zzzz"));
		System.out.println("역순으로 정렬하기====================");
		set = new TreeSet<>(Comparator.reverseOrder());
		set.add("abc");set.add("alien");
		set.add("bat");set.add("azz");
		set.add("car");set.add("Car");
		set.add("disc");set.add("dance");
		set.add("dzzzz");set.add("dZZZZ");
		set.add("elev");set.add("fan");set.add("flower");
		System.out.println(set);
		System.out.println("대소문자 구분없이 정렬하기 ===========");
		//CompareToIgnoreCase() 함수 사용
		set = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareToIgnoreCase(s2);
			}
		});
		System.out.println();
		set.add("abc");set.add("alien");
		set.add("bat");set.add("azz");
		set.add("car");set.add("Car");
		set.add("disc");set.add("dance");
		set.add("dzzzz");set.add("dZZZ");
		set.add("elev");set.add("fan");set.add("flower");
		System.out.println(set);
		
	}
}
