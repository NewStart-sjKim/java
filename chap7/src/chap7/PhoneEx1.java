package chap7;
/*
 * 상속예제
 * 	1. 모든 클래스는 Object 클래스를 상속 받는다.
 * 	2. 자손클래스의 객체 생성은 부모클래스의 객체부터 생성한다.
 *	   부모클래스의 객체 생성시 부모 클래스의 생성자를 호출한다.
 * 	3. 클래스 간의 상속은 단일 상속만 가능하다.
 * 	4. 모든클래스의 객체는 Object 객체를 포함한다.
 * 	=> 모든클래스의 객체는 Object 클래스의 맴버를 호출 할 수 있다.
 */
class Phone extends Object {
	boolean power;
	int number;
	void power() {
		power = !power;
	}
	void send() {
		if(power)System.out.println("전화걸기");
	}
	void receive() {
		if(power)System.out.println("전화받기");
	}
}
class SmartPhone extends Phone{
	void setApp(String name) {
		System.out.println(name + "앱 설치함");
	}
}
public class PhoneEx1 {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("카카오");
	}

}
