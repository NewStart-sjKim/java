package chap9;
/*
 * 열거형 예제
 */
public class EnumEx1 {
	public enum Car{
		AVANTE,SONATA,GRANDURE,SM5,K7 //미리 객체를 설정. 설정된 객체만 사용할 수 있도록 나열해놓음
	}
	public static void main(String[] args) {
		Car car = Car.AVANTE;
		System.out.println(car);
		System.out.println(car.K7);
		Car[] cars = Car.values(); //Car 열거형 객체들
		for(Car c : cars) {
			System.out.println(c + ":" + c.ordinal());
		}
		if(car instanceof Object) {
			System.out.println("car 객체는 Object 객체다.");
		}
	}
}
