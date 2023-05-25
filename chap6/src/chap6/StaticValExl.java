package chap6;
/*
 * 클래스 변수 사용 예제
 */
class Car2{
	String color;
	int num;
	int sno;
	static int cnt;
	public String toString() {
		return "자동차번호:" + sno +"=>" + color +"," + num + ", 자동차생산갯수:"+cnt; 
	}
}
public class StaticValExl {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.color = "white";
		c1.num = 1234;
		c1.sno = ++Car2.cnt;
		System.out.println(c1);
		Car2 c2 = new Car2();
		c2.color = "black";
		c2.num = 5678;
		c2.sno = ++Car2.cnt;
		System.out.println(c1);
		System.out.println(c2);
	}
}
