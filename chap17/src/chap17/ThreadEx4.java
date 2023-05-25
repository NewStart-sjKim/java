package chap17;
/*
 * 동기화 블럭 예제
 *   synchronized 예약어 사용. 임계영역.
 * 동기화 메서드 방식 : method의 제한자에 synchronized 사용
 */
class PrintThread1 extends Thread{
	char ch;
	static Object lock = new Object(); //lock 객체는 모든 스레드의 공유 변수여야 함
	PrintThread1(char ch){
		this.ch = ch;
	}
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			synchronized (lock) { //동기화 블럭. lock 은 반드시 객체여야 함
				for(int j=0;j<80;j++) {
					System.out.print(ch);
				}
				System.out.println();
				try {
					sleep(5);
				}catch(InterruptedException e) {}
			}//synchronized 끝
		}
	}
}
public class ThreadEx4 {
	public static void main(String[] args) {
		PrintThread t1 = new PrintThread('A');
		PrintThread t2 = new PrintThread('B');
		PrintThread t3 = new PrintThread('B');
		t1.start(); t2.start(); t3.start();
	}
}
