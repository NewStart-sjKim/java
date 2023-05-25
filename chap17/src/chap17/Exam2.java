package chap17;

import java.util.ArrayList;
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
 *  
 *  Runnable 구현 방식으로 구현하기
 *  SumRunnable 클래스로 구현하기
 */
class SumRunnable implements Runnable{
	int firstNum ,lastNum;
	int sum;
	SumRunnable(int firstNum, int lastNum){
		this.firstNum = firstNum;
		this.lastNum = lastNum;
		}
	@Override
	public void run() {
		for(int i=firstNum; i <= lastNum; i++)
			sum += i;
	}
}
public class Exam2 {
	public static void main(String[] args) throws Exception {
		List<SumRunnable> list = Arrays.asList(new SumRunnable(1,200),
						new SumRunnable(201,400),new SumRunnable(401,600),
						new SumRunnable(601,800),new SumRunnable(801,1000));
		List<Thread> list1 = new ArrayList<>();
		for(SumRunnable s : list) list1.add(new Thread(s));
		for(Thread t : list1) t.start();
		for(Thread t : list1) t.join();
		int sum = 0;
		for(SumRunnable s : list) sum += s.sum;
		System.out.println("전체 합 :" + sum);
		
	}											
}
