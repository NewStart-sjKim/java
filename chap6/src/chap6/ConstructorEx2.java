package chap6;
class Car3{
	String color;
	int number;
	static int width = 200;
	static int height = 120;
	Car3(String c, int n){
		color = c;
		number = n;
	}
	Car3(String c){
		color = c;
		number = 1234;
	}
	Car3(int n){
		color = "white";
		number = n;
	}
	public String toString() {
		return color +','+number+"("+width+","+height+")";
	}
}
public class ConstructorEx2 {
	public static void main(String[] args) {
		Car3 c1 = new Car3("Blue",1234);
		Car3 c2 = new Car3("Red");
		Car3 c3 = new Car3(2345);
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
		System.out.println("c3:" + c3);		
		
	}
}
