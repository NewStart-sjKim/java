package collectionex;

import java.util.ArrayList;
import java.util.List;

/*
 * fibo 메서드 구현하기
 * List<Integer> fibo(int)
 */
public class FiboEx2 {
	public static void main(String[] args) {
		System.out.println("fibo(10):" + fibo(10));// [0 1 1 2 3 ...34]
		System.out.println("fibo(10):" + fibo(3)); // [0 1 1]
	}
	private static List<Integer> fibo(int n){
		
		List<Integer>fibo = new ArrayList<>();
		fibo.add(0);fibo.add(1);
		for(int i=2;i<n;i++) {
			fibo.add(fibo.get(i-2) + fibo.get(i-1));
		}
		return fibo;
	}
}
