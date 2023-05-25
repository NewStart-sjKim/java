package chap8;
//Animal 클래스
interface Flyable{
	void fly();
}
abstract class Animal{
	String name;
	Animal(String name){
		this.name = name;
	}
	abstract void eat();
}
class Dove extends Animal implements Flyable{
	public Dove(){
		super("비둘기");
	}
	void eat() {
		System.out.println("벌레를 잡아먹는다");
	}
	@Override
	public void fly() {
		System.out.println(name + "은 날아 다닌다.");
	}
}
class Monkey extends Animal{
	public Monkey() {
		super("원숭이");
	}
	void eat() {
		System.out.println("바나나를 먹는다");
	}
}

/*
 * Dove,Monkey 클래스,Flyable 인터페이스 구현하기
 */
public class Exam1 {
	public static void main(String[] args) {
		Animal a = new Dove();
		a.eat();
		if(a instanceof Flyable) {
			Flyable f = (Flyable)a;
			f.fly();
		}
		a = new Monkey();
		a.eat();
		if(a instanceof Flyable) {
			Flyable f = (Flyable)a;
			f.fly();
		}
	}
}
