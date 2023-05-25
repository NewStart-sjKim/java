package chap17;

import java.util.Arrays;
import java.util.List;

/*
 * 1~100까지의 합을 5개의 스레드가 나누어 구하기
 * main 스레드는 모든 스레드가 종료할땨 까지 대기:
 *  t.join() : 스레드가 종료할때 까지 main 메서드 대기
 *  t1 : 1~200까지 합
 *  t2 : 201~400까지 합
 *  t3 : 401~600까지 합
 *  ...
 *  t5 : 801~1000까지 합
 */
class SumThread extends Thread{
	int firstNum ,lastNum;
	int sum;
	SumThread(int firstNum, int lastNum){
		this.firstNum = firstNum;
		this.lastNum = lastNum;
	}
	public void run() {
		for(int i=firstNum; i <= lastNum; i++)
			sum += i;
	}
}
public class Exam1 {
	public static void main(String[] args) throws Exception {
		System.out.println("main 시작");
		/*
		 * Runnable 인터페이스 : void run() 추상메서드 한개를 가진다.
		 * 					=> FunctionaInterface 임 => 람다 표현 갸늘
		 */
		Thread t1 = new Thread(()->System.out.println("Thread 호출"));
		t1.start();
		t1.join(); //t1 스레드 종료시까지 main 메서드 대기)
	System.out.println("maint 종료");
	
	List<SumThread> list = Arrays.asList(new SumThread(1,200),
				 new SumThread(201,400),new SumThread(401,600),
				 new SumThread(601,800),new SumThread(801,1000));
	for(SumThread s : list) s.start();
	for(SumThread s : list) s.join();
	int sum = 0;
	for(SumThread s : list) sum += s.sum;
	System.out.println("전체 합 :" + sum);
	}
}
