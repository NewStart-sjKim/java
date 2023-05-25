package chap17;
/*
 * 
 */
class PrintThread2 extends Thread {
	Printer ptr;
	char ch;
	PrintThread2(Printer ptr, char ch){
		this.ptr = ptr;
		this.ch = ch;
		}
	public void run() {
		for(int i=0;i<20;i++) {
			ptr.printChar(ch);
		}
	}
}
class Printer {
	//동기화 메서드 방식
	public synchronized void printChar (char ch) {
		for(int i=0;i<80;i++) System.out.print(ch);
		System.out.println();
	}
}
public class ThreadEx5 {
	public static void main(String[] args) {
		Printer ptr = new Printer();
		PrintThread2 t1 = new PrintThread2(ptr,'A');
		PrintThread2 t2 = new PrintThread2(ptr,'B');
		PrintThread2 t3 = new PrintThread2(ptr,'B');
		t1.start(); t2.start(); t3.start();
	}
}
