package chap17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 타자 연습 프로그램 구현
 * String[] data = {"태연","유리","윤아","효연"....}
 * 3초에 한번씩 List에 data 이름 추가하기.
 * 화면에 추가된 이름을 출력하기.
 * 이름을 입력받아서 입력받은 이름을 리스트에서 제거.
 * List 의 모든 데이터가 삭제되면 프로그램 종료
 * 
 */
public class ThreadEx9 {
	static List<String> words = new ArrayList<String>();
	static String[] data = { "태연", "유리", "윤아", "효연", "수영", "서현", "티파니", 
			"써니", "제시카", "뷔", "슈가", "제이홉","동키","슈렉","똥","뭘봐" };
	static int interval = 1 * 1000; // 3초

	class DataAddThread extends Thread {
		public void run() {
			while (true) {// 무한반복
				try {
					sleep(interval);
				} catch (InterruptedException e) {
				}
				words.add(data[(int) (Math.random() * data.length)]);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadEx9 c = new ThreadEx9();
		Scanner scan = new Scanner(System.in);
			c.words.add(c.data[0]);
		DataAddThread t1 = c.new DataAddThread();
		t1.setDaemon(true); // 데몬스레드 설정. => 반드시 start() 전에 실행해야함.
		t1.start();
		while (true) {
			System.out.println(words);
			System.out.println(">>");
			String input = scan.next().trim();
			words.remove(input); // 입력된 이름을 words 리스트의 요소에서 제거
			if (words.size() == 0)
				break;
		}
		System.out.println("프로그램 종료");
	}
}
