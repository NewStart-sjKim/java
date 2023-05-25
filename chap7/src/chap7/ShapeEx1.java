package chap7;
/*
 * 추상클래스
 * 1. 추상메서드를 멤버로 가질수 있는 클래스 = > abstract 예약어 사용
 * 2. 객체화불가 => 상속을 통해서 자손클래스의 객체화를 통해 객체화 가능
 * 3. 그외는 일반 클래스와 동일함(생성자,멤버변수,일반메서드,초기화블럭,상속...)
 * 
 * 추상메서드
 * 1. 메서드의 선언부만 존재. 구현부{}가 없다. => abstract 예약어 사용.
 * 2. 자손클래스에서 반드시 오버라이딩 해야함
 */
abstract class Shape{ // 추상클래스
	String type;
	Shape(String type){
		this.type = type;
	}
	abstract double area(); // 추상메서드
	abstract double length(); //추상메서드
}
class Circle extends Shape{
	int r;
	Circle(int r){
		super("원");
		this.r = r;
	}
	double area() {
		return Math.PI*r*r;
	}
	double length() {
		return Math.PI*r*2;
	}
	public String toString() {
		return type + ":" + r + "=>면적:" + area() + ",둘레:" + length();
	}
}
class Rectangle extends Shape{
	int width,height;
	Rectangle(int width,int height){
		super("사각형");
		this.width = width;
		this.height = height;
	}
	@Override
	double area() {
		return width * height;
	}
	@Override
	double length() {
		return 2*(width+height);
	}
	public String toString() {
		return type + ":" + width + "," + height + "=>면적:" +
						area() + ",둘레:" + length();
	}
}
public class ShapeEx1 {
	public static void main(String[] args) {
//		Shape 클래스 객체화 불가 => 추상클래스의 객체화는 안됨
//		Shape s = new Shape("도형");
		Shape[] arr = new Shape[2];
		arr[0] = new Circle(10);
		arr[1] = new Rectangle(10,10);
		//도형의 면적의 합과, 둘레 합 출력하기
		double totArea = 0;
		double totLength = 0;
		for(Shape s : arr) {
			System.out.println(s);
			totArea += s.area();
			totLength += s.length();
		}
		System.out.println("전체 면적 : " + totArea);
		System.out.println("전체 둘레 : " + totLength);
	}
}
