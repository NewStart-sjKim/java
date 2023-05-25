//package test;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
///*
// * 영어 타자 연습 프로그램 구현
// * 
// * 3초에 한번씩 List에 소문자 3~6자의 임의의 영어단어 추가하기.
// * 화면에 추가된이름을 출력하기.
// * 단어를 입력받아서 입력받은 단어를 리스트에서 제거.
// * List 의 모든 데이터 삭제되면 프로그램 종료
// * 
// [결과]
//[abcdef]
//>>abcdef
//[cncm]
//>>cncm
//[rfaa]
//>>rfaa  
// */
//
//public class Test2 {
//	public static void main(String[] args) throws InterruptedException {
//		List<String> words = new ArrayList<String>();
//		String[] data = 
//			{ "hi", "hey", "cute", "ant", "art", "swinng", "hellow","where", "hard"};
//		int interval = 2 * 1000; //1초
//		Scanner scan = new Scanner(System.in);
//		words.add(data[0]); //초기데이터
//		DataAddThread t1 = new DataAddThread(words, data, interval);
//		t1.setDaemon(true); //데몬스레드 설정. => 반드시 start() 전에 실행해야함.
//		t1.start();
//		while (true) {
//			System.out.println(words);
//			System.out.println(">>");
//			String input = scan.next().trim();
//			words.remove(input); //입력된 이름을 words 리스트의 요소에서 제거
//			if(words.size() ==0)
//				break;
//		}
//		System.out.println("프로그램 종료");
//	}
//}
//class DataAddThread extends Thread{
//	List<String> words;
//	String[] data;
//	int interval;
//	public DataAddThread(List<String> words, String[] data, int interval) {
//		this.words = words;
//		this.data = data;
//		this.interval = interval;
//	}
//	public void run() {
//		while (true) {// 무한반복
//			try {
//				sleep(interval);
//			}catch (InterruptedException e) {}
//			words.add(data[(int)(Math.random() * data.length)]);
//		}
//	}
//}
package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * 영어 타자 연습 프로그램 구현
 * 
 * 3초에 한번씩 List에 소문자 3~6자의 임의의 영어단어 추가하기.
 * 화면에 추가된이름을 출력하기.
 * 단어를 입력받아서 입력받은 단어를 리스트에서 제거.
 * List 의 모든 데이터 삭제되면 프로그램 종료
 * 
 [결과]
[abcdef]
>>abcdef
[cncm]
>>cncm
[rfaa]
>>rfaa  
 */

public class Test2 {
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		int interval = 2 * 1000; 
 	    Scanner scan = new Scanner(System.in);
		words.add("abcdef");
		EngDataAddThread t1 = new EngDataAddThread(words, interval);
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
class EngDataAddThread extends Thread {
	List<String> words;
	int interval;

	public EngDataAddThread(List<String> words, int interval) {
		this.words = words;
		this.interval = interval;
	}
	@Override
	public void run() {
		while (true) {
			try {
				sleep(interval);
			} catch (InterruptedException e) {}
			//임의의 생성할 글자 갯수
			int chlen = (int)(Math.random() * 4)+3;
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<chlen;i++) {
				char ch = (char)('a' + (int)(Math.random() * 26));
				sb.append(ch);
			}
			words.add(sb.toString());
		}
	}
	
}
