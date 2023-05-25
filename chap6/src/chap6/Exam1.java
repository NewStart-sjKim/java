package chap6;



/*
 * 직사각형 클래스 구현하기
 * 가로(width),세로(height)의 맴버 변수를 가지고,
 * void area(), void length() 맴버 메서드를 가진 클래스 구현하기
 */
class Rectangle{
	int width,height;
	void area() {
		System.out.println("(" + width + "," + height + ") 사각형의 면적 :"+ (width*height));
	}
	void length() {
		System.out.println("(" + width + "," + height + ") 사각형의 둘레 :"+ (width+height)*2);
	}
}

public class Exam1 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 5;
		r1.area(); //(10,5) 사각형 면적 : 50
		r1.length();//(10,5) 사각형 둘레 : 30
	}

}
