package test2;
/*
구동 클래스를 실행 했을때 다음의 결과가 나오도록 Animal 클래스를 구현하기
[결과]
원숭이:26살
사자:1살
사람:100살

this() 	: 같은 클래스 내의 다른 생성자를 호출시 사용
this	: 자기참조변수. 현재 객체의 참조값
		  
*/
class Animal {
	String name;	// 힙영역에 할당
	int age;
	Animal(String n , int y){ // 매개변수 : 스택영역에 할당
		name = n;
		age = y;
	}
	Animal(String n){
		name = n;
		age = 1;
	}
	Animal(int n){
		age = n;
		name = "사람";
	}
	void info() {
		System.out.println(name + ":" + age + "살");
	}
}
public class Test3 {
	public static void main(String[] args) {
		Animal a1 = new Animal("원숭이", 26);
		Animal a2 = new Animal("사자");
		Animal a3 = new Animal(100);
		a1.info();
		a2.info();
		a3.info();
	}
}