package chap7;
/*
 * 다형성 예제
 * 1. 자손타입의 객체는 부모타입의 참조변수로 참조가 가능
 * 2. 부모타입의 참조변수로 자손타입의 객체를 참조시
 * 	  부모타입의 멤버들만 호출가능하다.
 * 3. 모든 클래스의 객체는 Object 타입의 참조변수로 참조 가능
 * 	  Object 타입의 참조변수로는 Object 클래스의 멤버만 호출 가능
 */
class Bike2{
	int wheel;
	Bike2(int wheel){
		this.wheel = wheel;
	}
	void drive() {
		System.out.println("폐달을 밟는다");
	}
	void stop() {
		System.out.println("브레이크를 잡는다");
	}
}
class AutoBike2 extends Bike2{
	boolean power;
	AutoBike2(int wheel){
		super(wheel);
	}
	void Power() {
		power = !power;
	}
}

public class BikeEx2 {
	public static void main(String[] args) {
		AutoBike2 ab = new AutoBike2(2);
		Bike2 b = null;
		ab.Power();
		ab.drive();
		System.out.println("ab.wheel="+ab.wheel);
		ab.stop();
		b = ab;
	//	b.drive();
		b.drive();
		Object o = b;
	//	o.drive();
	}
}