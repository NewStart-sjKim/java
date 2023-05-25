package chap8;
/*
 * 인터페이스 예제
 * 인터페이스
 * 1. 인터페이스의 멤버는 상수,추상메서드,default 메서드,static 메서드만 가능
 * 	  인터페이스의 모든 멤버의 접근 제한자는 public임.
 * 	  상수 :   [public static final] 자료형 상수명;
 * 			  int NUM = 100; O
 * 			  final int NUM = 100; O
 * 			  static in NUM = 100; O
 * 			  protected int NUM = 100; X
 * 	  추상메서드: [public abstract] 리턴타입 메서드명(매개변수)
 * 			  int getA(); O
 * 			  public int getA(); O
 * 			  abstract int getA(); O
 * 			  final int getA(); X
 * 			  static int getA(); X
 * 			  int getA(){} X
 * 	  default 메서드 : 구현부가 존재. jdk8 버전 이후에 추가됨.
 * 		 public default 리턴타입 메서드명(매개변수){...}
 * 	  static 메서드 : 구현부가 존재. jdk8 버전 이후에 추가됨.
 * 		 public static 리턴타입 메서드명(매개변수){...}
 * 2.객체화 불가 => 구현클래스의 객체화를 통해서 객체화 됨.
 * 3.클래스와 인터페이스는 구현으로 표현함 => implements 예약어 사용
 *   => 다중 구현이 가능함
 * 4.인터페이스간의 상속이 가능 => 다중 상속이 가능
 */
interface Printerable{
	public static final int INK = 100;	// 상수
	public abstract void print();		//추상메서드
}
interface Scannerable{
	void scan();	//추상메서드
}
interface Faxable{
	String FAX_NO ="02-1111-2222";	//상수
	void send(String no);			//추상메서드
	void receive(String no);		//추상메서드
}
interface Complexerable extends Printerable,Scannerable,Faxable{}
//구현클래스
class Complexer implements Printerable,Scannerable,Faxable{ // 다중구현
	int ink;
	Complexer(){
		this.ink = INK;
		
	}
	@Override
	public void send(String no) {
		System.out.println(FAX_NO + "에서" + no + "로 FAX를 전송합니다." );
	}
	@Override
	public void receive(String no) {
		System.out.println(no + "에서" + FAX_NO + "로 FAX를 받았습니다.");
	}
	@Override
	public void scan() {
		System.out.println("이미지를 스캔하여 파일에 저장합니다.");
	}
	@Override
	public void print() {
		System.out.println("프린트를 출력합니다. 남은 잉크양:"+--ink);
	}
}
public class InterfaceEx1 {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println("기본잉크량 : " + Complexer.INK);
		System.out.println("기본잉크량 : " + Complexerable.INK);
		System.out.println("기본잉크량 : " + Printerable.INK);
//		Complexer.INK = 200; //상수는 변경 불가
		System.out.println("팩스 번호 : " + Complexer.FAX_NO);
		System.out.println("팩스 번호 : " + Complexerable.FAX_NO);
		System.out.println("팩스 번호 : " + Faxable.FAX_NO);
		com.print();
		com.scan();
		com.receive("02-2222-3333");
		com.send("02-3333-4444");
		System.out.println("com.ink : " + com.ink); //99
		if(com instanceof Printerable) {
			System.out.println("com 객체는 Printerable 객체임");
			System.out.println("com 객체는 Printerable 타입의 참조변수로 참조가 가능함");
			Printerable p = com;
			p.print();
//			p.scan();
//			p.receive("02-2222-3333");
//			p.send("02-2222-3333");
//			System.out.println("com.ink : " + c.ink); // 오류
//			System.out.println("p.ink : " + p.ink); // 98
			
		}
		if(com instanceof Scannerable) {
			System.out.println("com 객체는Scannerable 객체임");
			System.out.println("com 객체는 Scannerable 타입의 참조변수로 참조가 가능함");
			Scannerable s = com;
			s.scan();
		}
		if(com instanceof Faxable) {
			System.out.println("com 객체는 Faxable 객체임");
			System.out.println("com 객체는 Faxable 타입의 참조변수로 참조가 가능함");
			Faxable f = com;
			f.send("02-2222-3333");
			f.receive("02-2222-3333");
		}
	}
}
