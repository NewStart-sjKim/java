package chap6;
/*
 *  추상화 : 클래스 생성 단계
 *  	클래스 : 사용장 정의 자료형
 *  		속성 : 멤버 변수
 *  		기능 : 멤버 메서드
 *  객체화 : 클래스 정보를 이용하여 메모리 할당
 *  		멤버(멤버변수,멤버메서드)값이 메모리에 할당됨
 *  
 *  하나의 참조변수는 한개의 객체만 참조가능함.
 *  하나의 객체는 여러개의 참조변수가 참조 가능.
 *  참조변수가 참조하지 않은 객체는 사라진다.
 */
class Phone{
	String color; 	// 멤버 변수
	boolean power;	// 멤버 변수
	String no;		// 멤버 변수
	void power() {	// 멤버 메서드
		power = !power;	//멤버 변수
	}
	void send(String no) {	//멤버 메서드 (no는 지역변수)
		System.out.println(no + "로 전화 거는 중");
	}
	void receive(String no) {	//멤버 메서드
		System.out.println(no + "에서 전화 받는 중");
	}
}
public class PhoneEx1 {
	public static void main(String[] args) {
		Phone p1 = new Phone(); // 객체화 : 메모리 할당을 받아주는 단계
		/*
		 * new 예약어 기능 : 객체화
		 * 1. 힙영역에 메모리 할당. => 객체
		 * 2. 멤버 변수를 기본값으로 초기화
		 * 		기본값 : 숫자 : 0
		 * 				boolean : false
		 * 				참조형 : null
		 * 3. 생성자 호출
		 *  =(대입연산자)를 통해서 객체의 참조값을 참조변수에 저장
		 */
		p1.color = "검정";
		p1.power = true;
		p1.no = "01012345678";
		System.out.println(p1.color + "," + p1.power + ","+ p1.no);
		
		p1.send("01087654321");
		p1.receive("01087654321");
		p1.power();
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		
		Phone p2 = new Phone();
		p2.color="분홍";
		p2.power = true;
		p2.no	="01087654321";
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
		p2 = p1;
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
	}

}
