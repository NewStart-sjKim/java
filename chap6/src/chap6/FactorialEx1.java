package chap6;
/*
 * 재귀함수 : Recursive Call
 * 			자산의 함수를 호출하는 함수
 */
public class FactorialEx1 {

	public static void main(String[] args) {
		System.out.println("4! =" + factorial(4));
	}
	static int factorial(int i) {
		return (i==1)?1:i*factorial(i-1);
	}

}
