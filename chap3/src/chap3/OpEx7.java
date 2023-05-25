package chap3;
/*
 *  대입연산자 : =,+=,-=,*=,...
 *  
 *  a = 10 : a 변수에 10 대입하여 저장. => 대입연산자
 *  a == 10: a 변수의 값이 10이니?(결과 : true|false)
 *  
 *  a+b = 10 (x) : 대입연산자의 왼쪽은 반드시 변수여야함.
 *  10 = a	 (x) : 대입연산자의 왼쪽은 반드시 변수여야함.
 *  a = 10 	 (o) : lvalue는 변수만 가능
 *  a = 10+20(o) : rvalue는 변수,상수,수식 모두 가능
 */
public class OpEx7 {

	public static void main(String[] args) {
		int num = 100;
		System.out.println(num);// 100
		num += 10; // num = num + 10
		System.out.println(num);// 110
		num -= 10; // num = num - 10
		System.out.println(num);// 110
		num *= 5; // num = num + *5
		System.out.println(num);// 500
		num /= 10; // num = num / 10
		System.out.println(num);// 50
		num %= 3; // num = num % 3
		System.out.println(num);// 2
		num += 2+3; // num = num +(2+3)
		System.out.println(num);// 7
		
		byte b = 1;
		System.out.println(b);//1
		b*=2;
		//b = b*2; 오류
		System.out.println(b);//2
		b*=2;
		System.out.println(b);//4
		b*=2;
		System.out.println(b);//8
		b*=2;
		
	}

}
