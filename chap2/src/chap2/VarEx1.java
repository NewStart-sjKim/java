package chap2;

public class VarEx1 {

	public static void main(String[] args) {
		int num;	// 변수의 선언. 변수사용전에 반드시 선언필요. 메모리 할당됨.여기서는 num이 변수 저장할 수 있는 공간을 할당
		num = 100;	// 변수의 초기화.
		System.out.println(num);// num이 저장하고 있는 값 100을 콘솔에 출력.
		// 변수의 선언과 초기화 동시에함
		byte b1 = 10;
		short s1 = 20;
		int i1 = 30;
		long l1 = 40;
		//b1,s1,i1,l1 값을 콘솔에 출력하기
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		
		b1 = 100;
				System.out.println("b1="+b1);
		b1 = (byte)128;
				System.out.println(b1);
	}

}
