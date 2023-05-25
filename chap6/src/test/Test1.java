package test;

/*1. Card 클래스가 다음과 같을때 구동 클래스를 완성하시오
[결과]
Heart:1(100,250)
Spade:1(100,250)
Heart:1(50,80)
Spade:1(50,80)
*/
class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;

	public String toString() {
		return kind + ":" + number + "(" + width + "," + height + ")";
	}
}

public class Test1 {
	public static void main(String[] args) {
		Card c1= new Card();// (객체생성,메모리할당): 객체화
		c1.kind = "Heart";
		c1.number = 1;
		System.out.println(c1);//toString() 멤버 메서드 호출
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 1;
		System.out.println(c2);
		c1.width = 50; // Card.width
		c1.height = 80; // Card.height
		System.out.println(c1);
		System.out.println(c2);
	}
}