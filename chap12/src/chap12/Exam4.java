package chap12;

import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Lotto 번호(1~45) 임의의 숫자 6개를 출력하기
 *  - 중복숫자 없음.	=> TreeSet 사용하기
 *  - 정렬하여 출력하기
 */
public class Exam4 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		while(set.size() <= 5) {
			set.add(rand.nextInt(45)+1);
		}
		System.out.println(set);
	}
}
