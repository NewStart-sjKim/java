package chap13;
/*
 * 추상메서드의 매개변수가 있거, 리턴타입이 없는 경우
 * (매개변수)->{....}
 * 매개변수가 한개인 경우() 생략 가능
 * 실행 구문이 한문장인 경우 {} 생략 가능
 */
//@FunctionalInterface
interface LambdaInterface2 {
	void method(int a);
}
public class LambdaEx2 {
	public static void main(String[] args) {
		LambdaInterface2 fi = (a)->{
			System.out.println(a*5);
		};
		fi.method(10); //50
		fi.method(2); //10
		fi = a->System.out.println(a*5);
		fi.method(10); //50
		fi.method(2); //10
		calc(a->System.out.println(a*a),10);
		fi=a->{
			int sum = 0;
			for(int i=1;i<=a;i++) sum += i;
			System.out.printf("1에서 %d 까지의 합 : %d\n",a,sum);
		};
		fi.method(10);
		//calc 함수를 이용하여 i 까지의 합출력하기
		calc(fi,100);
		//calc 함수를 이용하여 i 까지의 짝수의 합출력하기
		calc(fi,100);
		fi=a->{
			int sum = 0;
			for(int i=1;i<=a;i+=2) sum += i;
			System.out.printf("1에서 %d 까지의 짝수합 : %d\n",a,sum);
			
		};
		calc(fi,10);
	}
	private static void calc(LambdaInterface2 f, int i) {
		f.method(i);
	}
}
