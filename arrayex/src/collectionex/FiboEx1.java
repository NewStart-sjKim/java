package collectionex;

import java.util.ArrayList;
import java.util.List;

/*
 * 피보나치 수열 출력하기
 */
public class FiboEx1 {
	public static void main(String[] args) {
		List<Integer>fibo = new ArrayList<>();
		fibo.add(0);fibo.add(1);
		//i=2 : fibo.add(fibo.get(0)+fibo.get(1))
		//i=3 : fibo.add(fibo.get(1)+fibo.get(2))
		//i=4 : fibo.add(fibo.get(2)+fibo.get(3))
		//i=n : fibo.add(fibo.get(n-2)+fibo.get(n-1))
		for(int i=2;i<10;i++) {
			fibo.add(fibo.get(i-2) + fibo.get(i-1));
		}
		System.out.println(fibo);
	}
}
