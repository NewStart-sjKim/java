package chap6;
/*
 * Rectangle2 클래스 구현하기
 * 멤버변수 : width(가로),height(세로),sno(사각형번호),
 * 			cnt(클래스변수)로 사각형 객체의 갯수
 * 멤버메서드 :
 * 		void area()		: 사각형의 면적 출력
 * 		void length()	: 사각형의 둘레 출력
 * 		String toString()
 * 
 * 		toString : 1번사각형 : 가로(10), 세로 (20), 현재까지 생성된 사각형(1) 형식으로 출력하기
 */
class Rectangle2{
	int width,height,sno;	// 인스턴스 변수
	static int cnt;			// 클래스 변수
	void area() {
		System.out.println(" 면적 :"+ (width*height));
	}
	void length() {
		System.out.println(" 둘레 :"+ (width+height)*2);
	}
		public String toString() {
			return sno + "번 사각형 : 가로" + width +",세로," + height +" 생산갯수:"+cnt; 
	}
}

public class Exam2 {
	public static void main(String[] args) {
		Rectangle2 r1 = new Rectangle2(); //객체화
		r1.width=10;
		r1.height=20;
		r1.sno = ++Rectangle2.cnt;
		System.out.println(r1);
		//면적과 둘레 출력하기
		r1.area();
		r1.length();
		//가로:20,세로:30인 두번재 사각형 생성하기
		Rectangle2 r2 = new Rectangle2();
		r2.width=20;
		r2.height=30;
		r2.sno = ++Rectangle2.cnt;
		System.out.println(r2);
		r2.area();
		r2.length();
	}

}
