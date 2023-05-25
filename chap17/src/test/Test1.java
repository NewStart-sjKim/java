package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * ThreadEx8번의 DataAddThread 를 Runnable 인터페이스를 구현하는
 *    방식으로 변경하기 
 */
public class Test1 {
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		String[] data = 
	{ "태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카" };
		int interval = 1 * 1000; // 3초
		Scanner scan = new Scanner(System.in);
		words.add(data[0]);
		Thread t1 = new Thread(()->{
			while (true) {
				try {
					Thread.sleep(interval);
				} catch (InterruptedException e) {
				}
				words.add(data[(int) (Math.random() * data.length)]);
			}			
		});
		t1.setDaemon(true); 
		t1.start();
		while (true) {
			System.out.println(words);
			System.out.print(">>");
			String input = scan.next().trim();
			words.remove(input);
			if (words.size() == 0)
				break;
		}
		System.out.println("프로그램 종료");
	}
}

