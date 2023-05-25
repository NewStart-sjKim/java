package chap7;

public class InstanceOfEx1 {
	public static void main(String[] args) {
		Parent2 p = new Child2();
		if(p instanceof Child2) {
			System.out.println("p 참조변수의 객체는 Child2 객체임");
			Child2 c = (Child2)p;
			System.out.println(c.x);
		}
		if(p instanceof Child2) {
			System.out.println("p 참조변수의 객체는 Parent2 객체임");
		}
		if(p instanceof Child2) {
			System.out.println("p 참조변수의 객체는 Object 객체임");
			Object o = p;
		//	System.out.println(o.x); 참조변수 타입의 멤버만큼만 호출가능
			
		}
	}

}
