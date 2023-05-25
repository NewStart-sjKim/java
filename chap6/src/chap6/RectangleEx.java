package chap6;
/*
 * 현재 사각형이 정 사각형인지 여부 판단하는 함수 isSquare() 구현하기
 * 리턴 타입 : boolean
 * 매개변수 : 없음
 * 메서드명 : isSquare
 * 
 * toString() 메서드에 추가 :정사각형이면 정사각형으로, 아니면 직사각형 표기하기
 */
class Rectangle3{
	int width,height,serialNo;
	static int sno;
	
	int area() {
		return width * height;
	}
	int length() {
		return(width + height)*2;
	}
	public String toString() {
		return serialNo + "번 삼각형:("+ width +"," + height + ")"
				+"생성된 사각형 갯수:" + sno
				+"=>면적:" + area() + ",둘레:" + length() + "," +
				(isSquare()?"정사각형":"직사각형");
	}
	boolean isSquare() {
		return width == height;
	}	
}

public class RectangleEx {
	public static void main(String[] args) {
		Rectangle3 r1 = new Rectangle3();
		r1.width = 30;
		r1.width = 20;
		r1.serialNo = ++Rectangle3.sno;
		System.out.println(r1);
		Rectangle3 r2 = new Rectangle3();
		r2.width = 35;
		r2.width = 25;
		r2.serialNo = ++Rectangle3.sno;
		System.out.println(r2);
		Rectangle3 r3 = new Rectangle3();
		r3.width = 25;
		r3.width = 25;
		r3.serialNo = ++Rectangle3.sno;
		System.out.println(r3);
	}

}
