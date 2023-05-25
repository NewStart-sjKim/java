package test2;
/*
 * 원(Circle) 클래스 구현하기
 *  1. 멤버변수
 *       반지름(r),x좌표(x),y좌표(y), 원의번호(no)
 *       원의번호 생성 변수 count
 *  2. 생성자 : 구동 클래스에 맞도록 설정하기     
 *  3. 멤버메서드
 *     (1) double area()  : 원의 넓이 리턴. Math.PI 상수 사용
 *     (2) double length(): 원의 둘레 리턴. Math.PI 상수 사용
 *     (3) void move(int a, int b): x,y좌표를 x+a, y+b로 이동.
 *     (4) void scale(double m): 반지름을 m배 확대/축소. r=r*m
 *     (5) String toString() :
 *         1번원 : 반지름:10, 좌표:(10,10), 넓이:314.xxx, 둘레:xxx.xxx
 *         ... */
class Circle{
	double r;//반지름
	int x,y,no;// 좌표
	static int count;//Circle 객체의 갯수
	Circle(int a, int b, int c){
		r = a;
		x = b;
		y = c;
		no = ++count;
	}
	Circle(int a , int b){
		r = 1;
		x = a;
		y = b;
		no = ++count;
	}
	Circle(int a ){
		r = a;
		x = 1;
		y = 1;
		no = ++count;
	}
	double area() {
		return 3.14 *(r*r);
	}
	double length() {
		return 2*3.14*r;
	}
	void move(int a, int b) {
		x += a; // x좌표이동
		y += b; // y좌표이둥
	}
	void scale(double m) {
		r *=m;	//반지름 크기 변경
	}
	//public String toString() {
		
	//}
}
public class Test4 {
	public static void main(String[] args) {
		Circle[] carr=new Circle[3];
		carr[0] = new Circle(10,10,10);
		carr[1] = new Circle(20,20);   
		carr[2] = new Circle(100);     
		for(Circle c : carr) {
			System.out.println(c);
			c.move(10,10);
			System.out.println(c);
			c.scale(3);
			System.out.println(c);
		}
	}
}