package chap13;
/*
 * 매개변수도 있고, 리턴값도 있는 경우
 * 	(x,y)=>{..... return 값;}
 * 	문장이 return 만 존재하는 경우 return과{} 생략 가능
 */
interface LambdaInterface3 {
	int method(int x, int y);
}
public class LambdaEx3 {
	public static void main(String[] args) {
		LambdaInterface3 fi = (x,y) ->{
			return x*y;
		};
		System.out.println("두수의 곱:" + fi.method(2,5));
		fi = (x,y) -> x*y;
		System.out.println("두수의 곱:" + fi.method(2,5));
		fi = (x,y) -> x+y;
		System.out.println("두수의 합:" + fi.method(2,5));
		fi = (x,y) -> (x>y)?x:y;
		System.out.println("두수 중 큰수:" + fi.method(2,5));
		fi = (x,y) -> (x<y)?x:y;
		System.out.println("두수 중 작은수:" + fi.method(2,5));
		fi = (x,y) -> sum (x,y);
		System.out.println("두수수의 합:" + fi.method(2,5));
		
	}

	private static int sum(int x, int y) {
		return x+y;
	}
}
