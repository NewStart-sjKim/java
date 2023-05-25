package chap17;
/*
 * Thread 생성
 * 1. Thread 클래스 상속받으면 만들수있다
 * 		=> run() 메서드 구현
 * 2. Runnable 인터페이스 구현
 * 		=> run() 메서드 구현
 */
class  Thread1 extends Thread{
	Thread1(String name){
		super(name);
	}
	public void run() {
		for(int i=1;i<=5;i++) {// Running 상태
			//getName() : Thread 클래스의 이름 리턴
			System.out.println(i+"=" + getName());
			try {
				sleep(1000); // 1000밀리초 = 1초  동안 대기. 대기상태
			}catch(InterruptedException e) {}
		}
	} // Dead 상태. 종료
}
public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		Thread t1 = new Thread1("First");
		Thread t2 = new Thread1("Second");
		t1.start();t2.start(); //Runable 상태(실행 가능)
		/*
		 * start() : 스레드의 시작
		 * 1. 스텍영여을 병렬화 함.
		 * 2. 병렬화된 스택영역에 run() 메서드 호출
		 */
		//*t1.start(); t1.start();
//		t1.run(); t2.run();
		System.out.println("main 스레드 종료");
	}
}
