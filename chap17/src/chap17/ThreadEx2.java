package chap17;
/*
 * Thread 생성
 * 1. Thread 클래스 상속 받으면 만들수있다 => Thread1 클래스는 Thread 클래스 임.
 * 		=> run() 메서드 구현
 * 2. Runnable 인터페이스 구현 => Runnable1 클래스는 단순히 Runnable 구현클래스 
 * 							  Thread 클래스가 아님.
 * 							  new Thread(Runnable r) 형태로 객체 생성
 * 		=> run() 메서드 구현
 */
class Runnable1 implements Runnable {
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			//Thread.currentThread() : 현재 실행중인 Thread 객체
			System.out.println(i + "=" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		}
	}
}
public class ThreadEx2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "스레드 시작");
		Runnable r = new Runnable1();
		Thread t1 = new Thread(r,"First");
		Thread t2 = new Thread(r,"Second");
		t1.start();t2.start();
		System.out.println(Thread.currentThread().getName() + "스레드 종료");
	}
}
