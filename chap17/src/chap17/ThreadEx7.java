package chap17;
/*
 * 데몬 스레드
 * 1. 일반스레드의 보조기능 담당
 * 2. 일반스레드가 종료되면 데몬 종료됨
 */
class DaemonThread extends Thread{
	public void run() {
		while(true) {
			System.out.println(this);
			try {
				sleep(100);
			} catch(InterruptedException e) {}
		}
	}
}
public class ThreadEx7 {
	public static void main(String[] args) throws InterruptedException {
		DaemonThread t1 = new DaemonThread();
		DaemonThread t2 = new DaemonThread();
		t1.setDaemon(true);t2.setDaemon(true);
		t1.start();t2.start();
		Thread.sleep(2000);
		System.out.println("main thread 종료");
	}
}
